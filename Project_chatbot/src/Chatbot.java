
import java.util.ArrayList;

public class Chatbot {
    
    ArrayList<Resposta> respostas = new ArrayList();
    
    public void adiciona(Resposta r){
        respostas.add(r);
    }
    
    public void processar(String texto){
        for (int i = 0; i < respostas.size(); i++) {
            String palavraChave = respostas.get(i).palavraChave;
            if(texto.indexOf(palavraChave) != -1){
                String resposta1 = respostas.get(i).produz();
                System.out.println(resposta1);
            }
        }
    }
            
}
