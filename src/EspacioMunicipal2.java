import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class EspacioMunicipal2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**cee
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspacioMunicipal2 frame = new EspacioMunicipal2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EspacioMunicipal2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(174, 191, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Espacio solicitado");
		lblNombre.setBounds(174, 166, 153, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(321, 191, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCif = new JLabel("Fecha solicitud");
		lblCif.setBounds(323, 166, 105, 14);
		contentPane.add(lblCif);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 274, 242, 80);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Caracter\u00EDsticas");
		lblDireccin.setBounds(174, 249, 127, 14);
		contentPane.add(lblDireccin);
		
		JButton btnInscribir = new JButton("Solicitar");
		btnInscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EspacioMunicipal1().setVisible(true);
				dispose();
			}
		});
		btnInscribir.setBounds(511, 333, 89, 23);
		contentPane.add(btnInscribir);
		
		JLabel lblFechaConcesion = new JLabel("Fecha concesi\u00F3n ");
		lblFechaConcesion.setBounds(486, 166, 105, 14);
		contentPane.add(lblFechaConcesion);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(473, 191, 127, 20);
		contentPane.add(textField_4);
		
		JLabel label = new JLabel("Espacios Municipales");
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		label.setBounds(222, 87, 328, 41);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 729, 70);
		contentPane.add(panel);
		
		JButton button = new JButton("Asociaciones");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Asociaciones1().setVisible(true);
				dispose();
			}
		});
		button.setBounds(10, 23, 132, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Subvenciones");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Subvenciones1().setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(152, 23, 132, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Esp Municipales");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EspacioMunicipal1().setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(298, 23, 132, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Actividades");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Actividad1().setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(451, 23, 133, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Menu");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuInicio().setVisible(true);
				dispose();
			}
		});
		button_4.setBounds(633, 23, 86, 23);
		panel.add(button_4);
		
		
	}
}
