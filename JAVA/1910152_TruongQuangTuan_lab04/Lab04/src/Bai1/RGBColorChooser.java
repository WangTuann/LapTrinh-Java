/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RGBColorChooser extends JFrame
implements ChangeListener {

private JSlider redSlider, greenSlider, blueSlider;
// For setting the color.

private JLabel redLabel, greenLabel, blueLabel;
private JPanel colorPatch;
// Color patch for displaying the color.

public RGBColorChooser() {


redSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
blueSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);


redLabel = new JLabel(" R = 0");
greenLabel = new JLabel(" G = 0");
blueLabel = new JLabel(" B = 0");

redLabel.setBackground(Color.white);
redLabel.setForeground(Color.red);
redLabel.setOpaque(true);
greenLabel.setBackground(Color.white);
greenLabel.setForeground(new Color(0,150,0));
greenLabel.setOpaque(true);
blueLabel.setBackground(Color.white);
blueLabel.setForeground(Color.blue);
blueLabel.setOpaque(true);

redSlider.addChangeListener(this);
greenSlider.addChangeListener(this);
blueSlider.addChangeListener(this);

colorPatch = new JPanel();
colorPatch.setBackground(Color.black);

setBackground(Color.gray);
getContentPane().setBackground(Color.gray);

getContentPane().setLayout(new GridLayout(1,3,3,3));
JPanel scrolls = new JPanel();
JPanel labels = new JPanel();
scrolls.setBackground(Color.gray);
labels.setBackground(Color.gray);
getContentPane().add(scrolls);
getContentPane().add(labels);
getContentPane().add(colorPatch);

scrolls.setLayout(new GridLayout(3,1,2,2));
scrolls.add(redSlider);
scrolls.add(greenSlider);
scrolls.add(blueSlider);

labels.setLayout(new GridLayout(3,1,2,2));
labels.add(redLabel);
labels.add(greenLabel);
labels.add(blueLabel);
}
public void stateChanged(ChangeEvent evt) {
int r = redSlider.getValue();
int g = greenSlider.getValue();
int b = blueSlider.getValue();
redLabel.setText(" R = " + r);
greenLabel.setText(" G = " + g);
blueLabel.setText(" B = " + b);
colorPatch.setBackground(new Color(r,g,b));
} 
}
