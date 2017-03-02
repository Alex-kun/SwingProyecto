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

	/**
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 153, 501);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Asociaciones");
		btnNewButton.setBounds(11, 157, 132, 23);
		panel.add(btnNewButton);
		
		JButton btnSubvenciones = new JButton("Subvenciones");
		btnSubvenciones.setBounds(11, 191, 132, 23);
		panel.add(btnSubvenciones);
		
		JButton btnEspaciosMunicipales = new JButton("Esp Municipales");
		btnEspaciosMunicipales.setBounds(11, 225, 132, 23);
		panel.add(btnEspaciosMunicipales);
		
		JButton btnActividades = new JButton("Actividades");
		btnActividades.setBounds(10, 259, 133, 23);
		panel.add(btnActividades);
		
		textField = new JTextField();
		textField.setBounds(208, 96, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(208, 71, 65, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(345, 96, 105, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCif = new JLabel("CIF");
		lblCif.setBounds(345, 71, 73, 14);
		contentPane.add(lblCif);
		
		textField_2 = new JTextField();
		textField_2.setBounds(208, 156, 242, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(208, 137, 92, 14);
		contentPane.add(lblDireccin);
		
		textField_3 = new JTextField();
		textField_3.setBounds(474, 156, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setBounds(478, 137, 65, 14);
		contentPane.add(lblMunicipio);
		
		textField_4 = new JTextField();
		textField_4.setBounds(591, 156, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal");
		lblCodigoPostal.setBounds(591, 137, 86, 14);
		contentPane.add(lblCodigoPostal);
		
		textField_5 = new JTextField();
		textField_5.setBounds(208, 216, 105, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(345, 216, 105, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTraductor = new JLabel("Tel\u00E9fono Movil");
		lblTraductor.setBounds(208, 191, 92, 14);
		contentPane.add(lblTraductor);
		
		JLabel lblTelfonoFijo = new JLabel("Tel\u00E9fono Fijo");
		lblTelfonoFijo.setBounds(345, 191, 79, 14);
		contentPane.add(lblTelfonoFijo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(208, 272, 242, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(208, 247, 46, 14);
		contentPane.add(lblEmail);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tipo", "Ejemplo 1", "Ejemplo 2", "Ejemplo 3"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(208, 344, 112, 20);
		contentPane.add(comboBox);
		
		JLabel lblTipoDeAsociacin = new JLabel("Tipo de Asociaci\u00F3n");
		lblTipoDeAsociacin.setBounds(208, 319, 146, 14);
		contentPane.add(lblTipoDeAsociacin);
		
		JButton btnInscribir = new JButton("Inscribir");
		btnInscribir.setBounds(588, 407, 89, 23);
		contentPane.add(btnInscribir);
		
		
	}
}
