package pl.edu.pw.mini.po.twelfth;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

public class MyKeyListener4ThirdButton implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
		if(e.getSource() instanceof JButton) {
			JButton thirdButton = (JButton)e.getSource();
			thirdButton.setText(thirdButton.getText() + e.getKeyChar());
//			System.out.println(" Char: " + e.getKeyChar() + " " + thirdButton.getText());
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
