public class Phone {

	private String name;
	private int ram;
	private int price;
	private String os;
	
	
	public Phone(String name, int ram, int price, String os) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
		this.os = os;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	@Override
	public String toString() {
		return "Phone [name=" + name + ", ram=" + ram + ", price=" + price + ", os=" + os + "]";
	}
	
	
	
	
}
