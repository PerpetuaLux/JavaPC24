package Java24;

public class Point4D extends Point3D {
//I did this myself, it's the hour 12 activity but it requested an actual name
    public int t;
    
    public Point4D(int x, int y, int z, int t) {
        super(x,y,z);
        this.t = t;
    }
    public void move(int x, int y, int z, int t) {
        this.t = t;
        super.move(x, y, z);
    }
    
    public void translate(int x, int y, int z, int t) {
        this.t += t;
        super.translate(x, y, z);
    }
    
}