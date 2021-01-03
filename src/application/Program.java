package application;

import java.util.Scanner;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


public class Program {

	public static void main(String[] args) throws ParseException {

		 SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy"); 

		
		Scanner input = new Scanner(System.in);
		System.out.print("Room number: ");
		int room = input.nextInt();
		System.out.print("Check-in date: (dd/MM/yyyy): ");
		Date checkin = spf.parse(input.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = spf.parse(input.next());
		Reservation res = new Reservation(room, checkin, checkout);
		System.out.print(res);

		System.out.print("Enter data to update the reservation:\n");
		System.out.print("check-in date (dd/MM/yyyy): ");
		Date checkin_up = spf.parse(input.next());
		System.out.print("check-out date (dd/MM/yyyy): ");
		Date checkout_up = spf.parse(input.next());

		res.updateDates(checkin_up, checkout_up);
		
		System.out.print(res);
		
		
		input.close();
		
	}

}
