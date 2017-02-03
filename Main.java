
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile rfile = new ReadFile("/Users/Janeth/Desktop/ReadFileJaneth.txt");
		ReadFileReverse rfiler = new ReadFileReverse("/Users/Janeth/Desktop/ReadFileJaneth.txt");
		
		rfile.open();
		rfile.read();
		rfile.show();
		
		
		System.out.println("REVERSE READ FILE ");
		
		rfiler.open();
		rfiler.read();
		rfiler.show();
	}

}
