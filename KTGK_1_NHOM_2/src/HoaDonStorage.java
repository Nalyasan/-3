import java.util.ArrayList;
import java.util.List;

public class HoaDonStorage {

	HoaDonStorage() {

	}

	void insertHoaDonTheoGio(HoaDonTheoGio hd) {

		MemoryHoaDonDB.addHoaDonTheoGio(hd);
	}

	void insertHoaDonTheoNgay(HoaDonTheoNgay hd) {
		MemoryHoaDonDB.addHoaDonTheoNgay(hd);
	}

	void editHoaDonTheoGio(HoaDonTheoGio hd) {

		MemoryHoaDonDB.EditHoaDonTheoGio(hd);
	}

	void editHoaDonTheoNgay(HoaDonTheoNgay hd) {
		MemoryHoaDonDB.EditHoaDonTheoNgay(hd);
	}
	
	void deleteHoaDonTheoNgay(int maHD) {
		MemoryHoaDonDB.DeleteHoaDonTheoNgay(maHD);
	}

	void deleteHoaDonTheoGio(int maHD) {
		MemoryHoaDonDB.DeleteHoaDonTheoGio(maHD);
	}
	
	HoaDonTheoNgay TimHoaDonTheoNgay(int maHD) {
		return MemoryHoaDonDB.getHoaDonNgayTheoMaHD(maHD);
	}
	
	HoaDonTheoGio TimHoaDonTheoGio(int maHD) {
		return MemoryHoaDonDB.getHoaDonGioTheoMaHD(maHD);
	}
	List<HoaDon> hoaDon = new ArrayList<HoaDon>();
	void addHoaDon (HoaDon hoaDon) {
		this.hoaDon.add(hoaDon);
	}
	List<HoaDon> layDSHoaDon(){
	return hoaDon;	
	}
	
}

