package br.com.digitalhouse.Exercicio1;

public class Principal {

    /*Realizar o cadastro de um professor, aluno, curso e matéria.
    Imprimir as seguintes informações de registro:
    -   nome do aluno
    -   curso do aluno
        -   detalhes do curso:
            -   nome do curso
            -   matérias
            -   professor
            -   horário das aulas

     */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Materia materia = new Materia();
        Professor professor = new Professor();
        Aula aula = new Aula();

        professor.setNomeProfessor("Tairo");
        aluno.setNomeAluno("Eduardo");
        curso.setNomeCurso("Android");
        materia.setNomeMateria("Informática");
        aula.setAulas("Orientação a Objeto");
        aula.setHoraInicioAula("19:00");
        aula.setHoraFimAula("22:30");

        System.out.println("Aluno: " + aluno.getNomeAluno());

        System.out.println("Curso:" + curso.getNomeCurso());

        System.out.println("Matérias deste curso:");
        System.out.println(materia.getMaterias().get(0));

        System.out.println("Professor Responsável: " + professor.getNomeProfessor());

        System.out.println("Horários das aulas: Das " + aula.getHoraInicioAula() + " às " + aula.getHoraFimAula());

    }
}
