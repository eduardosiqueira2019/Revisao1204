package br.com.digitalhouse.Exercicio3;

public class Estoque {

    private String nome;
    private int qtdeAtual;
    private int qtdeMinima;

    public void dadosEstoque(){

    }

    public void dadosEstoque(String nome, int qtdeAtual, int qtdeMinima){
        this.nome = nome;
        if(qtdeAtual < 0 ){
            qtdeAtual = 0;
        } else {
            this.qtdeAtual = qtdeAtual;
        }
        if(qtdeMinima < 0 ){
            qtdeMinima = 0;
        } else
        {
            this.qtdeMinima = qtdeMinima;
        }
    }

    public void mudarNome(String nome){
        this.nome = nome;
    }

    public void mudarQtdMinima(int qtdMinima){
        this.qtdeMinima = qtdMinima;
    }

    public  void repor(int qtd){
        this.qtdeAtual += qtd;
    }

    public void darBaixa(int qtd){
        qtdeAtual -= qtd;
        if(qtdeAtual < 0 ){
            qtdeAtual = 0;
        } else {
            qtdeAtual = qtdeAtual;
        }

    }

    public void mostra(){
        System.out.println("Produto: " + nome + ".\n" + "Qtde Atual: " + qtdeAtual + ".\n" + "Qtde Mínima: " + qtdeMinima + ".");
    }

    public boolean precisaRepor(){
        return qtdeAtual <= qtdeMinima;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        nome = novoNome;
    }

    public int getQtdeAtual(){
        return qtdeAtual;
    }
    public void setQtdeAtual(int novaQtde){
        qtdeAtual = novaQtde;
    }

    public int getQtdeMinima (){
        return qtdeMinima;
    }
    public void setQtdeMinima(int novaQtde) {
        qtdeMinima = novaQtde;
    }
}
