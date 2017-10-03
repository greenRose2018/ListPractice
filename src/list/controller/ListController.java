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
		Donut temp = new Donut();
		
		donutList.add(temp); // to here
		fillTheList();
	}
	
	private void showTheList()
	{
		for (int index = 0; index < donutList.size(); index++)
		{
			display.displayText(donutList.get()); //error need to fix lloooook here 
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("Jelly filled");
		Donut chocolateFilled = new Donut("ChocolateFilled");
		Donut strawberryFilled = new Donut("Strawberry Filled");
		Donut coffeeFilled = new Donut("Coffee Filled");
		Donut candyFilled = new Donut("Candy Filled");
		
		donutList.add(jellyFilled);
		donutList.add(chocolateFilled);
		donutList.add(strawberryFilled);
		donutList.add(coffeeFilled);
		donutList.add(candyFilled);
	}
}
