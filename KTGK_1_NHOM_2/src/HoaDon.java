import java.time.LocalDateTime;

public class HoaDon {
	int maHoaDon;
	LocalDateTime ngayHoaDon;
	String tenKhachHang;
	String maPhong;
	double donGia;
	LocalDateTime gioIn;
	LocalDateTime gioOut;
	double thang;

	HoaDon() {
		maHoaDon = 0;
		ngayHoaDon = null;
		tenKhachHang = null;
		maPhong = null;
		donGia = 0;
		gioIn = null;
		gioOut = null;
		thang = 0;

	}

	HoaDon(int _maHoaDon, LocalDateTime _ngayHoaDon, String _tenKhachHang, String _maPhong, double _donGia,
			LocalDateTime _gioIn, LocalDateTime _gioOut,double _thang) {
		maHoaDon = _maHoaDon;
		ngayHoaDon = _ngayHoaDon;
		tenKhachHang = _tenKhachHang;
		donGia = _donGia;
		gioIn = _gioIn;
		gioOut = _gioOut;
		maPhong = _maPhong;
		thang = _thang;
	}
	double tinhHoaDon() {
		return 0;
	}
	double thang() {
        return thang;
	}
}