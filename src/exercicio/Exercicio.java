package exercicio;

import scanner.InputScanner;
import service.Pagamento;
import service.Triangulo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Exercicio {

    private InputScanner inputScanner;

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

    public String exercicio13() {
        String nome = inputScanner.lerString("Por favor informe seu nome: ");
        int idade = inputScanner.lerInteiro("Por favor digite sua idade: ");

        if (idade < 18) {
            return "Olá " + nome + ". Você é menor de idade.";
        } else {
            return "Olá " + nome + ". Você já é maior de idade.";
        }
    }

    public String exercicio14() {
        int valorA = inputScanner.lerInteiro("Por favor digite um valor inteiro");
        int valorB = inputScanner.lerInteiro("Por favor digite outro valor inteiro");

        int temp = valorA;
        valorA = valorB;
        valorB = temp;

        return valorA + " " + valorB;
    }

    public String exercicio15() {
        int anoNascimento = inputScanner.lerInteiro("Por favor digite o ano em que você nasceu: ");
        LocalDate date = LocalDate.now().minusYears(anoNascimento);

        int year = date.getYear();
        int month = date.getMonthValue();
        int dayMonth = date.getDayOfMonth();

        return String.format("Você já viveu %d anos, %d meses e %d dias", year, month,dayMonth);
    }

    public String exercicio16() {
        int ladoUmTriangulo = inputScanner.lerInteiro("Por favor informe o primeiro lado do triangulo: ");
        int ladoDoisTriangulo = inputScanner.lerInteiro("Por favor informe o segundo lado do triangulo: ");
        int ladoTresTriangulo = inputScanner.lerInteiro("Por favor informe o ultimo lado do triangulo: ");

        Triangulo triangulo = new Triangulo(ladoUmTriangulo, ladoDoisTriangulo, ladoTresTriangulo);

        return triangulo.tipoTriangulo();
    }

    public int exercicio17() {
        int fahrenheit = inputScanner.lerInteiro("Digite um valor em Fahrenheit: ");

        int celsus = (5 * (fahrenheit - 32)/ 9);

        return celsus;
    }

    public String exercicio18() {
        double francisco = 1.50;
        double crescimentoFrancisco = 0.02;
        double sara = 1.10;
        double crescimentoSara = 0.03;

        double ano = (francisco - sara) / (crescimentoFrancisco - crescimentoSara);
        int anosNecessarios = (int) Math.ceil(ano);

        double franciscoAlturaFinal = francisco * crescimentoFrancisco * anosNecessarios;
        double saraAlturaFinal = sara * crescimentoSara * anosNecessarios;

        String mensagem = String.format(
                "Sara vai demorar %s anos para ficar maior que Francisco.\nEla vai ficar com %.2f metros e ele com %.2f metros.\nNão vão parar de crescer?",
                anosNecessarios, saraAlturaFinal, franciscoAlturaFinal);

        return mensagem;
    }

    public String exercicio19() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Vamos ver a tabuada:\n ");

        for (int i = 1; i < 11; i++) {
            mensagem.append(String.format("Tabuada do número %d: \n", i));

            for (int j = 0; j < 11; j++) {
                mensagem.append(String.format("%d * %2d = %3d", i, j, i*j));
                if (j < 10) {
                mensagem.append("\n");
                }
            }
            mensagem.append("\n-----------------------\n");
        }

        return mensagem.toString();
    }

    public String exercicio20() {
        int numero = inputScanner.lerInteiro("Por favor informe um número inteiro para calcular a tabuada: ");
        StringBuilder mensagem = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            mensagem.append(String.format("%d * %d = %d", numero, i, numero * i));
            if (i < 10)
                mensagem.append("\n");
        }

        return mensagem.toString();
    }


    public void fecharScanner() {
        inputScanner.fecharScanner();
    }
}
