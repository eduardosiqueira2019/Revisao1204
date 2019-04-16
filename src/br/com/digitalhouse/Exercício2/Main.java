package br.com.digitalhouse.Exercício2;

public class Main {

    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.fatura(1,"Monitor",178,7660.90);

        System.out.println(fatura.getNumeroItemFaturado());
        System.out.println(fatura.getDescricaoItem());
        System.out.println(fatura.getQuantidadeComprada());
        System.out.println(fatura.getPrecoUnitarioItem());
    }
}
