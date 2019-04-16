package br.com.digitalhouse.Exercicio3;

public class Principal {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.dadosEstoque("Amendocrem",10,1);

        System.out.println(estoque.getNome());
        System.out.println(estoque.getQtdeAtual());
        System.out.println(estoque.getQtdeMinima());

        estoque.mostra();
        estoque.darBaixa(15);
        estoque.mostra();
        System.out.println(estoque.precisaRepor());
    }
}
