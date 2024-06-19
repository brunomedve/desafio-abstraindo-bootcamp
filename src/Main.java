import java.time.LocalDate;

import br_com_dio_dominio.Bootcamp;
import br_com_dio_dominio.Curso;
import br_com_dio_dominio.Dev;
import br_com_dio_dominio.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso java");
        curso1.setCargaHoraria(80);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso javaScript");
        curso2.setCargaHoraria(120);

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bruno: " + devBruno.getConteudosInscritos());

        Dev devAlberto = new Dev();
        devAlberto.setNome("Alberto");
        devAlberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alberto:" + devAlberto.getConteudosInscritos());

    }
}
