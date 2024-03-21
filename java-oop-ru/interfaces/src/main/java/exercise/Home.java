package exercise;

// BEGIN
public interface Home extends Comparable<Home> {
    int compareTo(Home home);

    double getArea();
}
// END
