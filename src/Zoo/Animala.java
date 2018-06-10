package Zoo;

public class Animala {

	static {
		System.out.println("Animal object is created");
	}
	
	{System.out.println("poo object is created");}
	
	private int tag;
	private String name;

	public Animala() {
		
	}
	
	public Animala(int tag, String name){
		this.tag=tag;
		this.name=name;
	}
	
	public int getTag() {
		return tag;
	}


	public void setTag(int tag) {
		this.tag = tag;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		
		return "tag: " + this.tag + " Name:" + this.name;
		
	}
	
}
