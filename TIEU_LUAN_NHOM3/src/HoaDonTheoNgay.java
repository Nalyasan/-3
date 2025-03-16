import java.time.LocalDateTime;

public class HoaDonTheoNgay extends HoaDon {
	int soNgayThue;

	HoaDonTheoNgay() {
		maHoaDon = 0;
		ngayHoaDon = null;
		tenKhachHang = null;
		maPhong = null;
		donGia = 0;
		gioIn = null;
		gioOut = null;
		soNgayThue = 0;

	}

	HoaDonTheoNgay(int _maHoaDon, LocalDateTime _ngayHoaDon, String _tenKhachHang, String _maPhong, double _donGia,
			LocalDateTime _gioIn, LocalDateTime _gioOut, int _soNgayThue) {
		super(_maHoaDon, _ngayHoaDon, _tenKhachHang, _maPhong, _donGia, _gioIn, _gioOut);
		soNgayThue = _soNgayThue;
	}

	double tinhGiaTien() {
		double soTien = soNgayThue * donGia;
		if (soNgayThue > 7) {
			soTien = soTien * 80 / 100;
		}
		return soTien;
	}
}
