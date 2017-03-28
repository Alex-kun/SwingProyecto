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

public class Subvenciones3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**c
	 * teLaunch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subvenciones3 frame = new Subvenciones3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**g
	 * 
	 * Create the frame.
	 */
	public Subvenciones3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(208, 159, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("ID de Asociaci\u00F3n");
		lblNombre.setBounds(208, 134, 172, 14);
		contentPane.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setBounds(208, 300, 242, 80);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Justificacion subvenci\u00F3n");
		lblDireccin.setBounds(208, 275, 153, 14);
		contentPane.add(lblDireccin);
		
		textField_3 = new JTextField();
		textField_3.setBounds(208, 219, 127, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMunicipio = new JLabel("Nombre de Asociaci\u00F3n");
		lblMunicipio.setBounds(208, 194, 153, 14);
		contentPane.add(lblMunicipio);
		
		JButton btnInscribir = new JButton("Volver a listado");
		btnInscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new 	Subvenciones1().setVisible(true);
				dispose();
			}
		});
		btnInscribir.setBounds(521, 440, 153, 23);
		contentPane.add(btnInscribir);
		
		JLabel label = new JLabel("Subvenciones");
		label.setForeground(SystemColor.textHighlight);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		label.setBounds(391, 91, 210, 41);
		contentPane.add(label);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(208, 404, 127, 23);
		contentPane.add(btnImprimir);
		
		JButton btnEnviarEmail = new JButton("Enviar E-Mail");
		btnEnviarEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnviarEmail.setBounds(208, 440, 127, 23);
		contentPane.add(btnEnviarEmail);
		
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
