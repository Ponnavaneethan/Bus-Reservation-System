package busResv;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;//set & get method
	
	Bus(int no,boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No:" + busNo + "Ac:" + ac + "Total capacity:" + capacity);
		
		
	}
	public int getBusNo() {
		return busNo;
		// TODO 
	}


}