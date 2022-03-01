import java.util.Scanner;

public class RespostaConta extends Resposta {

    public RespostaConta(String palavraChave) {
        this.palavraChave = palavraChave;
        if (this.palavraChave == palavraChave) {
            System.out.println("Palavra '" + this.palavraChave + "' registrada com sucesso");
        }
    }
    
    public void bhaskara(double a, double b, double c){
        double d = 0;
        System.out.println("A Equação é: "+ a + "x² + " + b + "x + " + c + " = " + d);
        double delta;
        delta = (b*b)- (4*a*c);
        
        if(delta < 0){
            System.out.println("Delta = " + delta);
            System.out.println("A equação não possui valor real");
        }
        else{
            System.out.println("O valor do Delta é: "+ delta);
            double raizDelta = Math.sqrt(delta);
            System.out.println("A raiz do Delta é: "+ raizDelta);
            double raiz1, raiz2;
            
            raiz1 = ((-b)+ raizDelta)/ (2 * a);
            raiz2 = ((-b)- (Math.sqrt(delta)))/ (2 * a);
            
            System.out.println("As raizes da equação são: "+ raiz1 + " e "+ raiz2 );
        }
    }

    

    @Override
    public String produz() {
        Scanner entrada = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        System.out.println("BOT: OK, vamos lá!");
        System.out.println("Digite os numeros da equação:");
        System.out.print("A: ");
        a = entrada.nextInt();
        System.out.print("B: ");
        b = entrada.nextInt();
        System.out.print("C: ");
        c = entrada.nextInt();
        
        bhaskara(a, b, c);
        
        return this.resposta = "Resolvido!";
    }

}
