package br.com.digitalhouse.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    private String horaInicioAula;
    private String horaFimAula;
    private List<String> aulas = new ArrayList<>();

    public String getHoraInicioAula(){
        return horaInicioAula;
    }
    public void setHoraInicioAula(String novoInicio){
        horaInicioAula = novoInicio;
    }

    public String getHoraFimAula(){
        return horaFimAula;
    }
    public void setHoraFimAula(String novoFim){
        horaFimAula = novoFim;
    }

    public void setAulas(String novaAula){
        if (!aulas.contains(novaAula)){
            aulas.add(novaAula);
        } else {
            System.out.println("Aula já cadastrada !");
        }
    }
}
