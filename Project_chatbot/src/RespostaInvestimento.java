
import java.text.DecimalFormat;
import java.util.Scanner;

public class RespostaInvestimento extends Resposta {

    private double valorMensal;
    private double valorInicial;
    private double taxa;
    private double saldo = valorMensal + valorInicial + (valorMensal * taxa);
    private double meses = 12;
    private char decisao;
    private char decisao2;

    DecimalFormat mil = new DecimalFormat("R$0,000.00");
    DecimalFormat cent = new DecimalFormat("R$000,00");

    public RespostaInvestimento(String palavraChave) {
        this.palavraChave = palavraChave;
        if (this.palavraChave == palavraChave) {
            System.out.println("Palavra '" + this.palavraChave + "' registrada com sucesso");
        }
    }

    public void CalcularInvestimento() {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 0; i++) {
            System.out.println("Saldo do investimento após :" + i + " meses" + (mil.format(valorInicial)));
            for (int j = 1; j <= meses; j++) {
                saldo += valorMensal;
                saldo += saldo * taxa;

                System.out.println("Saldo do investimento após :" + j + " meses" + (mil.format(saldo + valorInicial)));

            }
            System.out.println("Investimento calculado!");

            Scanner entrada = new Scanner(System.in);

            System.out.println("BOT: Quer calcular outro investimento? S/N ");
            decisao = entrada.next().charAt(0);

            switch (decisao) {
                case 'S':
                    produz();
                    break;
                case 's':
                    produz();
                    break;
                case 'N':
                    break;
                case 'n':
                    System.out.println("BOT: Calculos encerrados!");
                    break;
                default:
                    System.out.println("Nao entendi,insira sua resposta novamente!**ultima tentativa**");
                    
                    decisao2 = entrada.next().charAt(0);
                    switch (decisao) {
                        case 'S':
                            produz();
                            break;
                        case 's':
                            produz();
                            break;
                        case 'N':
                            break;
                        case 'n':
                            break;
                        default:
                            System.out.println("BOT: Calculos encerrados!");
                            break;
                    }
            }
        }
    }

    @Override
    public String produz() {

        valorMensal = 0;
        valorInicial = 0;
        taxa = 0;
        saldo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("BOT: OK, vamos lá!");

        System.out.println("Digite o Valor Inicial");
        valorInicial = scanner.nextDouble();

        System.out.println("Digite o Valor Investido por mês:");
        valorMensal = scanner.nextDouble();
        System.out.println("Digite a taxa de juros por mês:");
        taxa = scanner.nextDouble();
        taxa = taxa / 100;
        CalcularInvestimento();

        return this.resposta = "No que posso te ajudar agora?";
    }
}
