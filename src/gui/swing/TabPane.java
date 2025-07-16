package gui.swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTabbedPane;

public class TabPane extends JTabbedPane {

	public static final Color BG_COLOR = Color.WHITE;
	private static final Font FONT_TAB = new Font("Arial", Font.PLAIN, 24);

	public TabPane() {
		super(JTabbedPane.TOP);
		setFont(FONT_TAB);
		setBackground(BG_COLOR);
	}

}
