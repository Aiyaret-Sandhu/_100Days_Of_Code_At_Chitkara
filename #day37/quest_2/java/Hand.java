// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.Comparator;
// import java.util.Collections;

// public class Hand implements Comparator<Hand>{
//     private ArrayList<Card> hand;

//     public Hand() {
//         this.hand = new ArrayList<>();
//     }

//     public void add(Card card) {
//         this.hand.add(card);
//     }

//     public void print(){
//         Iterator<Card> iterator = this.hand.iterator();

//         while (iterator.hasNext()) {
//             Card card = iterator.next();
//             System.out.println(card);
//         }
//     }

//     public void sort(){
//         Comparator<Card> comparator = Comparator.comparing(Card :: getValue).thenComparing(Card :: getSuit);
//         Collections.sort(hand, comparator);
//     }

//     @Override
//     public int compareTo(Hand handToCompare) {
//         int thisHandValue = 0;
// 		for (Card card : hand) {
// 			thisHandValue += card.getValue();
// 		}
// 		int compareHandValue = 0;
// 		for (Card card : handToCompare.hand) {
// 			compareHandValue += card.getValue();
// 		}
// //		if (thisHandValue == compareHandValue) {
// //
// //		}
// 		return thisHandValue - compareHandValue;
// 	}

// 	public void sortBySuit() {
// 		Collections.sort(hand, new BySuitInValueOrder());
// 	}
// }
    

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {
	private ArrayList<Card> hand;

	public Hand() {
		this.hand = new ArrayList<>();
	}

	public void add(Card card) {
		this.hand.add(card);
	}

	public void print() {
		Iterator<Card> iterator = hand.iterator();

		while(iterator.hasNext()) {
			Card nextCard = iterator.next();
			System.out.println(nextCard);
		}
	}

	public void sort() {
		Comparator<Card> comparator = Comparator
				.comparing(Card::getValue)
				.thenComparing(Card::getSuit);

		Collections.sort(hand, comparator);
	}

	@Override
	public int compareTo(Hand handToCompare) {
		int thisHandValue = 0;
		for (Card card : hand) {
			thisHandValue += card.getValue();
		}
		int compareHandValue = 0;
		for (Card card : handToCompare.hand) {
			compareHandValue += card.getValue();
		}
		return thisHandValue - compareHandValue;
	}

	public void sortBySuit() {
		Collections.sort(hand, new BySuitInValueOrder());
	}
}