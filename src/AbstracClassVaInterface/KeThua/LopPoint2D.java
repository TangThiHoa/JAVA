package AbstracClassVaInterface.KeThua;

public class LopPoint2D {
    private float x = 0.0f ;
    private float y = 0.0f ;
    public  LopPoint2D () {
    }
    public LopPoint2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x ,float y ){
        this.x = x;
        this.y = y;
    }
    public float [] getXY () {
//        return new float[2];
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
//        return new float[]{x,y};

//    }
        //    public static void main(String[] args) {
//
//
//    }


    @Override
    public String toString() {
        return "LopPoint2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class LopPoint3D extends LopPoint2D {
    private float z = 0.0f ;

    public LopPoint3D(float z) {
        this.z = z;
    }

    public LopPoint3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    LopPoint3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float getXYZ (float x ,float y , float z ){
       super.setXY(x,y);
        this.z=z;
        return z ;
    }


    @Override
    public String toString() {
        return "LopPoint3D{" +
                " z= " + z + " x= " + getX()+  " y= "+ getY()+
                '}';
    }
}
class tus {
    public static void main(String[] args) {
        LopPoint3D hi = new LopPoint3D(2,3,12);
        System.out.println(hi);
    }
}

