import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalculatorGUI extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JTextField billTextField;
    private JTextField tipTextField;
    private JTextField NumPeopleTextField;
    private JButton TipMinusButton;
    private JButton NumPeopleMinusButton;
    private JTextArea TipCostTextArea;
    private JTextArea TotalCostTextArea;
    private JButton NumPeoplePlusButton;
    private JButton TipPlusButton;

    public TipCalculatorGUI() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Tip Calculator");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TipMinusButton.addActionListener(this);
        TipPlusButton.addActionListener(this);
        NumPeopleMinusButton.addActionListener(this);
        NumPeoplePlusButton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
