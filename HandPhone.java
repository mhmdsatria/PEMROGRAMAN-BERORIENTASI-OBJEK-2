/**
 *
 * @author MuhamadSatria
 */
public class HandPhone {
    private String jenisHp; 
    private int tahunPembuatan;

    public void setDataHP(String jenis, int tahun) {
        jenisHp = jenis; 
        tahunPembuatan = tahun;
    }

    public String getJenisHP() {
        return jenisHp;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Smartphone", 2022);
        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}
