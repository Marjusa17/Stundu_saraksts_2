package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginActivity {
    private JPanel panel1;
    private JButton B_login;
    private JTextField TF_Username;
    private JTextField TF_Password;
    private JLabel L_error;
    public Database db = new Database();

    public LoginActivity() {
        db.connectDatabase();
        B_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.connectDatabase();
                if(db.checkUser(TF_Username.getText(),TF_Password.getText())){
                    SwingUtilities.invokeLater(MainScreenActivity::new);
                }else{
                    L_error.setText("Lietotājvārds/Parole nav pareiza!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginActivity");
        frame.setContentPane(new LoginActivity().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
