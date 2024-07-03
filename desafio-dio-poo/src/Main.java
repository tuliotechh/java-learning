import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descrição Curso Java");
        curso1.setTitulo("Java");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Conteudos conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devTulio = new Dev();
        devTulio.setNome("Tulio");
        devTulio.inscrever(bootcamp);
        System.out.println("Conteudos Incritos Tulio" + devTulio.getConteudosIncritos());

        Dev devMarco = new Dev();
        devMarco.setNome("Marco");
        devMarco.inscrever(bootcamp);
        System.out.println("Conteudos Incritos Marco" + devMarco.getConteudosIncritos());

    }
}