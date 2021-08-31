/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.awt.Event.*;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import javax.swing.*;
/**
 *
 * @author Quang Tuan
 */
public class RadioButtonDemo extends JFrame implements ActionListener{
    JRadioButton redRadio, blueRadio, greenRadio, blackRadio;
    JLabel label;
    
    public RadioButtonDemo(){
        getContentPane().setLayout((LayoutManager) new GridLayout(5,1));
        ButtonGroup colorGroup=new ButtonGroup();
        
        redRadio=new JRadioButton("Red");
        colorGroup.add(redRadio);
        redRadio.addActionListener((java.awt.event.ActionListener) this);
        getContentPane().add(redRadio);
        
      blueRadio=new JRadioButton("blue");
        colorGroup.add(blueRadio);
        blueRadio.addActionListener((java.awt.event.ActionListener) this);
        getContentPane().add(blueRadio);
        
        greenRadio=new JRadioButton("green");
        colorGroup.add(greenRadio);
        greenRadio.addActionListener((java.awt.event.ActionListener) this);
        getContentPane().add(greenRadio);
        
        blackRadio=new JRadioButton("black");
        colorGroup.add(blackRadio);
        blackRadio.addActionListener((java.awt.event.ActionListener) this);
        getContentPane().add(blackRadio);
        
        redRadio.setSelected(true);
        label=new JLabel("Red is selected",JLabel.CENTER);
        label.setForeground(Color.white);
        label.setForeground(color.red);
        label.setOpaque(true);
        getContentPane().add(label);    
    }
    public void actionPerformed(ActionEvent evt){
        if (redRadio.isSelected()) {
            Label.setBackground(color.red);
            label.setText("Red is selected");
            
        }
        else 
            if (blackRadio.isSelected()) {
                label.setBackground(color.black);
                label.setText("black is selected");  
        }
         else 
            if (greenRadio.isSelected()) {
                label.setBackground(color.green);
                label.setText("green is selected");  
        }
         else 
            if (bluekRadio.isSelected()) {
                label.setBackground(color.blue);
                label.setText("blue is selected");  
        }
    }
}
