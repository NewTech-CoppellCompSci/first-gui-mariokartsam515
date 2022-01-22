package lab;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File; //import the java files needed for the GUI

public class Runner {
	private static ArrayList<House> houses; //gets the Array list from the House class
	
	public static void main(String[] args) throws Exception{
		houses = new ArrayList<House>(); //getsnthe private int and makes it ppublic from above
		Scanner inFile = new Scanner(new File("src/lab/info.txt")); //takes house info from info. txt 
		while (inFile.hasNext()) { //loops through the variables below
			int sqfootage = inFile.nextInt(); //will get square footage, bedrooms, bathrooms, cost, address, lot size, if it has a pool, and the image needed
			int bedrooms = inFile.nextInt();
			double bathrooms = inFile.nextDouble();
			int cost = inFile.nextInt();
			inFile.nextLine();
			String address = inFile.nextLine();
			int lotsize = inFile.nextInt();
			boolean haspool = inFile.nextBoolean();
			String image = inFile.next();
			
		
			houses.add(new House(sqfootage, bedrooms, bathrooms, cost, address, lotsize, haspool, image)); //will add the variables the the GUI
		}
		for (int i = 0; i < houses.size(); i++) { 
			System.out.println(houses.get(i));
		}
		MainPage(); //creates the actual GUI code
		
	}
	public static void MainPage() { //will be the overall main page of the system
		
		JFrame frame = new JFrame("Zillow Realtor App"); //name of the JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//end frame
		frame.setSize(1250, 1000); 
		//give size
		
		//picture object
		ImageIcon house = new ImageIcon(houses.get(0).getImage()); //will get the image from the correct java folder
		//scaling the object to the correct size
		ImageIcon ScaleHouse = new ImageIcon(house.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		
		//label with original picture

		JButton labelhouse = new JButton(ScaleHouse); //adds button for the image
		labelhouse.setBounds(20, 50, ScaleHouse.getIconWidth(), ScaleHouse.getIconHeight()); //will get picture dimensions and create button
		frame.add(labelhouse); //will add the the button
		JLabel address1 = new JLabel(houses.get(0).getAddress()); //will get the house address
	    address1.setBounds(20, 260 , 240, 30); //x, y, w, h
		frame.add(address1);//adds house address
		
		labelhouse.addActionListener(new ActionListener() { //this part of the code adds action listener to get different variables for each house
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 
				 houseGUI(houses.get(0));
			 }
		});
		//all processes are repeated for the next houses
		
		ImageIcon house2 = new ImageIcon(houses.get(1).getImage()); 
		//scale
		ImageIcon ScaleHouse2 = new ImageIcon(house2.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		//label with original pic
		JButton labelhouse2 = new JButton(ScaleHouse2);
		labelhouse2.setBounds(20, 320, ScaleHouse2.getIconWidth(), ScaleHouse2.getIconHeight());
		frame.add(labelhouse2);
		JLabel address2 = new JLabel(houses.get(1).getAddress());
	    address2.setBounds(20, 520 , 240, 30); //x, y, w, h
		frame.add(address2);
		
		labelhouse2.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 
				 houseGUI(houses.get(1));
			 }
		});
		ImageIcon house3 = new ImageIcon(houses.get(2).getImage());
		//scale
		ImageIcon ScaleHouse3 = new ImageIcon(house3.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		//label with original pic
		JButton labelhouse3 = new JButton(ScaleHouse3);
		labelhouse3.setBounds(280, 50, ScaleHouse3.getIconWidth(), ScaleHouse3.getIconHeight());
		frame.add(labelhouse3);
		JLabel address3 = new JLabel(houses.get(2).getAddress());
	    address3.setBounds(280, 260 , 240, 30); //x, y, w, h
		frame.add(address3);
		
		labelhouse3.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 
				 houseGUI(houses.get(2));
			 }
		});
		
		ImageIcon house4 = new ImageIcon(houses.get(3).getImage());
		//scale
		ImageIcon ScaleHouse4 = new ImageIcon(house4.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		//label with original pic
		JButton labelhouse4 = new JButton(ScaleHouse4);
		labelhouse4.setBounds(280, 320, ScaleHouse4.getIconWidth(), ScaleHouse4.getIconHeight());
		frame.add(labelhouse4);
		JLabel address4 = new JLabel(houses.get(3).getAddress());
	    address4.setBounds(280, 520 , 240, 30); //x, y, w, h
		frame.add(address4);
		
		labelhouse4.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 
				 houseGUI(houses.get(3));
			 }
		});
		
		ImageIcon house5 = new ImageIcon(houses.get(4).getImage());
		//scale
		ImageIcon ScaleHouse5 = new ImageIcon(house5.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		//label with original pic
		JButton labelhouse5 = new JButton(ScaleHouse5);
		labelhouse5.setBounds(540, 50, ScaleHouse5.getIconWidth(), ScaleHouse5.getIconHeight());
		frame.add(labelhouse5);
		JLabel address5 = new JLabel(houses.get(4).getAddress());
	    address5.setBounds(540, 260 , 240, 30); //x, y, w, h
		frame.add(address5);
		
		labelhouse5.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 
				 houseGUI(houses.get(4));
			 }
		});
		
		ImageIcon house6 = new ImageIcon(houses.get(5).getImage());
		//scale
		ImageIcon ScaleHouse6 = new ImageIcon(house6.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		//label with original pic
		JButton labelhouse6 = new JButton(ScaleHouse6);
		labelhouse6.setBounds(540, 320, ScaleHouse6.getIconWidth(), ScaleHouse6.getIconHeight());
		frame.add(labelhouse6);
		JLabel address6 = new JLabel(houses.get(5).getAddress());
	    address6.setBounds(540, 520 , 240, 30); //x, y, w, h
		frame.add(address6);
		
		labelhouse6.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 
				 houseGUI(houses.get(5));
			 }
		});
		JLabel title = new JLabel("Zillow Realtor App"); //this is the label for the app title
	    title.setBounds(10, 10, 150, 20); //x, y, w, h
		frame.add(title);
		
		frame.setLayout(null); 
		//don't use layout
		frame.setVisible(true); //sets the frame to be visible
	}
	public static void houseGUI(House house) {
		JFrame frame = new JFrame("Houses"); //title for the next JFrame and shows details on the houses
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(800,800); //size for the frame
		//picture object
		JButton goback = new JButton("Go back to homepage"); //adds button to go back
		goback.setBounds(10, 10, 200, 30); //x, y, w, l
		frame.add(goback);
		goback.addActionListener(new ActionListener() { //action listener to go back to the main page for each area
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainPage();
				
			}
		});
		//picture object for each house
		ImageIcon housegui = new ImageIcon(house.getImage());
		//scale for each house
		ImageIcon ScaleHouseGui = new ImageIcon(housegui.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		
		
		
		JButton labelhouse = new JButton(ScaleHouseGui); //adds button the the image of the house
		labelhouse.setBounds(20, 50, ScaleHouseGui.getIconWidth(), ScaleHouseGui.getIconHeight());
		frame.add(labelhouse);
		
	
		//these labels put the information needed for the house including cost, address, square footage, # of bedrooms, # of bathrooms, lot size, ad if it has a pool
		JLabel info = new JLabel("Information about this house: "); 
		info.setBounds(350, 20, 300, 30);
		frame.add(info);
		
		JLabel price = new JLabel("Price: $" + house.getCost());
		price.setBounds(300, 40, 300, 30);
		frame.add(price);
		
		JLabel address = new JLabel("Adress: " + house.getAddress());
		address.setBounds(300, 60, 300, 30);
		frame.add(address);
		
		JLabel sqfootage = new JLabel("Square Feet: " + house.getSqfootage());
		sqfootage.setBounds(300, 80, 300, 30);
		frame.add(sqfootage);
		
		JLabel beds = new JLabel("Bedrooms: " + house.getBedrooms());
		beds.setBounds(300, 100, 300, 30);
		frame.add(beds);
		
		JLabel baths = new JLabel("Bathrooms: " + house.getBathrooms());
		baths.setBounds(300, 120, 300, 30);
		frame.add(baths);
		
		JLabel lotsize = new JLabel("Lot Size: " + house.getLotsize());
		lotsize.setBounds(300, 140, 300, 30);
		frame.add(lotsize);
		
		if (house.getPool() == true) {
			JLabel pool = new JLabel("Pool: Yes");
			pool.setBounds(300, 160, 300, 30);
			frame.add(pool);
		}
		else if (house.getPool() == false) {
			JLabel pool = new JLabel("Pool: No");
			pool.setBounds(300, 160, 300, 30);
			frame.add(pool);
		}
		
		frame.setLayout(null); //no layout
		frame.setVisible(true); //sets frame visible
	}

}
