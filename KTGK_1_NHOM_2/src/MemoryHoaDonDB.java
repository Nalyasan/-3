import java.util.ArrayList;

public class MemoryHoaDonDB {
	private static ArrayList<HoaDonTheoGio> databaseTheoGio = new ArrayList<HoaDonTheoGio>();
	private static ArrayList<HoaDonTheoNgay> databaseTheoNgay = new ArrayList<HoaDonTheoNgay>();

	public static void addHoaDonTheoGio(HoaDonTheoGio hd) {
		databaseTheoGio.add(hd);

	}

	public static void addHoaDonTheoNgay(HoaDonTheoNgay hd) {
		databaseTheoNgay.add(hd);
	}

	public static ArrayList<HoaDonTheoGio> getDSHoaDonTheoGio() {
		return databaseTheoGio;
	}

	public static ArrayList<HoaDonTheoNgay> getDSHoaDonTheoNgay() {
		return databaseTheoNgay;
	}

	public static HoaDonTheoGio getHoaDonGioTheoMaHD(int maHD) {
		for (HoaDonTheoGio hoaDon : databaseTheoGio) {
			if (hoaDon.maHoaDon == maHD) {
				return hoaDon;
			}
		}
		return null;
	}

	public static HoaDonTheoNgay getHoaDonNgayTheoMaHD(int maHD) {
		for (HoaDonTheoNgay hoaDon : databaseTheoNgay) {
			if (hoaDon.maHoaDon == maHD) {
				return hoaDon;
			}
		}
		return null;
	}

	public static void DeleteHoaDonTheoNgay(int maHD) {
		HoaDonTheoNgay hoaDon = getHoaDonNgayTheoMaHD(maHD);
		databaseTheoNgay.remove(hoaDon);
	}

	public static void DeleteHoaDonTheoGio(int maHD) {
		HoaDonTheoGio hoaDon = getHoaDonGioTheoMaHD(maHD);
		databaseTheoGio.remove(hoaDon);
	}

	public static void EditHoaDonTheoNgay(HoaDonTheoNgay hoaDonTheoNgay) {
		HoaDonTheoNgay hoaDon = getHoaDonNgayTheoMaHD(hoaDonTheoNgay.maHoaDon);
		if (hoaDon != null) {
			hoaDon.gioIn = hoaDonTheoNgay.gioIn;
			hoaDon.gioOut = hoaDonTheoNgay.gioOut;
			hoaDon.tenKhachHang = hoaDonTheoNgay.tenKhachHang;
		}
	}

	public static void EditHoaDonTheoGio(HoaDonTheoGio hoaDonTheoGio) {
		HoaDonTheoGio hoaDon = getHoaDonGioTheoMaHD(hoaDonTheoGio.maHoaDon);
		if (hoaDon != null) {
			hoaDon.gioIn = hoaDonTheoGio.gioIn;
			hoaDon.gioOut = hoaDonTheoGio.gioOut;
			hoaDon.tenKhachHang = hoaDonTheoGio.tenKhachHang;
		}
	}

}