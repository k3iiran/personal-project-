
public class Arrayhighestnumber {
	public static void main(String[] args) {
	int numbers[]= {15,38,26,84,90,17};
	int i;
	int maxvalue=numbers[0];
	for(i=1;i<numbers.length;i++);
		if(numbers[i]>maxvalue) {
			maxvalue=numbers[i];
		}
	System.out.println(maxvalue);
	}
}