
package javaapplication;

/**
 *
 * @author Danish Shafiqa
 */
public class JavaApplication {

    
    public static void main(String[] args) {
        Member member;
        member = new Member(){};
        Barang barang = new Barang();
        Laporan laporan = new Laporan();
        Transaksi transaksi = new Transaksi();
        
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        
        
    }
    
}
