import javax.swing.*;
import java.awt.event.*;

public class JMenu1 extends JFrame{
	public JMenu1(){
		setTitle("Menu Example");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

	JMenuItem newItem = new JMenuItem("New");
	JMenuItem openItem = new JMenuItem("Open");
	JMenuItem exitItem = new JMenuItem("Exit");

	exitItem.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	});

	fileMenu.add(newItem);
	fileMenu.add(openItem);
	fileMenu.addSeparator();
	fileMenu.add(exitItem);

	menuBar.add(fileMenu);
	menuBar.add(editMenu);
	menuBar.add(helpMenu);

	setJMenuBar(menuBar);
}
public static void main(String[] ars){
	SwingUtilities.invokeLater(new Runnable() {
		public void run(){
			new JMenu1().setVisible(true);
		}
	});
}
}
