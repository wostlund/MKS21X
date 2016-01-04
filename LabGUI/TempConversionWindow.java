import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel ans;
    private JTextField t;
    private String asghj = "Please enter a number :)";

    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize(400,400);
	this.setLocation(0,0);
	this.setDefaultCloseOperation(
				 EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton c = new JButton("ToC");
	c.addActionListener(this);
	c.setActionCommand("Celcius");
	JButton f = new JButton("ToF");
	f.addActionListener(this);
	f.setActionCommand("Farenheit");

	t = new JTextField(10);

	ans = new JLabel("Your answer will appear here");

	pane.add(t);
	pane.add(c);
	pane.add(f);
	pane.add(ans);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	String s = t.getText();
	double m;
	try{
	    m = Double.valueOf(s);
	    if(event.equals("Celcius")){
		ans.setText(""+TempConverter.FtoC(m));
	    }else{
		ans.setText(""+TempConverter.CtoF(m));
	    }
	}catch(NumberFormatException carlos){
	    ans.setText(asghj);
	    asghj="Please stop and enter a number >:(";
	}
    }
}
