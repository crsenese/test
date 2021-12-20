
public class Carrello {
	private int amount;

	public Carrello() {
		amount = 0;
		System.out.println(amount);
		System.out.println(amount);

	}

	
		// TODO Auto-generated constructor stub
		
	
		public int getAmount() {
			return amount;
		}
		
		
		public void insertOneProduct() {
			amount++;
		}



		public void removeOneProduct() {
			amount--;
		}

}
