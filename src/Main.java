import exercicio.Exercicio;
import scanner.InputScanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner();
        Exercicio exercicio = new Exercicio(inputScanner);
        System.out.println(exercicio.exercicio17());
        exercicio.fecharScanner();

    }

}