package br.com.digitalhouse.Exercicio1;

public class Professor implements Docente {

    private String nomeProfessor;
    private String numeroRD;

    public String getNomeProfessor(){
        return nomeProfessor;
    }

    public void setNomeProfessor(String novoPofessor){
        nomeProfessor = novoPofessor;
    }

    @Override
    public void darAulas() {

    }

    @Override
    public void fazerChamadas() {

    }
}
