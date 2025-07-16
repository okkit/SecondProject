package gui.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bl.DataTransferManager;

public class ProjectMain extends JFrame {

	public static final int FRAME_X = 600;
	public static final int FRAME_Y = 200;
	public static final int FRAME_WIDTH = 1000;
	public static final int FRAME_HEIGHT = 420;
	public static final String NAME = "<<2>>";
	private DataTransferManager dtm = new DataTransferManager();

	/**
	 * Constructs the application frame
	 */
	public ProjectMain() {
		super(NAME);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(FRAME_X, FRAME_Y, FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);

		initTabs();
		setVisible(true); // Muss IMMER die LETZTE Zeile im Konstruktor sein.
	}

	private void initTabs() {
		TabPane tabPanel = new TabPane();

		FormularPanel partyPanel = new FormularPanel(); // Das Panel, das wir bereits haben
		tabPanel.addTab("Gäste", partyPanel);

		JPanel samePanel = new JPanel(); // Ein neues, z. Z. ein leeres Panel
		tabPanel.addTab("Statistische Auswertung", samePanel);
		add(tabPanel);

	}

	public static void main(String[] args) {
		new ProjectMain();
	}

}
