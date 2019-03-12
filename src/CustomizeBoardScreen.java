import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


//needs massive improvements

public class CustomizeBoardScreen extends JPanel {
	JButton go;
	JButton quit;
	MainWindow mw;
	

	public void quitButtonActionListener(){
		mw.showCard("Dos");
	}
	
	public void goButtonActionListener(){
		mw.showCard("Cuatro");
	}
  
	public CustomizeBoardScreen(MainWindow mw){
	    this.mw = mw;
	    

		JLabel mess = new JLabel("Personalizar tablero [En construcción] ");
		add(mess);
		
		JLabel uc = new JLabel("Por defecto: Tablero de 8x8 con 8 serpientes/escaleras generadas aleatóriamente");
		add(uc);
	    
	    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	    go = new JButton("Iniciar Juego");
		quit = new JButton("Atrás");	
		
		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				goButtonActionListener();
			}
		});
		
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				 quitButtonActionListener();
			}
		});
		
		add(go);
		add(quit);
			
			
	}
}
