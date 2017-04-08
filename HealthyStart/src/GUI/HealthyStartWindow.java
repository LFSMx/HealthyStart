package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JPanel;

public class HealthyStartWindow {

	private JFrame frmHealthyStart;
	private CustomPanel PM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthyStartWindow window = new HealthyStartWindow();
					window.frmHealthyStart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HealthyStartWindow() {
		// Initialize JFrame object
		initialize();
		// 
		this.PM = new CustomPanel(frmHealthyStart);
		this.PM.changePanel(new MainMenuPanel(frmHealthyStart));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHealthyStart = new JFrame();
		frmHealthyStart.setBackground(new Color(238, 238, 238));
		frmHealthyStart.setTitle("Welcome to Healthy Start");
		frmHealthyStart.setBounds(100, 100, 800, 500);
		frmHealthyStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHealthyStart.getContentPane().setLayout(null);
	}
}
