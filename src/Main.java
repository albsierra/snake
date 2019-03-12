import javax.swing.SwingUtilities;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MainWindow mw = new MainWindow();
			    mw.setSize(600,400);
			    mw.setTitle("Serpientes y Escaleras");
			    mw.setVisible(true);
			}
		});
	}

}
