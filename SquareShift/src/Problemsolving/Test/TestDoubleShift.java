package Problemsolving.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Problemsolving.Airplane;
import junit.framework.Assert;

class TestDoubleShift {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		int[][] input1= {{3,2},{4,3},{2,3},{3,4}};
		int passengerCount=37;
		Airplane DObj= new Airplane();
		String[][] seat = DObj.initalizeSeatLayout(input1);
		seat = DObj.assignseat(seat, passengerCount);
		DObj.printreservedSeat(seat);
		Assert.assertNotNull(seat);
	}
	@Test
	void test2() {
		int[][] input1= {{6,2},{4,3},{2,3}};
		int passengerCount=3;
		Airplane DObj= new Airplane();
		String[][] seat = DObj.initalizeSeatLayout(input1);
		seat = DObj.assignseat(seat, passengerCount);
		DObj.printreservedSeat(seat);
		Assert.assertNotNull(seat);
	}

}
