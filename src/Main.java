import form.TestForm;

import javax.swing.*;
import java.awt.GridBagLayout;

public class Main {
    public static void main(String[] args) {
        // componente JFrame
        JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
        miJFrame.setSize(500,300);

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // usamos este diseño para centrar los componentes de JPanel
//        miJPanel.setLayout(new GridBagLayout());

        // componente JLabel
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Dime tu opinión acerca de Java Swing:  ");

        // componente JTextArea
        JTextArea miJTextArea = new JTextArea(5,20);

        // conecta los componentes JLabel y JTextField en JPanel
        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);

        // conectar JPanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);
    }
}