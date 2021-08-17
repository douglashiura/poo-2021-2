package JogoDaAdvinhacao;
import java.util.Scanner;
public class JogoDaAdvinhacao {
    public static void main(String[] args) {        
        Scanner userInputScanner = new Scanner(System.in);
        Charada charada = new Charada("Quanto menos luz mais eu apare�o. Quem eu sou?","Escurid�o");
        String entrada;       
        System.out.println("Jogo da adivinha��o");
        System.out.println("Teste sua sorte e tente descobrir a resposta");
        System.out.println("Dica: "+charada.getDica());
        System.out.print("Resposta: ");
        entrada = userInputScanner.nextLine();
        if (entrada.equalsIgnoreCase(charada.getResposta())){
            System.out.println("Parabens!!!! Voc� acertou");
        }else{
             System.out.println("Que pena!!!!! A resposta correta �: "+charada.getResposta());
        }
    } 
}