package meli.exercicio.produtos;

import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {

        Produto[] produtos = {new Pereciveis(1, "banana", 3)
                , new NaoPereciveis("enlatado", "Salsicha", 5)
                , new Pereciveis(3, "Abacaxi", 2)
                , new NaoPereciveis("utensílios", "Garfo", 10)};

        double total = 0;
        int qtde = 5;
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("O produto: "+produtos[i].getNome()+ " sai por: R$"+produtos[i].calcular(qtde));
            total = total + produtos[i].calcular(qtde);
        }
        System.out.println("O total da compra é de: R$"+ total);

    }
}

