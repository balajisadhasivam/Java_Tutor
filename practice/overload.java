package practice2;

public class overload {
	String name;
    int age;
    
    overload(String name, int age)
    {
    	this.name=name;
    	this.age=age;
    	System.out.println(name+" "+age);
    }
    overload(String name)
    {
    	this.name=name;
    	System.out.println(name);
    }
    
    public static void main(String[] args) {
    	overload o=new overload("Balaji",20);
    	overload l=new overload("Lalith");
    	
    }
}
