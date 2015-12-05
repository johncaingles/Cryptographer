package view.ciphers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import controller.ICipherController;
import view.MainFrame;

public class SimpleCipherView extends JPanel implements ActionListener, KeyListener {

	private MainFrame mainFrame;
	
	/**Controller*/
	private ICipherController controller;
	
	public SimpleCipherView(MainFrame mainFrame, ICipherController controller) {
		this.mainFrame = mainFrame;
		this.setBounds(0, 0, 683, 434);
		setLayout(null);
		
		this.controller = controller;
	}

	/** ACTION LISTNERLKSAJDF */
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
