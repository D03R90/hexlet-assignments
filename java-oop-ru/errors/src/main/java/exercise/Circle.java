package exercise;

// BEGIN
public class Circle {

    private Point cirlleCenter;
    private  int Radius;

    public Circle(Point cirlleCenter, int radius) {
        this.cirlleCenter = cirlleCenter;
        this.Radius = radius;
    }

    public int getRadius() {
        return Radius;
    }

    public double getSquare() throws NegativeRadiusException{
        if (this.getRadius() < 0){
            throw new NegativeRadiusException ("Faild");
        }
        return Math.PI * Math.pow(Radius, 2);
    }
}
// END
