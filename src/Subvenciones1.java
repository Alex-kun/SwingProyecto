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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Subvenciones1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**ce
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subvenciones1 frame = new Subvenciones1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**g
	 * Create the frame.
	 */
	public Subvenciones1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(209, 236, 508, 171);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Nombre", "Fecha Solicitud", "Importe Solicitado", "Modificar"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnRegistro = new JButton("Solicitud");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Subvenciones2().setVisible(true);
				dispose();
			}
		});
		btnRegistro.setBounds(209, 433, 128, 23);
		contentPane.add(btnRegistro);
		
		textField = new JTextField();
		textField.setBounds(209, 189, 153, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBusqueda = new JLabel("Busqueda");
		lblBusqueda.setBounds(209, 164, 72, 14);
		contentPane.add(lblBusqueda);
		
		JButton btnJustificaciones = new JButton("Justificaciones");
		btnJustificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Subvenciones3().setVisible(true);
				dispose();
			}
		});
		btnJustificaciones.setBounds(209, 467, 128, 23);
		contentPane.add(btnJustificaciones);
		
		JLabel lblSubvenciones = new JLabel("Subvenciones");
		lblSubvenciones.setForeground(SystemColor.textHighlight);
		lblSubvenciones.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblSubvenciones.setBounds(352, 114, 210, 41);
		contentPane.add(lblSubvenciones);
		
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
