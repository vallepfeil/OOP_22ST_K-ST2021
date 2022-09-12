package triangle;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 */
public class Triangle {
    private final int x;
    private final int y;
    private final int z;

    public Triangle(int x, int y, int z) throws IllegalArgumentException {
        if (z < 0 || z > 1) throw new IllegalArgumentException(); this.x = x; this.y = y; this.z = z;
    }

    public int getX() {return (x);}

    public int getY() {return (y);}

    public int getZ() {return (z);}

    public String toString() {return "(" + getX() + "," + getY() + "," + getZ() + ")";}

    public void testTriangle() {
        final Triangle triangle = new Triangle(2, 3, 1);
        System.out.println(triangle.toString());
    }

    public String getRight() {
        int getRightX = this.getX();
        int getRightY = this.getY();
        int getRightZ = this.getZ();



        if (getRightY % 2 == 0) {
            getRightY = getRightY + 1;
        }
        else {
            getRightY = getRightY - 1;
            getRightX = getRightX + 1;
        }

        if (getRightZ == 0) {
            getRightZ = getRightZ + 1;
        }
        else getRightZ = getRightZ - 1;

        return ("(" + getRightX + "," + getRightY + "," + getRightZ + ")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return x == triangle.x && y == triangle.y && z == triangle.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public HashSet<Triangle> hashIsch() {
        HashSet<Triangle> set = new HashSet<>();
        return set;
    }
}
