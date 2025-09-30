package MiVentana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Ventanuca {

	private JFrame frmEjemploExamen;
	private JTextField guardarNombre;
	private JTextField guardarEdad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanuca window = new Ventanuca();
					window.frmEjemploExamen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventanuca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploExamen = new JFrame();
		frmEjemploExamen.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Vagabond\\Downloads\\AyuGram Desktop\\8093ea8ec90ec5d47e729c2d289b50d9.jpg"));
		frmEjemploExamen.setTitle("Ejemplo Examen");
		frmEjemploExamen.setBounds(100, 100, 450, 300);
		frmEjemploExamen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjemploExamen.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 22, 46, 14);
		frmEjemploExamen.getContentPane().add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(22, 73, 46, 14);
		frmEjemploExamen.getContentPane().add(lblEdad);
		
		guardarNombre = new JTextField();
		guardarNombre.setBounds(22, 42, 86, 20);
		frmEjemploExamen.getContentPane().add(guardarNombre);
		guardarNombre.setColumns(10);
		
		guardarEdad = new JTextField();
		guardarEdad.setColumns(10);
		guardarEdad.setBounds(22, 98, 86, 20);
		frmEjemploExamen.getContentPane().add(guardarEdad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceptas Terminos");
		chckbxNewCheckBox.setBounds(22, 125, 97, 23);
		frmEjemploExamen.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String dato =guardarNombre.getText();
				JOptionPane.showMessageDialog(null,dato);
				
			}
		});
		btnNewButton.setBounds(80, 174, 89, 23);
		frmEjemploExamen.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(270, 41, 109, 23);
		frmEjemploExamen.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		rdbtnMujer.setBounds(270, 81, 109, 23);
		frmEjemploExamen.getContentPane().add(rdbtnMujer);
		
		JRadioButton rdbtnAvionDeCombate = new JRadioButton("Avion de combate");
		buttonGroup.add(rdbtnAvionDeCombate);
		rdbtnAvionDeCombate.setBounds(270, 125, 109, 23);
		frmEjemploExamen.getContentPane().add(rdbtnAvionDeCombate);
	}
}
