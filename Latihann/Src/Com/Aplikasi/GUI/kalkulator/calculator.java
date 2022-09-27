package Latihann.Src.Com.Aplikasi.GUI.kalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberbutton = new JButton[10];
    JButton[] functionbutton = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    Font myFont = new Font("Ink free", Font.PLAIN, 20);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    calculator() {
        // JFrame //membuat kotaknya
        frame = new JFrame("kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 520);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);

        // JTextField //menentukan kotak text dan edit text
        textfield = new JTextField();
        textfield.setBounds(95, 30, 210, 35);
        textfield.setFont(myFont);
        textfield.setBackground(Color.WHITE);
        textfield.setEditable(false);

        // JButton //membuat tombol
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("del");
        clrButton = new JButton("clear");
        negButton= new JButton("(-)");

        // array utuk menaru fungsi tombol
        functionbutton[0] = addButton;
        functionbutton[1] = subButton;
        functionbutton[2] = mulButton;
        functionbutton[3] = divButton;
        functionbutton[4] = decButton;
        functionbutton[5] = equButton;
        functionbutton[6] = delButton;
        functionbutton[7] = clrButton;
        functionbutton[8] = negButton;

        // for loop
        for (int i = 0; i < functionbutton.length; i++) {
            functionbutton[i].addActionListener(this);
            functionbutton[i].setFont(myFont);
            functionbutton[i].setFocusable(false);
        }

        for (int i = 0; i < numberbutton.length; i++) {
            numberbutton[i] = new JButton(String.valueOf(i));
            numberbutton[i].addActionListener(this);
            numberbutton[i].setFont(myFont);
            numberbutton[i].setFocusable(false);

        }
        negButton.setBounds(50,400,100,50);//tombol negativ
        negButton.setBackground(Color.lightGray);
        delButton.setBounds(150, 400, 100, 50);// tombol delete
        delButton.setBackground(Color.LIGHT_GRAY);
        clrButton.setBounds(250, 400, 100, 50);// tombol clear
        clrButton.setBackground(Color.LIGHT_GRAY);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 290);
        panel.setLayout(new GridLayout(4, 4, 0, 0));
        panel.setBackground(Color.white);

        // memunculkan angka dan fungsi penjumlahan
        panel.add(numberbutton[1]);
        panel.add(numberbutton[2]);
        panel.add(numberbutton[3]);
        panel.add(addButton);
        panel.add(numberbutton[4]);
        panel.add(numberbutton[5]);
        panel.add(numberbutton[6]);
        panel.add(subButton);
        panel.add(numberbutton[7]);
        panel.add(numberbutton[8]);
        panel.add(numberbutton[9]);
        panel.add(mulButton);
        panel.add(equButton);
        panel.add(numberbutton[0]);
        panel.add(divButton);
        panel.add(decButton);

        // memunculkan gui
        frame.add(negButton);
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String... args) {
        calculator kalkulator = new calculator();
        System.out.println(kalkulator);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberbutton[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;

                default:
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrButton){
            textfield.setText("");
        }
        if(e.getSource()==delButton){
            String string = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < string.length()-1; i++) {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==negButton){
            double temp= Double.parseDouble(textfield.getText());
            temp*=-1;
            textfield.setText(String.valueOf(temp));
        }

    }

}
