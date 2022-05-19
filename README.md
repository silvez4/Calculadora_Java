# Calculadora_Java
Calculadora feita em Java para disciplina Sistemas Distribuidos

## Comandos de Uso
Soma: soma n1 n2 n3 ..... nN  
Subtração: sub n1 n2 n3 ..... nN  
Divisão: div n1 n2 n3 ..... nN  
Multiplicação: mult n1 n2 n3 ..... nN

Potenciação: pot n1 n2  (n1 ^ n2)  
Raiz: raiz n  
Porcentagem: porc n1 n2  (n1% de n2)

## Decisão de Projeto
O projeto foi dividido em 5 arquivos, sendo UM Cliente com as funções de conexão de servidor baseado na entrada do usuario,
e o resposavel por tal comunicação, DOIS arquivos Servers onde cada um ficou resposavel por criação da linha de coneção do cliente
com as funções adequadas, sendo essas funções divididas entre DOIS arquivos ClientHandlers onde ficam armazenadas todas as funções
que o usuario pode se utilizar

## Portas
Server_A: "127.0.0.1", PORT: 9999  
Server_B: "127.0.0.1", PORT: 9998   
Apos a seleção da posta com o Client (A depender da função requisitada)
é feita a conexão entre InputStream e OutputStream com o Server determinado
e ester Server Realizar a união entre Client E ClientHandler Adequado, e por essas conexões
ocorrem as transferências de dados entre os dois.

### © Gabriel Silva de Araujo
