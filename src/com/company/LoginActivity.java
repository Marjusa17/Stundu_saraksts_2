package com.company;

import javax.swing.*;
import java.awt.*;

public class LoginActivity {
    private JPanel panel1;
    private JButton B_login;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginActivity");
        frame.setContentPane(new LoginActivity().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Database db = new Database();
        db.connectDatabase();
    }

}
