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

public class Asociaciones2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**ceyr
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asociaciones2 frame = new Asociaciones2();
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
	public Asociaciones2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(146, 171, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(146, 146, 65, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 171, 105, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCif = new JLabel("CIF");
		lblCif.setBounds(283, 146, 73, 14);
		contentPane.add(lblCif);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 231, 242, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(146, 212, 92, 14);
		contentPane.add(lblDireccin);
		
		textField_3 = new JTextField();
		textField_3.setBounds(412, 231, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setBounds(416, 212, 65, 14);
		contentPane.add(lblMunicipio);
		
		textField_4 = new JTextField();
		textField_4.setBounds(529, 231, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal");
		lblCodigoPostal.setBounds(529, 212, 86, 14);
		contentPane.add(lblCodigoPostal);
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 291, 105, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(283, 291, 105, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTraductor = new JLabel("Tel\u00E9fono Movil");
		lblTraductor.setBounds(146, 266, 92, 14);
		contentPane.add(lblTraductor);
		
		JLabel lblTelfonoFijo = new JLabel("Tel\u00E9fono Fijo");
		lblTelfonoFijo.setBounds(283, 266, 79, 14);
		contentPane.add(lblTelfonoFijo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(146, 347, 242, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(146, 322, 46, 14);
		contentPane.add(lblEmail);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tipo", "Ejemplo 1", "Ejemplo 2", "Ejemplo 3"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(146, 407, 112, 20);
		contentPane.add(comboBox);
		
		JLabel lblTipoDeAsociacin = new JLabel("Tipo de Asociaci\u00F3n");
		lblTipoDeAsociacin.setBounds(146, 382, 146, 14);
		contentPane.add(lblTipoDeAsociacin);
		
		JButton btnInscribir = new JButton("Inscribir");
		btnInscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Asociaciones1().setVisible(true);
				dispose();
			}
		});
		btnInscribir.setBounds(529, 406, 89, 23);
		contentPane.add(btnInscribir);
		
		JLabel label = new JLabel("Asociaciones");
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		label.setBounds(287, 94, 210, 41);
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
