package Candidatura;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Marco", "Tulio", "Santiago", "Garcia"};
        for (String candidato : candidatos){

        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atender();

            if (continuaTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuaTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM O "+candidato+" NA "+tentativasRealizadas+" TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O "+candidato+" NUMERO MAXIMO DE TENTATIVAS "+tentativasRealizadas+" REALIZADA");
    }

    // Metodo Auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Marco", "Tulio", "Santiago", "Garcia"};
        System.out.println("Imprimindo a lista de candidatos...");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato n: " + (i + 1) + " é " + candidatos[i]);
        }
        System.out.println("Forma abreviada (for each): ");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

        static void selecaoCandidato() {
        String[] candidatos = {"Marco", "Tulio", "Santiago", "Garcia", "Brunno", "Oliveira", "Bernardes", "Marcos", "Vinicios", "Ferreira"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioB = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioP = valorPretendido();

            System.out.println("O Candidado " + candidato + " solicitou este valor de salario " + salarioP);
            if (salarioB >= salarioP) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }
    static void analisarCandidato(double salarioP){
        double salarioB = 2000.0;

        if (salarioB > salarioP){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioB == salarioP){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
