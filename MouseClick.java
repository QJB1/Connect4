package jframe;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseClick{// implements MouseListener
	public static void main(String[] args){

// declaring objects
		JFrame frame = new JFrame("TicTacToe");

// JLabel pictures
		JLabel pic_x = new JLabel(new ImageIcon());
		JLabel pic_o = new JLabel();
		JLabel grid = new JLabel();

// frame settings
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setSize(1600,1600);// 1600,800
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " " + y);
			}
			@Override
			public void mouseEntered(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " " + y);
			}
			@Override
			public void mousePressed(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " " + y);
			}
			@Override
			public void mouseReleased(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " " + y);
			}
			@Override
			public void mouseExited(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " " + y);
			}
		});


	}
}
