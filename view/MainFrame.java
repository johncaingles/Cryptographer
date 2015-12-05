package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ciphers.HillCipherController;
import model.Database;
import view.ciphers.SimpleCipherView;

public class MainFrame extends JFrame {

	private JPanel currentPanel;
	private Database model;
	
	public MainFrame(String appName, Database model) {
		/** Frame setup */
		this.setTitle("Cryptographer");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(0, 0, 683, 434);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		this.model = model;
	}

	public void renderView(String view) {
		/** continue if else statements here for new ciphers
		 * format
		 * if(view.equals("CIPHER NAME THAT YOU ADDED TO listOfCiphers from DATABASE.java")) {
			currentPanel = new SimpleCipherView(this, new NewCipherController()<--create this after);
			}
		*/
		if(view.equals("Main Menu")) {
			currentPanel = new MainMenuView(this, model); 
		} else
		if(view.equals("Hill Cipher")) {
			currentPanel = new SimpleCipherView(this, new HillCipherController());
		}
		
		frameRevalidate();
		this.setContentPane((JPanel) currentPanel);
	}
	
	private void frameRevalidate() {
		validate();
		repaint();
		setVisible(true);
	}
}
