package JogoDaAdvinhacao;

public class Charada {
    public Charada(){
        this.setDica("");
        this.setResposta("");
    }
    public Charada(String dica, String resposta){
         this.setDica(dica);
        this.setResposta(resposta);
    }   
    private String Dica;
    private String Resposta;
    public String getDica() {
        return Dica;
    }
    public void setDica(String Dica) {
        this.Dica = Dica;
    }
    public String getResposta() {
        return Resposta;
    }
    public void setResposta(String Resposta) {
        this.Resposta = Resposta;
    }
}