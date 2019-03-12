import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainWindow extends JFrame{
	
	JPanel cards;
	String cardDisplayed;
	CardLayout cl;
	
	WelcomeScreen s1;
	PlayerSelectScreen s2;
	CustomizeBoardScreen s3;
	BoardScreen s4;
	
	public void showCard(String cardName){
		cl.show(cards, cardName);
	}
	
	public void resetAll(){
		s1 = new WelcomeScreen(this);
		s2 = new PlayerSelectScreen(this);
		s3 = new CustomizeBoardScreen(this);
		s4 = new BoardScreen(this);
		
		cards.add(s1,"One");
		cards.add(s2,"Two");
		cards.add(s3, "Three");
		cards.add(s4, "Four");
	}
	
	//maintaining board info
	public void setBoard(){
		s4 = new BoardScreen(this);
		cards.add(s4, "Four");
	}
	
	public MainWindow(){
		
		setVisible(true);
		
		cards = new JPanel();
		cards.setLayout(new CardLayout());
		add(cards);
		
		s1 = new WelcomeScreen(this);
		s1.setTitle("Snake and Ladders");
		
		/*
		JPanel jp2 = new JPanel(new FlowLayout());
		JLabel jl2 = new JLabel("Panel 2");
		JButton jb2 = new JButton("Go ahead!");
		jp2.add(jb2);
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				cl.show(cards, "Three");
			}
		});
		
		jp2.setSize(this.getSize());
		jp2.add(jl2);
		jp2.setVisible(true);
		
		*/
		
		
		JPanel jp5 = new JPanel(new FlowLayout());
		JLabel jl5 = new JLabel("Panel 5");
		
		jp5.setSize(this.getSize());
		jp5.add(jl5);
		jp5.setVisible(true);
		
		
		
		s2 = new PlayerSelectScreen(this);
		s3 = new CustomizeBoardScreen(this);
		s4 = new BoardScreen(this);
		
		cards.add(s1,"One");
		cards.add(s2,"Two");
		cards.add(s3, "Three");
		cards.add(s4, "Four");
		
		//cards.add(jp2,"Two");
		//cards.add(jp4,"Four");
		cards.add(jp5, "Five");
		
		cl = (CardLayout)(cards.getLayout());
		
		cl.show(cards, "One");
		showCard("One");	
	}

}
