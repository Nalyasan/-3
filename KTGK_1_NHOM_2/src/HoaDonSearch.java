
public class HoaDonSearch extends HoaDonControl {
	private int MaHD;

	public HoaDonSearch() {
		super();
	}

	public void TimHoaDon() {
		out.print("Chon loai hoa don muon tim \n[ 1 - HD Gio / 2 - HD Ngay] ");
		out.flush();
		int luaChon = keyboard.nextInt();

		if (luaChon != 1 && luaChon != 2) {
			out.println("Loai hoa don khong chinh xac");
			out.flush();

			return;
		}

		out.println("Nhap Ma Hoa Don:");
		out.flush();
		MaHD = keyboard.nextInt();
		keyboard.nextLine();

		if (luaChon == 1) {
			HoaDonTheoGio hoaDon = storage.TimHoaDonTheoGio(MaHD);
			if (hoaDon != null) {
				out.println("TIM thay hoa don");
				out.flush();
				out.println("Ma HD: " + hoaDon.maHoaDon);
				out.flush();
				out.println("Gia Tien: " + hoaDon.tinhGiaTien());
				out.flush();
				out.println("Ten Khach: " + hoaDon.tenKhachHang);
				out.flush();
			} else {
				out.println("KHONG Tim thay hoa don");
				out.flush();

			}
		} else if (luaChon == 2) {
			HoaDonTheoNgay hoaDon = storage.TimHoaDonTheoNgay(MaHD);
			if (hoaDon != null) {
				out.println("TIM thay hoa don");
				out.flush();
				out.println("Ma HD: " + hoaDon.maHoaDon);
				out.flush();
				out.println("Gia Tien: " + hoaDon.tinhGiaTien());
				out.flush();
				out.println("Ten Khach: " + hoaDon.tenKhachHang);
				out.flush();
			} else {
				out.println("KHONG Tim thay hoa don");
				out.flush();

			}
		}
	}

}