package br.com.digitalhouse.Exercício2;

import java.util.List;

public class Fatura {

    private Integer numeroItemFaturado;
    private String descricaoItem;
    private Integer quantidadeComprada;

    public void setPrecoUnitarioItem(Double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }

    private Double precoUnitarioItem;


    public Double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public Integer getQuantidadeComprada(){
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(Integer novaQuantidade){
        quantidadeComprada = novaQuantidade;
    }

    public Double getTotalFatura(){
        return quantidadeComprada * precoUnitarioItem;
    }

    public void fatura
            (Integer numeroItemFaturado,String descricaoItem,Integer quantidadeComprada,Double precoUnitarioItem){

        setNumeroItemFaturado(numeroItemFaturado);
        setDescricaoItem(descricaoItem);
        setQuantidadeComprada(quantidadeComprada);
        setPrecoUnitarioItem(precoUnitarioItem);

        if(quantidadeComprada < 1){
            quantidadeComprada = 0;
        }
        if(precoUnitarioItem < 0.0d){
            precoUnitarioItem=0.0;
        }
    }

    public Integer getNumeroItemFaturado(){
        return numeroItemFaturado;
    }

    public void setNumeroItemFaturado(Integer novoNumero){
        numeroItemFaturado = novoNumero;
    }


    public String getDescricaoItem(){
        return descricaoItem;
    }

    public void setDescricaoItem(String novaDescricao){
        descricaoItem = novaDescricao;
    }

}
