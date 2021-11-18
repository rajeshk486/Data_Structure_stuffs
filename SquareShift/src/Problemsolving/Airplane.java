package Problemsolving;

import java.util.Arrays;

public class Airplane {
	boolean SeatFull = false;
	static int[][] input = { { 3, 2 }, { 4, 3 }, { 2, 3 }, { 3, 4 } };
	static int passengerCount = 36;

	public static void main(String[] args) {
		Airplane DObj = new Airplane();
		String[][] seat = DObj.initalizeSeatLayout(input);
		seat = DObj.assignseat(seat, passengerCount);
		DObj.printreservedSeat(seat);
	}

	public String[][] assignseat(String[][] seat, int passenger) {
		boolean seatoccupied = false;
		for (int i = 1; i <= passenger && !SeatFull; ++i) {
			seatoccupied = fillpassenger(seat, i, "A");
			if (!seatoccupied)
				seatoccupied = fillpassenger(seat, i, "W");
			if (!seatoccupied)
				seatoccupied = fillpassenger(seat, i, "M");

			if (!seatoccupied) {
				SeatFull = true;
				System.out.println("*****FLIGHT IS FULL cant take passeneger "+passenger+"*****");
			}
		}
		return seat;
	}

	public String[][] initalizeSeatLayout(int[][] input) {
		int row = 0, col = 0;
		int colstart = 0;
		int colend = 0;
		int rowend = 0;

		// Create LAYOUT for the seats, find ROW and COL values
		for (int i = 0; i < input.length; i++) {
			col = col + input[i][0];
			if (input[i][1] > row)
				row = input[i][1];
		}
		//System.out.println(row + " " + col);

		// initalize the seat layout
		String[][] seat = new String[row][col];

		// Fill with default values "*"
		for (int i = 0; i < row; i++)
			Arrays.fill(seat[i], "*");

		// fill LAYOUT with seat arrangement AISLE(A),WINDOW(W),MIDDLE(M)
		/*
		  W  M  A  A  M  M  A  A  A  A  M  W  
		  W  M  A  A  M  M  A  A  A  A  M  W  
		  *  *  *  A  M  M  A  A  A  A  M  W  
          *  *  *  *  *  *  *  *  *  A  M  W  
		 */
		for (int i = 0; i < input.length; i++) {
			colend = input[i][0];
			rowend = input[i][1];
			fillseatposition(seat, colstart, colend, rowend, col);
			colstart += colend;
		}
		System.out.println("    SEAT LAYOUT\n============================");

		printSeat(seat);
		System.out.println("--------------------");
		return seat;
	}

	void printSeat(String[][] seat) {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + "  ");
			}
			System.out.println();
		}

	}
//Final Output of reserved Seats will be printed in readable format by this function.
	public void printreservedSeat(String[][] seat) {
		System.out.println("RESERVED SEAT ARRANGEMENT\n============================");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				if (seat[i][j].equals("M"))
					System.out.print("MM  ");
				else if (seat[i][j].equals("A"))
					System.out.print("AA  ");
				else if (seat[i][j].equals("W"))
					System.out.print("WW  ");
				else if (seat[i][j].equals("*"))
					System.out.print("--  ");
				else
					System.out.print(seat[i][j] + "  ");// +i+""+j);
			}
			System.out.println();
		}
		System.out.println("MM ->Middle seats");
		System.out.println("AA ->Aisle seats");
		System.out.println("WW ->Window seats");
		System.out.println("-- -> Dummy seats");

	}

	private String[][] fillseatposition(String[][] seat, int rowstat, int rowend, int colend, int colrealend) {
		for (int i = rowstat; i < rowstat + rowend; i++) {
			for (int j = 0; j < colend; j++) {
				if (i == 0 || i == colrealend - 1)
					seat[j][i] = "W";
				else if (i == rowstat || i == rowstat + rowend - 1)

					seat[j][i] = "A";
				else
					seat[j][i] = "M";

			}
		}
		return seat;
	}

	private boolean fillpassenger(String[][] seat, int passenger, String c) {
		boolean seatfilled = false;
		for (int i = 0; i < seat.length; i++)
			for (int j = 0; j < seat[i].length; j++)
				if (seat[i][j].equals(c) && !seatfilled) {
					if (passenger < 10)
						seat[i][j] = "0" + passenger + "";
					else
						seat[i][j] = passenger + "";
					seatfilled = true;
					break;
				}
		return seatfilled;
	}

}
