import java.io.PrintWriter;
import java.util.Scanner;

public class HoaDonMenu {
	PrintWriter out;
	Scanner in;
	String prompt;
	HoaDonInput hoadonInput;
	DSHoaDonControl dshoadonControl;
	HoaDonControl hoadonControl;

	HoaDonMenu() {
		out = new PrintWriter(System.out);
		in = new Scanner(System.in);
		prompt = "->";
		hoadonInput = new HoaDonInput();
		dshoadonControl = new DSHoaDonControl();
		hoadonControl = new HoaDonControl();

	}

	HoaDonMenu(PrintWriter _out, Scanner _in, String _prompt) {
		out = _out;
		in = _in;
		prompt = _prompt;
	}

	HoaDonMenu(PrintWriter _out, Scanner _in, String _prompt, HoaDonInput _hoadonInput) {
		this(_out, _in, _prompt);
		hoadonInput = _hoadonInput;
	}

	void controlLoop() {
		String command = " ";
		out.println("gõ lệnh \"help\" để được hỗ trợ!");
		out.flush();
		while (true) {
			out.print(prompt);
			out.flush();
			command = in.nextLine();

			command = command.trim();

			if ("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
			if ("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			if ("delete".equalsIgnoreCase(command)) {
				delete();
				continue;
			}
			if ("edit".equalsIgnoreCase(command)) {
				edit();
				continue;
			}
			if ("search".equalsIgnoreCase(command)) {
				search();
				continue;
			}
			if ("print".equalsIgnoreCase(command)) {
				print();
				continue;

			}
			if ("exit".equalsIgnoreCase(command)) {
				break;

			}
		}
	}

	void search() {
		HoaDonSearch hoaDonSearch = new HoaDonSearch();
		hoaDonSearch.TimHoaDon();
	}

	void edit() {
		HoaDonEdit hoadonEdit = new HoaDonEdit();
		hoadonEdit.Edit();
	}

	void print() {
		dshoadonControl.printDSHoaDon();
	}

	void delete() {
		HoaDonDelete hoaDonDelete = new HoaDonDelete();
		hoaDonDelete.XoaHoaDon();
	}

	void add() {
		hoadonInput.Input();
	}

	void help() {
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] hướng dẫn sử dụng phầm mềm");
		out.flush();
		out.println("[ADD] thêm mới thông tin hóa đơn");
		out.flush();
		out.println("[DELETE] xóa thông tin hóa đơn");
		out.flush();
		out.println("[EDIT]chỉnh sửa thông tin hóa đơn");
		out.flush();
		out.println("[SEARCH] tìm kiếm thông tin hóa đơn");
		out.flush();
		out.println("[PRINT] in tất cả hóa đơn");
		out.flush();
		out.println("[EXIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
	}
}
