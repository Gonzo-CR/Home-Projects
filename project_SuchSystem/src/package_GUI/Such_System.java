package package_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class Such_System extends JFrame
{

	private JPanel contentPane;
	private JLabel lblStart;
	private ImageIcon ksnStart = new ImageIcon(Such_System.class.getResource("/package_Images/logo-ksn.png"));
	private ImageIcon KSNStartLogo = new ImageIcon(Such_System.class.getResource("/package_Images/StartBild.png"));

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
					Such_System frame = new Such_System();
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
	public Such_System()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewStart = new JLabel("");
		lblNewStart.setBackground(Color.WHITE);
		lblNewStart.setBounds(213, 221, 164, 70);
		contentPane.add(lblNewStart);
		Image StartImage = ksnStart.getImage();
		Image modStartImage = StartImage.getScaledInstance(lblNewStart.getWidth(), lblNewStart.getHeight(), Image.SCALE_SMOOTH);
		ksnStart = new ImageIcon(modStartImage);
		lblNewStart.setIcon(ksnStart);
		
		JLabel lblStartBild = new JLabel("");
		lblStartBild.setBounds(10, 11, 614, 172);
		contentPane.add(lblStartBild);
		Image StartBildImage = KSNStartLogo.getImage();
		Image modStartBildImage = StartBildImage.getScaledInstance(lblStartBild.getWidth(), lblStartBild.getHeight(), Image.SCALE_SMOOTH);
		KSNStartLogo = new ImageIcon(modStartBildImage);
		lblStartBild.setIcon(KSNStartLogo);
		
		JLabel lblWillkommen = new JLabel("HERZLICH WILLKOMMEN");
		lblWillkommen.setBounds(10, 221, 193, 37);
		contentPane.add(lblWillkommen);
		
		JButton btnSuchen = new JButton("Suchen");
		btnSuchen.setBounds(213, 357, 89, 23);
		contentPane.add(btnSuchen);
	}
}
