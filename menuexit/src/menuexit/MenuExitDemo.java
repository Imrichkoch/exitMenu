package menuexit;

import java.awt.EventQueue;

public class MenuExitDemo {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			new MenuExit();
		});
	}
}
