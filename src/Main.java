import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.ArrayList;

public class Main extends JFrame{

    public Main() {
        // Inicialización de la ventana del juego
        setTitle("Juego de Memoria");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);


    }

        // Metodo main para ejecutar el juego
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new Main().setVisible(true));
        }


}