import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    int count = 1;
//    int xScore = 0;
//    int circleScore = 0;
    ImageIcon iconx = new ImageIcon("x.png");
    ImageIcon iconcircle = new ImageIcon("circle.png");
    ImageIcon xwins = new ImageIcon("xwins.png");
    ImageIcon circlewins = new ImageIcon("circlewins.png");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3, 1, 1));
        this.setSize(600, 600);

        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        button1.setBackground(Color.black);
        button2.setBackground(Color.black);
        button3.setBackground(Color.black);
        button4.setBackground(Color.black);
        button5.setBackground(Color.black);
        button6.setBackground(Color.black);
        button7.setBackground(Color.black);
        button8.setBackground(Color.black);
        button9.setBackground(Color.black);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {

            if (count % 2 == 0) {
                button1.setIcon(iconx);
                count++;
                button1.setEnabled(false);
                button1.setDisabledIcon(iconx);
            }
            else {
                button1.setIcon(iconcircle);
                count++;
                button1.setEnabled(false);
                button1.setDisabledIcon(iconcircle);
            }
        }


        if (e.getSource() == button2) {

            if (count % 2 == 0) {
                button2.setIcon(iconx);
                count++;
                button2.setEnabled(false);
                button2.setDisabledIcon(iconx);
            }
            else {
                button2.setIcon(iconcircle);
                count++;
                button2.setEnabled(false);
                button2.setDisabledIcon(iconcircle);
            }
        }


        if (e.getSource() == button3) {

            if (count % 2 == 0) {
                button3.setIcon(iconx);
                count++;
                button3.setEnabled(false);
                button3.setDisabledIcon(iconx);
            }
            else {
                button3.setIcon(iconcircle);
                count++;
                button3.setEnabled(false);
                button3.setDisabledIcon(iconcircle);
            }
        }

        if (e.getSource() == button4) {

            if (count % 2 == 0) {
                button4.setIcon(iconx);
                count++;
                button4.setEnabled(false);
                button4.setDisabledIcon(iconx);
            }
            else {
                button4.setIcon(iconcircle);
                count++;
                button4.setEnabled(false);
                button4.setDisabledIcon(iconcircle);
            }
        }

        if (e.getSource() == button5) {

            if (count % 2 == 0) {
                button5.setIcon(iconx);
                count++;
                button5.setEnabled(false);
                button5.setDisabledIcon(iconx);
            }
            else {
                button5.setIcon(iconcircle);
                count++;
                button5.setEnabled(false);
                button5.setDisabledIcon(iconcircle);
            }
        }

        if (e.getSource() == button6) {

            if (count % 2 == 0) {
                button6.setIcon(iconx);
                count++;
                button6.setEnabled(false);
                button6.setDisabledIcon(iconx);
            }
            else {
                button6.setIcon(iconcircle);
                count++;
                button6.setEnabled(false);
                button6.setDisabledIcon(iconcircle);
            }
        }

        if (e.getSource() == button7) {

            if (count % 2 == 0) {
                button7.setIcon(iconx);
                count++;
                button7.setEnabled(false);
                button7.setDisabledIcon(iconx);
            }
            else {
                button7.setIcon(iconcircle);
                count++;
                button7.setEnabled(false);
                button7.setDisabledIcon(iconcircle);
            }
        }

        if (e.getSource() == button8) {

            if (count % 2 == 0) {
                button8.setIcon(iconx);
                count++;
                button8.setEnabled(false);
                button8.setDisabledIcon(iconx);
            }
            else {
                button8.setIcon(iconcircle);
                count++;
                button8.setEnabled(false);
                button8.setDisabledIcon(iconcircle);
            }
        }

        if (e.getSource() == button9) {

                if (count % 2 == 0) {
                    button9.setIcon(iconx);
                    count++;
                    button9.setEnabled(false);
                    button9.setDisabledIcon(iconx);
                }
             else {
                button9.setIcon(iconcircle);
                count++;
                button9.setEnabled(false);
                button9.setDisabledIcon(iconcircle);
            }
        }

    }
}


