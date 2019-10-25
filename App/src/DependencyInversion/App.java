package DependencyInversion;

public class App {
	public static void main(String[] args) {
		Greeting g= new Greeting();
		g. greeting(new Enemy());
	}
}