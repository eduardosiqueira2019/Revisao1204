package br.com.digitalhouse.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private List<String> materias= new ArrayList();

    public List<String> getMaterias(){
        return materias;
    }

    public void setNomeMateria(String novaMateria) {

        if (!materias.contains(novaMateria)) {
            materias.add(novaMateria);
        } else {
            System.out.println("Essa matéria já foi cadastrada.");
        }


    }

}