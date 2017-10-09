package list.controller;

import java.util.List;			//step 1: import donut file, list and arraylist.
import java.util.ArrayList;
import list.model.Donut;
import list.view.PopupDisplay;

public class ListController
{
	private List<Donut> donutList; //step 2: declare 
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>(); //step 3: initialize need to call using params
		display = new PopupDisplay();
	}
	public void start()
	{
		//temporarily makes Donut an object
		//Donut temp = new Donut();
		
		//donutList.add(temp); // to here
		fillTheList();
		changeTheList();
		//showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "Chocolate Filled";
		for (int index = 0; index < donutList.size(); index++)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 1; woop < 2; woop += 1)
				{
					display.displayText("The best Flavor ever!!");
				}	
			}
			/*for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex  += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex,  currentLetterIndex+ 1));
			}*/
			
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()

	{
		Donut jellyFilled = new Donut("Jelly filled");
		Donut chocolateFilled = new Donut("Chocolate Filled");
		Donut strawberryFilled = new Donut("Strawberry Filled");
		Donut coffeeFilled = new Donut("Coffee Filled");
		Donut candyFilled = new Donut("Candy Filled");
		
		donutList.add(jellyFilled);
		donutList.add(chocolateFilled);
		donutList.add(strawberryFilled);
		donutList.add(coffeeFilled);
		donutList.add(candyFilled);
	}

	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
}
