package Numberconverter;

public class Tens {
	private String Ty(int No) {
		String word="";
		switch(No) {
		case 20: word="twenty"; break;
		case 30: word="thirty"; break;
		case 40: word="fourty"; break;
		case 50: word="fifty"; break;
		case 60: word="sixty"; break;
		case 70: word="seventy"; break;
		case 80: word="eighty"; break;
		case 90: word="ninety"; break;
		}
	return word;
	}
}