import java.time.LocalDateTime;

public class HoaDonTheoGio extends HoaDon {

	int soGioThue;

	HoaDonTheoGio() {
		maHoaDon = 0;
		ngayHoaDon = null;
		tenKhachHang = null;
		maPhong = null;
		donGia = 0;
		gioIn = null;
		gioOut = null;
		soGioThue = 0;

	}

	HoaDonTheoGio(int _maHoaDon, LocalDateTime _ngayHoaDon, String _tenKhachHang, String _maPhong, double _donGia,
			LocalDateTime _gioIn, LocalDateTime _gioOut, int _soGioThue) {
		super(_maHoaDon, _ngayHoaDon, _tenKhachHang, _maPhong, _donGia, _gioIn, _gioOut);
		soGioThue = _soGioThue;
	}

	double tinhGiaTien() {
		return soGioThue * donGia;
	}
}