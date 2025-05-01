package service;

public class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean testarLadosTriangulo() {
        if (ladoA + ladoB <= ladoC ||
                ladoA + ladoC <= ladoB ||
                ladoB + ladoC <=ladoA ||
                ladoA <=0 || ladoB <=0 || ladoC <=0) {

            return false;
        }
        return true;
    }

    public String tipoTriangulo() {
        if (!testarLadosTriangulo()) {
            return "Os lados fornecidos não formam um triangulo válido.";
        }

        if (ladoA == ladoB && ladoB == ladoC) {
            return "Temos um triângulo equilátero, onde todos os seus lados são iguais";
        } else if (ladoA == ladoB && ladoA != ladoC ||
                ladoA == ladoC && ladoC != ladoB ||
                ladoB == ladoC && ladoB != ladoA) {
            return "Temos um triângulo isósceles, onde temos dois lados iguais.";
        } else {
            return "Temos um triângulo escaleno, onde nenhum dos lados é igual.";
        }
    }
}
