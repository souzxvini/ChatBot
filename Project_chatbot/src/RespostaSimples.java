public class RespostaSimples extends Resposta {
    
    public RespostaSimples(String palavraChave, String resposta) {
        this.palavraChave = palavraChave;
        this.resposta = resposta;
        if(this.palavraChave == palavraChave){
            System.out.println("Palavra Registrada com sucesso");
        }
        else{
            System.out.println("Palavra inválida");
        }
    }

    @Override
    public boolean verifica(String entrada) {
        if(this.palavraChave == entrada){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String produz() {
        return this.resposta;
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
    
    
}
