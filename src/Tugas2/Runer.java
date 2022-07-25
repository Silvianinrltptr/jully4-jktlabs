package Tugas2;


public class Runer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Implementer implementer = new Implementer();
		
		try {
			implementer.penjumlahan(1, 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}
		
		try {
			implementer.pengurangan(5, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}
		
		try {
			implementer.perkalian(10, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}
		
		try {
			implementer.pembagian(3, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}

	}

}
