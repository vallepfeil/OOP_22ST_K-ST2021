package triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeTriangle<T> implements Iterable<T> {

    private final int x;
    private final int y;
    private final int k;

    public CompositeTriangle(int x, int y, int k) throws IllegalArgumentException {
        if (k < 1) throw new IllegalArgumentException(); this.x = x; this.y = y; this.k = k;
    }

    public int getX() {return (x);}

    public int getY() {return (y);}

    public int getK() {return (k);}

    public String getPeak() {return ("(" + x + "," + y + "," + 1 + ")");}

    public String getCompositeTriangle() {return ("(" + x + "," + y + "," + k + ")");}

    @Override
    @SuppressWarnings("unchecked")
    public T iterator() {
        List<Triangle> ACTUAL = new ArrayList<>(); int x = this.getX(); int y = this.getY() - k + 1; int k = this.k;
        int z = 1;

        int columnSteps; int rowSteps = k - 1;

        for (int i = 0; i <= rowSteps; i++) {
            Triangle initT = new Triangle(x, y + i, z); Triangle nextT = initT; columnSteps = 2 * k - (1 + 2 * i);
            for (int j = 0; j < columnSteps; j++) {
                ACTUAL.add(nextT); nextT = nextT.getRight();
            }
        } return (T) ACTUAL;
    }

    public boolean contains(Triangle t){
        for (Triangle triangle : (List<Triangle>)this.iterator()) {
            return t.equals(triangle);
        }
        return false;
    }
}
