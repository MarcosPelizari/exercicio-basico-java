# 📚 Exercícios de Java para Prática

## Sobre o Repositório
Este repositório contém uma coleção de **20 exercícios práticos** desenvolvidos em **Java** para revisar e aprimorar conceitos fundamentais da linguagem. Cada exercício aborda diferentes aspectos da programação, como entrada/saída, estruturas condicionais, laços, manipulação de strings e cálculos matemáticos.

Os exercícios utilizam uma classe personalizada `InputScanner` para permitir que o usuário insira valores diretamente no terminal, eliminando a necessidade de alterar variáveis no código. Isso torna os exercícios interativos e fáceis de testar.

![Java](https://img.shields.io/badge/-Java-007396?style=flat-square&logo=java)
![Status](https://img.shields.io/badge/Status-Em%20Andamento-green?style=flat-square)

## Estrutura do Projeto
O projeto está organizado em pacotes para manter o código modular e bem estruturado:

- **`exercicio`**: Contém a classe principal `Exercicio`, que implementa os 20 exercícios, e a classe `InputScanner`, responsável por gerenciar a entrada de dados pelo terminal.
- **`service`**: Inclui a classe `Triangulo` e `Pagamento`, usada no exercício 16 e 12, respectivamente.
- **`Main.java`**: Arquivo principal que permite testar qualquer exercício alterando o número do exercício chamado no método `main`.

## Como Executar
Para testar os exercícios, siga estas etapas:

1. **Pré-requisitos**:
    - Java Development Kit (JDK) 8 ou superior instalado.
    - Um terminal ou IDE (como IntelliJ IDEA, Eclipse ou VS Code) para compilar e executar o código.

2**Testando um Exercício**:
    - Abra o arquivo `Main.java`.
    - No método `main`, altere o número do exercício que deseja testar. Por exemplo, para executar o exercício 19:
      ```java
      System.out.println(exercicio.exercicio19());
      ```
    - Execute novamente com `java Main`.
    - Siga as instruções no terminal para inserir os valores solicitados (ex.: números inteiros, decimais, etc.).

3**Entrada de Dados**:
    - Todos os exercícios usam a classe `InputScanner` para leitura de entrada via terminal.
    - A classe trata erros de entrada (ex.: valores inválidos) e solicita nova entrada até que um valor válido seja fornecido, com um limite de 3 tentativas.

## Lista de Exercícios
Aqui estão os 20 exercícios que usei para praticar diferentes aspectos da programação em Java:

| **Nº** | **Descrição**                                                                                   |
|--------|-------------------------------------------------------------------------------------------------|
| 1      | Leia os valores A, B, C e imprima a soma de A e B, verificando se a soma é menor que C.         |
| 2      | Receba um número e imprima se é par ou ímpar, positivo ou negativo.                             |
| 3      | Leia dois valores A e B. Se forem iguais, some-os; caso contrário, multiplique A por B.         |
| 4      | Receba um número inteiro e imprima seu antecessor e sucessor.                                   |
| 5      | Leia o salário mínimo (R$ 1.293,20) e o salário de um usuário, calcule quantos salários mínimos ele ganha. |
| 6      | Leia um valor e imprima com reajuste de 5%.                                                     |
| 7      | Leia dois valores booleanos e determine se ambos são VERDADEIRO ou FALSO.                       |
| 8      | Leia três valores inteiros e imprima em ordem decrescente.                                      |
| 9      | Calcule o IMC de uma pessoa com base no peso e altura, e imprima a condição (ex.: "Abaixo do peso"). Fórmula: `IMC = peso / (altura)²`. |
| 10     | Leia três notas de um aluno e imprima a média.                                                  |
| 11     | Leia quatro notas de um aluno, calcule a média e imprima se foi aprovado (média ≥ 7) ou reprovado. |
| 12     | Leia o valor de um produto e calcule o valor final com base na forma de pagamento (ex.: à vista com 15% de desconto). |
| 13     | Leia o nome e a idade de uma pessoa e imprima se é maior ou menor de idade.                     |
| 14     | Leia dois valores A e B, troque os valores entre si e imprima os novos valores.                 |
| 15     | Leia o ano de nascimento de uma pessoa e imprima quantos anos, meses e dias ela viveu (365 dias/ano, 30 dias/mês). |
| 16     | Leia os lados de um triângulo, verifique se são válidos e determine se é equilátero, isósceles ou escaleno. |
| 17     | Leia uma temperatura em Fahrenheit, converta para Celsius e imprima. Fórmula: `C = (5 * (F-32) / 9)`. |
| 18     | Calcule em quantos anos Francisco (1,50m, cresce 2cm/ano) será mais alto que Sara (1,10m, cresce 3cm/ano). |
| 19     | Imprima a tabuada de 1 a 10.                                                                    |
| 20     | Receba um valor inteiro e imprima sua tabuada.                                                  |


## Características do Projeto
- **Entrada Interativa**: Todos os exercícios utilizam a classe `InputScanner`, que permite ao usuário inserir dados diretamente no terminal, com tratamento de erros para entradas inválidas (ex.: letras em vez de números).
- **Modularidade**: O código está organizado em pacotes (`exercicio`, `service` e `scanner`), separando a lógica dos exercícios, entrada de dados e funcionalidades específicas (como validação de triângulos).