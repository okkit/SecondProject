package gui.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FormularPanel extends JPanel implements MouseListener {

	private static final Color BG_COLOR = Color.WHITE;
	private static final Font FONT = new Font("Arial", Font.PLAIN, 20);
	private static final String TODO = "TODO:\n\n" + "Das Formular mit den Daten\n" + "für den Gast\n\n" + "%s\n\n"
			+ "anzeigen.";


	/**
	 * DE: Anzeige des Inhalts der selektierten Zeile in der Liste.<br>
	 * Jedes Listeneintrag ist eine Instanz der Klasse bl.GuestForm. Das, was in der
	 * Liste letztenendes angezeigt wird, ist der Return-Wert der Methode toString()
	 * der Klasse GuestForm!<br>
	 * EN: Display the contents of the selected row in the list.<br>
	 * Each list item is an instance of the bl.GuestForm class.<br>
	 * Each row of the list is the return value of the toString() method of the
	 * GuestForm class.
	 */
	JTextArea todo_label;

	/**
	 * self-explanatory :-)
	 */
	private JList<String> listView;
	private String[] listData;

	/**
	 * DE: Standardkonstruktor (halt ohne Paramener)<br>
	 * Im Konstruktor werden die Erscheinungseigenschaften des Panels
	 * initialisiert<br>
	 * und die Initialisierung der Bestandtteile des Panels werden angestoßen
	 * (Aufruf der Methode init())<br>
	 * EN: Constructs an instance of the class.<br>
	 * Sets the appearance properties and initializes the components (calls the
	 * method init()).
	 * 
	 */
	public FormularPanel() {
		super();
		listData = getFakeList();
		init();
	}


	private void init() {
		initLayout();
		initComponents();
	}

	/**
	 * Creates fake data
	 * @return
	 */
	private String[] getFakeList() {
		int count = 20;
		String[] retList = new String[count];
		for (int i = 0; i < count; i++) {
			retList[i] = "Person Nr. " + i;
		}
		return retList;
	}


	private void initLayout() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(1, 2));
	}

	/**
	 * DE: Initialisiert die beiden Bestandtteile: die Liste und das Formular<br>
	 * EN: Initializes the two child-components: the list and the form.
	 */
	private void initComponents() {
		initListView(); // Liste
		initFormView(); // Das Formular, das wir bereits haben
	}

	private void initListView() {

		listView = new JList<String>(listData);
		listView.setPreferredSize(new Dimension(600, 200));
		listView.setFont(FONT);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getViewport().setView(listView); // Zeigt die Liste tatsächlich an

		listView.addMouseListener(this);
		add(scrollPane);

	}

	private void initFormView() {
		JPanel formPanel = new JPanel();
		formPanel.setBackground(BG_COLOR);
		todo_label = new JTextArea("TODO");
		todo_label.setEditable(false);
		todo_label.setFont(FONT);
		formPanel.add(todo_label);
		add(formPanel);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			int index = listView.locationToIndex(e.getPoint());
			todo_label.setText(String.format(TODO, listData[index]));
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// wird in dieser Anwendung nicht benötigt
		// is not required in this application

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// wird in dieser Anwendung nicht benötigt
		// is not required in this application

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// wird in dieser Anwendung nicht benötigt
		// is not required in this application

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// wird in dieser Anwendung nicht benötigt
		// is not required in this application

	}

}
