/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
 
 
public class Menu extends JFrame {
 
    public Menu() {
         
        initUI();
    }
 
    private void initUI() {
 
        JMenuBar menubar = new JMenuBar();
  
        ImageIcon newIcon = new ImageIcon("F:/new.png");
        ImageIcon openIcon = new ImageIcon("F:/open.png");
        ImageIcon exitIcon = new ImageIcon("F:/exit.png");
  
        
  
        JMenu menuFile = new JMenu("File");
        menuFile.setMnemonic('F');
        JMenuItem newItem = new JMenuItem("New", newIcon);
        JMenuItem openItem = new JMenuItem("Open", openIcon);
        JMenuItem exitItem = new JMenuItem("Exit", exitIcon);
        
        newItem.setAccelerator( KeyStroke.getKeyStroke("ctrl N") );
        openItem.setAccelerator( KeyStroke.getKeyStroke("ctrl O") );
        exitItem.setAccelerator( KeyStroke.getKeyStroke("ctrl X") );
        
        exitItem.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
           System.exit(0);
        }
        });
  
        menuFile.add(newItem);
        menuFile.add(openItem);
        
        menuFile.addSeparator();
        menuFile.add(exitItem);
  
        menubar.add(menuFile);
        setJMenuBar(menubar);
  
        setTitle("Menu");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);       
    }
}
