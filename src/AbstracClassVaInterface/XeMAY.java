package AbstracClassVaInterface;

public class XeMAY extends  PhuongTien implements Comparable<XeMAY>{
    private int dTich;

    XeMAY(String yamaha) {
    }

    public XeMAY(int dTich) {
        this.dTich = dTich;
    }

    public XeMAY(String hang, String color, String name, int price, int dTich) {
        super(hang, color, name, price);
        this.dTich = dTich;
    }

    public int getdTich() {
        return dTich;
    }

    public void setdTich(int dTich) {
        this.dTich = dTich;
    }

    @Override
    public String toString() {
        return "XeMAY = {" +
                " Hang " + getHang() + " Mau " + getColor() + " Gia " + getPrice() + " Dungtich " + getdTich() +
                '}';
    }

    @Override
    public int compareTo(XeMAY o) {
        return this.getPrice()- o.getPrice();
    }
}