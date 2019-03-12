import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//needs massive aesthetic rewrites

public class PlayerSelectScreen extends JPanel {
	JButton go;
	JButton quit;
	MainWindow mw;
	
	JRadioButton opt1;
	JRadioButton opt2;
	JRadioButton opt3;
	
	public void quitButtonActionListener(){
		mw.showCard("Uno");
	}
	
	public void goButtonActionListener(){
		playerOptions();
		mw.s4.setUpPlayers();
		mw.showCard("Tres");
	}
	
	public void playerOptions(){
		int m = 5;
		if(opt1.isSelected() == true)
		    m = 1;
		else if(opt2.isSelected() == true)
			m = 2;
		else if(opt3.isSelected() == true)
			m = 3;
	    mw.s4.setMaxPlayers(m);
	}
	
	public PlayerSelectScreen(MainWindow mw){
		this.mw = mw;
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		JLabel mess = new JLabel("Seleccionar Jugadores: ");
		add(mess);
		
		JLabel uc = new JLabel("Por defecto: 1Jugador");
		add(uc);
		
		//set up radio buttons
		
		opt1 = new JRadioButton("1 Jugador(Por defecto)");
		opt1.setSelected(true);
		
		opt2 = new JRadioButton("2 Jugadores");
		opt3 = new JRadioButton("3 Jugadores");
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(opt1);
		grp.add(opt2);
		grp.add(opt3);
		
		add(opt1);
		add(opt2);
		add(opt3);

		opt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				playerOptions();
			}
		});
		opt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				playerOptions();
			}
		});
		
		opt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				playerOptions();
			}
		});
		
		go = new JButton("Personalizar tablero");
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
