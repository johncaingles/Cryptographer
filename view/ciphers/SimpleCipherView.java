package view.ciphers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import controller.ICipherController;
import view.MainFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class SimpleCipherView extends JPanel implements ActionListener, KeyListener {

	private MainFrame mainFrame;
	
	/**Controller*/
	private ICipherController controller;
	private JTextField txtfldInput;
	private JTextField txtfldOutput;
	private JButton btnEncrypt;
	private JButton btnDecrypt;
	private JButton btnBack;
	private boolean hasBeenClicked;
	
	public SimpleCipherView(MainFrame mainFrame, ICipherController controller) {
		hasBeenClicked = false;
		setBackground(Color.CYAN);
		this.mainFrame = mainFrame;
		this.setBounds(0, 0, 683, 434);
		setLayout(null);
		
		this.controller = controller;
		
		txtfldInput = new JTextField();
		txtfldInput.setHorizontalAlignment(SwingConstants.CENTER);
		txtfldInput.setText("Type your message here");
		txtfldInput.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	if(!hasBeenClicked) {
            		txtfldInput.setText("");
            		hasBeenClicked = true;
            	}
            }
        });
		txtfldInput.setBounds(124, 88, 385, 68);
		add(txtfldInput);
		txtfldInput.setColumns(10);
		
		btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(153, 191, 136, 36);
		btnEncrypt.addActionListener(this);
		add(btnEncrypt);
		
		btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setBounds(323, 191, 136, 36);
		btnDecrypt.addActionListener(this);
		add(btnDecrypt);
		
		txtfldOutput = new JTextField();
		txtfldOutput.setHorizontalAlignment(SwingConstants.CENTER);
		txtfldOutput.setText("Result");
		txtfldOutput.setColumns(10);
		txtfldOutput.setBounds(124, 283, 385, 68);
		add(txtfldOutput);
		
		btnBack = new JButton("BACK");
		btnBack.setBounds(10, 11, 89, 23);
		btnBack.addActionListener(this);
		add(btnBack);
	}

	/** ACTION LISTNERLKSAJDF */
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == btnEncrypt) {
			String input = getInputTxt();
			String output = controller.encrypt(input);
			setOutputTxt(output);
		} else
		if(ae.getSource() == btnDecrypt) {
			String input = getInputTxt();
			String output = controller.decrypt(input);
			setOutputTxt(output);
		}
		if(ae.getSource() == btnBack) {
			mainFrame.renderView("Main Menu");
		}
	}
	
	private void setOutputTxt(String output) {
		txtfldOutput.setText(output);		
	}

	private String getInputTxt() {
		return txtfldInput.getText();
	}

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
}
