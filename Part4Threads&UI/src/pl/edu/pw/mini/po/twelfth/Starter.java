package pl.edu.pw.mini.po.twelfth;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import pl.edu.pw.mini.po.twelfth.mypanel.MyWorkPanel;
import pl.edu.pw.mini.po.twelfth.mypanel.listener.FirstButtonActionListenerImpl;

public class Starter {

	private JTextField myTextField;
	private JCheckBox firstBox;
	private JCheckBox secondBox;
	private MyWorkPanel workPanel;
	private JFrame jFrame;

	public static void main(String[] args) {

		Starter starter = new Starter();
		starter.go();

	}

	private void go() {
		jFrame = new JFrame();
		jFrame.setVisible(true);

		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setTitle("Moja pierwsza ramka!");
		// jFrame.setSize(new Dimension(800, 800));

		jFrame.add(getMainPanel());
		jFrame.setJMenuBar(getMainJMenuBar());
		
		workPanel.setFocusable(true);
		workPanel.grabFocus();
		
		jFrame.pack();
	}

	private JPanel getMainPanel() {
		JPanel result = new JPanel();
		result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));

		result.add(getButtonPanel());
		this.workPanel = getWorkPanel();
		result.add(workPanel);
		result.add(getOperationalPanel());

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

				JColorChooser jColorChooser = new JColorChooser();
				Color color = jColorChooser.showDialog(jFrame, "", new Color(1));
				workPanel.setBackground(color);
				System.out.println("Color: " + color);
			}
		});
		JMenuItem thirdOptionMenuItem = new JMenuItem("Third");
		thirdOptionMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				workPanel.setFocusable(true);
				workPanel.grabFocus();
			}
		});
		optionsMenu.add(firstOptionMenuItem);
		optionsMenu.add(secondOptionMenuItem);
		optionsMenu.add(thirdOptionMenuItem);

		result.add(optionsMenu);

		return result;
	}

	private MyWorkPanel getWorkPanel() {
		//JPanel result = new JPanel();
		MyWorkPanel result = new MyWorkPanel();
		result.setBackground(new Color(50, 0, 100));

		result.setPreferredSize(new Dimension(400, 400));
		
		result.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("addFocusListener");
			}

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("addFocusListener");
			}
		});

		result.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("addKeyListener typed: " + e.getKeyChar());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("addKeyListener released: " + e.getKeyChar());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("addKeyListener pressed: " + e.getKeyChar());
			}

		});
		result.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				if(MouseEvent.BUTTON1 == e.getButton()) {
					System.out.println("Button 1 released");
				} else if (MouseEvent.BUTTON2 == e.getButton()) {
					System.out.println("Button 2 released");
				} else if (MouseEvent.BUTTON3 == e.getButton()) {
					System.out.println("Button 3 released");
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(MouseEvent.BUTTON1 == e.getButton()) {
					System.out.println("Button 1 pressed");
				} else if (MouseEvent.BUTTON2 == e.getButton()) {
					System.out.println("Button 2 pressed");
				} else if (MouseEvent.BUTTON3 == e.getButton()) {
					System.out.println("Button 3 pressed");
				}
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("EXITED");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("ENTERED");
				//result.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
				result.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				workPanel.addDot(e.getX(), e.getY());
				workPanel.repaint();
			}
			
		});

		
		result.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("MouseMotionListener");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("MouseMotionListener");
			}
		});

		result.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println("MouseWheelListener" + e.getScrollAmount() + " Wheel rotation: " + e.getWheelRotation());
				
			}
		});

		return result;
	}

	private JPanel getButtonPanel() {
		JPanel result = new JPanel();
		result.setBackground(new Color(100, 50, 50));

		JButton firstButton = new JButton("My first button");
		// pierwsza opcja
		firstButton.addActionListener(new FirstButtonActionListenerImpl());

		// druga opcja
		class GreenColorWrapper {
			private int greenColorValue = 0;

			public int getGreenColorValue() {
				return greenColorValue;
			}

			public void increase() {
				greenColorValue++;
			}
		}

		final GreenColorWrapper greenColorWrapper = new GreenColorWrapper();

		firstButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				Object source = actionEvent.getSource();
				if (source instanceof JButton) {
					JButton sourceButton = (JButton) source;
					// sourceButton.setEnabled(false);
					sourceButton.setBackground(new Color(0, greenColorWrapper.getGreenColorValue(), 0));
					greenColorWrapper.increase();
					System.out.println("First button pressed");
				}

			}

		});

		// Trzecia opcja
		firstButton.addActionListener(new ActionListener() {
			private int greenColorFactor;

			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				Object source = actionEvent.getSource();
				if (source instanceof JButton) {
					JButton sourceButton = (JButton) source;
					// sourceButton.setEnabled(false);
					sourceButton.setBackground(new Color(0, greenColorFactor++, 0));
					greenColorWrapper.increase();
					System.out.println("First button pressed");
				}

			}

			private void meth() {

			}

		});

		result.add(firstButton);

		JButton secondButton = new JButton("My second button");
		secondButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				if (firstBox.isSelected() && !secondBox.isSelected()) {
					myTextField.setText("Button!!!");
				}
			}

		});
		result.add(secondButton);

		JButton thirdButton = new JButton("My third button");
		thirdButton.addKeyListener(new MyKeyListener4ThirdButton());
		result.add(thirdButton);

		result.setPreferredSize(new Dimension(400, (int) result.getMinimumSize().getHeight()));

		return result;
	}

	private JPanel getOperationalPanel() {
		JPanel result = new JPanel();
		result.setBackground(new Color(255, 150, 0));

		result.add(getTextPanel());
		result.add(getRadioButtonsPanel());
		result.add(getCheckboxesPanel());

		result.setPreferredSize(new Dimension(600, (int) result.getMinimumSize().getHeight()));

		return result;
	}

	private JPanel getTextPanel() {
		JPanel result = new JPanel();

		JTextField lessImportantTextField = new JTextField();
		lessImportantTextField.setText("Write here...");
		lessImportantTextField
				.setPreferredSize(new Dimension(100, (int) lessImportantTextField.getMinimumSize().getHeight()));

		result.add(getMoreImportantTextFieldPanel());
		result.add(getTextFieldPanelWithMargins());
		result.add(getLessImportantTextFieldPanel());

		result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));

		result.setPreferredSize(new Dimension(300, (int) result.getMinimumSize().getHeight()));

		return result;
	}

	private JPanel getMoreImportantTextFieldPanel() {
		JPanel result = new JPanel();

		JLabel myLablel = new JLabel("My text");
		myTextField = new JTextField("AAAA");
		myTextField.setText("");
		myTextField.setPreferredSize(new Dimension(200, (int) myTextField.getMinimumSize().getHeight()));
		result.add(myLablel);
		result.add(myTextField);
		result.setBorder(BorderFactory.createTitledBorder("Important text fields!"));

		return result;
	}

	private JPanel getTextFieldPanelWithMargins() {
		JPanel result = new JPanel();

		JLabel myLablel = new JLabel("With margins ");
		JTextField myTextField = new JTextField("");
		myTextField.setPreferredSize(new Dimension(100, (int) myTextField.getMinimumSize().getHeight()));
		result.add(myLablel);
		result.add(myTextField);

		result.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 15));

		return result;
	}

	private JPanel getLessImportantTextFieldPanel() {
		JPanel result = new JPanel();

		JLabel myLablel = new JLabel("My text");
		JTextField myTextField = new JTextField("AAAA");
		myTextField.setText("Write here...");
		myTextField.setPreferredSize(new Dimension(100, (int) myTextField.getMinimumSize().getHeight()));
		result.add(myLablel);
		result.add(myTextField);

		return result;
	}

	private JPanel getRadioButtonsPanel() {
		JPanel result = new JPanel();

		JRadioButton first = new JRadioButton("First");
		JRadioButton second = new JRadioButton("Second");
		JRadioButton third = new JRadioButton("Third");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(first);
		buttonGroup.add(second);
		buttonGroup.add(third);

		result.add(first);
		result.add(second);
		result.add(third);

		result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));

		return result;
	}

	private JPanel getCheckboxesPanel() {
		JPanel result = new JPanel();

		firstBox = new JCheckBox("First");
		secondBox = new JCheckBox("Second");

		result.add(firstBox);
		result.add(secondBox);

		result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));

		return result;
	}

}
