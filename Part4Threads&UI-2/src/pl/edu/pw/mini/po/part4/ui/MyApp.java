package pl.edu.pw.mini.po.part4.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyApp {
	
	private JFrame jFrame;
	
	public MyApp() {
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);

		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setTitle("Moja pierwsza ramka!");
		jFrame.setPreferredSize(new Dimension(800, 800));

		jFrame.add(getMainPanel());
		jFrame.setJMenuBar(getMainJMenuBar());
			
			//jFrame.setFocusable(true);
			//jFrame.grabFocus();
			
		jFrame.pack();

	}

	JPanel getMainPanel() {
		JPanel result = new JPanel();
		
		JPanel topPanel = new JPanel();
		
		result.add(topPanel);
		
		
		return result;
	}

	private JMenuBar getMainJMenuBar() {
		JMenuBar result = new JMenuBar();

		JMenu optionsMenu = new JMenu("Options");

		JMenuItem firstOptionMenuItem = new JMenuItem("First");
		firstOptionMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// FileSystemView.getFileSystemView().getHomeDirectory()
				JFileChooser myFileChooser = new JFileChooser();

				int returnValue = myFileChooser.showOpenDialog(null);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = myFileChooser.getSelectedFile();
					System.out.println(selectedFile.getAbsolutePath());

				}

			}
		});
		JMenuItem secondOptionMenuItem = new JMenuItem("Second");
		secondOptionMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Color color = JColorChooser.showDialog(jFrame, "", new Color(1));
				//workPanel.setBackground(color);
				System.out.println("Color: " + color);
			}
		});
		JMenuItem thirdOptionMenuItem = new JMenuItem("Third");
		thirdOptionMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//workPanel.setFocusable(true);
				//workPanel.grabFocus();
			}
		});
		optionsMenu.add(firstOptionMenuItem);
		optionsMenu.add(secondOptionMenuItem);
		optionsMenu.add(thirdOptionMenuItem);

		result.add(optionsMenu);

		return result;
	}

}
