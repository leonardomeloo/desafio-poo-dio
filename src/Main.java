import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso(8);
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: Curso JAVA");
        System.out.println(curso1);

        Curso curso2 = new Curso(4);
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Matricule-se no curso de JS");
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria(LocalDate.now());
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria destinada a alunos de JAVA");
        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        Dev devCamila = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootCamp);
        devLeonardo.progredir();
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("Conteudos inscritos: " + devLeonardo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devLeonardo.getConteudosConcluidos());
        System.out.println("XP: " + devLeonardo.calcularTotalXp());
        System.out.println("Conteudos inscritos: " + devLeonardo.getConteudosInscritos());
        
        // devCamila.setNome("Camila");
        // devCamila.inscreverBootcamp(bootCamp);
        // System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
        // System.out.println("Conteudos Concluidos: " + devCamila.getConteudosConcluidos());

        

    }
}
