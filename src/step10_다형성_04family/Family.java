package step10_다형성_04family;

public class Family {
	private String name;
	
	public Family() {
		
	}
	public Family(String name) {
	super();
	this.name=name;
	}
	
	public String toString() {
		return "이름 : "+name+"\n";
	}
}

