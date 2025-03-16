import java.util.ArrayList;

public class DSHoaDonControl {
	DSHoaDonStorage dsHoaDonStorage;
	DSHoaDonOutput dsHoaDonOutput;

	DSHoaDonControl() {
		dsHoaDonStorage = new DSHoaDonStorage();
		dsHoaDonOutput = new DSHoaDonOutput();

	}

	void printDSHoaDon() {
		ArrayList<HoaDonTheoGio> dsHoaDonGio;
		ArrayList<HoaDonTheoNgay> dsHoaDonNgay;
		dsHoaDonGio = dsHoaDonStorage.getDSHoaDonGio();
		dsHoaDonNgay = dsHoaDonStorage.getDSHoaDonNgay();

		dsHoaDonOutput.output(dsHoaDonGio, dsHoaDonNgay);
	}
}
