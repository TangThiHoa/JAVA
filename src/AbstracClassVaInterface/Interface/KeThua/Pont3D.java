package AbstracClassVaInterface.Interface.KeThua;

public class Pont3D extends Point2D{
    private float z=0.0f;

    public Pont3D(float z) {
        this.z = z;
    }

    public Pont3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float [] getXYZ(float x , float y ,float z) {
        super.getXY();
        this.z = z;
        return new float[0];
    }

    @Override
    public String toString() {
        return "Pont3D{" +
                "z=" + z + " x = " + " y = " +
                '}';
    }

}
