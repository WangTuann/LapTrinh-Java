

/**
 *
 * @author Quang Tuan
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calc extends JFrame{

    private final JButton bt1;
    private final JButton bt2;
    private final JButton bt3;
    private final JButton bt4;
    private final JTextField tf1;   
    private final JTextField tf2;   
    private final JTextField tf3;
  private final Container cont;
    private final JPanel pn1;
    private final JPanel pn2;
  private double result;
  
  public Calc(String s){
      super(s);
        cont=this.getContentPane();
        JLabel num1lb =new JLabel("number 1");
        tf1=new JTextField();
        JLabel num2lb =new JLabel("number 2");
        tf2=new JTextField();
        JLabel resultld = new JLabel("Result");
        tf3= new JTextField();
        tf3.setEditable(false);
        pn1= new JPanel();
        pn1.setLayout(new GridLayout(3,2));
        
        pn1.add(num1lb); 
		pn1.add(tf1); 
		pn1.add(num2lb); 
		pn1.add(tf2);
		pn1.add(resultld);
		pn1.add(tf3);
		
		bt1 = new JButton("+");
		bt2= new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		
		pn2 = new JPanel();
		pn2.add(bt1);
		pn2.add(bt2);
		pn2.add(bt3);
		pn2.add(bt4);
        
                cont.add(pn1); 
		cont.add(pn2,"South"); 
		
		bt1.addActionListener((ActionListener) this);
		bt2.addActionListener((ActionListener) this); 
		bt3.addActionListener((ActionListener) this); 
		bt4.addActionListener((ActionListener) this);
		
		this.pack();
		this.setVisible(true);
	}

	
	public void doPlus() 
	{ 
	   result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()); 
	   tf3.setText(String.valueOf(result)); 
	}
	
	public void doMinus() 
	{ 
		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
	
	public void doMult() 
	{
		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result)); 
	}
	
	public void doDiv()
	{
	    result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
	    tf3.setText(String.valueOf(result));
	} 
	
	
	public void actionPerformed(ActionEvent e) 
	{ 
		if ("+".equals(e.getActionCommand()))
		doPlus();
		if ("-".equals(e.getActionCommand()))
		doMinus();
		if ("*".equals(e.getActionCommand()))
		doMult();
		if ("/".equals(e.getActionCommand()))
		doDiv();
	
	}
	
	public static void main(String args[])
	{
		
		Calc simpleCalculator = new Calc("SimpleCalculator");
		simpleCalculator.setLocationRelativeTo(null);
	}
}
    

