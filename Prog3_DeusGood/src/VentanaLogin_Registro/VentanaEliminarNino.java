package VentanaLogin_Registro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VentanaEliminarNino extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	final JFrame ventana = this;

	public VentanaEliminarNino() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Borrar Ninyo BD");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][][][][188.00][grow]", "[][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Ninyo :");
		panel_1.add(lblNewLabel_1, "cell 1 2");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 2 2 3 1,growx");
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Tienes que escribir el nombre del nino que quieres borrar", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						int resultado = BD.BD.buscarNino(textField.getText());
						if (resultado == 1) {
							BD.BD.eliminarNino(textField.getText());
							JOptionPane.showMessageDialog(null, "Nino Borrado de la BD", "Exito", JOptionPane.ERROR_MESSAGE);

							ventana.setVisible(false);
							VentanaAdmin va = new VentanaAdmin();
							va.setVisible(true);

						} else {
							JOptionPane.showMessageDialog(null, "El Nino que quieres Borrar no esta en la BD",
									"Error", JOptionPane.INFORMATION_MESSAGE);

						}
					} catch (NumberFormatException e1) {

					}
				}

			}
		});
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaAdmin vl = new VentanaAdmin();
				vl.setVisible(true);				
			}
		});
		panel_2.add(btnNewButton);
	}

}
