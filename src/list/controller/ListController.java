package list.controller;

import java.util.List;			//step 1: import donut file, list and arraylist.
import java.util.ArrayList;
import list.model.Donut;

public class ListController
{
	private List<Donut> donutList; //step 2: declare 
	
	public ListController()
	{
		donutList = new ArrayList<Donut>(); //step 3: initialize need to call using params
	}
	public void start()
	{
		//temporarily make Donut an object
		Donut temp = new Donut();
		
		donutList.add(temp); // to here
	}
}
