package Problemsolving;

public class SquareShiftTest {

	public static void main(String[] args) {
	System.out.println("\n\nTestCase1:");
		testset1();
	System.out.println("\n\nTestCase2:");
		testset2();
	System.out.println("\n\nTestCase3:");
		testset3();
	}
	static void testset1()
	{
		int[][] input1= {{3,2},{4,3},{2,3},{3,4}};
		int passengerCount=37;
		Airplane DObj= new Airplane();
		String[][] seat = DObj.initalizeSeatLayout(input1);
		seat = DObj.assignseat(seat, passengerCount);
		DObj.printreservedSeat(seat);
	}
	static void testset2()
	{
		int[][] input1= {{6,2},{4,3},{2,3}};
		int passengerCount=30;
		Airplane DObj= new Airplane();
		String[][] seat = DObj.initalizeSeatLayout(input1);
		seat = DObj.assignseat(seat, passengerCount);
		DObj.printreservedSeat(seat);
	}
	
	static void testset3()
	{
		int[][] input1= {{6,2},{4,3},{2,3},{3,4}};
		int passengerCount=10;
		Airplane DObj= new Airplane();
		String[][] seat = DObj.initalizeSeatLayout(input1);
		seat = DObj.assignseat(seat, passengerCount);
		DObj.printreservedSeat(seat);
	}
}
