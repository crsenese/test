
public class Carrello {
	private int amount;

	public Carrello() {
		amount = 0;
		System.out.println(amount);
		System.out.println(amount);
		System.out.println("verifica locale");
		System.out.println("verifica locale2");


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
