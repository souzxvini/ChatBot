
import java.text.SimpleDateFormat;
import java.util.Date;


public class RespostaHora extends Resposta {
    
    Date data = new Date();
    String hora = new SimpleDateFormat("HH:mm:ss").format(data);

    public RespostaHora(String palavraChave) {
        this.resposta = data.toString();
        this.palavraChave = palavraChave;
        if(this.palavraChave == palavraChave){
            System.out.println("Key '" + this.palavraChave +"' + resposta registrados com Sucesso!");
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
    public String produz() {
        return this.resposta = hora;
    }

}
