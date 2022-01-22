package lab;

import javax.swing.*;
import java.util.Scanner;
import java.io.File;

public class House {
	//Parameters for the information of the house
	private int sqfootage;
	private int bedrooms;
	private double bathrooms;
	private int cost;
	private String address;
	private int lotsize;
	private boolean haspool;
	private String image;
	
	//constructors to get info for the house
	public House(int sqfootage, int bedrooms, double bathrooms, int cost, String address, int lotsize, boolean haspool, String image) {
		this.sqfootage = sqfootage;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.cost = cost;
		this.address = address;
		this.lotsize = lotsize;
		this.haspool = haspool;
		this.image = image;
		
	}
	//The getter methods to ge the variables
	public int getSqfootage() { return sqfootage; }
	public int getBedrooms() { return bedrooms; }
	public double getBathrooms() { return bathrooms; }
	public int getCost() { return cost; }
	public String getAddress() { return address; }
	public int getLotsize() { return lotsize; }
	public boolean getPool() { return haspool; }
	public String getImage() { return image; }
	
	//what is returned to the runner
	public String toString() {
		return sqfootage + "\n" + bedrooms + "\n" + bathrooms + "\n" + cost + "\n" + address + "\n" + lotsize + "\n" + haspool + "\n" + image;
	}
}
