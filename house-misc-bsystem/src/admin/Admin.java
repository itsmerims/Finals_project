package admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.w3c.dom.events.DocumentEvent;

import login_signup.login_admin;
import methods.deleteByID;
import methods.mgamethod;
import methods.tableSearchFilter;

import javax.swing.JTabbedPane;
import java.awt.ScrollPane;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
public class Admin extends JFrame {
	private static String user;
	String account;
    // then create setters and getter
    public void setUser(String user) 
    {
    	this.user = user;
    }
    
    public String getUser()
	{
		return user;
	}
	private JPanel contentPane;
	


	//set movable
		int xMouse;

		int yMouse;
		private JTable table;
		private JTable table_1;
		private JTable table_2;
		private JTable table_3;
		private JTable table_4;
		private JTextField txtD;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		String timeNow;
		String dateNow;
		private JTextField txtId;
		private JTextField txtId_1;
		
		
		
		private void frameMouseDragged(java.awt.event.MouseEvent evt) {

		int coorx = evt.getXOnScreen();

		int coory = evt.getYOnScreen();

		 

		this.setLocation(coorx-xMouse, coory-yMouse);

		 

		}

		 

		private void frameMousePressed(java.awt.event.MouseEvent evt) {

		xMouse  = evt.getX();

		yMouse = evt.getY();

		}
		//end
	
	/**
	 * Launch the application.
	 */
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);  
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 671);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setUndecorated(true);	
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		//lblNewLabel_2.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 3, 950, 22);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDaenerys = new JLabel("");
		lblDaenerys.setBounds(0, 0, 33, 21);
		lblDaenerys.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaenerys.setForeground(Color.WHITE);
		lblDaenerys.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		panel.add(lblDaenerys);
		
		
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("./src/logo/logo1.png").getImage().getScaledInstance(30, 29, Image.SCALE_DEFAULT));
		lblDaenerys.setIcon(imageIcon1);
		
		JLabel lblNewLabel = new JLabel("x");
		lblNewLabel.setBounds(915, -2, 33, 19);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE);
			}
		});
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel label_8 = new JLabel("Daenerys'");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(255, 255, 255));
		label_8.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		label_8.setBounds(462, 1, 118, 21);
		panel.add(label_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(0, 0, 950, 671);
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 793, 24);
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frameMouseDragged(e);
			}
		});
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frameMousePressed(e);
			}
		});
		panel_1.setLayout(null);
		
		JButton btnBack = new JButton("Logout");
		btnBack.setBounds(669, 72, 176, 42);
		panel_1.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_admin log = new login_admin();
				log.setVisible(true);
				log.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("SansSerif", Font.PLAIN, 19));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(0, 153, 255));
		
		JLabel lblNewLabel_3 = new JLabel("");
		printAcc(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(774, 27, 166, 36);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_3);
		panel_1.add(lblNewLabel_1);
		
		//time
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		timeNow = time.format(formatter);
		
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		dateNow = date.format(formatterDate);

	

