/**
 * 
 */
package Cliente;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author isaacmontielsanchez
 *
 */
public class VentanaCliente extends JFrame {

	/**
	 * @construc constructor dela marco
	 */
	public VentanaCliente() {
		setBounds(1200,300,280,350);
		JPanel lamina = new JPanel();
		lamina.setLayout(new BorderLayout());
		areatexto = new JTextArea();
		lamina.add(areatexto,BorderLayout.CENTER);
		add(lamina);
		setVisible(true);
		
	}
	
	private JTextArea areatexto;

}
