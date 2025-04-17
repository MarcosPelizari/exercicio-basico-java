package scanner;

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
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor digite um número Inteiro.");
                scanner.nextInt();
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
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor digite um número Decimal.");
                scanner.nextDouble();
            }
        }
        System.out.println("Número máximo de tentativas atingido.");
        return 0;
    }

    public boolean lerBoolean(String mensagem) {
        while (tentativas < maxTentativas) {
            try {
                System.out.println(mensagem);
                return scanner.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite 'true' ou 'false'.");
                scanner.nextBoolean();
            }
        }
        System.out.println("Número máximo de tentativas atingido.");
        return false;
    }

    public void fecharScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