ImageIcon imageIcon5 = new ImageIcon(new ImageIcon("./src/logo/client.png").getImage().getScaledInstance(90, 80, Image.SCALE_DEFAULT));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 35, 930, 620);
		panel_1.add(tabbedPane);
		JPanel panel_0 = new JPanel();
		tabbedPane.addTab(null, imageIcon5, panel_0);
		tabbedPane.setFont( new Font( "SansSerif", Font.BOLD|Font.ITALIC, 20 ) );
		
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("./src/login_signup/daenerys-targaryen.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("./src/login_signup/daenerys-targaryen.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		panel_0.setLayout(null);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(206, 52, 709, 321);
		panel_0.add(panel_3);
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 11, 689, 299);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setFont(new Font("SansSerif", Font.PLAIN, 13));
		table.setBackground(Color.WHITE);
		String [] columnHeader = new String[] {"Account no.", "Account owner", "Username", "Mobile No.", "Password"};
		DefaultTableModel dm = new DefaultTableModel(columnHeader,0);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Account no.", "Account owner", "Username", "Mobile No."
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 196, 556);
		panel_2.setBackground(new Color(216, 191, 216));
		panel_0.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(25, 214, 147, 194);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(26, 211, 146, 200);
		
		
		BufferedImage img3 = null;
		try {
		    img3 = ImageIO.read(new File("./src/logo/itotalga.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg3 = img3.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(),
		        Image.SCALE_SMOOTH);
		
		Image dimg4 = img3.getScaledInstance(label_5.getWidth(), label_5.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon4 = new ImageIcon(dimg4);
		
		ImageIcon imageIcon3 = new ImageIcon(dimg3);
		lblNewLabel_2.setIcon(imageIcon3);
		
		
		JLabel label_1 = new JLabel("Daenerys'");
		label_1.setBounds(68, 133, 118, 32);
		panel_2.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		
		
		JLabel lblBayadCenter = new JLabel("Bayad Center");
		lblBayadCenter.setBounds(25, 151, 144, 38);
		panel_2.add(lblBayadCenter);
		lblBayadCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblBayadCenter.setForeground(new Color(0, 0, 0));
		lblBayadCenter.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		
		
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(10, 83, 92, 77);
		panel_2.add(label_6);
		
		BufferedImage img2 = null;
		try {
		    img2 = ImageIO.read(new File("./src/logo/black2.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg2 = img2.getScaledInstance(label_6.getWidth(), label_6.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon2 = new ImageIcon(dimg2);
		label_6.setIcon(imageIcon2);
		
		ImageIcon imageIcon6 = new ImageIcon(new ImageIcon("./src/logo/payment.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab(null, imageIcon6, panel_4);
		panel_4.setLayout(null);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(new Color(102, 205, 170));
		panel_5.setBounds(0, 0, 196, 620);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		panel_5.add(label_5);
		label_5.setIcon(imageIcon4);
		
		JLabel label_3 =   new JLabel("Daenerys'");
		label_3.setBounds(69, 133, 117, 30);
		panel_5.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		
		JLabel label_4 = new JLabel("Bayad Center");
		label_4.setBounds(26, 156, 146, 30);
		panel_5.add(label_4);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(10, 83, 92, 77);
		panel_5.add(label_7);
		label_7.setIcon(imageIcon2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(206, 52, 709, 398);
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 689, 376);
		panel_6.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFillsViewportHeight(true);
		table_1.setBackground(Color.WHITE);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Account no.", "Name", "Type of bill", "Company", "Amount of bill", "Time", "Date", "Total payment"
			}
		));
		table_1.getColumnModel().getColumn(4).setPreferredWidth(78);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(81);
		scrollPane_1.setViewportView(table_1);
		
		
		//mgamethod met = new mgamethod();
		loadTable(table);
		
		JLabel lblClientsDetails = new JLabel("Clients Details");
		lblClientsDetails.setBounds(206, 11, 709, 30);
		lblClientsDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientsDetails.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 25));
		panel_0.add(lblClientsDetails);
		
		textField = new JTextField();
		textField.setBounds(267, 395, 253, 36);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
//					
					String searchQuery = textField.getText();
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
				{
					String searchQuery = "";
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				
			}
		
			
		});
		
		
		textField.setFont(new Font("SansSerif", Font.PLAIN, 17));
		textField.setColumns(10);
		panel_0.add(textField);
		
		JLabel label = new JLabel("Search:");
		label.setBounds(206, 394, 64, 39);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_0.add(label);
		
		txtId = new JTextField();
		txtId.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setBounds(686, 426, 229, 36);
		panel_0.add(txtId);
		txtId.setColumns(10);
		
		JButton btnDeleteARecord = new JButton("Delete a record by ID");
		btnDeleteARecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = txtId.getText();
				Boolean found = false;
				try {
				    DefaultTableModel model = (DefaultTableModel)table.getModel();
				    for (int i = 0; i < model.getRowCount(); i++) {
				        if (((String)model.getValueAt(i, 0)).equals(ID)) {
				            model.removeRow(i);
				            found = true;
				            break;
				        }
				    }
				    if(!found) {
				    	JOptionPane.showMessageDialog(null, "ID doesn't exists!", "Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else {
				    	JOptionPane.showMessageDialog(null, ID+" has been deleted from the database", "Data Deleted", JOptionPane.INFORMATION_MESSAGE);
				    	deletebyID(ID);
				    }
				}
				catch(Exception ex) {
					
				}
				
			}
		});
		btnDeleteARecord.setForeground(Color.WHITE);
		btnDeleteARecord.setFont(new Font("SansSerif", Font.PLAIN, 19));
		btnDeleteARecord.setBorder(null);
		btnDeleteARecord.setBackground(new Color(0, 153, 255));
		btnDeleteARecord.setBounds(686, 473, 229, 36);
		panel_0.add(btnDeleteARecord);
		
		
		
		JLabel lblEnterAccountNumber = new JLabel("Enter Account number:");
		lblEnterAccountNumber.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblEnterAccountNumber.setBounds(686, 397, 229, 30);
		panel_0.add(lblEnterAccountNumber);
		
		ImageIcon imageIcon7 = new ImageIcon(new ImageIcon("./src/logo/loginlog.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab(null, imageIcon7, panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBackground(new Color(100, 149, 237));
		panel_9.setBounds(0, 0, 196, 620);
		panel_7.add(panel_9);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(26, 211, 146, 200);
		panel_9.add(label_11);
		label_11.setIcon(imageIcon3);
		
		JLabel label_12 = new JLabel("Daenerys'");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		label_12.setBounds(69, 133, 117, 30);
		panel_9.add(label_12);
		
		JLabel label_13 = new JLabel("Bayad Center");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		label_13.setBounds(26, 156, 146, 30);
		panel_9.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(10, 83, 92, 77);
		panel_9.add(label_14);
		label_14.setIcon(imageIcon2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(206, 52, 709, 398);
		panel_7.add(panel_10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 689, 376);
		panel_10.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setFillsViewportHeight(true);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Time", "Date"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		ImageIcon imageIcon8 = new ImageIcon(new ImageIcon("./src/logo/emp.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab(null, imageIcon8, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBackground(new Color(244, 164, 96));
		panel_11.setBounds(0, 0, 196, 620);
		panel_8.add(panel_11);
		
		JLabel label_17 = new JLabel("");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(26, 211, 146, 200);
		panel_11.add(label_17);
		label_17.setIcon(imageIcon3);
		
		JLabel label_18 = new JLabel("Daenerys'");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.BLACK);
		label_18.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		label_18.setBounds(69, 133, 117, 30);
		panel_11.add(label_18);
		
		JLabel label_19 = new JLabel("Bayad Center");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(Color.BLACK);
		label_19.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		label_19.setBounds(26, 156, 146, 30);
		panel_11.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(10, 83, 92, 77);
		panel_11.add(label_20);
		label_20.setIcon(imageIcon2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(206, 52, 709, 291);
		panel_8.add(panel_12);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 689, 269);
		panel_12.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setFillsViewportHeight(true);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Account no.", "Account owner", "Username", "Mobile No."
			}
		));
		table_3.getColumnModel().getColumn(1).setPreferredWidth(91);
		scrollPane_3.setViewportView(table_3);
		//autoWrite();
		paymentlog(table_1);
		
		JLabel lblPaymentLog = new JLabel("Payment Log");
		lblPaymentLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaymentLog.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 25));
		lblPaymentLog.setBounds(206, 11, 709, 30);
		panel_4.add(lblPaymentLog);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
