package VentanaLogin_Registro;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Reloj.InterfaceReloj;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.Label;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame{
	private InterfaceReloj ireloj;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		
		final JFrame ventana = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setLayout(new MigLayout("", "[65px][194.00px][85.00,left][][][][][][][][][][][][][119.00][right][][][][][298.00][147.00,center][341.00][][][][][][][180.00][][][][][][][][][][][][][][][][][][][]", "[29px]"));
		
		JLabel lblNewLabel = new JLabel("Bienvenid@ a DeusGood : ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panelTitulo.add(lblNewLabel, "cell 0 0 2 1,alignx center,aligny center");
		
		Label label = new Label(VentanaLogin.getNick());
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panelTitulo.add(label, "cell 2 0");
		
		JButton btnTerminos = new JButton("Terminos y condiciones");
		btnTerminos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				ventanaTerminos v4 = new ventanaTerminos();
				v4.setVisible(true);
				
			}
		});
		
		JLabel lblReloj = new InterfaceReloj();
		lblReloj.setHorizontalAlignment(SwingConstants.RIGHT);
		panelTitulo.add(lblReloj, "cell 22 0");
		panelTitulo.add(btnTerminos, "cell 47 0,alignx left,aligny top");
		
		JPanel panelCentro = new JPanel();
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new GridLayout(1, 0, 0, 0));
		
		ImageIcon iconLogo = new ImageIcon("Images/ONG.jpg");
		JLabel icon = new JLabel();
		icon.setIcon(iconLogo);
		panelCentro.add(icon);
		
		JPanel panel_Noticias = new JPanel();
		panelCentro.add(panel_Noticias);
		panel_Noticias.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_topNoticias = new JPanel();
		panel_Noticias.add(panel_topNoticias, BorderLayout.NORTH);
		
		JLabel lblNoticias = new JLabel("Noticias");
		lblNoticias.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_topNoticias.add(lblNoticias);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_Noticias.add(scrollPane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setText("\r\nPolonia pierde el rastro de la ni\u00F1a Eileen\r\nTRINIDAD DEIROS BRONTE / MARI\u00C9N KADNER|Madrid|11 DIC 2021 - 03:28 CET\r\nLa menor, de cuatro a\u00F1os, se separ\u00F3 de sus padres cuando fueron expulsados a Bielorrusia el lunes. Desde entonces se desconoce su paradero, seg\u00FAn ONG polacas\r\n\r\nLa vital y desconocida labor que se realiza en el aeropuerto de M\u00E1laga\r\nMARIANO AHIJADO|16 DIC 2021 - 11:03 CET\r\nLa ONG Envera, que emplea a 21 trabajadores con diversidad funcional, recoge y clasifica los residuos para su correcto reciclaje en la terminal malague\u00F1a y otras zonas que prestan servicios aeroportuarios\r\n\r\nVIOLENCIA MACHISTA\r\nMujeres valientes de Ben\u00EDn que bailan contra la violencia machista\r\nBEATRIZ V\u00C1ZQUEZ DE MIGUEL|Nikki (Ben\u00EDn)|24 DIC 2021 - 05:35 CET\r\nLa coordinadora del Comit\u00E9 de Pol\u00EDticas Sociales de una ONG beninesa explica c\u00F3mo un grupo de mujeres de Nikki, una peque\u00F1a comunidad del sureste del pa\u00EDs africano, enfrentan la violencia de g\u00E9nero y reivindican su derecho a una vida en paz\r\n\r\nEl Kremlin busca el control total\r\nPILAR BONET|30 DIC 2021 - 05:40 CET\r\nCon la decisi\u00F3n de cerrar la ONG Memorial, Rusia se reconfigura como un Estado autoritario que controla no solo el presente, sino el pasado y el futuro del pa\u00EDs\r\n\r\nECONOM\u00CDA GLOBAL\r\nLa doble condena de la econom\u00EDa sumergida tras la covid\r\nMAR\u00CDA FERN\u00C1NDEZ|Madrid|09 ENE 2022 - 05:45 CET\r\nLas ayudas p\u00FAblicas desplegadas en todo el mundo despu\u00E9s de la crisis sanitaria no llegan a los trabajadores informales, la mayor\u00EDa mujeres\r\n\r\nHUMAN RIGHTS WATCH\r\nHuman Rights Watch alerta del aumento de la represi\u00F3n en el mundo en 2021\r\nEL PA\u00CDS / AGENCIAS|Madrid / Ginebra|13 ENE 2022 - 11:47 CET\r\nEl informe anual de la ONG refleja una creciente persecuci\u00F3n a la disidencia en pa\u00EDses como China, Rusia y Nicaragua y critica la \u201Cd\u00E9bil\u201D respuesta de Occidente\r\n\r\nTarazona\r\nIBSEN MART\u00CDNEZ|18 ENE 2022 - 02:03 CET\r\nEl director general de la ONG Fundaredes es, desde julio de 2021, uno de los 240 presos pol\u00EDticos en la Venezuela de Nicol\u00E1s Maduro\r\n\r\nCOOPERACI\u00D3N Y DESARROLLO\r\nEspa\u00F1a destinar\u00E1 por ley el 0,7% del PIB a la ayuda al desarrollo en 2030\r\nMIGUEL GONZ\u00C1LEZ|Madrid|11 ENE 2022 - 05:40 CET\r\nEl Gobierno aprueba la nueva ley de cooperaci\u00F3n, que sustituye a la de 1998\r\n\r\n\r\nTRATA DE PERSONAS\r\nLa soledad de las v\u00EDctimas de trata: denuncia contra la fiscal\u00EDa y la polic\u00EDa por no proteger a Lili\r\n");
		scrollPane.setViewportView(textArea);
		
		
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