
package infonpm;


public class InfoNPM {

    
    private final String npm;
    private final String tahun;
    private final String kodeFakultas;
    private final String kodeProdi;
    private final String namaProdi;
    private final String nomorUrut;

    public InfoNPM(String npm) {
   
        this.npm = npm;
        this.tahun = npm.substring(0, 2);
        this.kodeFakultas = npm.substring(2, 4);
        this.kodeProdi = npm.substring(4, 6);
        this.nomorUrut = npm.substring(6, 10);
        this.namaProdi = determineNamaProdi(this.kodeProdi);
    }

    private String determineNamaProdi(String kodeProdi) {
        switch (kodeProdi) {
            case "01":
                return "Teknik Informatika";
            case "02":
                return "Sistem Informasi";
            case "03":
                return "Teknik Elektro";
            // Tambahkan kode prodi lainnya sesuai kebutuhan
            default:
                return "Prodi Tidak Diketahui";
        }
    
    }
     
     
    public String getNpm() {
        return npm;
    }

    public String getTahun() {
        return tahun;
    }

    public String getKodeFakultas() {
        return kodeFakultas;
    }

    public String getKodeProdi() {
        return kodeProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public String getNomorUrut() {
        return nomorUrut;
    }

    @Override
    public String toString() {
        
        return "NPM: " + npm + "\n" +
               "Tahun: 20" + tahun + "\n" +
               "Kode Fakultas: " + kodeFakultas + "\n" +
               "Kode Prodi: " + kodeProdi + "\n" +
               "Nama Prodi: " + namaProdi + "\n" +
               "Nomor Urut: " + nomorUrut;
    }
}

