import java.io.PrintWriter;

public class HoaDonOutput {
	PrintWriter out;
	HoaDonOutput() {
		out = new PrintWriter(System.out);
	}
	HoaDonOutput(PrintWriter _out){
		out=_out;
	}
	void output(HoaDon hoaDon) {
        out.println("Mã hóa đơn: " );
        out.println("Thành tiền: " + hoaDon.tinhHoaDon());
    }

    // Phương thức xuất danh sách hóa đơn
    public void outputDanhSachHoaDon(HoaDonStorage storage) {
        for (HoaDon hd : storage.layDSHoaDon()) {
            output(hd);
	}
}
}