import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Descrição do curso de Java Básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Intermediário");
        curso2.setDescricao("Descrição do curso de Java Intermediário");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como fazer um bom currículo");
        mentoria.setDescricao("Descrição da mentoria de como fazer um bom currículo");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev rodrigo = new Dev();
        rodrigo.setNome("Rodrigo");
        rodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Rodrigo: " + rodrigo.getConteudosInscritos());

        rodrigo.progredir();
        rodrigo.progredir();
        System.out.println("-------------------");
        System.out.println("Conteúdos inscritos de Rodrigo: " + rodrigo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Rodrigo: " + rodrigo.getConteudosConcluidos());
        System.out.println("XP de Rodrigo: " + rodrigo.calcularTotalXp());

        System.out.println("-------------------");

        Dev rin = new Dev();
        rin.setNome("Rin");
        rin.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Rin: " + rin.getConteudosInscritos());

        rin.progredir();
        rin.progredir();
        rin.progredir();
        System.out.println("-------------------");
        System.out.println("Conteúdos inscritos de Rin: " + rin.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Rin: " + rin.getConteudosConcluidos());
        System.out.println("XP de Rin: " + rin.calcularTotalXp());
    }
}
