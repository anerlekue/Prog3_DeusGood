package VentanaLogin_Registro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.Font;

public class VentanaDonar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDonar frame = new VentanaDonar();
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
	public VentanaDonar() {
		JFrame ventana = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblTitulo = new JLabel("TU DONACIÓN SALVA VIDAS");
		lblTitulo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panel.add(lblTitulo);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pago mensual");
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Aceptar Términos y Condiciones");
		panel_4.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_3 = new JLabel(" ");
		panel_4.add(lblNewLabel_3);
		
		// Import ImageIcon     
		ImageIcon iconLogo = new ImageIcon("Images/niño_hungry.jpg");
		JLabel thumb = new JLabel();
		thumb.setIcon(iconLogo);
		panel_1.add(thumb, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnDonar = new JButton("Donar");
		btnDonar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")||textField_1.getText().equals("")
						||textField_2.getText().equals("")||textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Es obligatorio rellenar todos los campos.", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}else {
					if(chckbxNewCheckBox_1.isSelected()) {
						JOptionPane.showMessageDialog(null, "Donación realizada con éxito.", "Muchas gracias!",
								JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Es obligatorio aceptar los Terminos y Condiciones.", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		panel_2.add(btnDonar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				ventana.setVisible(false);
				VentanaPrincipal v7 = new VentanaPrincipal();
				v7.setVisible(true);
			}
		});
		panel_2.add(btnVolver);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.WEST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{134, 203, 0};
		gbl_panel_3.rowHeights = new int[]{58, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNT = new JLabel("Numero Tarjeta :");
		GridBagConstraints gbc_lblNT = new GridBagConstraints();
		gbc_lblNT.insets = new Insets(0, 0, 5, 5);
		gbc_lblNT.anchor = GridBagConstraints.NORTH;
		gbc_lblNT.gridx = 0;
		gbc_lblNT.gridy = 1;
		panel_3.add(lblNT, gbc_lblNT);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel_3.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel_3.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNS = new JLabel("Numero Seguridad :");
		GridBagConstraints gbc_lblNS = new GridBagConstraints();
		gbc_lblNS.insets = new Insets(0, 0, 5, 5);
		gbc_lblNS.gridx = 0;
		gbc_lblNS.gridy = 3;
		panel_3.add(lblNS, gbc_lblNS);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		panel_3.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblCP = new JLabel("Codigo Postal :");
		GridBagConstraints gbc_lblCP = new GridBagConstraints();
		gbc_lblCP.insets = new Insets(0, 0, 5, 5);
		gbc_lblCP.gridx = 0;
		gbc_lblCP.gridy = 5;
		panel_3.add(lblCP, gbc_lblCP);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 5;
		panel_3.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 6;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblCE = new JLabel("Correo Electronico :");
		GridBagConstraints gbc_lblCE = new GridBagConstraints();
		gbc_lblCE.insets = new Insets(0, 0, 0, 5);
		gbc_lblCE.gridx = 0;
		gbc_lblCE.gridy = 7;
		panel_3.add(lblCE, gbc_lblCE);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 7;
		panel_3.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
	}

}
