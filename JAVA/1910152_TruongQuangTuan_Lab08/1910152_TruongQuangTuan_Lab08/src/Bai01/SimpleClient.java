/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class SimpleClient extends JFrame implements ActionListener {

    JTextField sendThis;
    JButton send;

    public SimpleClient() {

        super("Simple Client");
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        sendThis = new JTextField(15);
        con.add(sendThis);
        send = new JButton("Send");
        send.addActionListener(this);
        con.add(send);
        setSize(200, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent action) {
        Socket client = null;
        DataOutputStream output;
        try {
// client = new Socket( InetAddress.getByName("kneedeep.cis.famu.edu"),8000);
            client = new Socket(InetAddress.getLocalHost(), 8000);
            output = new DataOutputStream(client.getOutputStream());
            output.writeUTF(sendThis.getText());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        SimpleClient c = new SimpleClient();
        c.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
