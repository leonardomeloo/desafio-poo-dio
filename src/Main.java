import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Curso Java", "Curso Java", 8);
        System.out.println(curso1);

        Curso curso2 = new Curso("Curso JS", "Matricule-se no curso de JS", 4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Mentoria destinada a alunos de JAVA", LocalDate.now());
        System.out.println(mentoria);

    }
}
