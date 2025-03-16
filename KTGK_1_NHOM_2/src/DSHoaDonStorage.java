import java.util.ArrayList;

public class DSHoaDonStorage {
	public DSHoaDonStorage() {

	}

	ArrayList<HoaDonTheoGio> getDSHoaDonGio() {
		return MemoryHoaDonDB.getDSHoaDonTheoGio();

	}

	ArrayList<HoaDonTheoNgay> getDSHoaDonNgay() {
		return MemoryHoaDonDB.getDSHoaDonTheoNgay();
	}

}