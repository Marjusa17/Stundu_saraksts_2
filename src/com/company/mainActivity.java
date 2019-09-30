package com.company;

import javax.swing.*;

public class mainActivity  {
    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainActivity");
        frame.setContentPane(new mainActivity().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    ////comentars
}
