import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NomesAleatorios {
    public static void main(String[] args) {

        // Declara Arrays e Variáveis
        String nomes [] = {"João","Maria","José","Pedro","Ana","Paulo","Renato","Joana","Thaise","Joaquina","Fernanda","Paolla"};
        ArrayList<String> rangenomes = new ArrayList<>();
        ArrayList<String> amigosecreto = new ArrayList<>();

        // Insere lista de nomes no array de Range de Nomes
        rangenomes.addAll(List.of(nomes));

        //Faz Sorteio de nomes aleatórios

        do {

            //Randomiza um nome
            String nomesorteado = rangenomes.get(new Random().nextInt(rangenomes.size()));

            if (amigosecreto.isEmpty() || amigosecreto.contains(nomesorteado) == false) {
                amigosecreto.add(nomesorteado);
            }

        } while (amigosecreto.size()<rangenomes.size());

        //Imprime
        System.out.println("Lista de Participantes embaralhada: " + amigosecreto);
        System.out.println("O sorteio do amigo secreto começará agora...");

        // Match entre as pessoas participantes
        for(int i = 0;i < amigosecreto.size();i++){

            // Testa os nomes
            if (i < amigosecreto.size()-1) {
                String nomeparticipanteatual = amigosecreto.get(i);
                String nomeparticipanteproximo = amigosecreto.get(i + 1);
                System.out.println("O participante: " + nomeparticipanteatual + " saiu com o participante: " + nomeparticipanteproximo);
            } else {
                int j = amigosecreto.size() - amigosecreto.size();
                String nomeparticipanteatual = amigosecreto.get(i);
                String nomeparticipanteproximo = amigosecreto.get(j);
                System.out.println("O participante: " + nomeparticipanteatual + " saiu com o participante: " + nomeparticipanteproximo);
            }
        }

    }
}