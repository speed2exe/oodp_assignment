package cz2002movieBooking;

public class Screening {
	
	private int movieid;
	private int showtime;
	private int cinemaid;
	private CinemaSeat[] seats;
	
	public void showSeats() {
		for(int i = 0; i<seats.length;i++) {
			if(seats[i].checkOccupied() == true) {
				System.out.println("O");
			}
			else System.out.println("X");
		}
	}
}
