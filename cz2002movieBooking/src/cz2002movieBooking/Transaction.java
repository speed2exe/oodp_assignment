package cz2002movieBooking;

public class Transaction {
	
	private int transactionid;
	private int cinemaid;
	private ticket[] listoftickets;
	private int numberoftickets = 0;
	private int creditcard = 0;
	private char[] emailaddress;
	
	public int getPrice() {
		int result = 0;
		for(int i = 0; i<numberoftickets;i++) {
			result += listoftickets[i].getPrice();
		}
		return result;
	}
	public void generateTicket() {
		
		int movieid = 0;
		//movieid = getMovieId; 
		
		int showtime = 0;
		//showtime = getShowTime;
		
		int seatnumber[];
		//seatnumber[] = getSeatNumber();
		
		for (int i=0; i<seatnumber.length;i++) {
			listoftickets[numberoftickets] = new ticket(cinemaid,movieid,seatnumber[i],showtime);
			numberoftickets++;
		}
		
		
		
	}
	public void showTransaction(){
		System.out.println("Transaction ID: " +transactionid
				+ "\nEmail Address: " + emailaddress
				+ "\nCredit Card: "+ creditcard
				+ "\n");
		for(int i = 0;i<numberoftickets;i++){
			listoftickets[i].showTicketInformation();
		}
	}
	
}