//					
					String searchQuery = textField.getText();
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
				{
					String searchQuery = "";
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				
			}
		
			
		});
		
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(267, 462, 253, 36);
		panel_4.add(textField_1);
		
		JLabel label_2 = new JLabel("Search:");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		label_2.setBounds(206, 461, 64, 39);
		panel_4.add(label_2);
		adminsign(table_3);
		
		JLabel lblEmployeesuserAdmins = new JLabel("Employees/User Admins");
		lblEmployeesuserAdmins.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeesuserAdmins.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 25));
		lblEmployeesuserAdmins.setBounds(206, 11, 709, 30);
		panel_8.add(lblEmployeesuserAdmins);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
//					
					String searchQuery = textField.getText();
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
				{
					String searchQuery = "";
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				
			}
		
			
		});
		textField_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(267, 373, 253, 36);
		panel_8.add(textField_2);
		
		JLabel label_9 = new JLabel("Search:");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("SansSerif", Font.BOLD, 15));
		label_9.setBounds(206, 372, 64, 39);
		panel_8.add(label_9);
		
		JButton button = new JButton("Delete a record by ID");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = txtId_1.getText();
				Boolean found = false;
				try {
				    DefaultTableModel model = (DefaultTableModel)table_3.getModel();
				    for (int i = 0; i < model.getRowCount(); i++) {
				        if (((String)model.getValueAt(i, 0)).equals(ID)) {
				            model.removeRow(i);
				            found = true;
				            break;
				        }
				    }
				    if(!found) {
				    	JOptionPane.showMessageDialog(null, "ID doesn't exists!", "Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else {
				    	JOptionPane.showMessageDialog(null, ID+" has been deleted from the database", "Data Deleted", JOptionPane.INFORMATION_MESSAGE);
				    	empdeletebyID(ID);
				    }
				}
				catch(Exception ex) {
					
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("SansSerif", Font.PLAIN, 19));
		button.setBorder(null);
		button.setBackground(new Color(0, 153, 255));
		button.setBounds(686, 424, 229, 36);
		panel_8.add(button);
		
		txtId_1 = new JTextField();
		txtId_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		txtId_1.setColumns(10);
		txtId_1.setBounds(686, 373, 229, 36);
		panel_8.add(txtId_1);
		
		ImageIcon imageIcon9 = new ImageIcon(new ImageIcon("./src/logo/emplog.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		
		JPanel panel_13 = new JPanel();
		tabbedPane.addTab(null, imageIcon9, panel_13, null);
		panel_13.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setBackground(new Color(173, 216, 230));
		panel_14.setBounds(0, 0, 196, 620);
		panel_13.add(panel_14);
		
		JLabel label_21 = new JLabel("");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setBounds(26, 211, 146, 200);
		panel_14.add(label_21);
		label_21.setIcon(imageIcon3);
		
		JLabel label_22 = new JLabel("Daenerys'");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(Color.BLACK);
		label_22.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		label_22.setBounds(69, 133, 117, 30);
		panel_14.add(label_22);
		
		JLabel label_23 = new JLabel("Bayad Center");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setForeground(Color.BLACK);
		label_23.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		label_23.setBounds(26, 156, 146, 30);
		panel_14.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(10, 83, 92, 77);
		panel_14.add(label_24);
		label_24.setIcon(imageIcon2);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(206, 52, 709, 398);
		panel_13.add(panel_15);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 11, 689, 376);
		panel_15.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setFillsViewportHeight(true);
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Time", "Date"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JLabel lblEmployeesMoginLog = new JLabel("Employee's Login Log");
		lblEmployeesMoginLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeesMoginLog.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 25));
		lblEmployeesMoginLog.setBounds(206, 11, 709, 30);
		panel_13.add(lblEmployeesMoginLog);
		
		clientlog(table_2);
		adminloginlog(table_4);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
