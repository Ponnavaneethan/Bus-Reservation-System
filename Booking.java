package busResv;
import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Booking {
	
	String passengerName;
	int busNo;
	Date date;
	private boolean ture;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter bus no: ");
		busNo = scanner.nextInt();
		System.out.println("enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		
		date = dateFormat.parse(dateInput, null);
		
		
	}

public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses) {
	int capacity = 0;
	for(Bus bus:buses) {
		if(bus.getBusNo() == busNo)
			capacity = bus.getCapacity();
	}
	int booked = 0;
	for(Booking b:booking) {
		if(b.busNo == busNo && b.date.equals(date)) {
			booked++;
			
		}
	}

	return booked<capacity?ture:false;

	
}
}
