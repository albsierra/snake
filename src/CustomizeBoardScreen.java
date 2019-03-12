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
		mw.showCard("Two");
	}
	
	public void goButtonActionListener(){
		mw.showCard("Four");
	}
  
	public CustomizeBoardScreen(MainWindow mw){
	    this.mw = mw;
	    

		JLabel mess = new JLabel("Customize Board [Under Construction] ");
		add(mess);
		
		JLabel uc = new JLabel("Default: 8x8 board with 8 randomly generated snakes/ladders");
		add(uc);
	    
	    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	    go = new JButton("Start Game");
		quit = new JButton("Back");	
		
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
