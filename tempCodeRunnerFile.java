public class Nasabah {
    private int idNasabah;
    private String nama;
    private String alamat;
    private String noTelp;

    public Nasabah(int idNasabah, String nama, String alamat, String noTelp) {
        this.idNasabah = idNasabah;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public int getIdNasabah() {
        return idNasabah;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }
}
