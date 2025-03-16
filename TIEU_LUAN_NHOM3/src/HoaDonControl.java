import java.io.PrintWriter;
import java.util.Scanner;

public class HoaDonControl {
	Scanner keyboard;
	PrintWriter out;
	HoaDonStorage storage;

	public HoaDonControl() {
		storage = new HoaDonStorage();
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
	}	
}
