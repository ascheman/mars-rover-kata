
class Rover {
	Position position
	Direction direction
	
	Rover(int x = 0, int y = 0, Direction direction = Direction.NORTH) {
		this.position = new Position(x, y)
		this.direction = direction
	}
	
	void moveForward() {
		if (direction == Direction.NORTH) {
			position.y++
		} else if (direction == Direction.EAST) {
			position.x++
		} else if (direction == Direction.SOUTH) {
			position.y--
		} else if (direction == Direction.WEST) {
			position.x--
		} else {
			throw new RuntimeException ("This should never happen!")
		}
	}
	void turnLeft() {
		if (direction == Direction.NORTH) {
			direction = Direction.WEST
		} else if (direction == Direction.EAST) {
			direction = Direction.NORTH
		} else if (direction == Direction.SOUTH) {
			direction = Direction.EAST
		} else if (direction == Direction.WEST) {
			direction = Direction.SOUTH
		} else {
			throw new RuntimeException ("This should never happen!")
		}
	}
	void turnRight() {
		if (direction == Direction.NORTH) {
			direction = Direction.EAST
		} else if (direction == Direction.EAST) {
			direction = Direction.SOUTH
		} else if (direction == Direction.SOUTH) {
			direction = Direction.WEST
		} else if (direction == Direction.WEST) {
			direction = Direction.NORTH
		} else {
			throw new RuntimeException ("This should never happen!")
		}
	}

}
