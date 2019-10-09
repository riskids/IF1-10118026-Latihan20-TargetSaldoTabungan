/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: menghitung bunga saldo tabungan sampai target saldo
 */
public class IF110118026Latihan20TargetSaldoTabungan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		double saldoAwal = 3500000,
                       saldoTarget = 6000000, 
                       saldoSekarang = saldoAwal,  
                       bunga = 0.08;
                
		int bulan = 1;
                
		do {
			saldoSekarang += saldoSekarang * bunga; 
			System.out.printf("Saldo di bulan ke-%d Rp. %.0f\n", bulan, saldoSekarang);
			//System.out.println("Saldo di bulan ke-" + bulanKe + " Rp. " + saldoSekarang);
			bulan++;
		} while (saldoSekarang < saldoTarget);

	}
	
}
