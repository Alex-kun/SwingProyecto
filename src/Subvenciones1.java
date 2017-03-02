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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(209, 157, 508, 171);
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
		
		JButton btnInscribir = new JButton("Concesi\u00F3n");
		btnInscribir.setBounds(342, 388, 114, 23);
		contentPane.add(btnInscribir);
		
		JButton btnRegistro = new JButton("Solicitud");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Subvenciones2().setVisible(true);
				dispose();
			}
		});
		btnRegistro.setBounds(209, 388, 114, 23);
		contentPane.add(btnRegistro);
		
		textField = new JTextField();
		textField.setBounds(209, 110, 153, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBusqueda = new JLabel("Busqueda");
		lblBusqueda.setBounds(209, 85, 72, 14);
		contentPane.add(lblBusqueda);
		
		JButton btnJustificaciones = new JButton("Justificaciones");
		btnJustificaciones.setBounds(209, 435, 247, 23);
		contentPane.add(btnJustificaciones);
		
		JLabel lblSubvenciones = new JLabel("Subvenciones");
		lblSubvenciones.setForeground(SystemColor.textHighlight);
		lblSubvenciones.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblSubvenciones.setBounds(378, 31, 210, 41);
		contentPane.add(lblSubvenciones);
		
		
	}
}
