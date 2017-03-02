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
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.SystemColor;

public class Actividad2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;

	/**ce
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad2 frame = new Actividad2();
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
	public Actividad2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 153, 501);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Asociaciones");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Asociaciones1().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(11, 157, 132, 23);
		panel.add(btnNewButton);
		
		JButton btnSubvenciones = new JButton("Subvenciones");
		btnSubvenciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Subvenciones1().setVisible(true);
				dispose();
			}
		});
		btnSubvenciones.setBounds(11, 191, 132, 23);
		panel.add(btnSubvenciones);
		
		JButton btnEspaciosMunicipales = new JButton("Esp Municipales");
		btnEspaciosMunicipales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EspacioMunicipal1().setVisible(true);
				dispose();
			}
		});
		btnEspaciosMunicipales.setBounds(11, 225, 132, 23);
		panel.add(btnEspaciosMunicipales);
		
		JButton btnActividades = new JButton("Actividades");
		btnActividades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Actividad1().setVisible(true);
				dispose();
			}
		});
		btnActividades.setBounds(10, 259, 133, 23);
		panel.add(btnActividades);
		
		JButton button = new JButton("Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuInicio().setVisible(true);
				dispose();
			}
		});
		button.setBounds(11, 446, 132, 23);
		panel.add(button);
		
		textField = new JTextField();
		textField.setBounds(208, 96, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(208, 71, 153, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(355, 96, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCif = new JLabel("Fecha ");
		lblCif.setBounds(357, 71, 105, 14);
		contentPane.add(lblCif);
		
		textField_2 = new JTextField();
		textField_2.setBounds(460, 191, 242, 80);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Descripci\u00F3n");
		lblDireccin.setBounds(460, 166, 127, 14);
		contentPane.add(lblDireccin);
		
		JButton btnInscribir = new JButton("Inscribir");
		btnInscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Actividad1().setVisible(true);
				dispose();
			}
		});
		btnInscribir.setBounds(588, 407, 89, 23);
		contentPane.add(btnInscribir);
		
		JLabel lblFechaConcesion = new JLabel("Direcci\u00F3n");
		lblFechaConcesion.setBounds(208, 127, 105, 14);
		contentPane.add(lblFechaConcesion);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(208, 147, 218, 20);
		contentPane.add(textField_4);
		
		JLabel lblNDestinatarios = new JLabel("N\u00BA Destinatarios\r\n");
		lblNDestinatarios.setBounds(208, 191, 105, 14);
		contentPane.add(lblNDestinatarios);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 211, 127, 20);
		contentPane.add(textField_3);
		
		JLabel lblOrganizadoPor = new JLabel("Organizado por:");
		lblOrganizadoPor.setBounds(208, 257, 105, 14);
		contentPane.add(lblOrganizadoPor);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(208, 277, 127, 20);
		contentPane.add(textField_5);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(208, 308, 105, 14);
		contentPane.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Selecione un tipo--", "Ejemplo 1", "Ejemplo 2", "Ejemplo3"}));
		comboBox.setBounds(208, 333, 153, 20);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("Actividad");
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		label.setBounds(406, 22, 194, 41);
		contentPane.add(label);
		
		
	}
}
