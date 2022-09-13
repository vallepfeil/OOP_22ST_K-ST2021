package triangle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class Triangle {
    List<Integer> triangleList = new ArrayList<>();
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

    public void testT() {System.out.println(this.toString());}

    public Triangle getRight() {

        int getRightX = this.getX(); int getRightY = this.getY(); int getRightZ = this.getZ();

        if (getRightZ == 0) {
            getRightZ = getRightZ + 1; getRightY = getRightY + 1;
        }
        else {getRightZ = getRightZ - 1; getRightX = getRightX + 1; getRightY = getRightY - 1;}

        return new Triangle(getRightX,getRightY,getRightZ);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o; return x == triangle.x && y == triangle.y && z == triangle.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
