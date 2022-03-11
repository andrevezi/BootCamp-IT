package meli.exercicios;

public class Main {
    public static void checkIMC(int indice) {
        switch(indice) {
            case -1:
                System.out.println("Nível de peso: Abaixo do peso");
                break;
            case 0:
                System.out.println("Nível de peso: Peso saudável");
                break;
            case 1:
                System.out.println("Nível de peso: Sobrepeso");
                break;
        }
    }
    public static void checkIdade(boolean validador){
        if(validador) {
            System.out.println("O usuário é maior de idade");
        } else {
            System.out.println("O usuário é menor de idade");
        }
    }
    public static void main(String[] args) {
        Pessoa sem_parametro = new Pessoa();
        Pessoa nome_idade_id = new Pessoa("Elisa",30 , "p#12");
        Pessoa todos_parametros = new Pessoa("Rogerio", 17, "p25", 60, 1.74);
        //Pessoa nome_idade = new Pessoa("Valter", 46); aponta erro de construtor

        // Calculando imc
        int imc = todos_parametros.calcularIMC();
        checkIMC(imc);
        // Verificando idade
        boolean verificaIdade = todos_parametros.ehMaiorIdade();
        checkIdade(verificaIdade);
        // Imprimindo dados
        System.out.println(todos_parametros.toString());
    }
}
