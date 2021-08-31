/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class DateClient extends JFrame implements ActionListener {

    JTextField theDate;
    JButton getDate;

    public DateClient() {
        super("Date Client");
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        theDate = new JTextField(15);
        con.add(theDate);
        getDate = new JButton("What is the date?");
        getDate.addActionListener(this);
        con.add(getDate);
        setSize(200, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent action) {
        String date;
        Socket client = null;
        DataOutputStream output;
        DataInputStream input;
        try {
            client = new Socket(InetAddress.getLocalHost(), 8000);
            output = new DataOutputStream(client.getOutputStream());
            output.writeUTF("Give me the date");
            input = new DataInputStream(client.getInputStream());
            date = input.readUTF();
            theDate.setText(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        DateClient c = new DateClient();
        c.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
