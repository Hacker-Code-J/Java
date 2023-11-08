package test4;

public class Test4 {

	public static void army(human people) {
		people.military();
	}
	
	public static void main(String[] args) {
		Man man = new Man();
		Woman woman = new Woman();
		
		man.military();
		woman.military();
		
		System.out.println("------------");
		human people = null;
		people = new Man();
		people.military();
		people = new Woman();
		people.military();
	}
}
