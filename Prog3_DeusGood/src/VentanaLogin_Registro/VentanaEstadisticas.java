package VentanaLogin_Registro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BD.BD;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEstadisticas extends JFrame {

	private JPanel contentPane;
	final JFrame ventana = this;

	public VentanaEstadisticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblEstadisticas = new JLabel("Estadisticas");
		lblEstadisticas.setFont(new Font("Georgia", Font.BOLD, 18));
		lblEstadisticas.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblEstadisticas);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][][188.00,grow,center][][]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Media de edad de los ninos : ");
		panel_1.add(lblNewLabel, "cell 1 1,alignx left");
		
		JLabel lblmediaEdad = new JLabel(BD.mediaEdad());
		panel_1.add(lblmediaEdad, "cell 2 1");
		
		JLabel lblNewLabel_1 = new JLabel("Dinero recaudado :");
		panel_1.add(lblNewLabel_1, "cell 1 2,alignx left");
		
		JLabel lblDIneroRecaudado = new JLabel(BD.DineroRecaudado());
		panel_1.add(lblDIneroRecaudado, "cell 2 2,alignx center");
		
		JLabel lblNewLabel_2 = new JLabel("Gente con pago mensual :");
		panel_1.add(lblNewLabel_2, "cell 1 3,alignx left");
		
		JLabel lblPagoMensual = new JLabel(BD.PagoMensuales());
		panel_1.add(lblPagoMensual, "cell 2 3,alignx center");
		
		JLabel lblNewLabel_3 = new JLabel("Cantidad Ninos/Ninas :");
		panel_1.add(lblNewLabel_3, "cell 1 4,alignx left");
		
		JLabel lblNewLabel_5 = new JLabel("Mayor Donacion :");
		panel_1.add(lblNewLabel_5, "cell 1 5,alignx left");
		
		JLabel lblCninos = new JLabel(BD.GetNinos());
		panel_1.add(lblCninos, "flowx,cell 2 4,alignx center");
		
		JLabel lblNewLabel_4 = new JLabel("/");
		panel_1.add(lblNewLabel_4, "cell 2 4,alignx center");
		
		JLabel lblCninas = new JLabel(BD.GetNinas());
		panel_1.add(lblCninas, "cell 2 4,alignx center");
		
		JLabel lblMayorDonacion = new JLabel(BD.getMayorDonacion());
		panel_1.add(lblMayorDonacion, "cell 2 5");
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				VentanaAdmin va = new VentanaAdmin();
				va.setVisible(true);
				ventana.setVisible(false);
			}
		});
		panel_2.add(btnNewButton);
	}

}
