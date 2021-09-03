package aulas;
import java.awt.Component;
import java.awt.Container;
import java.util.EventObject;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class PrimeiraTela {
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
 
        addAButton("Tetris", pane);
        addAButton("Jogar", pane);
        addAButton("Pontuação", pane);
        addAButton("Configurações do jogo", pane);
        addAButton("Sair", pane);
    }
 
    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
 
    
    private static void criar() {
        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.setSize(900, 900);
        frame.pack();
        frame.setVisible(true);
        frame.addMouseListener(null);
 

    }
}