# Expresso lang! 

Linguagem de programação modelo para a disciplina de introdução a compiladores

## Pré-requisitos:
- [ANTLR4](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)
- [Java (de preferência o java 11)](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)

## Configuração 

Instalar dependências (não necessário se for apenas testar o analisador léxico e sintático)
```shell
pip install -r requirement.txt
```

## Testando o analisador léxico e sintático
Execute os seguintes comandos na raiz do projeto:
```shell
$ cd expresso/parser/build
$ grun expresso start -gui < ../../../exampleFiles/[nome do arquivo de teste desejado].exp
```
Isso irá analisar o arquivo de teste desejado, e abrir uma interface gráfica demonstrando a árvore de derivação gerada na análise do mesmo.

A pasta `ExampleFiles` contém uma série de arquivos de exemplo da linguagem

## Executando os arquivos
Ainda não implementado, aguarde a próxima versão.
