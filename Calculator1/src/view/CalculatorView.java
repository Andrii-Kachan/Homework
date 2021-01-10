package view;

import listeners.ButtonClicListener;
import logic.Calculation;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    public CalculatorView(){
        JFrame frame = new JFrame("Калькулятор");
        JLabel label1 = new JLabel("Число 1");
        label1.setBounds(45, 50,100,40);
        JTextField textF1 = new JTextField();
        textF1.setBounds(150, 50, 190, 40);
        JLabel label2 = new JLabel("Число 2");
        label2.setBounds(45, 170, 100, 40);
        JTextField textF2 = new JTextField();
        textF2.setBounds(150, 170, 190, 40);
        JLabel label3 = new JLabel ("Операция");
        label3.setBounds(45, 110, 100, 40);
        JTextField textF3 = new JTextField();
        textF3.setBounds(150, 110, 190, 40);
        JButton button1 = new JButton("Рассчитать");
        button1.setBounds(45, 230, 295, 40);
        JLabel label4 = new JLabel("Результат");
        label4.setBounds(45, 290, 100, 40);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(150, 290, 190, 100);
        textArea.setLineWrap(true);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        frame.add(textF1);
        frame.add(textF2);
        frame.add(textF3);
        frame.add(textArea);

        frame.add(button1);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        ActionListener listener = new ButtonClicListener(textF1, textF2, textF3, textArea, new Calculation());

        button1.addActionListener(listener);

    }
}
