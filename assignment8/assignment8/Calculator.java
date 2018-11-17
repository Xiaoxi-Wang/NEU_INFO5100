package assignment8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, CLEAR
}

public class Calculator extends JFrame {
    private JTextField resTextField;
    private JButton add, subtract, multiply, divide, equal, clear;
    private JButton numbers[];
    private Font font;


    int first = 0;
    int second = 0;

    Operation o = Operation.ADD;

    class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add) {
                o = Operation.ADD;
                first = Integer.parseInt(resTextField.getText());
                resTextField.setText("");
            }
            if (e.getSource() == subtract) {
                o = Operation.SUBTRACT;
                first = Integer.parseInt(resTextField.getText());
                resTextField.setText("");
            }
            if (e.getSource() == multiply) {
                o = Operation.MULTIPLY;
                first = Integer.parseInt(resTextField.getText());
                resTextField.setText("");
            }
            if (e.getSource() == divide) {
                o = Operation.DIVIDE;
                first = Integer.parseInt(resTextField.getText());
                resTextField.setText("");
            }
            if (e.getSource() == clear) {
                o = Operation.CLEAR;
                first = 0;
                second = 0;
                resTextField.setText("");
            }
            if (e.getSource() == numbers[0]) {
                resTextField.setText(resTextField.getText() + numbers[0].getText());
            }
            if (e.getSource() == numbers[1]) {
                resTextField.setText(resTextField.getText() + numbers[1].getText());
            }
            if (e.getSource() == numbers[2]) {
                resTextField.setText(resTextField.getText() + numbers[2].getText());
            }
            if (e.getSource() == numbers[3]) {
                resTextField.setText(resTextField.getText() + numbers[3].getText());
            }
            if (e.getSource() == numbers[4]) {
                resTextField.setText(resTextField.getText() + numbers[4].getText());
            }
            if (e.getSource() == numbers[5]) {
                resTextField.setText(resTextField.getText() + numbers[5].getText());
            }
            if (e.getSource() == numbers[6]) {
                resTextField.setText(resTextField.getText() + numbers[6].getText());
            }
            if (e.getSource() == numbers[7]) {
                resTextField.setText(resTextField.getText() + numbers[7].getText());
            }
            if (e.getSource() == numbers[8]) {
                resTextField.setText(resTextField.getText() + numbers[9].getText());
            }
            if (e.getSource() == numbers[9]) {
                resTextField.setText(resTextField.getText() + numbers[9].getText());
            }

        }
    }

    class ComputeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int result = 0;
            second = Integer.parseInt(resTextField.getText());
            if (o == Operation.ADD) {
                result = first + second;
            }
            if (o == Operation.SUBTRACT) {
                result = first - second;
            }
            if (o == Operation.DIVIDE) {
                result = first / second;
            }
            if (o == Operation.MULTIPLY) {
                result = first * second;
            }

            resTextField.setText(result + "");
        }
    }


    public Calculator() {
        createComponents();
        setLayout();
        addComponents();
        addBehaviors();
        display();
    }

    private void setLayout() {
        GridLayout gl = new GridLayout(6, 1);
        Container c = this.getContentPane();
        c.setLayout(gl);

    }

    private void display() {
        setSize(320, 360);
        setVisible(true);
    }

    private void addBehaviors() {
        ComputeListener cl = new ComputeListener();
        equal.addActionListener(cl);

        OperationListener ol = new OperationListener();
        add.addActionListener(ol);
        subtract.addActionListener(ol);
        multiply.addActionListener(ol);
        divide.addActionListener(ol);
        clear.addActionListener(ol);
    }

    private void addComponents() {
        Container container = getContentPane();
        container.add(resTextField);

        setLayout(new GridLayout(5, 4));

        JPanel panel = new JPanel();
        panel.add(numbers[7]);
        panel.add(numbers[8]);
        panel.add(numbers[9]);
        panel.add(add);
        container.add(panel);

        panel = new JPanel();
        panel.add(numbers[4]);
        panel.add(numbers[5]);
        panel.add(numbers[6]);
        panel.add(subtract);
        container.add(panel);

        panel = new JPanel();
        panel.add(numbers[1]);
        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(multiply);
        container.add(panel);

        panel = new JPanel();
        panel.add(numbers[0]);
        panel.add(equal);
        panel.add(clear);
        panel.add(divide);
        container.add(panel);
    }


    private void createComponents() {
        font = new Font("TimesRoman", Font.PLAIN, 30);
        resTextField = new JTextField(4);
        resTextField.setFont(font);
        add = new JButton("+");
        add.setFont(font);
        subtract = new JButton("-");
        subtract.setFont(font);
        multiply = new JButton("×");
        multiply.setFont(font);
        divide = new JButton("÷");
        divide.setFont(font);
        equal = new JButton("=");
        equal.setFont(font);
        clear = new JButton("C");
        clear.setFont(font);
        numbers = new JButton[10];
        OperationListener ol = new OperationListener();
        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(i + "");
            numbers[i].setFont(font);
            numbers[i].addActionListener(ol);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}