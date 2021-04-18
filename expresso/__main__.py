from antlr4 import FileStream, CommonTokenStream
from os import path
import argparse
from ast_decompiler import decompile

try:
    from .parser.expressoLexer import expressoLexer
    from .parser.expressoParser import expressoParser
except ImportError:
    # Generate ANTLR parser from g4 file
    from .generate_parser import generate_parser
    generate_parser(path.join(path.dirname(__file__), 'parser/expresso.g4'))

    from .parser.expressoLexer import expressoLexer
    from .parser.expressoParser import expressoParser

# import astVisitor after the try-except
from .astVisitor import astVisitor


def main():

    # Argument parser
    parser_args = argparse.ArgumentParser(prog='expresso', description='C-- interpreter')
    parser_args.add_argument('input', type=str, help='source code')
    parser_args.add_argument('-o', metavar='', type=str, default=None, help='python output')

    args = parser_args.parse_args() 
    #################################

    input_stream = FileStream(args.input)

    lexer = expressoLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = expressoParser(stream)

    tree = parser.start() # Get AST

    # Transverse AST to generate python ast -> NOT YET IMPLEMENTED
    visitor = astVisitor(args.input)
    ast = visitor.visitStart(tree)

    code = compile(source=ast, filename=args.input, mode='exec') 

    exec(code, globals())
    
    if args.o:
        with open(args.o, 'w') as file:
            file.write(decompile(ast))

if __name__ == '__main__':
    main()