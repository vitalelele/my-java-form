package esameLab;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class MyListener implements MouseListener {
	
	private Container c;
	private ArrayList<Object> miePersone;
	
	public MyListener(Container c, ArrayList miePersone) {
		this.c = c;
		this.miePersone = miePersone;
	}
	
	
	/*
	 * Quando premo il pulsante controllo quale pulsante è stato premuto, se devo aggiungere uno studente o un docente oppure stampare tutto
	 * @Override
	 */
	public void mouseClicked(MouseEvent e) {
		JTextField matricola = (JTextField) c.getComponent(1);
		JTextField cognome = (JTextField) c.getComponent(3);
		JTextField nome = (JTextField) c.getComponent(5);
		
		JButton pulsanteAttivazione = new JButton();
		pulsanteAttivazione = (JButton) e.getComponent();
		// System.out.println(pulsanteAttivazione.getName());
		
		
		switch(pulsanteAttivazione.getName()) {
			case "inserisciStudente":
				miePersone.add(new Studente(Integer.parseInt(matricola.getText()), cognome.getText(), nome.getText()) );
				this.resetCampi(matricola, cognome, nome);
					break;
			case "inserisciDocente":
				miePersone.add(new Docente(Integer.parseInt(matricola.getText()), cognome.getText(), nome.getText()) );
				this.resetCampi(matricola, cognome, nome);
					break;
			case "stampaTutto":
				Iterator<Object> itr = miePersone.iterator();	
				while(itr.hasNext()) {
					Object o = itr.next();
					if(o instanceof Studente) {
						Studente toPrint = (Studente) o;
						toPrint.chiSono();
					}
					else if (o instanceof Docente){
						Docente toPrint = (Docente) o;
						toPrint.chiSono();
					}
				}
		} // end switch
	} // end mouseCLicked();
	
	/*
	 * Funzione che utilizzo per riportare i campi vuoti
	 */
	public void resetCampi(JTextField matricola, JTextField cognome, JTextField nome) {
		matricola.setText("");
		cognome.setText("");
		nome.setText("");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
