package esameLab;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/*
 * 
 */
public class JavaSwingForm {
	
	private JFrame frame;
	
	public static void main(String[] args) {
		try {
				JavaSwingForm window = new JavaSwingForm();
				window.frame.setVisible(true);
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	/**
	* Create the application.
	*/
	
	public JavaSwingForm() {
		initialize();
	}
	
	public void initialize() {
		ArrayList miePersone = new ArrayList();
		frame = new JFrame("EsameLab");
		Container c = frame.getContentPane();
		c.setLayout(new GridLayout(5, 2));
		
		/* Schema layout */
		JTextField fieldMatricola = new JTextField();
		JTextField fieldCognome = new JTextField();
		JTextField fieldNome = new JTextField();
		
		JButton inserisciStudente = new JButton("inserisci studente");
		inserisciStudente.setForeground(Color.magenta);
		JButton stampaTutto = new JButton("stampa");
		JButton inserisciDocente = new JButton("inserisci docente");
		
		
		c.add(new JLabel("Matricola: ", JLabel.CENTER));
		c.add(fieldMatricola);
		
		c.add(new JLabel("Cognome: ", JLabel.CENTER));
		c.add(fieldCognome);
		
		c.add(new JLabel("Nome: ", JLabel.CENTER));
		c.add(fieldNome);
		
		c.add(inserisciStudente);
		inserisciStudente.setName("inserisciStudente");
		c.add(stampaTutto);
		stampaTutto.setName("stampaTutto");
		c.add(new JLabel("Per inserire docente: "));
		c.add(inserisciDocente);
		inserisciDocente.setName("inserisciDocente");
		
		MyListener listener = new MyListener(c, miePersone);
		inserisciStudente.addMouseListener(listener);
		stampaTutto.addMouseListener(listener);
		inserisciDocente.addMouseListener(listener);
		
		frame.setSize(300, 150);
		
	}
}

