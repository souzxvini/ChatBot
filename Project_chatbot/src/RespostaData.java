
import java.text.SimpleDateFormat;
import java.util.Date;

public class RespostaData extends Resposta {

    Date date = new Date();
    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(date);

    public RespostaData(String palavraChave) {
        this.resposta = data.toString();
        this.palavraChave = palavraChave;
        if (this.palavraChave == palavraChave) {
            System.out.println("Key '" + this.palavraChave + "' + resposta registrados com sucesso!");
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
        return this.resposta = data;
    }

}
