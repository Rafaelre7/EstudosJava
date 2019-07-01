package Internaciolizacao;

public enum MessageEnum {

	TITLE("message.title"),
	HELLO("message.hello"),
	GOODBYE("message.goodbye");

	private String prop;

	private MessageEnum(String prop) {
		this.prop = prop;
	}

	public String getProp() {
		return prop;
	}
}
