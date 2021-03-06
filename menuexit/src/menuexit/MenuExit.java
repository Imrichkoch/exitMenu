package menuexit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MenuExit extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3324011838043471912L;

	JPanel thePanel = new JPanel();

	public MenuExit() {
		this.setBackground(Color.green);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Menu Exit");
		this.setSize(800, 600);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");

		JMenuItem exit = new JMenuItem("Exit");
		menu.add(exit);
		menuBar.add(menu);
		this.setJMenuBar(menuBar);

		exit.addActionListener(e -> System.exit(0));

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		this.setLocation(xPos, yPos);

	}

}
