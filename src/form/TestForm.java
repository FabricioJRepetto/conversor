package form;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class TestForm {
    private JPanel MainPanel;
    private JPanel MainMenu;
    private JButton divisasButton;
    private JButton temperaturasButton;
    private JButton medidasButton;
    private JButton pesoButton;
    private JLabel MenuTitle;
    private JPanel MainView;
    private JLabel Logo;
    private JLabel LogoText;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestForm");
        frame.setContentPane(new TestForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
