package AbstracClassVaInterface;

public class Oto extends PhuongTien{
    private double soCho ;

    Oto(){
    }

    public Oto(double soCho) {
        this.soCho = soCho;
    }

    public Oto(String hang, String color, String name, int price, double soCho) {
        super(hang, color, name, price);
        this.soCho = soCho;
    }

    public double getSoCho() {
        return soCho;
    }

    public void setSoCho(double soCho) {
        this.soCho = soCho;
    }
}
