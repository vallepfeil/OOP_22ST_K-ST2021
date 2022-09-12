package triangle;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void testTriangle() {
        Triangle t1 = new Triangle (2, 3, 1);
        System.out.println(t1.toString());
        System.out.println(t1.getRight());

        System.out.println();

        Triangle t2 = new Triangle (3,2, 0);
        System.out.println(t2.toString());
        System.out.println(t2.getRight());


    }
}
