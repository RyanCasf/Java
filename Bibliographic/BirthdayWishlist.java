import java.util.ArrayList;

public class BirthdayWishlist {

	public static void main(String[] args) {
		ArrayList<String> wishList = new ArrayList<String>();
		
		wishList.add("Macbook Pro");
		wishList.add("A new watch");
		wishList.add("Sweatpants");
		wishList.add("New mouse");
		wishList.add("Mechanical keyboard");
		wishList.add("Gift card");
		wishList.add("Picture frame");
		wishList.add("New desk");
		wishList.add("Coffee maker");
		wishList.add("Hard drive");
		wishList.add("T-shirts");
		wishList.add("Socks");

		
		int size = wishList.size();
		String first = wishList.get(0);
		String last = wishList.get(size - 1);

		System.out.println("Size: " + size);
		System.out.println("First: " + first);
		System.out.println("Last: " + last);

		

	}

}
