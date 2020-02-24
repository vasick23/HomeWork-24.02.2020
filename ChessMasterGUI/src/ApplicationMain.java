import java.awt.BorderLayout;

import javax.swing.*;
public class ApplicationMain{
	public static void main(String[] args){		
		JFrame windowFrame = new JFrame();
		JLabel statusbar = new JLabel("Problem and game info will be displayed here.");
		windowFrame.add(statusbar, BorderLayout.SOUTH);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(520, 545);
		windowFrame.setResizable(false);
		windowFrame.add(new GameBoardPanel());	
		windowFrame.setVisible(true);
		String[] collection = new String[] {
			"H", "B", "C"	
		};
	}
}