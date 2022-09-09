public class Frame_Person {
	public String name ;
	public int age;
	public float height;

	public Frame_Person( String NAME, int AGE, float HEIGHT) {
		this.name = NAME;
		this.age = AGE;
		this.height = HEIGHT;

	}
	public void eat (String food_name) {
		System.out.println(name + " is eating." + food_name);
	}

}
