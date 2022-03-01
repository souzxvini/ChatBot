
public class Sair extends Resposta {
    
    public Sair(String palavraChave) {
        this.palavraChave = "/sair do chat";
        if (this.palavraChave == palavraChave) {
            System.out.println("Key '" + this.palavraChave + "' registrada com Sucesso!");
        }
    }

    @Override
    public String produz() {
        System.out.println("A conversa acabou.");
        System.out.println("-----------------------------------");
        System.exit(0);
        return this.resposta;
    }
    
}


