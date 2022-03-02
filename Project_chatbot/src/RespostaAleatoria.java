
import java.util.ArrayList;
import java.util.Random;

public class RespostaAleatoria extends Resposta{
    
    public ArrayList< String> piadas = new ArrayList<>();
    Random random = new Random();

    public RespostaAleatoria(String palavraChave, ArrayList piadas) {
        this.palavraChave = palavraChave;
        if(this.palavraChave == palavraChave ){
            System.out.println("Key '" + this.palavraChave +"' + resposta registrados com Sucesso!");
            this.piadas = piadas;
        }
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    @Override
    public String produz() {
        for (int i = 0; i < this.piadas.size(); i++) {
            String escolhido = this.piadas.get((int) (Math.random() * this.piadas.size()));
            this.resposta = escolhido;
            return this.resposta;
        }
        return this.resposta;
    }
    
}
