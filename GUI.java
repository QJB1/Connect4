package jframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JPanel {
	static int val1 = 0;
	static int clickcount = 0;


	public static void main(String[] args){

// Dimensions
		Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
		double screen_height = screen_size.getWidth();
		double screen_width = screen_size.getWidth();

// object declaration
		JFrame frame = new JFrame("Hello World!");

		JPanel panel_main = new JPanel();
		JPanel panel_buttons = new JPanel();
		JPanel panel_display = new JPanel();

		JLabel display = new JLabel();

// PANEL DISPLAY
		panel_display.setBounds(0,0,(int)screen_width,(int)screen_height/5);
		panel_display.setBackground(Color.BLUE);

		panel_display.add(display);

// PANEL BUTTONS
		panel_buttons.setLayout(new GridLayout(4,4));
		panel_buttons.setBounds(0,(int)screen_height*1/5,(int)screen_width,(int)screen_height*2/5);
		panel_buttons.setBackground(Color.GREEN);

		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button_sign1 = new JButton("+");
		JButton button_sign2 = new JButton("-");
		JButton button_sign3 = new JButton("*");
		JButton button_sign4 = new JButton("/");
		JButton button_sign5 = new JButton("^");
		JButton button_sign6 = new JButton(".");
		JButton button_other1 = new JButton("DEL");
		JButton button_other2 = new JButton("CLEAR");


		panel_buttons.add(button1);
		panel_buttons.add(button2);
		panel_buttons.add(button3);
		panel_buttons.add(button4);
		panel_buttons.add(button5);
		panel_buttons.add(button6);
		panel_buttons.add(button7);
		panel_buttons.add(button8);
		panel_buttons.add(button9);

// PANEL MAIN
		
		panel_main.setBounds(0,0,(int)screen_width,(int)screen_height);
		panel_main.setBackground(Color.GRAY);

// frame settings
		//frame.getContentPane().add(panel_main);
		frame.getContentPane().add(panel_display);
		frame.getContentPane().add(panel_buttons);
		
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setSize(1600,1600);// 1600,800
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

// buttons	
		button1.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+1;
						clickcount += 1;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button2.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+2;
						clickcount += 1;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button3.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+3;
						clickcount += 3;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button4.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+4;
						clickcount += 4;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button5.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+5;
						clickcount += 5;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button6.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+6;
						clickcount += 1;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button7.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+7;
						clickcount += 1;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button8.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+8;
						clickcount += 1;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);
		button9.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					if (!isMAXorMIN(val1)){
						val1 = val1*10+9;
						clickcount += 1;
						display.setText(Integer.toString(val1));
					}
				}
			}
		);


	}
	public static boolean isMAXorMIN(int val){
		if (val >= Integer.MAX_VALUE && val <= Integer.MIN_VALUE){
			return false;
		}
		return true;
	}
	public GUI(){
		
	}
	
}
/*
	public void paint(Graphics g){
		g.fillRect(0,0,100,100);
		int[] cordsx = new int[]{100,100,200,200};
		int[] cordsy = new int[]{100,200,100,200};
		Polygon polygon1 = new Polygon(cordsx,cordsy,4);

		//polygon1.addPoint(5,5);
		g.setColor(Color.GREEN);
		g.drawPolygon(polygon1);
		//g.drawOval(50,40,150,150);
		//g.drawLine(20,20,)
	}
	public static void Frame(){
		
	}
	*/

/*
	Color purple = new Color(197,180,231);
	Color dark_blue = new Color(81,42,160);
*/


/*
		panel_main.setLayout(new BorderLayout());
		panel_main.add(panel_display, BorderLayout.PAGE_START);
		panel_main.add(panel_buttons, BorderLayout.CENTER);
		*/