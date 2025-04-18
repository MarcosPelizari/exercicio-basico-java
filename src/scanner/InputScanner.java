package scanner;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner {

    private int tentativas = 0;
    private int maxTentativas = 5;
    private Scanner scanner;

    public InputScanner() {
        this.scanner = new Scanner(System.in);
    }

    public int lerInteiro(String mensagem) {
        while (tentativas < maxTentativas) {
            try {
                System.out.println(mensagem);
                int numeroRetorno = scanner.nextInt();
                scanner.nextLine();
                return numeroRetorno;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor digite um número Inteiro.");
                scanner.nextLine();
                tentativas++;
            }
        }
        System.out.println("Número máximo de tentativas atingido.");
        return 0;
    }

    public double lerDouble(String mensagem) {
        while (tentativas < maxTentativas) {
            try {
                System.out.println(mensagem);
                Double doubleRetorno = scanner.nextDouble();
                scanner.nextLine();
                return doubleRetorno;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor digite um número Decimal.");
                scanner.nextLine();
                tentativas++;
            }
        }
        System.out.println("Número máximo de tentativas atingido.");
        return 0;
    }

    public boolean lerBoolean(String mensagem) {
        while (tentativas < maxTentativas) {
            try {
                System.out.println(mensagem);
                boolean booleanRetorno = scanner.nextBoolean();
                scanner.nextLine();
                return booleanRetorno;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
                scanner.nextLine();
                tentativas++;
            }
        }
        System.out.println("Número máximo de tentativas atingido.");
        return false;
    }

    public BigDecimal lerBigDecimal(String mensagem) {
        while (tentativas < maxTentativas) {
            try {
                System.out.println(mensagem);
                BigDecimal valor = scanner.nextBigDecimal();
                scanner.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida.");
                scanner.nextLine();
                tentativas++;
            }
        }
        System.out.println("Número máximo de tentativas atingido.");
        return null;
    }

    public String lerString(String mensagem) {
        while (tentativas < maxTentativas) {
            try {
                System.out.println(mensagem);
                return scanner.nextLine();
            } catch (InputMismatchException e) {}
            System.out.println("Entrada inválida.");
            scanner.nextLine();
            tentativas++;
        }
        System.out.println("Número máximo de tentativas atingido.");
        return null;
    }

    public void fecharScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
