import static org.junit.Assert.*

import org.junit.Test
import static org.junit.Assert.*;

/**
 * 
 */

/**
 * @author ascheman
 *
 */
class RoverTest {
	// TODO Alle assertTrue-Statements in assertEquals umwandeln! 
	// Funktioniert aktuell nicht mit Position-Objekten
	@Test
	void testNewRover () {
		def rover = new Rover ()
		assertTrue (rover.position.equals(new Position(0, 0)))
		assertEquals (Direction.NORTH, rover.direction)
	}

	@Test
	void testNewRover00 () {
		def rover = new Rover (0, 0)
		assertTrue (rover.position.equals(new Position(0, 0)))
		assertEquals (Direction.NORTH, rover.direction)
	}
	
	@Test
	void testRoverMovesOneForwardNorth () {
		def rover = new Rover ()
		rover.moveForward()
		assertEquals (Direction.NORTH, rover.direction)
		assertTrue (rover.position.equals (new Position(0, 1)))
	}
	
	@Test
	void testRoverMovesOneForwardEast () {
		def rover = new Rover ()
		rover.turnRight()
		rover.moveForward()
		assertEquals (Direction.EAST, rover.direction)
		assertTrue (rover.position.equals (new Position(1, 0)))
	}
	
	@Test
	void testRoverMovesOneForwardWest () {
		def rover = new Rover ()
		rover.turnLeft()
		rover.moveForward()
		assertEquals (Direction.WEST, rover.direction)
		assertTrue (rover.position.equals (new Position(-1, 0)))
	}
	
	@Test
	void testRoverMovesOneForwardSouth () {
		def rover = new Rover ()
		rover.turnLeft()
		rover.turnLeft()
		rover.moveForward()
		assertEquals (Direction.SOUTH, rover.direction)
		assertTrue (rover.position.equals (new Position(0, -1)))
	}
	
	@Test
	void testFourLefts() {
		def rover = new Rover()
		rover.turnLeft()
		rover.turnLeft()
		rover.turnLeft()
		rover.turnLeft()
		assertEquals (Direction.NORTH, rover.direction)
		assertTrue(rover.position.equals(new Position(0, 0)))
	}
}
