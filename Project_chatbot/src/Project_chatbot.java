
import java.util.ArrayList;
import java.util.Scanner;

public class Project_chatbot {

    public static void main(String[] args) {

        Chatbot bot = new Chatbot();

        Resposta resp1 = new RespostaSimples("seu nome", "Eu sou o anhembiBot");
        Resposta resp2 = new RespostaSimples("oi", "Olá, no que posso ajudar?");
        Resposta resp3 = new RespostaSimples("sabe contar piadas", "Contar piada é minha especialidade!");
        Resposta resp4 = new RespostaSimples("voce sabe fazer", "Eu sei contar piada e resolver a formula de bhaskara");
        Resposta resp5 = new RespostaSimples("obrigado", "Estou aqui pra isso!");
        Resposta resp6 = new RespostaSimples("tchau", "Tchau! Qualquer coisa estou a disposição!");
        Resposta resp10 = new RespostaConta("bhaskara");
        Resposta resp11 = new Sair("/sair do chat");

        ArrayList<String> piadas = new ArrayList();
        piadas.add("Qual é o peixe que pulou da monttanha? AAAAAAAAAAtum");
        piadas.add("Você sabe como faz pra deixar um carteiro triste? \n"
                + "\n"
                + "Você mata a familia dele.");
        piadas.add("Você sabe como deixar alguém curioso?\n"
                + "\n"
                + "Eu conto amanhã.");
        Resposta resp7 = new RespostaAleatoria("uma piada", piadas);

        Resposta resp8 = new RespostaHora("horas");
        Resposta resp9 = new RespostaData("data");

        bot.adiciona(resp1);
        bot.adiciona(resp2);
        bot.adiciona(resp3);
        bot.adiciona(resp4);
        bot.adiciona(resp5);
        bot.adiciona(resp6);
        bot.adiciona(resp7);
        bot.adiciona(resp8);
        bot.adiciona(resp9);
        bot.adiciona(resp10);
        bot.adiciona(resp11);

        System.out.println("-----------------------------------");

        Scanner entrada = new Scanner(System.in);
        String textoUsuario;
        String nomeUsuario;

        System.out.println("Digite o seu nome para iniciar a conversa:");
        nomeUsuario = entrada.nextLine();
        System.out.println("-----------------------------------");
        
        while(true) {
            System.out.print(nomeUsuario + ": ");
            textoUsuario = entrada.nextLine();
            bot.processar(textoUsuario);
            
        }
    }
}
