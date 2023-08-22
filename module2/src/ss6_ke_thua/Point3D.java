package ss6_ke_thua;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        float xyz[]={x,y,z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D = ("+ x +
                "," + y +
                "," + z +
                ')';
    }
}