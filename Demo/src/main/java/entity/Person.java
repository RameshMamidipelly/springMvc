package entity;

public class Person {
	private String name;
	private int id;
	private String cor;
	
	public Person(String name, int id, String cor) {
		super();
		this.name = name;
		this.id = id;
		this.cor = cor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cor=" + cor + "]";
	}
	
	
	
	
	
	

}
