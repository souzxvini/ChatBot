
import java.util.Scanner;

public class RespostaTabuada extends Resposta {

    public RespostaTabuada(String palavraChave) {
        this.palavraChave = palavraChave;
        if (this.palavraChave == palavraChave) {
            System.out.println("Palavra '" + this.palavraChave + "' registrada com sucesso");
        }
    }

    public void CalcularTabuada() {
        Scanner entrada = new Scanner(System.in);

        int a;

        System.out.println("BOT: OK, vamos la!");

        System.out.println("Digite o número da tabuada você quer: ");
        a = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + "= " + i * a);
        }

        System.out.println("BOT: Você quer calcular a tabuada de mais algum número? S/N");
        this.resposta = entrada.next();

        switch (this.resposta) {
            case "S":
                CalcularTabuada();
                break;
            case "s":
                CalcularTabuada();
                break;
            case "n":
                break;
            default:
                System.out.println("BOT: Nao entendi,insira sua resposta novamente(S/N)  **ultima tentativa**");
                this.resposta = entrada.next();
                switch (this.resposta) {
                    case "S":
                        CalcularTabuada();
                        break;
                    case "s":
                        CalcularTabuada();
                        break;
                    case "n":
                        break;
                    case "N":
                        break;
                    default:
                        System.out.println("BOT: Calculos encerrados!");
                        break;
                }
                break;
        }
    }

    @Override
    public String produz() {
        CalcularTabuada();
        return "conta encerrada";

    }
}
