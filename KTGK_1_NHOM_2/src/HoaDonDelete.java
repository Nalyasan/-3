
public class HoaDonDelete extends HoaDonControl {
	private int MaHD;

	public HoaDonDelete() {
		super();
	}

	public void XoaHoaDon() {
		out.print("Chon loai hoa don muon xoa \n[ 1 - HD Gio / 2 - HD Ngay] ");
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
			storage.deleteHoaDonTheoGio(MaHD);
		} else if (luaChon == 2) {
			storage.deleteHoaDonTheoGio(MaHD);
		}
	}

}