package com.autoregistry.vms.app.service;

import java.util.Scanner;
import com.autoregistry.vms.app.model.Vehicle;

public class Vehiclemodel implements Vehicledetails {
	Scanner sc =new Scanner(System.in);
	 private static int registrationCounter = 1;
	Vehicle v= new Vehicle();
	
	@Override
	public  void registerVehicle() {
	   	 
		System.out.println("Enter Your Name:");
		v.setName(sc.nextLine());
		System.out.println("Enter mob no:");
		v.setMobno(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter Your Vehicle Model Name:");
		v.setVehiclemodelname(sc.nextLine());
		System.out.println("Enter your vehicle Number:");
		v.setVehicleno(sc.nextLine());
		System.out.println("Enter colour of Vehicle:");
		v.setColour(sc.nextLine());
		System.out.println("Enter Price of Vehicle:");
		v.setPrice(sc.nextDouble());
		v.setRegisterno(registrationCounter++);
        System.out.println("Vehicle Registered Successfully.");
        System.out.println("Your Registration Number is: " + v.getRegisterno());
		
	}
	
	
	@Override
	public void viewDetails() {
		System.out.println("***************************Vehicle Details*********************");
		System.out.println("Registration number:"+v.getRegisterno());
		System.out.println("Owner Name:"+v.getName());
		System.out.println("Mobile Number:"+v.getMobno());
		System.out.println("Vehicle Model Name:"+v.getVehiclemodelname());
		System.out.println("Vehicle Number:"+v.getVehicleno());
		System.out.println("Colour"+v.getColour());
		System.out.println("Price:"+v.getPrice());
	}
	
	@Override
	public void updateVehicle() {
		while(true) {
		System.out.println("**************Update Your Vehicle Details***********");
		System.err.println("1.Update Owner Name");
		System.out.println("2.Update price");
		System.out.println("What is Your Choice");
		int ch=sc.nextInt();
		sc.nextLine();
		switch(ch) {
		case 1:
			System.out.println("Enter new owner name");
			v.setName(sc.nextLine());
			System.out.println("Name Updated");

			break;
		case 2:
			System.out.println("Enter New Price");
			v.setPrice(sc.nextDouble());
			System.out.println("Price updated");
			break;
		
		}return;
		
	}
		
	}

}
