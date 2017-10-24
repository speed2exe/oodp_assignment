package cz2002movieBooking;

public class ticket {
	public ticket(int cinemaid, int movieid, int showtime, int seatnumber ) {
		this.movieid = movieid;
		this.seatnumber = seatnumber;
		this.showtime = showtime;
		this.cinemaid = cinemaid;
		this.setTicketId(ticketidcount);
		ticketidcount++;
	}
	
	
	private static int tickettotalnum;
	private static int ticketidcount = 1;
	
	private int ticketid;
	private int cinemaid;
	private int movieid;
	private int seatnumber;
	private int showtime;
	private int transactionid;
	
	
	public int getPrice() {
	return 0;
	}


	public int getTicketId() {
		return ticketid;
	}


	public void setTicketId(int ticketid) {
		
		this.ticketid = ticketid;
	}
	
	public void showTicketInformation(){
		
		System.out.println("Ticket ID: "+ticketid);
		//System.out.println("Cinema: "+getCinemaName);
		//System.out.println("Movie Title: "+getMovieTitle(movieid);
		System.out.println("Seat Number: "+ticketid);
		System.out.println("Show time: "+ticketid);
		System.out.println("Price: "+ticketid);
		System.out.println("Ticket ID: "+ticketid);
	}

}
