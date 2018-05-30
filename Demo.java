import java.util.ArrayList;
class Demo{
	public static void main(String[] args) {
		int[] getallen;
		getallen = new int[7];
		int[] nummers = new int[3];
		int[] nogmeergetallen = {3,14,6,7,8,9,11};
		int[] nmgetallen = new int[] {3,7,5};
//		int[] nogmeergetallen = {3,14,6,7,8,9,11};
		Pizza[] allerleiPizza = {};
		Pizza[] vierPizza = new Pizza[4];
		Pizza pizza = new Pizza("Kip");
		Pizza pizza2 = new Pizza("Salami");
		vierPizza[0] = new Pizza("Kaas");
		vierPizza[1] = pizza2;
		vierPizza[2] = pizza;
		vierPizza[3] = new Pizza("Champignons");
		System.out.println("vvvvvvvvv");
		for(int x = 0; x < vierPizza.length; x++){
			System.out.println(vierPizza[x].ingredient);
			if(vierPizza[x].ingredient.equals("Kaas")) {
				vierPizza[x].bakken();
			}
		}
	}
}
class Pizza{
	String ingredient = "Ham";
	Pizza(String ing){  // kip
		ingredient = ing;
	}
	void bakken() {
		System.out.println("Het bakken van de pizza met"+ this.ingredient +"is voltooid");
	}
}
