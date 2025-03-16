import java.io.PrintWriter;
import java.util.Scanner;

public class HoaDonControl extends HoaDonStorage {
	Scanner keyboard;
	PrintWriter out;
	HoaDonStorage storage;

	public HoaDonControl() {
		storage = new HoaDonStorage();
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
	}
	int demHoaDon() {
		return storage.layDSHoaDon().size();
	}
	double tongSoTienHoaDon() {
	        double tong = 0;
	        for (HoaDon hd : storage.layDSHoaDon()) {
	        	tong+=hd.tinhHoaDon();
	        }
	        return tong;
}
double tinhTrungBinhHoaDon(int thangCanTinh) {
	 double tongTien = 0;
     int count = 0;

     for (HoaDon hd : hoaDon) {
         if (hd.thang() == thangCanTinh) {
             tongTien += hd.tinhHoaDon();
             count++;
         }
     }

     double trungBinh = (count > 0) ? (tongTien / count) : 0;
	return trungBinh;

}
}
