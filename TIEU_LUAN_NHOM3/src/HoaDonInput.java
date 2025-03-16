import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HoaDonInput extends HoaDonControl {

	public HoaDonInput() {
		super();
	}

	void Input() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime HoaDonCheckedIndateTime = null;

		while (HoaDonCheckedIndateTime == null) { // Keep asking until valid input
			System.out.println("Nhap ngay gio nhan phong theo format in format (dd-MM-yyyy HH:mm): ");
			String input = keyboard.nextLine();

			try {
				HoaDonCheckedIndateTime = LocalDateTime.parse(input, formatter);
			} catch (DateTimeParseException e) {
				System.out.println("Khong dung dinh dang. Vui long nhap lai.");
			}
		}

		LocalDateTime HoaDonCheckedOutdateTime = null;

		while (HoaDonCheckedOutdateTime == null) { // Keep asking until valid input
			System.out.println("Nhap ngay gio tra phong theo format in format (dd-MM-yyyy HH:mm): ");
			String input = keyboard.nextLine();

			try {
				HoaDonCheckedOutdateTime = LocalDateTime.parse(input, formatter);
			} catch (DateTimeParseException e) {
				System.out.println("Khong dung dinh dang. Vui long nhap lai.");
			}
		}

		// Nhap thong tin co ban cua hoa don
		int maHD;
		String hoTenKH;
		String maPhong;
		double donGia;

		out.println("Nhap Ma Hoa Don:");
		out.flush();
		maHD = keyboard.nextInt();
		keyboard.nextLine();
		// nhap ho ten khach

		out.println("Nhap Ho Ten Khach Hang:");
		out.flush();
		hoTenKH = keyboard.nextLine();

		out.println("Nhap Ma Phong:");
		out.flush();
		maPhong = keyboard.nextLine();

		// Tinh do chenh lech
		Duration duration = Duration.between(HoaDonCheckedIndateTime, HoaDonCheckedOutdateTime);
		int hours = (int) duration.toHours(); // Get total hours

		if (hours >= 24 && hours <= 30) {
			hours = 24;
		}

		if (hours <= 24) {
			// tao hoa don theo gio
			out.println("Nhap Don Gia Theo Gio");
			out.flush();
			donGia = keyboard.nextDouble();

			HoaDonTheoGio hoaDon = new HoaDonTheoGio(maHD, LocalDateTime.now(), hoTenKH, maPhong, donGia,
					HoaDonCheckedIndateTime, HoaDonCheckedOutdateTime, hours);
			storage.insertHoaDonTheoGio(hoaDon);
		} else {
			// tao hoa don theo ngay
			int ngay = (int) (hours / 24);
			out.println("Nhap Don Gia Theo Ngay");
			out.flush();
			donGia = keyboard.nextDouble();

			HoaDonTheoNgay hoaDon = new HoaDonTheoNgay(maHD, LocalDateTime.now(), hoTenKH, maPhong, donGia,
					HoaDonCheckedIndateTime, HoaDonCheckedOutdateTime, ngay);
			storage.insertHoaDonTheoNgay(hoaDon);

		}
	}
}
