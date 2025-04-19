package exercicio;

import scanner.InputScanner;
import service.Pagamento;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Exercicio {

    private InputScanner inputScanner;
    private Pagamento pagamento;

    public Exercicio(InputScanner inputScanner) {
        this.inputScanner = inputScanner;
    }


    public int exercicio01() {

        int primeiroNumero = inputScanner.lerInteiro("Digite o Primeiro número inteiro: ");
        int segundoNumero = inputScanner.lerInteiro("Digite o Segundo número inteiro: ");
        int terceiroNumero = inputScanner.lerInteiro("Digite o Terceiro número inteiro: ");

        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma do primeiro e segundo número é " + soma);

        if (soma < terceiroNumero) {
            System.out.printf("A soma do primeiro e segundo número é %d, e é menor que c", soma);
        }
        return soma;
    }

    public String exercicio02() {
        int numero = inputScanner.lerInteiro("Digite um número inteiro: ");
        String mensagem = "";
        if (numero % 2 == 0) {
            if (numero >= 0) {
                mensagem = "O número é par e maior que 0.";
            } else {
                mensagem = "O número é par e menor que 0.";
            }
        } else {
            if (numero >= 0) {
                mensagem = "O número é ímpar e maior que 0.";
            } else {
                mensagem = "O número é ímpar e menor que 0.";
            }
        }
        return mensagem;
    }

    public int exercicio03() {
        int primeiroNumero = inputScanner.lerInteiro("Digite o Primeiro número inteiro: ");
        int segundoNumero = inputScanner.lerInteiro("Digite o Segundo número inteiro: ");
        int resultado;

        if (primeiroNumero == segundoNumero) {
            resultado = primeiroNumero + segundoNumero;
        } else {
            resultado = primeiroNumero * segundoNumero;
        }
        System.out.println("O valor da váriavel c é: " + resultado);
        return resultado;
    }

    public String exercicio04() {
        int numero = inputScanner.lerInteiro("Digite um número inteiro: ");

        return "O número anterior ao informado é " + (numero - 1) +" e o número posterior é " + (numero + 1);
    }

    public String exercicio05() {
        double salario = inputScanner.lerDouble("Por favor informe o seu salário: ");
        double salarioMinimo = 1293.20;

        double quantidadeSalarioMinimo = salario / salarioMinimo;

        String mensagem = String.format("Você ganha %.2f salários mínimos", quantidadeSalarioMinimo);

        return mensagem;
    }

    public String exercicio06() {
        int number = inputScanner.lerInteiro("Digite um número inteiro: ");

        double reajuste = (number + (number * 0.05));

        return "O valor informado foi reajustado em 5% e ficou com o valor de " + reajuste;
    }

    public boolean exercicio07() {
        boolean booleanA = inputScanner.lerBoolean("Digite o Primeiro valor booleano inteiro: ");
        boolean booleanB = inputScanner.lerBoolean("Digite o Segundo valor booleano inteiro: ");

        if (booleanA == true && booleanB == true) {
            System.out.println("Ambos sào VERDADEIROS.");
            return true;
        } else if (booleanA == true || booleanB == true) {
            System.out.println("Apenas um é verdadeiro.");
            return true;
        } else {
            System.out.println("Ambos são FALSOS.");
            return false;
        }
    }

    public int[] exercicio08() {
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
        return listaNumeros;
    }

    public String exercicio09() {
        int peso = inputScanner.lerInteiro("Por favor digite o seu peso: ");
        double altura = inputScanner.lerDouble("Por favor digite a sua altura: ");

        double imc = peso / (altura * altura);
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(imc);
    }

    public String exercicio10() {
        double notaAluno = inputScanner.lerDouble("Por favor informe a primeira nota: ");
        notaAluno += inputScanner.lerDouble("Por favor informe a segunda nota: ");
        notaAluno += inputScanner.lerDouble("Por favor informe a terceira nota: ");

        return new DecimalFormat("#.00").format(notaAluno/3);
    }

    public String exercicio11() {
        double notaAluno = inputScanner.lerDouble("Por favor informe a primeira nota do aluno: ");
        notaAluno += inputScanner.lerDouble("Por favor informe a segunda nota do aluno: ");
        notaAluno += inputScanner.lerDouble("Por favor informe a terceira nota do aluno: ");
        notaAluno += inputScanner.lerDouble("Por favor informe a quarta nota do aluno: ");

        double media = notaAluno / 4;

        if (media >= 7) {
            return "Aluno Aprovado";
        } else {
            return "Aluno reprovado";
        }
    }

    public BigDecimal exercicio12() {
        Pagamento pagamento = new Pagamento(0.15, 0.1);

        BigDecimal valorProduto = inputScanner.lerBigDecimal("Escaneie o código de barras para identificar o valor do produto: ");
        int formaPagamento = inputScanner.lerInteiro("Informe a forma de pagamento " +
                "(1. total ou 2. parcelado): ");

        if (formaPagamento == 1) {
            return pagamento.pagamentoTotal(valorProduto);
        } else if (formaPagamento == 2) {
            int quantidadeParcelas = inputScanner.lerInteiro("Quantas parcelas deseja fazer?");
            BigDecimal valorParcela = pagamento.pagamentoParcelado(valorProduto, quantidadeParcelas);
            System.out.println("O valor das parcelas ficou em " + valorParcela);
            return valorParcela;
        } else {
            System.out.println("Opção selecionada inválida.");
            return valorProduto;
        }
    }
}
