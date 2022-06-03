package pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame {

	private JFrame jFrame = new JFrame();

	public MyFrame() {
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setTitle("Maciej Bednarz - moja pierwsza oceniana ramka!");
		Object lock = new Object();

		jFrame.add(createMainPanel(lock));

		jFrame.setJMenuBar(createMainMenuBar(lock));
		jFrame.pack();
	}

	private JPanel createMainPanel(Object lock) {
		JPanel result = new JPanel();

		GraphicPanel graphicPanel = new GraphicPanel(lock);

		result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));
		result.add(createGraphicPanel(graphicPanel));
		result.add(createRaysPanel(graphicPanel));

		return result;
	}

	private JPanel createGraphicPanel(GraphicPanel graphicPanel) {
		JPanel result = new JPanel();

		result.add(graphicPanel);

		return result;
	}

	private JPanel createRaysPanel(GraphicPanel graphicPanel) {
		JPanel result = new JPanel();

		final JTextField jTextField = new JTextField();
		jTextField.setEnabled(false);
		jTextField.setPreferredSize(new Dimension(100, 20));
		JButton jButton = new JButton("Get rays");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextField.setText(String.valueOf(graphicPanel.getOvalsRays()));
			}
		});

		result.add(jButton);
		result.add(jTextField);

		return result;
	}

	private JMenuBar createMainMenuBar(Object lock) {
		JMenuBar result = new JMenuBar();

		JMenu optionsMenu = new JMenu("Options");

		JMenuItem firstOptionMenuItem = new JMenuItem("Release");
		firstOptionMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action");
				synchronized (lock) {
					lock.notifyAll();
				}
				System.out.println("Notified!");
			}
		});

		optionsMenu.add(firstOptionMenuItem);

		result.add(optionsMenu);

		return result;
	}

}
