package arrayas;

public class Vehicle {

		String Make;
		String Model;
		int price;
		boolean fourwDrive;
		public String getMake() {
			return Make;
		}
		public void setMake(String make) {
			Make = make;
		}
		public String getModel() {
			return Model;
		}
		public void setModel(String model) {
			Model = model;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public boolean isFourwDrive() {
			return fourwDrive;
		}
		public void setFourwDrive(boolean fourwDrive) {
			this.fourwDrive = fourwDrive;
		}
		public Vehicle(String make, String model, int price, boolean fourwDrive) {
			super();
			Make = make;
			Model = model;
			this.price = price;
			this.fourwDrive = fourwDrive;
		}
		
}
