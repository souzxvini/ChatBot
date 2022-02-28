
import java.util.Date;


public class RespostaHora extends Resposta {
    
    Date data = new Date();

    public RespostaHora(String palavraChave) {
        this.resposta = data.toString();
        this.palavraChave = "hora";
        if(this.palavraChave == palavraChave){
            System.out.println("Palavra Registrada com Sucesso");
        }
        else{
            System.out.println("Palavra invalida");
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
    public boolean verifica(String palavraChave) {
        if (this.palavraChave == palavraChave) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String produz() {
        return this.resposta = data.toString();
    }

}
