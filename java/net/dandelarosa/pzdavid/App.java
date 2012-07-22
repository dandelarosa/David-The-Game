package net.dandelarosa.pzdavid;
import javax.swing.JFrame;

/**
 * Run this class in order to play the game.
 * @author dandelarosa
 */
public class App {
	/**
	 * Main method of the application
	 * @param args Parameters passed in from the console
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		JFrame frame = new GameJFrame(new DavidGameController());
	}
}
