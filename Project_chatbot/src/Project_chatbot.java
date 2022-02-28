
import java.util.ArrayList;
import java.util.Scanner;

public class Project_chatbot {

    public static void main(String[] args) {

        Chatbot bot = new Chatbot();

        Resposta resp1 = new RespostaSimples("nome", "Eu sou o anhembiBot");
        Resposta resp2 = new RespostaSimples("oi", "Olá, no que posso ajudar?");
        

        ArrayList<String> piadas = new ArrayList();
        piadas.add("Qual é o peixe que pulou da monttanha? AAAAAAAAAAtum");
        piadas.add("b");
        piadas.add("Como deixar alguém curioso?\n"
                + "\n"
                + "Eu conto amanhã.");
        Resposta resp3 = new RespostaAleatoria("piada", piadas);
        Resposta resp4 = new RespostaHora("hora");

        bot.adiciona(resp1);
        bot.adiciona(resp2);
        bot.adiciona(resp3);
        bot.adiciona(resp4);

        Scanner entrada = new Scanner(System.in);
        String texto;
        String nomeUsuario;

        while (true) {
            System.out.print("Você:");
            texto = entrada.nextLine();
            bot.processar(texto);
        }
    }

}
