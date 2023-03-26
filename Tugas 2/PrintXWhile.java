// NAMA : RIRIN ASTIANI
// NIM : 13020210132
// HARI/TGL/WAKTU : JUMAT,17-MARET-2023 14.10



import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {

     /**
	* @param args
	*/ 
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus : */
		int Sum;
		int x;
		Scanner masukan=new Scanner(System.in);
		/* Program */
		Sum = 0; /* Inisialisasi */

		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();/* First Elmt*/
		while (x != 999) /* Kondisi berhenti */ { 
			Sum = Sum + x; /* Proses */
			System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt();/* First Elmt*/
		}	
		System.out.println("Hasil penjumlahan = "+ Sum); /* 
Terminasi */
	}

} 