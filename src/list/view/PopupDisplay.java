package list.view;

import javax.swing.JOptionPane;
/**
 * 
 * @author Brittney Mor
 * @version 
 */

public class PopupDisplay
{
	/**
	 * Displays supplied message in a popup window.
	 * @param message
	 */
	
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	
	/**
	 * Displays the supplied question in a popup and returns the answer as a String.
	 * @param fromQuestion
	 * @return
	 */
	public String getResponse(String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
		
		return response;
	}

}
