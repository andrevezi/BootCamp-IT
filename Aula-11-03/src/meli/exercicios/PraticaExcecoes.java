package meli.exercicios;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;
        try {
            int result = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");

        } finally {
            System.out.println("Programa Finalizado");
        }
    }
}

