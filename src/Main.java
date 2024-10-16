import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Curso curso1 = new Curso("Java Básico", "Descrição do curso de Java Básico", 8);
            Curso curso2 = new Curso("Java Intermediário", "Descrição do curso de Java Intermediário", 4);

            Mentoria mentoria = new Mentoria("Como fazer um bom currículo", "Descrição da mentoria de como fazer um bom currículo", LocalDate.now());

            Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
            bootcamp.adicionarConteudo(curso1);
            bootcamp.adicionarConteudo(curso2);
            bootcamp.adicionarConteudo(mentoria);

            Dev rodrigo = new Dev("Rodrigo");
            rodrigo.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos inscritos de Rodrigo: " + rodrigo.getConteudosInscritos());

            rodrigo.progredir();
            rodrigo.progredir();
            System.out.println("-------------------");
            System.out.println("Conteúdos inscritos de Rodrigo: " + rodrigo.getConteudosInscritos());
            System.out.println("Conteúdos concluídos de Rodrigo: " + rodrigo.getConteudosConcluidos());
            System.out.println("XP de Rodrigo: " + rodrigo.calcularTotalXp());

            System.out.println("-------------------");

            Dev rin = new Dev("Rin");
            rin.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos inscritos de Rin: " + rin.getConteudosInscritos());

            rin.progredir();
            rin.progredir();
            rin.progredir();
            System.out.println("-------------------");
            System.out.println("Conteúdos inscritos de Rin: " + rin.getConteudosInscritos());
            System.out.println("Conteúdos concluídos de Rin: " + rin.getConteudosConcluidos());
            System.out.println("XP de Rin: " + rin.calcularTotalXp());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}