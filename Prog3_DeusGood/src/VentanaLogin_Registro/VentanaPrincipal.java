package VentanaLogin_Registro;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JTextArea;

public class VentanaPrincipal extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		
		JFrame ventana = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setLayout(new MigLayout("", "[65px][180.00px][][][][][][][][][][][][][][][][right]", "[29px]"));
		
		JLabel lblNewLabel = new JLabel("Bienvenid@ a DeusGood");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panelTitulo.add(lblNewLabel, "cell 0 0 2 1,alignx center,aligny center");
		
		JButton btnTerminos = new JButton("Terminos y condiciones");
		btnTerminos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				ventanaTerminos v4 = new ventanaTerminos();
				v4.setVisible(true);
				
			}
		});
		panelTitulo.add(btnTerminos, "cell 17 0,alignx left,aligny top");
		
		JPanel panelCentro = new JPanel();
		contentPane.add(panelCentro, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton BotonPago = new JButton("Pago Estudios");
		BotonPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaPagarEstudios v5 = new VentanaPagarEstudios();
				v5.setVisible(true);
			}
		});
		panel.add(BotonPago);
		
		JButton btnDonar = new JButton("Donar");
		btnDonar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaDonar v6 = new VentanaDonar();
				v6.setVisible(true);
				}
		});	
		
		panel.add(btnDonar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.setVisible(false);
				VentanaLogin vl = new VentanaLogin();
				vl.setVisible(true);
				
			}
		});
		panel.add(btnSalir);
		
	}
}