package Reloj;

import javax.swing.JLabel;

import Reloj.InterfaceReloj;
import Reloj.Relojito;

public class InterfaceReloj extends JLabel implements Runnable {

	private InterfaceReloj horaLabel;
	private Relojito reloj;

	public InterfaceReloj() {
		reloj = new Relojito();
		horaLabel = this;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			reloj.establecerHora();
			if (reloj.getMeridiem() == 1)
				horaLabel.setText(reloj.getHora() + ":" + reloj.getMinuto() + ":" + reloj.getSegundo() + " PM");
			else
				horaLabel.setText(reloj.getHora() + ":" + reloj.getMinuto() + ":" + reloj.getSegundo() + " AM");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
