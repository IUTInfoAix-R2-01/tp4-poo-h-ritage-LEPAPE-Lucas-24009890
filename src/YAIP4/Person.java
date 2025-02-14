package YAIP4;

public class Person {
	private String name;
	private String address;
	
	public Person() {
		name = "Lepape";
		address = "1 rue de LaRue";
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAdress) {
		address = newAdress;
	}

	public String toString() {
		return String.format("Person [Name: %s, Address: %s]", name, address);
	}
	
	public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Rombi", "2 rue du Boulvard");

        System.out.println("Test des constructeurs:");
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("Test des getters et setters:");
        p1.setAddress("Champs Élisée");
        System.out.println(p1);
	}
}
