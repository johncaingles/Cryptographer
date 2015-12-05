package driver;

import model.Database;
import view.MainFrame;

public class CryptographerMain {
	public static void main(String[] args) {
		new MainFrame("Cryptographer", new Database()).renderView("Main Menu");
	}
}
