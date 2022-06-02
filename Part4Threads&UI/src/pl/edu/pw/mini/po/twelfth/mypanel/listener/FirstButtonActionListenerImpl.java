package pl.edu.pw.mini.po.twelfth.mypanel.listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FirstButtonActionListenerImpl implements ActionListener {

	private int greenColorValue;

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		Object source = actionEvent.getSource();
		if (source instanceof JButton) {
			JButton sourceButton = (JButton) source;
			sourceButton.setBackground(new Color(0, greenColorValue++, 0));
			System.out.println("First button pressed. Current green factor: " + greenColorValue);
		}
	}

}
