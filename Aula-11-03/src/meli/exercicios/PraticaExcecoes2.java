package meli.exercicios;

public class PraticaExcecoes2 {
    public static double dividir(int a, int b) {
        if(b == 0) throw new IllegalArgumentException("Não pode ser dividido por zero");
        return a/b;
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        dividir(b,a);
        try {
            int result = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");

        } finally {
            System.out.println("Programa Finalizado");
        }
    }
}
