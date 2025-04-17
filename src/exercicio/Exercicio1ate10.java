package exercicio;

import scanner.InputScanner;

public class Exercicio1ate10 {

    private InputScanner inputScanner;

    public Exercicio1ate10(InputScanner inputScanner) {
        this.inputScanner = inputScanner;
    }


    public void exercicio01() {

        int primeiroNumero = inputScanner.lerInteiro("Digite o Primeiro número inteiro: ");
        int segundoNumero = inputScanner.lerInteiro("Digite o Segundo número inteiro: ");
        int terceiroNumero = inputScanner.lerInteiro("Digite o Terceiro número inteiro: ");

        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma do primeiro e segundo número é " + soma);

        if (soma < terceiroNumero) {
            System.out.printf("A soma do primeiro e segundo número é %d, e é menor que c", soma);
        }
    }

    public void exercicio02() {
        int numero = inputScanner.lerInteiro("Digite um número inteiro: ");

        if (numero % 2 == 0) {
            if (numero >= 0) {
                System.out.println("O número é par e maior que 0.");
            } else {
                System.out.println("O número é par e menor que 0.");
            }
        } else {
            if (numero >= 0) {
                System.out.println("O número é ímpar e maior que 0.");
            } else {
                System.out.println("O número é ímpar e menor que 0.");
            }
        }
    }

    public void exercicio03() {
        int primeiroNumero = inputScanner.lerInteiro("Digite o Primeiro número inteiro: ");
        int segundoNumero = inputScanner.lerInteiro("Digite o Segundo número inteiro: ");
        int resultado;

        if (primeiroNumero == segundoNumero) {
            resultado = primeiroNumero + segundoNumero;
        } else {
            resultado = primeiroNumero * segundoNumero;
        }
        System.out.println("O valor da váriavel c é: " + resultado);
    }

    public void exercicio04() {
        int numero = inputScanner.lerInteiro("Digite um número inteiro: ");

        System.out.println("O número anterior ao informado é " + (numero - 1) +" e o número posterior é " + (numero + 1));
    }

    public void exercicio05() {
        double salario = inputScanner.lerDouble("Por favor informe o seu salário: ");
        double salarioMinimo = 1293.20;

        double quantidadeSalarioMinimo = salario / salarioMinimo;

        System.out.printf("Você ganha %.2f salários mínimos", quantidadeSalarioMinimo);
    }

    public void exercicio06() {
        int number = inputScanner.lerInteiro("Digite um número inteiro: ");

        double reajuste = (number + (number * 0.05));
        System.out.println("O valor informado foi reajustado em 5% e ficou com o valor de " + reajuste);
    }

    public void exercicio07() {
        boolean booleanA = inputScanner.lerBoolean("Digite o Primeiro valor booleano inteiro: ");
        boolean booleanB = inputScanner.lerBoolean("Digite o Segundo valor booleano inteiro: ");

        if (booleanA == true && booleanB == true) {
            System.out.println("Ambos sào VERDADEIROS.");
        } else if (booleanA == true || booleanB == true) {
            System.out.println("Apenas um é verdadeiro.");
        } else {
            System.out.println("Ambos são FALSOS.");
        }
    }

    public void exercicio08() {
        int[] listaNumeros = new int[3];
        listaNumeros[0] = inputScanner.lerInteiro("Por favor digite um número inteiro: ");
        listaNumeros[1] = inputScanner.lerInteiro("Por favor digite o próximo número inteiro: ");
        listaNumeros[2] = inputScanner.lerInteiro("Por favor digite o último número inteiro: ");

        for (int i = 0; i < listaNumeros.length - 1; i++) {
            for (int j = 0; j < listaNumeros.length - i - 1; j++) {
                if (listaNumeros[j] < listaNumeros[j + 1]) {
                    int temp = listaNumeros[j];
                    listaNumeros[j] = listaNumeros[j + 1];
                    listaNumeros[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }
    }
}
