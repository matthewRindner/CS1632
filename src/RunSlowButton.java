import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class RunSlowButton extends JButton {

	private MainPanel mainPanel;

	/**
	 * Constructor - Adds a listener to the button.
	 * 
	 * @param m the main animation panel where all the action happens
	 */
	public RunSlowButton(MainPanel m) {
		super("Slow");
		mainPanel = m;
		addActionListener(new RunSlowButtonListener());
	}

	class RunSlowButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			mainPanel.runSlow();
		}
	}
}
