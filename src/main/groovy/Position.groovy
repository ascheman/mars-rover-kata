
class Position {
	int x
	int y
	
	public Position (int x, int y) {
		this.x = x
		this.y = y
	}
	
	public boolean equals(Position otherPosition) {
		return x == otherPosition.x && y == otherPosition.y
	}
}
