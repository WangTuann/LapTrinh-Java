/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai01;

import java.awt.Container;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author ADMIN
 */
public class SimpleServer extends JFrame {

    /**
     * @param args the command line arguments
     */
    JTextArea display;

    public SimpleServer() {
        super("Simple Server");
        Container con = getContentPane();
        display = new JTextArea(10, 30);
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
        try {
            server = new ServerSocket(8000);
            while (true) {
                connection = server.accept();
                display.append("Connection established\n");

                input = new DataInputStream(connection.getInputStream());
                message = input.readUTF();
                display.append("Received message: " + message + "\n");
                connection.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        // TODO code application logic here
        SimpleServer s = new SimpleServer();
        s.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        s.startServer();
    }
}
