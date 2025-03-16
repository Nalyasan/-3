import java.io.PrintWriter;
import java.util.ArrayList;

public class DSHoaDonOutput {
	PrintWriter out;

	DSHoaDonOutput() {
		out = new PrintWriter(System.out);

	}

	void output(ArrayList<HoaDonTheoGio> dsGio, ArrayList<HoaDonTheoNgay> dsNgay) {

		for (HoaDonTheoGio hdGio : dsGio) {
			out.println("MA HD:" + hdGio.maHoaDon);
			out.flush();

		}
		for (HoaDonTheoNgay hdNgay : dsNgay) {
			out.println("MA HD:" + hdNgay.maHoaDon);
			out.flush();

		}
	}
}