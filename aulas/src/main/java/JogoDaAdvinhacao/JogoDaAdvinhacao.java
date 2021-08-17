package JogoDaAdvinhacao;
import java.util.Scanner;
public class JogoDaAdvinhacao {
    public static void main(String[] args) {        
        Scanner userInputScanner = new Scanner(System.in);
        Charada charada = new Charada("Quanto menos luz mais eu apareço. Quem eu sou?","Escuridão");
        String entrada;       
        System.out.println("Jogo da adivinhação");
        System.out.println("Teste sua sorte e tente descobrir a resposta");
        System.out.println("Dica: "+charada.getDica());
        System.out.print("Resposta: ");
        entrada = userInputScanner.nextLine();
        if (entrada.equalsIgnoreCase(charada.getResposta())){
            System.out.println("Parabens!!!! Você acertou");
        }else{
             System.out.println("Que pena!!!!! A resposta correta é: "+charada.getResposta());
        }
    } 
}