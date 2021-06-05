package automation.Enums;

public enum DemoEnum {

	CHROME("77"), //
	FIREFOX("5.32.43"), //
	IE("993"), //
	OPERA("978123.3");

	private String version;

	DemoEnum(String s) {
		this.version = version;

	}

	public String getVersion() {
		return version;
	}

}
