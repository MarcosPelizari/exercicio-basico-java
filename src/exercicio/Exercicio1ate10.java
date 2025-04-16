package exercicio;

import java.util.Scanner;

public class Exercicio1ate10 {

    Scanner scanner = new Scanner(System.in);


    public void exercicio01() {

        System.out.println("Digite o Primeiro número inteiro: ");
        int a = scanner.nextInt();
        System.out.println("Digite o Segundo número inteiro: ");
        int b = scanner.nextInt();
        System.out.println("Digite o Terceiro número inteiro: ");
        int c = scanner.nextInt();

        int soma = a + b;
        System.out.println("A soma do primeiro e segundo número é " + soma);

        if (soma < c) {
            System.out.printf("A soma do primeiro e segundo número é %d, e é menor que c", soma);
        }
    }

    public void exercicio02() {
        System.out.println("Digite um número inteiro: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            if (a >= 0) {
                System.out.println("O número é par e maior que 0.");
            } else {
                System.out.println("O número é par e menor que 0.");
            }
        } else {
            if (a >= 0) {
                System.out.println("O número é ímpar e maior que 0.");
            } else {
                System.out.println("O número é ímpar e menor que 0.");
            }
        }
    }

    public void exercicio03() {
        System.out.println("Digite o Primeiro número inteiro: ");
        int a = scanner.nextInt();
        System.out.println("Digite o Segundo número inteiro: ");
        int b = scanner.nextInt();
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("O valor da váriavel c é: " + c);
    }

    public void exercicio04() {
        System.out.println("Digite um número inteiro: ");
        int a = scanner.nextInt();

        System.out.println("O número anterior ao informado é " + (a - 1) +" e o número posterior é " + (a + 1));
    }

    public void exercicio05() {
        System.out.println("Por favor informe o seu salário: ");
        double a = scanner.nextDouble();
        double salarioMinimo = 1293.20;

        double quantidadeSalarioMinimo = a / salarioMinimo;

        System.out.printf("Você ganha %.2f salários mínimos", quantidadeSalarioMinimo);
    }
}
