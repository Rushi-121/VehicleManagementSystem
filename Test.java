package com.autoregistry.vms.app.op;

import java.util.Scanner;

import com.autoregistry.vms.app.model.Vehicle;
import com.autoregistry.vms.app.service.Vehicledetails;
import com.autoregistry.vms.app.service.Vehiclemodel;

import com.autoregistry.vms.app.service.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicledetails v1=new Vehiclemodel();
		while(true) {
			
			System.out.println("********************************Vehicle Management System****************************");
			System.out.println("=================================Menu==================================================");
			System.out.println("1.Register Your Vehicle");
			System.out.println("2.View Details");
			System.out.println("3.Update Your Vehicle Details");
			System.out.println("4.Exit");
			
			System.out.println("Enter Your Choice");
			int ch =sc.nextInt();
			
			switch(ch) {
			case 1:
			{
				v1.registerVehicle();
				break;
			}
			case 2:
			{
				v1.viewDetails();
				break;
			}
			case 3:
			{
				v1.updateVehicle();
				break;
				
			}
			case 4:
			{
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Invalid Choice Please Try Again......!");
			}
			}
		}
		
	}

}
