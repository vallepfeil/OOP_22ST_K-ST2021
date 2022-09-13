package triangle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class CompositeTriangle {

    private final int x;
    private final int y;
    private final int k;

    public CompositeTriangle(int x, int y, int k) throws IllegalArgumentException {
        if (k < 1) throw new IllegalArgumentException(); this.x = x; this.y = y; this.k = k;
    }

    public int getX() {return (x);}

    public int getY() {return (y);}

    public int getK() {return (k);}

    public String getPeak() {return ("(" + x + "," + y + ")");}

//    public String toString() {return "(" + getX() + "," + getY() + "," + getK() + ")";}
//
//    public void testCompositeTriangle() {
//        final CompositeTriangle compositetriangle = new CompositeTriangle(-2, 4, 3);
//        System.out.println(compositetriangle.toString());
//    }
//
//    public String getRight() {
//        int getRightX = this.getX(); int getRightY = this.getY(); int getRightZ = this.getK();
//
//        if (getRightY % 2 == 0) {
//            getRightY = getRightY + 1;
//        }
//        else {
//            getRightY = getRightY - 1; getRightX = getRightX + 1;
//        }
//
//        if (getRightZ == 0) {
//            getRightZ = getRightZ + 1;
//        }
//        else getRightZ = getRightZ - 1;
//
//        return ("(" + getRightX + "," + getRightY + "," + getRightZ + ")");
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true; if (o == null || getClass() != o.getClass()) return false;
//        CompositeTriangle that = (CompositeTriangle) o; return x == that.x && y == that.y && k == that.k;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y, k);
//    }
//
//    public HashSet<Triangle> hashIsch() {
//        HashSet<Triangle> set = new HashSet<>(); return set;
//    }
}
