package AbstracClassVaInterface.KeThua;

public class SinhVien extends Person{
    private int diem ;
    SinhVien(){}

    public SinhVien(int diem) {
        this.diem = diem;
    }

    public SinhVien(int ma, String ten, int tuoi, int diem) {
        super(ma, ten, tuoi);
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "sinhVien{"  +
                "diem=" + diem + " ma "+ getMa() + " ten " + getTen() + " tuoi "+ getTuoi() +
                '}';
    }
}
