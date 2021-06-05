package automation.oop;

public class Test3 {

	public static void main(String[] args) {

		Light bulb1 = new Light();
		Light bulb2 = new Light();
		Light bulb3 = new Light();

		bulb1.turnOn();

		System.out.println("After turn on intensity is " + bulb1.getIntensity());
		System.out.println("After turn on state is " + bulb1.getState());

		bulb1.brighten();

		System.out.println("After brigthen intensity is " + bulb1.getIntensity());
		System.out.println("After brighten state is " + bulb1.getState());

		bulb1.dim();

		System.out.println("After dim intensity is " + bulb1.getIntensity());
		System.out.println("After dim state is " + bulb1.getState());

		bulb1.turnOff();

		System.out.println("After turn off intensity is " + bulb1.getIntensity());
		System.out.println("After turn off state is " + bulb1.getState());

		bulb1.turnOn();

		System.out.println("After turn on (again) intensity is " + bulb1.getIntensity());
		System.out.println("After turn on (again) state is " + bulb1.getState());

		// Null dinstruge referinta catre obiect.
		// bulb1 = null;
		//
		// bulb1.getState();
		// bulb1.getIntensity();

	}
}
