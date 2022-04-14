package AbstracClassVaInterface.KeThua;

public class QuanLuSv implements QuanLu<SinhVien>{
    private SinhVien[]danhsach=new SinhVien[3];
    private int size = 0;
    private String name = "Hoa";
    @Override
    public void them(SinhVien sv) {
        danhsach[size]=sv;
        size++;

    }

    @Override
    public void sua(String name, SinhVien sv ) {
        danhsach[timkiem(name)]= sv;

    }

    @Override
    public void hienthi() {
        for (int i=0 ; i<size;i++){
            System.out.println(danhsach[i]);
        }

    }

    @Override
    public int timkiem(String name) {
        for (int i=0;i<size;i++){
            if (name==danhsach[i].getTen());
            return i;
        }
        return -1 ;
    }

    public static void main(String[] args) {
        QuanLuSv ql = new QuanLuSv();
        SinhVien sv1 = new SinhVien(2000,"hoa",20,234);
        SinhVien sv2 = new SinhVien(2003,"huong",27,301);
        SinhVien sv3 = new SinhVien(2006,"huy",25,408);
        ql.them(sv1);
        ql.them(sv2);
        ql.them(sv3);
        ql.hienthi();
        ql.timkiem("huong");
        ql.hienthi();
        ql.sua("nanh",sv2);
        ql.hienthi();

    }
}
