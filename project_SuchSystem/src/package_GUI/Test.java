package package_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Test extends JFrame
{

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private ArrayList<String> list = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Test frame = new Test();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test()
	{
		list.add("Peter");
		list.add("Gustav");
		list.add("Stefan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 242, 414, -230);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 23, 279, 169);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Alter"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				for(int i = 0; i < list.size(); i++)
				{
					model.addRow(new Object [] {list.get(i), 12});
				}
			}
		});
		btnNewButton.setBounds(196, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 203, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
//	public void zeigeAlleLehrer()
//	{
//		DefaultTableModel model = (DefaultTableModel)table_Lehrer.getModel();
//		loescheLehrerTabelle();
////		model.setRowCount(0);
//		for(int i = 0; i < lehrerliste.size(); i++) 
//		{
////			Lehrer lehrer = lehrerliste.get(i);
//			if(lehrerliste.get(i).isMehrereklassen() == true && lehrerliste.get(i).isMehrerefaecher() == true)
//			{
//				model.addRow(new Object [] {lehrerliste.get(i).getName(), lehrerliste.get(i).getNachname(), lehrerliste.get(i).getKuerzel(), lehrerliste.get(i).getKlasse_1().getBezeichnung(), lehrerliste.get(i).getKlasse_2().getBezeichnung(), lehrerliste.get(i).getFach().getBezeichnung(), lehrerliste.get(i).getFach2().getBezeichnung()});
//			}
//			else if(lehrerliste.get(i).isMehrereklassen() == true && lehrerliste.get(i).isMehrerefaecher() == false)
//			{
//				model.addRow(new Object [] {lehrerliste.get(i).getName(), lehrerliste.get(i).getNachname(), lehrerliste.get(i).getKuerzel(), lehrerliste.get(i).getKlasse_1().getBezeichnung(), lehrerliste.get(i).getKlasse_2().getBezeichnung(), lehrerliste.get(i).getFach().getBezeichnung(), " --- "});
//			}
//			else if(lehrerliste.get(i).isMehrereklassen() == false && lehrerliste.get(i).isMehrerefaecher() == true)
//			{
//				model.addRow(new Object [] {lehrerliste.get(i).getName(), lehrerliste.get(i).getNachname(), lehrerliste.get(i).getKuerzel(), lehrerliste.get(i).getKlasse_1().getBezeichnung(), " --- ", lehrerliste.get(i).getFach().getBezeichnung(), lehrerliste.get(i).getFach2().getBezeichnung()});
//			}
//			else
//			{
//				model.addRow(new Object [] {lehrerliste.get(i).getName(), lehrerliste.get(i).getNachname(), lehrerliste.get(i).getKuerzel(), lehrerliste.get(i).getKlasse_1().getBezeichnung(), " --- ", lehrerliste.get(i).getFach().getBezeichnung(), " --- "});
//			}
//		}
//	}

}
