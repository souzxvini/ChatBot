
import java.util.ArrayList;
import java.util.Scanner;

public class Project_chatbot {

    public static void main(String[] args) {

        Chatbot bot = new Chatbot();

        // criando palavras chaves e respostas, o primeiro parametro eh a palavra chave e o segundo parametro eh a resposta
        Resposta resp1 = new RespostaSimples("seu nome", "Eu sou o anhembiBot");
        Resposta resp2 = new RespostaSimples("oi", "Ola, no que posso ajudar?");
        Resposta resp3 = new RespostaSimples("sabe contar piadas", "Contar piada eh minha especialidade!");
        Resposta resp13 = new RespostaSimples("sabe contar piada", "Contar piada eh minha especialidade!");
        Resposta resp15 = new RespostaSimples("quem eh o presidente do Brasil", "O atual presidente do Brasil eh o Jair Messias Bolsonaro");
        
        Resposta resp4 = new RespostaSimples("voce sabe fazer", "Eu sei contar piadas, sei resolver a formula de bhaskara e posso calcular investimentos pra voce!");
        
        Resposta resp5 = new RespostaSimples("obrigado", "Estou aqui pra isso!");
        Resposta resp6 = new RespostaSimples("tchau", "Tchau! Qualquer coisa estou a disposicao!");

        /*O parametro passado nesse metodo sera a key para o bot iniciar o calculo da formula de bhaskara*/
        Resposta resp10 = new RespostaConta("bhaskara");

        /*O parametro que for passado nesse metodo, ao ser digitado pelo usuario no chat, ira encerrar a conversa*/
        Resposta resp11 = new Sair("/sair");

        /*Aqui eu criei um array list para armazenar piadas*/
        ArrayList<String> piadas = new ArrayList();
        piadas.add("Qual eh o peixe que pulou da monttanha? AAAAAAAAAtum");
        piadas.add("Sabe o que o melao estava fazendo de maos dadas com o mamao perto de Copacabana?\n"
                + "Levando o mamao papaya."
        );
        piadas.add("Voce sabe como deixar alguem curioso?\n"
                + "\n"
                + "Eu conto amanha.");
        /*Aqui, o primeiro parametro eh a palavra chave que vai retornar alguma piada do array list piadas*/
        Resposta resp7 = new RespostaAleatoria("uma piada", piadas);

        /*O parametro passado nesse metodo sera a key para o bot responder as horas*/
        Resposta resp8 = new RespostaHora("horas");

        /*O parametro passado nesse método sera a key para o bot responder a Data*/
        Resposta resp9 = new RespostaData("data");
        
        Resposta resp12 = new RespostaInvestimento("investimento");
        
        Resposta resp14 = new RespostaTabuada("tabuada");

        /*Apos criar todas as respostas, voce deve adicionar elas em um array de respostas na classe Chatbot*/
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
        bot.adiciona(resp12);
        bot.adiciona(resp13);
        bot.adiciona(resp14);
        bot.adiciona(resp15);
        
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
