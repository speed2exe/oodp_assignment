package cz2002movieBooking;

public class CinemaSeat {
	
	public CinemaSeat() {}
	public CinemaSeat(int ticketid, int seatnumber) {
		this.ticketid=ticketid;
		this.seatnumber=seatnumber;
		
	}
	
	private int ticketid;
	private int seatnumber;
	private boolean occupied;
	
	public boolean checkOccupied() {
		return occupied;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public int getTicketId() {
		return ticketid;
	}
}
