public class HoaDonEdit extends HoaDonControl {

	public HoaDonEdit() {
		super();
	}

	void Edit() {
		// Nhap thong tin co ban cua hoa don
		int maHD;
		String hoTenKH;
		String maPhong;
		double donGia;

		out.print("Chon loai hoa don muon sua \n[ 1 - HD Gio / 2 - HD Ngay] ");
		out.flush();
		int luaChon = keyboard.nextInt();

		if (luaChon != 1 && luaChon != 2) {
			out.println("Loai hoa don khong chinh xac");
			return;
		}

		out.println("Nhap Ma Hoa Don:");
		out.flush();
		maHD = keyboard.nextInt();
		keyboard.nextLine();

		if (luaChon == 1) {
			HoaDonTheoGio hoaDon = storage.TimHoaDonTheoGio(maHD);
			if (hoaDon != null) {
				out.println("Nhap Thong Tin Cap Nhat (bo trong neu khong thay doi)");
				out.flush();

				out.println("Nhap Ho Ten Khach Hang:");
				out.flush();
				hoTenKH = keyboard.nextLine();
				if (hoTenKH != null && !hoTenKH.isEmpty()) {
					hoaDon.tenKhachHang = hoTenKH;
				}

				out.println("Nhap Ma Phong:");
				out.flush();
				maPhong = keyboard.nextLine();
				if (maPhong != null && !maPhong.isEmpty()) {
					hoaDon.maPhong = maPhong;
				}

				// tao hoa don theo gio
				out.println("Nhap Don Gia Theo Gio (nhap -1.00 neu khong thay doi)");
				out.flush();
				donGia = keyboard.nextDouble();
				if (donGia > 0) {
					hoaDon.donGia = donGia;
				}
				storage.editHoaDonTheoGio(hoaDon);
			} else {
				out.println("KHONG Tim thay hoa don");
				out.flush();

			}
		} else if (luaChon == 2) {
			HoaDonTheoNgay hoaDon = storage.TimHoaDonTheoNgay(maHD);
			if (hoaDon != null) {
				out.println("Nhap Thong Tin Cap Nhat (bo trong neu khong thay doi)");
				out.flush();

				out.println("Nhap Ho Ten Khach Hang:");
				out.flush();
				hoTenKH = keyboard.nextLine();
				if (hoTenKH != null && !hoTenKH.isEmpty()) {
					hoaDon.tenKhachHang = hoTenKH;
				}

				out.println("Nhap Ma Phong:");
				out.flush();
				maPhong = keyboard.nextLine();
				if (maPhong != null && !maPhong.isEmpty()) {
					hoaDon.maPhong = maPhong;
				}

				// tao hoa don theo gio
				out.println("Nhap Don Gia Theo Ngay (nhap -1.00 neu khong thay doi)");
				out.flush();
				donGia = keyboard.nextDouble();
				if (donGia > 0) {
					hoaDon.donGia = donGia;
				}
				storage.editHoaDonTheoNgay(hoaDon);
			} else {
				out.println("KHONG Tim thay hoa don");
				out.flush();

			}
		}
	}
}
