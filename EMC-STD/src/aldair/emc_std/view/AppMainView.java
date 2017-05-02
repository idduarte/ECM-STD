package aldair.emc_std.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class AppMainView extends JFrame implements Ii18nComponent{
	
	private static final long serialVersionUID = -1065810703344905972L;
	private HashMap<String, String> localizedText;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu aboutMenu;

	public AppMainView() {
		localizedText = new HashMap<>();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setMinimumSize(new Dimension(640, 480));
		this.setTitle("Electromagnetic Compatibility Studio");
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		aboutMenu = new JMenu("About");
		menuBar.add(aboutMenu);
		this.add(menuBar,BorderLayout.NORTH);
	}

	@Override
	public void refreshLocalizedStuff() {
		
		
		
	}

}
