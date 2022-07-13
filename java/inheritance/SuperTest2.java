package inheritance;

public class SuperTest2 {
}

class Point2D{
    int x;
    int y;

    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x : " + x + "y : " + y;
    }
}
class Point3D extends Point2D{
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    String getLocation(){
        return "x : " + x + "y : " + y + "z : " + z;
    }
}