import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro("Effective Java", "Joshua Bloch", LocalDate.of(2017, 12, 28));
        biblioteca.adicionarLivro("Java: The Complete Reference", "Herbert Schildt", LocalDate.of(2018, 4, 11));
        biblioteca.adicionarLivro("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", LocalDate.of(2008, 8, 1));
        biblioteca.adicionarLivro("Head First Java", "Kathy Sierra e Bert Bates", LocalDate.of(2005, 2, 1));
        biblioteca.adicionarLivro("Java Concurrency in Practice", "Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, e Doug Lea", LocalDate.of(2006, 5, 9));

        System.out.println("Lista de livros na biblioteca:");
        biblioteca.listarLivros();

        System.out.println("\nTentando emprestar o livro 'Effective Java':");
        biblioteca.emprestarLivro("Effective Java");

        System.out.println("\nLista de livros após empréstimo:");
        biblioteca.listarLivros();

        System.out.println("\nTentando devolver o livro 'Effective Java':");
        biblioteca.devolverLivro("Effective Java");

        System.out.println("\nLista de livros após devolução:");
        biblioteca.listarLivros();

        System.out.println("\nTentando devolver o livro 'Effective Java' novamente:");
        biblioteca.devolverLivro("Effective Java");

        System.out.println("\nTentando devolver um livro não existente:");
        biblioteca.devolverLivro("The Catcher in the Rye");

    }

}
