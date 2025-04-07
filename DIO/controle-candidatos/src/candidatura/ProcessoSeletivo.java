package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
  }
    static void entrandoEmContato(String[] candidatos){
        for (int i = 0; i < candidatos.length; i++) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM O CANDIDATO " + candidatos[i]);
            } while (continuarTentando && tentativasRealizadas < 3);
            if (!atendeu){
                System.out.println("O CANDIDATO " + candidatos[i] + " NAO ATENDEU O TELEFONE");
            }
        }
    }
  //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"João", "Maria", "José", "Ana", "Pedro", "Lucas", "Fernanda", "Carla", "Roberto", "Patrícia"};
        String[] candidatoSelecionado = new String[5];
        int candidatosSelecionados =0;
        int candidatoAtual =0;
        double salarioBase=2000.0;
        while (candidatosSelecionados<5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatoSelecionado[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        imprimirSelecionados(candidatoSelecionado);
        entrandoEmContato(candidatoSelecionado);
    }
    static void imprimirSelecionados(String[] candidatos){
        System.out.println("================================================================");
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice=0; indice < candidatos.length; indice++){
            if (candidatos[indice]==null){
                continue;
            }
            System.out.println("O candidato de Numero " + (indice+1) + " e " + candidatos[indice]);
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
