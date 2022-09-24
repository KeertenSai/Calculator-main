import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    //declare variables
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, 
    buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear;

    private JTextField textField;
    private JPanel panel;
    private double num1, num2, result;
    private int addc = 0, subc = 0, mulc = 0, divc = 0;

    public App() {

        //creating a new frame to store text field and buttons
        super("Calculator");
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        textField = new JTextField();
        textField.setEditable(false);

        //creating number buttons and add them to panel
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("x");
        buttonDiv = new JButton("/");
        buttonEqual = new JButton("=");
        buttonClear = new JButton("C");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonAdd);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonSub);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonMul);
        panel.add(buttonClear);
        panel.add(button0);
        panel.add(buttonEqual);
        panel.add(buttonDiv);
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        //register action listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonAdd.addActionListener(this );

        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        

        Object source = e.getSource();
        if (source == button1) {
            textField.setText(textField.getText().concat("1"));
        }
        if (source == button2) {
            textField.setText(textField.getText().concat("2"));
        }
        if (source == button3) {
            textField.setText(textField.getText().concat("3"));
        }
        if (source == button4) {
            textField.setText(textField.getText().concat("4"));
        }
        if (source == button5) {
            textField.setText(textField.getText().concat("5"));
        }
        if (source == button6) {
            textField.setText(textField.getText().concat("6"));
        }
        if (source == button7) {
            textField.setText(textField.getText().concat("7"));
        }
        if (source == button8) {
            textField.setText(textField.getText().concat("8"));
        }
        if (source == button9) {
            textField.setText(textField.getText().concat("9"));
        }
        if (source == button0) {
            textField.setText(textField.getText().concat("0"));
        }
        if (source == buttonAdd) {
            num1 = Double.parseDouble(textField.getText());
            addc = 1;
            textField.setText("");
        }
        if (source == buttonSub) {
            num1 = Double.parseDouble(textField.getText());
            subc = 1;
            textField.setText("");
        }
        if (source == buttonMul) {
            num1 = Double.parseDouble(textField.getText());
            mulc = 1;
            textField.setText("");
        }
        if (source == buttonDiv) {
            num1 = Double.parseDouble(textField.getText());
            divc = 1;
            textField.setText("");
        }

        if (source == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());
            if (addc > 0) {
                result = num1 + num2;
                textField.setText(Double.toString(result));
                addc = 0;
            }
            if (subc > 0) {
                result = num1 - num2;
                textField.setText(Double.toString(result));
                subc = 0;
            }
            if (mulc > 0) {
                result = num1 * num2;
                textField.setText(Double.toString(result));
                mulc = 0;
            }
            if (divc > 0) {
                result = num1 / num2;
                textField.setText(Double.toString(result));
                divc = 0;
            }
        }
        if (source == buttonClear) {
            textField.setText("");
        }
        
    }

    public static void main(String[] args) {

        App frame = new App();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}