package desafio;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        curso curso1 = new curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        curso curso2 = new curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        mentoria mentoria = new mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao da mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("bootcamp java");
        bootcamp.setDescricao("descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        dev devNicole = new dev();
        devNicole.setNome("Nicole");
        devNicole.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos: " + devNicole.getConteudosInscritos());
        devNicole.progredir();
        devNicole.progredir();
        System.out.println("conteudos inscritos: " + devNicole.getConteudosInscritos());
        System.out.println("conteudos concluidos: " + devNicole.getConteudosConcluidos());
        System.out.println("XP: " + devNicole.calcularTotalXp());


        dev devDiego = new dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos: " + devDiego.getConteudosInscritos());
        devDiego.progredir();
        System.out.println("conteudos inscritos: " + devDiego.getConteudosInscritos());
        System.out.println("conteudos concluidos: " + devDiego.getConteudosConcluidos());
        System.out.println("XP: " + devDiego.calcularTotalXp());

    }
}
