package automation.oop;

public class Car {
	private int speed;
	private boolean state;
	private String direction;
	// private int angle;

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void accelerate() {
		speed++;

	}

	public void start() {
		this.state = true;

	}

	public int getSpeed() {
		return speed;
	}

	public void stop() {
		this.state = false;

	}

	public boolean getSate() {
		return state;
	}

	public void turnLeft() {
		direction = "turn left";
		// if(angle < 0 && angle >-60)
		// angle--;
	}

	public void turnRight() {
		direction = "turn right";
		// angle++;
	}

	public String getDirection() {
		return direction;
	}
}
