# CompiladoresAtividade1

# Instruções de Instalação e Uso

Este é um guia rápido para instalar e usar os analisadores léxico e sintático gerados a partir do código-fonte fornecido.

## Pré-requisitos

Certifique-se de ter os seguintes pré-requisitos instalados em seu sistema:

- Java Development Kit (JDK)
- JFlex

## Instalação

Siga estas etapas para instalar e executar os analisadores léxico e sintático:

1. Abra um terminal ou prompt de comando.

2. Execute o seguinte comando para gerar o analisador léxico usando o JFlex:

   ```shell
   java -jar <localização>jflex-<versão>.jar lexico.flex

Isso irá gerar o arquivo Lexer.java com base nas especificações definidas no arquivo lexico.flex.

3. Em seguida, execute o arquivo .bat fornecido para gerar o analisador sintático:
   ```shell
   gera_analisador_sintatico.bat
   
## Uso

Após a conclusão da instalação, siga estas etapas para testar os analisadores com os arquivos `.prg` fornecidos:

1. Certifique-se de que os arquivos `.prg` que você deseja testar estão no diretório raiz do projeto.

2. Execute o seguinte comando para compilar e executar o arquivo `Main.java`:

   ```shell
   java Main

## Observações

Certifique-se de ter o JDK e o JFlex corretamente instalados e configurados em seu sistema antes de executar os passos acima.

## Documentação

Para mais informações sobre o JFlex e sua utilização, consulte a documentação oficial:

- [Site do JFlex](https://jflex.de/)
- [Documentação do JFlex](https://jflex.de/manual.html)
