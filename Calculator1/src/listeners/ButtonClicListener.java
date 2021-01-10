package listeners;

import logic.Calculation;
import utils.Contants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClicListener implements ActionListener {

    private final JTextField textF1;
    private final JTextField textF2;
    private final JTextField textF3;
    private final JTextArea textArea;
    private final Calculation calculation;

    public ButtonClicListener(JTextField textF1, JTextField textF2, JTextField textF3, JTextArea textArea, Calculation calculation){

        this.textF1 = textF1;
        this.textF2 = textF2;
        this.textF3 = textF3;
        this.textArea = textArea;
        this.calculation = calculation;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(textF1.getText());
        double num2 = Double.parseDouble(textF2.getText());
        char num3 = textF3.getText().charAt(0);

        double answer = 0;

        try{
            if (num3 == '+'){
                answer = calculation.addition(num1, num2);
            }
            else if (num3 == '-'){
                answer = calculation.substraction(num1, num2);
            }
            else if (num3 == '*'){
                answer = calculation.multiplication(num1, num2);
            }
            else if (num3 == '/'){
                answer = calculation.division(num1, num2);
            }
            else if (num3 == '%'){
                answer = calculation.remainder(num1, num2);
            }
            else{
                textArea.setText(Contants.ERROR_TEXT);
            }
        }
        catch (ArithmeticException ex){
            textArea.setText(ex.getMessage());
            return;
        }
        String result = answer % 1 == 0 ? String.valueOf((int) answer) : String.valueOf(answer);
        textArea.setText(result);

    }
}
