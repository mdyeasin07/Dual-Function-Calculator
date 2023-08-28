package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField TField;
    double temp, temp1, result;
    JButton zero, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton clr,plus,min,mul,div,eq;
    int x=0, y=0, z=0;
    char Ch;
    Container cont;
    JPanel buttonpanel;

    SimpleCalculator(){
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        TField = new JTextField(25);
        TField.setHorizontalAlignment(SwingConstants.RIGHT);
        TField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });

        textpanel.add(TField);
        buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(4, 4, 2, 2));
        boolean t = true;

        b1 = new JButton("1");
        buttonpanel.add(b1);
        b1.addActionListener(this);
        b2 = new JButton("2");
        buttonpanel.add(b2);
        b2.addActionListener(this);
        b3 = new JButton("3");
        buttonpanel.add(b3);
        b3.addActionListener(this);

        plus = new JButton("+");
        buttonpanel.add(plus);
        plus.addActionListener(this);

        b4 = new JButton("4");
        buttonpanel.add(b4);
        b4.addActionListener(this);
        b5 = new JButton("5");
        buttonpanel.add(b5);
        b5.addActionListener(this);
        b6 = new JButton("6");
        buttonpanel.add(b6);
        b6.addActionListener(this);

        min = new JButton("-");
        buttonpanel.add(min);
        min.addActionListener(this);

        b7 = new JButton("7");
        buttonpanel.add(b7);
        b7.addActionListener(this);
        b8 = new JButton("8");
        buttonpanel.add(b8);
        b8.addActionListener(this);
        b9 = new JButton("9");
        buttonpanel.add(b9);
        b9.addActionListener(this);

        mul = new JButton("*");
        buttonpanel.add(mul);
        mul.addActionListener(this);

        clr = new JButton("AC");
        buttonpanel.add(clr);
        clr.addActionListener(this);

        zero = new JButton("0");
        buttonpanel.add(zero);
        zero.addActionListener(this);

        eq = new JButton("=");
        buttonpanel.add(eq);
        eq.addActionListener(this);

        div = new JButton("/");
        div.addActionListener(this);
        buttonpanel.add(div);

        cont.add("Center", buttonpanel);
        cont.add("North", textpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("1")) {
            if (z == 0) {
                TField.setText(TField.getText() + "1");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                TField.setText(TField.getText() + "2");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                TField.setText(TField.getText() + "3");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                TField.setText(TField.getText() + "4");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                TField.setText(TField.getText() + "5");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                TField.setText(TField.getText() + "6");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                TField.setText(TField.getText() + "7");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                TField.setText(TField.getText() + "8");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                TField.setText(TField.getText() + "9");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                TField.setText(TField.getText() + "0");
            } else {
                TField.setText("");
                TField.setText(TField.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("AC")) {
            TField.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("+/-")) {
            if (x == 0) {
                TField.setText("-" + TField.getText());
                x = 1;
            }
            else {
                TField.setText(TField.getText());
            }
        }
        if (s.equals(".")) {
            if (y == 0) {
                TField.setText(TField.getText() + ".");
                y = 1;
            }
            else {
                TField.setText(TField.getText());
            }
        }
        if (s.equals("+")) {
            if (TField.getText().equals("")) {
                TField.setText("");
                temp = 0;
                Ch = '+';
            }
            else {
                temp = Double.parseDouble(TField.getText());
                TField.setText("");
                Ch = '+';
                y = 0;
                x = 0;
            }
            TField.requestFocus();
        }
        if (s.equals("-")) {
            if (TField.getText().equals("")) {
                TField.setText("");
                temp = 0;
                Ch = '-';
            }
            else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(TField.getText());
                TField.setText("");
                Ch = '-';
            }
            TField.requestFocus();
        }
        if (s.equals("/")) {
            if (TField.getText().equals("")) {
                TField.setText("");
                temp = 1;
                Ch = '/';
            }
            else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(TField.getText());
                Ch = '/';
                TField.setText("");
            }
            TField.requestFocus();
        }

        if (s.equals("*")) {
            if (TField.getText().equals("")) {
                TField.setText("");
                temp = 1;
                Ch = '*';
            }
            else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(TField.getText());
                Ch = '*';
                TField.setText("");
            }
            TField.requestFocus();

        }
        if (s.equals("=")) {
            if (TField.getText().equals("")) {
                TField.setText("");
            } else {
                temp1 = Double.parseDouble(TField.getText());
                switch (Ch) {
                    case '+':
                        result = temp + temp1;
                        break;
                    case '-':
                        result = temp - temp1;
                        break;
                    case '/':
                        result = temp / temp1;
                        break;
                    case '*':
                        result = temp * temp1;
                        break;
                }
                TField.setText("");
                TField.setText(TField.getText() + result);
                z = 1;
            }

        }

        TField.requestFocus();
    }
    double fact(double x) {
        int er = 0;
        if (x < 0) {
            er = 20;
            return 0;
        }
        double i, s = 1;
        for (i = 2; i <= x; i += 1.0)
            s *= i;
        return s;
    }

    public static void main(String[] args) {
        try {

            UIManager.setLookAndFeel("WindowsLookAndFeel");
        } catch (Exception e) {
        }
        SimpleCalculator obj = new SimpleCalculator();
        obj.setTitle("StandardCalculator");
        obj.setSize(350,350);
        obj.setVisible(true);
    }
}