//					
					String searchQuery = textField.getText();
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
				{
					String searchQuery = "";
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				
			}
		
			
		});
		textField_3.setFont(new Font("SansSerif", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(267, 462, 253, 36);
		panel_13.add(textField_3);
		
		JLabel label_10 = new JLabel("Search:");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("SansSerif", Font.BOLD, 15));
		label_10.setBounds(206, 461, 64, 39);
		panel_13.add(label_10);
		
		JLabel lblClientsLoginLog = new JLabel("Client's Login Log");
		lblClientsLoginLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientsLoginLog.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 25));
		lblClientsLoginLog.setBounds(206, 11, 709, 30);
		panel_7.add(lblClientsLoginLog);
		
		txtD = new JTextField();
		txtD.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
//					
					String searchQuery = textField.getText();
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
				{
					String searchQuery = "";
					tableSearchFilter tr = new tableSearchFilter();
					
					tr.searchAndFilter(table, searchQuery);
				}
				
				
			}
		
			
		});
		txtD.setFont(new Font("SansSerif", Font.PLAIN, 17));
		txtD.setBounds(266, 459, 253, 36);
		panel_7.add(txtD);
		txtD.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Search:");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(205, 458, 64, 39);
		panel_7.add(lblNewLabel_4);
		
		JLabel lblAccountNumber = new JLabel("Account number:");
		lblAccountNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountNumber.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblAccountNumber.setBounds(639, 29, 154, 34);
		panel_1.add(lblAccountNumber);
		

	}
	
	public void adminloginlog(JTable tbl)
	{
		 String filePath = "./src/database/adminloginlog.txt";
	        File file = new File(filePath);
	        
	        try {
	        	FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);
	            // get the first line
	            // get the columns name from the first line
	            // set columns name to the jtable model
	            
//	            DefaultTableModel model = new DefaultTableModel();
//	            tbl.setModel(model);
	            DefaultTableModel model = (DefaultTableModel)tbl.getModel();

	            // get lines from txt file
	            Object[] tableLines = br.lines().toArray();
	            
	            // extratct data from lines
	            // set data to jtable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	            	//trim means to cut
	                String line = tableLines[i].toString().trim();
	                //everytime the reader see's a comman(,), it jumps to another cell 
	                String[] dataRow = line.split(",");
	                
	                //everytime there is a newline, add the whole row to the table model
	                model.addRow(dataRow);
	            }
	            
	            
	            
	            
	        } catch (Exception ex) {
//	            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
	        	JOptionPane.showMessageDialog(null, ex.toString(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }
	}
	
	
	
	public void loadTable(JTable tbl)
	{
		
		 String filePath = "./src/database/clientssign.txt";
	        File file = new File(filePath);
	        //File tempDB = new File("./src/database/clienttemp.txt");
	        
	        try {
	        	FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);
	            // get the first line
	            // get the columns name from the first line
	            // set columns name to the jtable model
	            
//	            DefaultTableModel model = new DefaultTableModel();
//	            tbl.setModel(model);
	            DefaultTableModel model = (DefaultTableModel)tbl.getModel();

	            // get lines from txt file
	            Object[] tableLines = br.lines().toArray();
	            
	            // extratct data from lines
	            // set data to jtable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	            	//trim means to cut
	                String line = tableLines[i].toString().trim();
	                //everytime the reader see's a comman(,), it jumps to another cell 
	                String[] dataRow = line.split(",");
	                
	                //everytime there is a newline, add the whole row to the table model
	                model.addRow(dataRow);
	            }
	            
	            br.close();
	            
	            
	        } catch (Exception ex) {
//	            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
	        	JOptionPane.showMessageDialog(null, ex.toString(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }
	}
	
	public void paymentlog(JTable tbl)
	{
		 String filePath = "./src/database/paymentlog.txt";
	        File file = new File(filePath);
	        
	        try {
	        	FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);
	            // get the first line
	            // get the columns name from the first line
	            // set columns name to the jtable model
	            
//	            DefaultTableModel model = new DefaultTableModel();
//	            tbl.setModel(model);
	            DefaultTableModel model = (DefaultTableModel)tbl.getModel();

	            // get lines from txt file
	            Object[] tableLines = br.lines().toArray();
	            
	            // extratct data from lines
	            // set data to jtable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	            	//trim means to cut
	                String line = tableLines[i].toString().trim();
	                //everytime the reader see's a comman(,), it jumps to another cell 
	                String[] dataRow = line.split(",");
	                
	                //everytime there is a newline, add the whole row to the table model
	                model.addRow(dataRow);
	            }
	            
	            
	            
	        } catch (Exception ex) {
//	            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
	        	JOptionPane.showMessageDialog(null, ex.toString(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }
	}
	
	public void adminsign(JTable tbl)
	{
		 String filePath = "./src/database/adminsign.txt";
	        File file = new File(filePath);
	        
	        try {
	        	FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);
	            // get the first line
	            // get the columns name from the first line
	            // set columns name to the jtable model
	            
//	            DefaultTableModel model = new DefaultTableModel();
//	            tbl.setModel(model);
	            DefaultTableModel model = (DefaultTableModel)tbl.getModel();

	            // get lines from txt file
	            Object[] tableLines = br.lines().toArray();
	            
	            // extratct data from lines
	            // set data to jtable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	            	//trim means to cut
	                String line = tableLines[i].toString().trim();
	                //everytime the reader see's a comman(,), it jumps to another cell 
	                String[] dataRow = line.split(",");
	                
	                //everytime there is a newline, add the whole row to the table model
	                model.addRow(dataRow);
	            }
	            
	            
	            
	        } catch (Exception ex) {
//	            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
	        	JOptionPane.showMessageDialog(null, ex.toString(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }
	}
	
	public void clientlog(JTable tbl)
	{
		 String filePath = "./src/database/loginlog.txt";
	        File file = new File(filePath);
	        
	        try {
	        	FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);
	            // get the first line
	            // get the columns name from the first line
	            // set columns name to the jtable model
	            
//	            DefaultTableModel model = new DefaultTableModel();
//	            tbl.setModel(model);
	            DefaultTableModel model = (DefaultTableModel)tbl.getModel();

	            // get lines from txt file
	            Object[] tableLines = br.lines().toArray();
	            
	            // extratct data from lines
	            // set data to jtable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	            	//trim means to cut
	                String line = tableLines[i].toString().trim();
	                //everytime the reader see's a comman(,), it jumps to another cell 
	                String[] dataRow = line.split(",");
	                
	                //everytime there is a newline, add the whole row to the table model
	                model.addRow(dataRow);
	            }
	            
	            
	            
	        } catch (Exception ex) {
//	            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
	        	JOptionPane.showMessageDialog(null, ex.toString(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }
	}
	
	public void printAcc(JLabel label) {
		try {
		String delimiter = ":";
        Map<String, String> map = new HashMap<>();

        try(Stream<String> lines = Files.lines(Paths.get("./src/database/accuseradmin.txt"))){
            lines.filter(line -> line.contains(delimiter)).forEach(
                line -> map.putIfAbsent(line.split(delimiter)[0], line.split(delimiter)[1])
            );
        }
        
        label.setText(map.get(user));
		}
		catch(Exception e) {
			
		}
	}
	
	
	public void loginlog() {
		try {
			
			String files = "./src/database/adminloginlog.txt";
			File file = new File(files);
			if(!file.exists()){
		          file.createNewFile();
		       }
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    
			bw.write(user+",");
			bw.write(timeNow+",");
			bw.write(dateNow);
			bw.newLine();
			bw.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void autoSulat()
	{
		try{
            //the file path
		
			
           File file = new File("./src/database/clienttemp.txt");
           //if the file not exist create one
           if(!file.exists()){
              file.createNewFile();
           }
//           
           FileWriter taga_sulat = new FileWriter(file.getAbsoluteFile());
           BufferedWriter bw = new BufferedWriter(taga_sulat);
//           
           //loop for jtable rows
           for(int i = 0; i < table.getRowCount(); i++){
               //loop for jtable column
               for(int j = 0; j < table.getColumnCount(); j++){
                   bw.write(table.getModel().getValueAt(i, j)+",");
               }
               //break line at the begin 
               //break line at the end 
               bw.newLine();
           }
           
                       
           //close BufferedWriter
           //ctrl + question mark para sa auto comment
           bw.close();
           //close FileWriter 
           taga_sulat.close();
//    
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,"error @"+ex.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void deletebyID(String ID) throws IOException {

    		
    		String record;
    		ID = txtId.getText();
    		
    		File tempDB = new File("./src/database/clienttemp.txt");
    		File db = new File("./src/database/clientssign.txt");
    		
    		
    		BufferedReader br = new BufferedReader( new FileReader( db ) );
    		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
    		
    		
    		
    		
    		
    		while( ( record = br.readLine() ) != null ) {
    			if( record.contains(ID) ) 
    				continue;
   
    			bw.write(record);
    			bw.flush();
    			bw.newLine();
 
    		}
    		
    		br.close();
    		bw.close();
    		
    		db.delete();
    		
    		tempDB.renameTo(db);
 
    }
	
	public void empdeletebyID(String ID) throws IOException {

		
		String record;
		ID = txtId_1.getText();
		
		File tempDB = new File("./src/database/emptemp.txt");
		File db = new File("./src/database/adminsign.txt");
		
		
		BufferedReader br = new BufferedReader( new FileReader( db ) );
		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
		
		
		
		
		
		while( ( record = br.readLine() ) != null ) {
			if( record.contains(ID) ) 
				continue;

			bw.write(record);
			bw.flush();
			bw.newLine();

		}
		
		br.close();
		bw.close();
		
		db.delete();
		
		tempDB.renameTo(db);

}
}