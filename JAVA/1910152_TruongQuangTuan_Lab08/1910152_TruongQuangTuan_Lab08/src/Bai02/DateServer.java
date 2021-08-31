/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai02;

import java.awt.Container;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author ADMIN
 */
public class DateServer extends JFrame {

    JTextArea display;

    public DateServer() {
        super("Date Server");
        Container con = getContentPane();
        display = new JTextArea(10, 45);
        display.setEditable(false);
        con.add(display);
        setSize(400, 300);
        setVisible(true);
    }

    public void startServer() {
        ServerSocket server = null;
        Socket connection = null;
        String message;
        DataInputStream input;
        DataOutputStream output;
        try {

            server = new ServerSocket(8000);
            while (true) {
                connection = server.accept();
                display.append("Connection established\n");
                input = new DataInputStream(connection.getInputStream());
                output = new DataOutputStream(connection.getOutputStream());
                message = input.readUTF();
                if (message.equals("Give me the date")) {
                    display.append("Client wants the date\n");
                    String dateString = DateFormat.getDateInstance().format(new Date());
                    output.writeUTF(dateString);
                }
                connection.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        DateServer s = new DateServer();
        s.startServer();
    }
}
