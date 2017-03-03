package test1;
import java.awt.BorderLayout; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;



public class Jframe1 extends JFrame {

	private JPanel contentPane;
	private final JTable table_1 = new JTable();
	private JButton selectButton;
	private JButton insertButton;
	private JPanel panel;
	private JPanel panel_2;
	private JTextPane textPane;
	private JTextPane textPane_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe1 frame = new Jframe1();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jframe1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 845);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setForeground(new Color(0, 51, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(144, 25, 561, 265);
		contentPane.add(panel);
		panel.setLayout(null);
		table_1.setBounds(6, 6, 549, 253);
		panel.add(table_1);
		table_1.setFillsViewportHeight(true);
		
		selectButton = new JButton("Load");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		selectButton.setBounds(343, 302, 155, 62);
		contentPane.add(selectButton);
		
		insertButton = new JButton("New button");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		insertButton.setBounds(343, 681, 155, 62);
		contentPane.add(insertButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(264, 567, 310, 89);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textPane_1 = new JTextPane();
		textPane_1.setToolTipText("Write stuff here");
		textPane_1.setBounds(6, 6, 298, 77);
		panel_1.add(textPane_1);
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(144, 430, 561, 112);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textPane = new JTextPane();
		textPane.setToolTipText("Write stuff here");
		textPane.setBounds(6, 6, 549, 100);
		panel_2.add(textPane);
			
		
	}
}

