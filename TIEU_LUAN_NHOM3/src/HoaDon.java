import java.time.LocalDateTime;

public class HoaDon {
	int maHoaDon;
	LocalDateTime ngayHoaDon;
	String tenKhachHang;
	String maPhong;
	double donGia;
	LocalDateTime gioIn;
	LocalDateTime gioOut;

	HoaDon() {
		maHoaDon = 0;
		ngayHoaDon = null;
		tenKhachHang = null;
		maPhong = null;
		donGia = 0;
		gioIn = null;
		gioOut = null;

	}

	HoaDon(int _maHoaDon, LocalDateTime _ngayHoaDon, String _tenKhachHang, String _maPhong, double _donGia,
			LocalDateTime _gioIn, LocalDateTime _gioOut) {
		maHoaDon = _maHoaDon;
		ngayHoaDon = _ngayHoaDon;
		tenKhachHang = _tenKhachHang;
		donGia = _donGia;
		gioIn = _gioIn;
		gioOut = _gioOut;
		maPhong = _maPhong;

	}
	
	
}
