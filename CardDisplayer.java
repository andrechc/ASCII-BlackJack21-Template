
public class CardDisplayer {
	//a
	private final String aceHeart1 = " _____ ";
	private final String aceHeart2 = "|A    |";
	private final String aceHeart3 = "|     |";
	private final String aceHeart4 = "|  ♥  |";
	private final String aceHeart5 = "|     |";
	private final String aceHeart6 = "|____V|";
	//k
	private final String kingHeart1 = " _____ ";
	private final String kingHeart2 = "|K    |";
	private final String kingHeart3 = "|     |";
	private final String kingHeart4 = "|  ♥  |";
	private final String kingHeart5 = "|     |";
	private final String kingHeart6 = "|___>l|";
	//q
	private final String queenHeart1 = " _____ ";
	private final String queenHeart2 = "|Q    |";
	private final String queenHeart3 = "|     |";
	private final String queenHeart4 = "|  ♥  |";
	private final String queenHeart5 = "|     |";
	private final String queenHeart6 = "|___´O|";
	//j
	private final String jackHeart1 = " _____ ";
	private final String jackHeart2 = "|J    |";
	private final String jackHeart3 = "|     |";
	private final String jackHeart4 = "|  ♥  |";
	private final String jackHeart5 = "|     |";
	private final String jackHeart6 = "|____[|";
	// 2
	private final String two1 = " _____ ";
	private final String two2 = "|2    |";
	private final String two3 = "|  o  |";
	private final String two4 = "|     |";
	private final String two5 = "|  o  |";
	private final String two6 = "|____Z|";
	// 3
	private final String three1 = " _____ ";
	private final String three2 = "|3    |";
	private final String three3 = "| o o |";
	private final String three4 = "|     |";
	private final String three5 = "|  o  |";
	private final String three6 = "|____E|";
	// 4
	private final String four1 = " _____ ";
	private final String four2 = "|4    |";
	private final String four3 = "| o o |";
	private final String four4 = "|     |";
	private final String four5 = "| o o |";
	private final String four6 = "|____h|";
	// 5
	private final String five1 = " _____ ";
	private final String five2 = "|5    |";
	private final String five3 = "| o o |";
	private final String five4 = "|  o  |";
	private final String five5 = "| o o |";
	private final String five6 = "|____S|";
	// 6
	private final String six1 = " _____ ";
	private final String six2 = "|6    |";
	private final String six3 = "| o o |";
	private final String six4 = "| o o |";
	private final String six5 = "| o o |";
	private final String six6 = "|____9|";
	// 7
	private final String seven1 = " _____ ";
	private final String seven2 = "|7    |";
	private final String seven3 = "| o o |";
	private final String seven4 = "|o o o|";
	private final String seven5 = "| o o |";
	private final String seven6 = "|____L|";
	// 8
	private final String eight1 = " _____ ";
	private final String eight2 = "|8    |";
	private final String eight3 = "|o o o|";
	private final String eight4 = "| o o |";
	private final String eight5 = "|o o o|";
	private final String eight6 = "|____8|";
	// 9
	private final String nine1 = " _____ ";
	private final String nine2 = "|9    |";
	private final String nine3 = "|o o o|";
	private final String nine4 = "|o o o|";
	private final String nine5 = "|o o o|";
	private final String nine6 = "|____6|";
	// 0
	private final String ten1 = " _____ ";
	private final String ten2 = "|10 o |";
	private final String ten3 = "|o o o|";
	private final String ten4 = "|o o o|";
	private final String ten5 = "|o o o|";
	private final String ten6 = "|___I0|";
	// Hidden card.
	private final String hiden1 = " _____ ";
	private final String hiden2 = "|/////|";
	private final String hiden3 = "|/////|";
	private final String hiden4 = "|/////|";
	private final String hiden5 = "|/////|";
	private final String hiden6 = "|_____|";

	public String generator(String word) {
	
		String floor1 = "";
		String floor2 = "";
		String floor3 = "";
		String floor4 = "";
		String floor5 = "";
		String floor6 = "";

		for (int i = 0; i < word.length(); i++) {
			floor1 += cardConverter1(word.charAt(i));
		}
		for (int i = 0; i < word.length(); i++) {
			floor2 += cardConverter2(word.charAt(i));
		}
		for (int i = 0; i < word.length(); i++) {
			floor3 += cardConverter3(word.charAt(i));
		}
		for (int i = 0; i < word.length(); i++) {
			floor4 += cardConverter4(word.charAt(i));
		}
		for (int i = 0; i < word.length(); i++) {
			floor5 += cardConverter5(word.charAt(i));
		}
		for (int i = 0; i < word.length(); i++) {
			floor6 += cardConverter6(word.charAt(i));
		}

		String devolucion = floor1 + "\n" + floor2 + "\n" + floor3 + "\n" + floor4 + "\n" + floor5 + "\n" + floor6 + "\n";
		return devolucion;
	}


	

