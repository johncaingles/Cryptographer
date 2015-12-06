package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import controller.MainMenuController;
import model.Database;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class MainMenuView extends JPanel implements ActionListener, KeyListener  {

	private MainFrame mainFrame;
	
	/** Controller */
	private MainMenuController controller;
	
	/** Panel components */
	private JLabel lblDevs;
	private JComboBox cmbbxCipherList;
	private JButton btnChooseCipher;
	
	public MainMenuView(MainFrame mainFrame, Database model) {
		this.mainFrame = mainFrame;
		this.setBounds(0, 0, 683, 434);
		setLayout(null);
		
		lblDevs = new JLabel("Cryptographer");
		lblDevs.setFont(new Font("Britannic Bold", Font.PLAIN, 51));
		lblDevs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevs.setBounds(10, 25, 663, 147);
		add(lblDevs);
		
		cmbbxCipherList = new JComboBox(model.getListOfCiphers().toArray());
		cmbbxCipherList.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cmbbxCipherList.setBounds(163, 263, 126, 20);
		add(cmbbxCipherList);
		
		btnChooseCipher = new JButton("Choose Cipher");
		btnChooseCipher.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnChooseCipher.setBounds(368, 262, 156, 23);
		btnChooseCipher.addActionListener(this);
		add(btnChooseCipher);
		
		controller = new MainMenuController(this, model);
		
		JLabel lblCainglesMedina = new JLabel("By Caingles, Lim, Medina, Sanchez");
		lblCainglesMedina.setFont(new Font("Monotype Corsiva", Font.PLAIN, 19));
		lblCainglesMedina.setHorizontalAlignment(SwingConstants.CENTER);
		lblCainglesMedina.setBounds(141, 158, 383, 14);
		add(lblCainglesMedina);
	}

	/** START OF ACTION LISTENERS */

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == btnChooseCipher) {
			String chosenCipher = getChosenCipher();
			mainFrame.renderView(chosenCipher);
		}
	}

	private String getChosenCipher() {
		return cmbbxCipherList.getSelectedItem().toString();
	}

	@Override
	public void keyPressed(KeyEvent ke) {
//		if(ke.getKeyCode() == KeyEvent.VK_ENTER && ke.getSource() == chatInputTxtField)	{
//		
//		}
	}

	@Override
	public void keyReleased(KeyEvent ke) {
	}

	@Override
	public void keyTyped(KeyEvent ke) {
	}
}
