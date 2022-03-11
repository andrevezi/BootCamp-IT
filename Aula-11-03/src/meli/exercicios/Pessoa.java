package meli.exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private int peso;
    private double altura;

    public Pessoa() {

    }
    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }
    public Pessoa(String nome, int idade, String ID, int peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }
    public int calcularIMC() {
        double imc = peso/(Math.pow(altura, 2));
        int result = 0;

        if(imc < 20) {
            result = -1;
        }else if (imc > 25)  {
            result = 1;
        }
        return result;
    }
    public boolean ehMaiorIdade() {
        boolean result = true;
        if(idade < 18) {
            result = false;
        }
        return result;
    }
    @Override
    public String toString() {
        BigDecimal imc = new BigDecimal(peso/(Math.pow(altura, 2)));
        return "Usuário \n" +
                "------------------------------------\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + " anos\n" +
                "ID: " + ID +  "\n" +
                "Altura: "+ altura + " metros\n" +
                "Peso: " + peso + " kgs\n" +
                "IMC: " + imc.setScale(2, RoundingMode.HALF_EVEN)  + "\n" +
                "Maior de idade: " + (ehMaiorIdade()? "Sim": "Não") +
                "\n------------------------------------";
    }
}
