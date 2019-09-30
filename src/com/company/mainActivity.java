package com.company;

import javax.swing.*;
import java.sql.*;

public class mainActivity  {
    private JPanel panel1;
    private JTextField tF_username;
    private JButton b_login;

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainActivity");
        frame.setContentPane(new mainActivity().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    String getData = "SELECT VARDS FROM SKOLOTAJS";

}
