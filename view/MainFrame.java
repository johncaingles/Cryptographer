package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ciphers.BeaufortCipherController;
import controller.ciphers.CaesarCipherController;
import controller.ciphers.FoursquareCipherController;
import controller.ciphers.HillCipherController;
import controller.ciphers.RotnController;
import controller.ciphers.VigenereCipherController;
import model.Database;
import view.ciphers.SimpleCipherView;
import view.ciphers.KeyCipherView;
import view.ciphers.FoursquareCipherView;

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
		} else
		if(view.equals("ROT-N")) {
			currentPanel = new KeyCipherView(this, new RotnController());
		} else
        if(view.equals("Four-square Cipher")) {
        	currentPanel = new SimpleCipherView(this, new FoursquareCipherController());
        } else
		if(view.equals("Caesar Cipher")) {
			currentPanel = new KeyCipherView(this, new CaesarCipherController());
		} else 
		if(view.equals("Beaufort Cipher")) {
			currentPanel = new KeyCipherView(this, new BeaufortCipherController(model));
		} else
		if(view.equals("Vigenere Cipher")){
            currentPanel = new KeyCipherView(this, new VigenereCipherController(model));
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

