package pl.edu.pw.mini.po.assessedtask4a.solution.graphicpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyFrame {

	private JFrame jFrame = new JFrame();

	public MyFrame() {
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setTitle("Maciej Bednarz - ostatnie zadanie przed wakacjami!");
		Object lock = new Object();
		GraphicPanel graphicPanel = new GraphicPanel(lock);
		jFrame.add(createMainPanel(graphicPanel, lock));

		jFrame.setJMenuBar(createMainMenuBar(graphicPanel));
		jFrame.pack();
	}

	private JPanel createMainPanel(GraphicPanel graphicPanel, Object lock) {
		JPanel result = new JPanel();

		result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));
		result.add(createRaysPanel(lock));
		result.add(createGraphicPanel(graphicPanel));

		return result;
	}

	private JPanel createGraphicPanel(GraphicPanel graphicPanel) {
		JPanel result = new JPanel();

		result.add(graphicPanel);

		return result;
	}

	private JPanel createRaysPanel(Object lock) {
		JPanel result = new JPanel();

		JButton jButton = new JButton("Release one");
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				synchronized (lock) {
					lock.notify();
				}
			}
		});

		result.add(jButton);

		return result;
	}

	private JMenuBar createMainMenuBar(GraphicPanel graphicPanel) {
		JMenuBar result = new JMenuBar();

		JMenu optionsMenu = new JMenu("Options");

		JMenuItem firstOptionMenuItem = new JMenuItem("Set random color (ovals)");
		firstOptionMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				graphicPanel.setRandomColorForAllOvals();
			}
		});

		optionsMenu.add(firstOptionMenuItem);

		result.add(optionsMenu);

		return result;
	}

}
