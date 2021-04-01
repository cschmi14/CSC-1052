import java.util.ArrayList;
import java.util.Scanner;
public class Blackjack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String action = "hit";
		String cards = "";
		int playerTotal = 0;
		
		CardDeck deck = new CardDeck();
		deck.shuffle();
		
		ArrayList<Card> playerCards = new ArrayList<Card>();
		ArrayList<Card> dealerCards = new ArrayList<Card>();
		
		playerCards.add(deck.nextCard());
		
		dealerCards.add(deck.nextCard());
		
		playerCards.add(deck.nextCard());	
		
		dealerCards.add(deck.nextCard());
		
		System.out.println();
		System.out.println("Dealer has a " + dealerCards.get(1).getRank() + " showing");
		System.out.println();
		
		System.out.print("Your have: ");
		cards += playerCards.get(0).getRank() + ", ";
		cards += playerCards.get(1).getRank();
		System.out.print(cards);
		System.out.println();
		System.out.print("Your possible totals are: " + countHand(playerCards));
		System.out.println();
		System.out.println("Would you like to hit or stay?");
		action = scan.next();
		
		while (action.equalsIgnoreCase("hit")) {
			
			playerCards.add(deck.nextCard());
			System.out.print("You have ");
			cards += ", " + playerCards.get(playerCards.size() - 1).getRank();
			System.out.print(cards);
			System.out.println();
			System.out.println("Your Possible Totals are: " + countHand(playerCards));
			if (maxCountUnder21(playerCards) > 21) {
				System.out.println("Bust. You lose");
				return;
			}
			System.out.println("Would you like to hit or stay?");
			action = scan.next();
			System.out.println();
			
		}
		
		String dCards = "";
		dCards += dealerCards.get(0).getRank() + ", ";
		dCards += dealerCards.get(1).getRank();
		
		System.out.println("Dealer reveals " + dealerCards.get(0).getRank());
		System.out.println("Dealer has " + dCards);
		System.out.println("Possible Totals: " + countHand(dealerCards));
		System.out.println();
		
		while (maxCountUnder21(dealerCards) <= 17) {
			
			dealerCards.add(deck.nextCard());
			System.out.println("Dealer hits.");
			System.out.print("Dealer has ");
			dCards += ", " + dealerCards.get(dealerCards.size() - 1).getRank();
			System.out.print(dCards);
			System.out.println();
			System.out.println("Possible Totals: " + countHand(dealerCards));
			System.out.println();
			if (maxCountUnder21(dealerCards) > 21) {
				System.out.println("Dealer Bust. You win!");
				return;
			}
			
		}
		
		System.out.println("Your Total: " + maxCountUnder21(playerCards));
		System.out.println("Dealer Total: " + maxCountUnder21(dealerCards));
		
		if (maxCountUnder21(playerCards) > maxCountUnder21(dealerCards)) {
			System.out.println("You Win!");
		}
		else if (maxCountUnder21(playerCards) == maxCountUnder21(dealerCards)) {
			System.out.println("You Tied");
		}
		else {
			System.out.println("You Lose");
		}
		
	}
	
	public static String countHand(ArrayList<Card> a) {
		int total = 0;
		int countAces = 0;
		String totals = "";
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getRank().getValue() == 11) {
				countAces++;
			}
			total += a.get(i).getRank().getValue();
		}
		int temp = total;
		totals += total + ",";
		for (int i = 0; i < countAces; i++) {
			totals += (temp - 10) + ",";
		}
		totals = totals.substring(0, totals.length() - 1);
		return totals;
	}
	
	public static int maxCountUnder21(ArrayList<Card> a) {
		int total = 0;
		int countAces = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getRank().getValue() == 11) {
				countAces++;
			}
			total += a.get(i).getRank().getValue();
		}
		if (total > 21) {
			while (total > 21 && countAces > 0) {
				total -= 10;
				countAces--;
			}
		}
		return total;
	}
	
}
