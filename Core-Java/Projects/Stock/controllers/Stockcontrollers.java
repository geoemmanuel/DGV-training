package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import models.Stock;

public class Stockcontrollers {
	ArrayList <Stock> stocks = new ArrayList<Stock>();
	
	public void add() {
			stocks.add(new Stock("Electronic arts","Esports",980,400,78,new double[] {116.5,240.4,444.9,800.56,600.5},80));
			stocks.add(new Stock("Blender","3d",450,190,560,new double[] {170.9,110.4,140.6,148.4},40));
			stocks.add(new Stock("Yamaha","motorsports",568,450,140,new double[] {120.3,187.56,435.1,125.9,445.8},60));
			stocks.add(new Stock("Autodesk","cad",110,98,170,new double[] {100.3,90.56,113.6,140.8,60.8},30));
	}
	
public void displayStocks() {
		
		System.out.println("Name                    "  + "Category          " + "Price "             + "ROI" );
		System.out.println();
		for(int i=0;i<stocks.size();i++) {
			System.out.println(stocks.get(i).getName()+ "         " + stocks.get(i).getCategory()+ "          "+stocks.get(i).getPrice()+ "      "+stocks.get(i).getRoi());
		}
	}
	
	
	public void displayPerformance(){
		System.out.println("Name                    "  + "Category          " + "Price " + "High52 " + "Low52 " + "Last5               " + "ROI" );
		stocks.forEach((stock)->{
			System.out.println(stock.getName()+"   "+stock.getCategory()+"    "+stock.getPrice()+ "   "+stock.getHigh52()+"   "+stock.getLow52()+"    "+stock.getLast5()+"    "+stock.getRoi());
		});
	}
	
	public void sortedStock() {
		Collections.sort(stocks, new SortStocks());
		this.displayStocks();
	}
	
	
	public void searchStock(String userInput) {
		Optional<Stock> foundData=stocks.stream().filter((s)->{
			return s.getName().equals(userInput);
		}).findFirst();
		System.out.println(foundData.get().getName() + "  "+foundData.get().getCategory()+ "   " + foundData.get().getPrice());
		
	}
	
	public void displayRoi(String name,int month) {
		Optional<Stock> foundStock=stocks.stream().filter((s)->{
			return s.getName().equals(name);
		}).findFirst();
		System.out.println("Your profit is "+foundStock.get().getPrice()*(foundStock.get().getRoi()/100)*month);
	}

	
}