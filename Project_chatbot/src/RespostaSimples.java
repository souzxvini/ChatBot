public class RespostaSimples extends Resposta {
    
    public RespostaSimples(String palavraChave, String resposta) {
        this.palavraChave = palavraChave;
        this.resposta = resposta;
        System.out.println("Key '" +this.palavraChave +"' + resposta registrados com sucesso!");
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
