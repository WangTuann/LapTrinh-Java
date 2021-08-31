/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.awt.EventQueue;

/**
 *
 * @author PC119
 */
public class Main {
    public static void main(String[] args) {
         
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }
}
