package view;

import listeners.ButtonClicListener;
import logic.Convertor;
import utils.Constants;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ConvertorView {
    public ConvertorView(){
        JFrame frame = new JFrame(Constants.FRAME);

        JLabel label1 = new JLabel(Constants.LABEL_1);
        label1.setBounds(50, 50, 250, 40);
        JLabel label2 = new JLabel(Constants.LABEL_2);
        label2.setBounds(50, 100, 250, 40);
        JLabel label3 = new JLabel(Constants.LABEL_3);
        label3.setBounds(50, 150, 250, 40);
        JLabel label4 = new JLabel(Constants.LABEL_4);
        label4.setBounds(50, 250, 250, 40);
        JLabel label5 = new JLabel(Constants.LABEL_5);
        label5.setBounds(50, 300, 350, 40);
        JLabel label6 = new JLabel(Constants.LABEL_6);
        label6.setBounds(50, 325, 350, 40);
        JLabel label7 = new JLabel(Constants.LABEL_7);
        label7.setBounds(50, 350, 350, 40);
        JLabel label8 = new JLabel(Constants.LABEL_8);
        label8.setBounds(50, 375, 350, 40);
        JLabel label9 = new JLabel(Constants.LABEL_9);
        label9.setBounds(50, 400, 375, 40);
        JLabel label10 = new JLabel(Constants.LABEL_10);
        label10.setBounds(50, 425, 350, 40);

        JTextField textF1 = new JTextField();
        textF1.setBounds(300, 50, 190, 40);
        JTextField textF2 = new JTextField();
        textF2.setBounds(300, 100, 190, 40);
        JTextField textF3 = new JTextField();
        textF3.setBounds(300, 150, 190, 40);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(300, 250, 190, 40);
        textArea.setLineWrap(true);

        JButton button1 = new JButton(Constants.BUTTON_1);
        button1.setBounds(300, 200, 190, 40);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(label10);

        frame.add(textF1);
        frame.add(textF2);
        frame.add(textF3);
        frame.add(textArea);

        frame.add(button1);

        frame.setSize(560, 525);
        frame.setLayout(null);
        frame.setVisible(true);


        ActionListener listener = new ButtonClicListener(textF1, textF2, textF3, textArea, new Convertor());

        button1.addActionListener(listener);
    }
}
