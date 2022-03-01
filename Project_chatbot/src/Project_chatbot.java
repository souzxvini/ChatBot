
import java.util.ArrayList;
import java.util.Scanner;

public class Project_chatbot {

    public static void main(String[] args) {

        Chatbot bot = new Chatbot();

        // criando palavras chaves e respostas, o primeiro parametro é a palavra chave e o segundo parametro é a resposta
        Resposta resp1 = new RespostaSimples("seu nome", "Eu sou o anhembiBot");
        Resposta resp2 = new RespostaSimples("oi", "Olá, no que posso ajudar?");
        Resposta resp3 = new RespostaSimples("sabe contar piadas", "Contar piada é minha especialidade!");
        Resposta resp4 = new RespostaSimples("voce sabe fazer", "Eu sei contar piada e resolver a formula de bhaskara");
        Resposta resp5 = new RespostaSimples("obrigado", "Estou aqui pra isso!");
        Resposta resp6 = new RespostaSimples("tchau", "Tchau! Qualquer coisa estou a disposição!");

        /*O parâmetro passado nesse método será a key para o bot iniciar o cálculo da formula de bhaskara*/
        Resposta resp10 = new RespostaConta("bhaskara");

        /*O parãmetro que for passado nesse método, ao ser digitado pelo usuário no chat, irá encerrar a conversa*/
        Resposta resp11 = new Sair("/sair do chat");

        /*Aqui eu criei um array list para armazenar piadas*/
        ArrayList<String> piadas = new ArrayList();
        piadas.add("Qual é o peixe que pulou da monttanha? AAAAAAAAAAtum");
        piadas.add("Sabe o que o melão estava fazendo de mãos dadas com o mamão perto de Copacabana?\n"
                + "Levando o mamão papaya."
        );
        piadas.add("Você sabe como deixar alguém curioso?\n"
                + "\n"
                + "Eu conto amanhã.");
        /*Aqui, o primeiro parâmetro é a palavra chave que vai retornar alguma piada do array list piadas*/
        Resposta resp7 = new RespostaAleatoria("uma piada", piadas);

        /*O parâmetro passado nesse método será a key para o bot responder as horas*/
        Resposta resp8 = new RespostaHora("horas");

        /*O parâmetro passado nesse método será a key para o bot responder a Data*/
        Resposta resp9 = new RespostaData("data");

        /*Após criar todas as respostas, você deve adicionar elas em um array de respostas na classe Chatbot*/
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

        while (true) {
            System.out.print(nomeUsuario + ": ");
            textoUsuario = entrada.nextLine();
            bot.processar(textoUsuario);

        }
    }
}
