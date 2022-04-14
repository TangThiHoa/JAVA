package AbstracClassVaInterface;

import java.sql.Array;
import java.util.Arrays;

public class QliXeMay implements QuanLi<XeMAY> {
    private XeMAY[] danhsach = new XeMAY[2];
    public int size = 0;
    public String xe = "Audi";


    @Override
    public void them(XeMAY xeMAY) {
        danhsach[size] = xeMAY;
        size++;

    }

    @Override
    public void sua(String name, XeMAY xeMAY) {
        danhsach[timkiem(name)] = xeMAY;

    }

    @Override
    public void xoa(String name) {


    }

    @Override
    public int timkiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhsach[i].getName()) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public void sapxep() {
        Arrays.sort(danhsach);


    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhsach[i]);
        }
    }

    public static void main(String[] args) {
        QliXeMay ql = new QliXeMay();
        XeMAY xm1 = new XeMAY("yamaha", "pink", "r6", 13, 234);
        XeMAY xm2 = new XeMAY("yama", "red", "r8", 33, 204);
        ql.them(xm1);
        ql.them(xm2);
        XeMAY xm3 = new XeMAY("yamano", "red", "r1", 33, 704);

        ql.sua("r6", xm3);
        ql.sapxep();
        ql.print();


    }

}


