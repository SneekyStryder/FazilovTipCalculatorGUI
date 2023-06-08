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
    private double bill;
    private double tipPercent;
    private int numPeople;

    public TipCalculatorGUI() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Tip Calculator");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TipMinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int percent = Integer.parseInt(tipTextField.getText());
                percent -= 1;
                tipTextField.setText("" + percent);
                calculate();
            }
        });
        TipPlusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int percent = Integer.parseInt(tipTextField.getText());
                percent += 1;
                tipTextField.setText("" + percent);
                calculate();
            }
        });
        NumPeopleMinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numPeople = Integer.parseInt(NumPeopleTextField.getText());
                numPeople -= 1;
                NumPeopleTextField.setText("" + numPeople);
                calculate();
            }
        });
        NumPeoplePlusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numPeople = Integer.parseInt(NumPeopleTextField.getText());
                numPeople += 1;
                NumPeopleTextField.setText("" + numPeople);
                calculate();
            }
        });
        setVisible(true);
    }

    private void calculate() {
        getBill();
        getTipPercent();
        getNumPeople();
        double tipTotal = bill * tipPercent;
        double tipPer = tipTotal / numPeople;
        TipCostTextArea.setText("" + tipPer);
        double costPer = bill / numPeople + tipPer;
        TotalCostTextArea.setText("" + costPer);
    }

    private void getBill() {
        bill = Double.parseDouble(billTextField.getText());
    }

    private void getTipPercent() {
        tipPercent = ((double) Integer.parseInt(tipTextField.getText())) / 100;
    }

    private void getNumPeople() {
        numPeople = Integer.parseInt(NumPeopleTextField.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
