package automation.oop;

public class Light {

	private boolean state;
	private byte intensity;

	public void turnOn() {
		this.state = true;
	}

	public void turnOff() {
		this.state = false;
	}

	public boolean getState() {
		return state;
	}

	// // Daca am avea un panou prin care setam intensitatea din tastatura.
	// public void setIntensity(byte intensity) {
	// // in cazul in care avem intensitatea in afara intervalului,
	// // folosim return inainte de asignarea lui this.intensity cu valoarea din afara intervalului
	// if (intensity < 0 || intensity > 10) {
	// return;
	// }
	// this.intensity = intensity;
	// }

	public void dim() {
		if (intensity > 0) {
			intensity--;

			if (intensity == 0)
				turnOff();
		}
	}

	public void brighten() {
		if (intensity < 10) {
			intensity++;
			if (intensity == 1)
				turnOn();
		}
	}

	public byte getIntensity() {
		return this.intensity;

	}
}
