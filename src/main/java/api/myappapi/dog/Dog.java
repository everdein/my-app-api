package api.myappapi.dog;

public class Dog {
	private String name;
	private String coat;
	private String breed;
	private int age;
	private int id;

	public Dog(String name, String coat, String breed, int age, int id) {
		this.name = name;
		this.coat = coat;
		this.breed = breed;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", coat=" + coat + ", breed=" + breed + ", age=" + age + ", id=" + id + "]";
	}
}
