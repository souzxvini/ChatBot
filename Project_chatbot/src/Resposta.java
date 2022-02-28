public abstract class Resposta {
    
    String palavraChave;
    String resposta;
    
    public abstract boolean verifica(String entrada);
    
    public abstract String produz();
}