	private String cardConverter1(char carta) { // 1/6
		String diseno = "";
		switch (carta) {
		case 'a':
			diseno = aceHeart1;
			break;
		case 'k':
			diseno = kingHeart1;
			break;
		case 'q':
			diseno = queenHeart1;
			break;
		case 'j':
			diseno = jackHeart1;
			break;
		case '2':
			diseno = two1;
			break;
		case '3':
			diseno = three1;
			break;
		case '4':
			diseno = four1;
			break;
		case '5':
			diseno = five1;
			break;
		case '6':
			diseno = six1;
			break;
		case '7':
			diseno = seven1;
			break;
		case '8':
			diseno = eight1;
			break;
		case '9':
			diseno = nine1;
			break;
		case '0':
			diseno = ten1;
			break;
		case 'r':
			diseno = hiden1;
			break;
		}
		return diseno;
	}

	private String cardConverter2(char carta) {
		String diseno = "";
		switch (carta) {
		case 'a':
			diseno = aceHeart2;
			break;
		case 'k':
			diseno = kingHeart2;
			break;
		case 'q':
			diseno = queenHeart2;
			break;
		case 'j':
			diseno = jackHeart2;
			break;
		case '2':
			diseno = two2;
			break;
		case '3':
			diseno = three2;
			break;
		case '4':
			diseno = four2;
			break;
		case '5':
			diseno = five2;
			break;
		case '6':
			diseno = six2;
			break;
		case '7':
			diseno = seven2;
			break;
		case '8':
			diseno = eight2;
			break;
		case '9':
			diseno = nine2;
			break;
		case '0':
			diseno = ten2;
			break;
		case 'r':
			diseno = hiden2;
			break;
		}
		return diseno;
	}

	private String cardConverter3(char carta) { // 3/6
		String diseno = "";
		switch (carta) {
		case 'a':
			diseno = aceHeart3;
			break;
		case 'k':
			diseno = kingHeart3;
			break;
		case 'q':
			diseno = queenHeart3;
			break;
		case 'j':
			diseno = jackHeart3;
			break;
		case '2':
			diseno = two3;
			break;
		case '3':
			diseno = three3;
			break;
		case '4':
			diseno = four3;
			break;
		case '5':
			diseno = five3;
			break;
		case '6':
			diseno = six3;
			break;
		case '7':
			diseno = seven3;
			break;
		case '8':
			diseno = eight3;
			break;
		case '9':
			diseno = nine3;
			break;
		case '0':
			diseno = ten3;
			break;
		case 'r':
			diseno = hiden3;
			break;
		}
		return diseno;
	}

	private String cardConverter4(char carta) { // 4/6
		String diseno = "";
		switch (carta) {
		case 'a':
			diseno = aceHeart4;
			break;
		case 'k':
			diseno = kingHeart4;
			break;
		case 'q':
			diseno = queenHeart4;
			break;
		case 'j':
			diseno = jackHeart4;
			break;
		case '2':
			diseno = two4;
			break;
		case '3':
			diseno = three4;
			break;
		case '4':
			diseno = four4;
			break;
		case '5':
			diseno = five4;
			break;
		case '6':
			diseno = six4;
			break;
		case '7':
			diseno = seven4;
			break;
		case '8':
			diseno = eight4;
			break;
		case '9':
			diseno = nine4;
			break;
		case '0':
			diseno = ten4;	
		case 'r':
			diseno = hiden4;
			break;
		}
		return diseno;
	}

	private String cardConverter5(char carta) { // 5/6
		String diseno = "";
		switch (carta) {
		case 'a':
			diseno = aceHeart5;
			break;
		case 'k':
			diseno = kingHeart5;
			break;
		case 'q':
			diseno = queenHeart5;
			break;
		case 'j':
			diseno = jackHeart5;
			break;
		case '2':
			diseno = two5;
			break;
		case '3':
			diseno = three5;
			break;
		case '4':
			diseno = four5;
			break;
		case '5':
			diseno = five5;
			break;
		case '6':
			diseno = six5;
			break;
		case '7':
			diseno = seven5;
			break;
		case '8':
			diseno = eight5;
			break;
		case '9':
			diseno = nine5;
			break;
		case '0':
			diseno = ten5;
			break;
		case 'r':
			diseno = hiden5;
			break;
		}
		return diseno;
	}

	private String cardConverter6(char carta) { // 6/6
		String diseno = "";
		switch (carta) {
		case 'a':
			diseno = aceHeart6;
			break;
		case 'k':
			diseno = kingHeart6;
			break;
		case 'q':
			diseno = queenHeart6;
			break;
		case 'j':
			diseno = jackHeart6;
			break;
		case '2':
			diseno = two6;
			break;
		case '3':
			diseno = three6;
			break;
		case '4':
			diseno = four6;
			break;
		case '5':
			diseno = five6;
			break;
		case '6':
			diseno = six6;
			break;
		case '7':
			diseno = seven6;
			break;
		case '8':
			diseno = eight6;
			break;
		case '9':
			diseno = nine6;
			break;
		case '0':
			diseno = ten6;
			break;
		case 'r':
			diseno = hiden6;
			break;
		}
		return diseno;
	}
}
