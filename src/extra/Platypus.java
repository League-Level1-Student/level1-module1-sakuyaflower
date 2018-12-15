package extra;
public class Platypus {
	private String name;
	
	public Platypus(String name) {
		this.name = name;
	}
	
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
  	void sayHi(){
        	System.out.println("The platypus " + name + " is smarter than your average platypus.");
  	
  	}
}
