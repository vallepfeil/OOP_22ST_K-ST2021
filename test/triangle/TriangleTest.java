package triangle;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void testTriangle() {
        System.out.println("d) Gibt String aus dem Objekt aus");
        final Triangle t = new Triangle(2, 3, 1); t.testT();
        // --------
        System.out.println("1. Test: Hol mir 1x den rechten Nachbarn");
        System.out.println("Hier als Triangle");
        Triangle t1 = new Triangle(2, 3, 1); System.out.println(t1.toString());
        System.out.println(t1.getRight());
        System.out.println("2. Test: Hol mir 2x den rechten Nachbarn");
        System.out.println("Hier als Triangle");
        System.out.println(t1.getRight().getRight());


        Triangle t2 = new Triangle(3, 2, 0); System.out.println(t2.toString());
        System.out.println(t2.getRight());
        System.out.println();

        System.out.println("3. Test: Gib mir die Spitze des Kompositums (Dreieck)");
        CompositeTriangle t3 = new CompositeTriangle(-2, 4, 3); System.out.println(t3.getPeak());
        System.out.println("4. Test: Gib mir die Attribute des Kompositums (Dreieck)");
        CompositeTriangle t4 = new CompositeTriangle(-2, 4, 3); System.out.println(t4.getCompositeTriangle());
        System.out.println("5. Test: Iteriert mir das Kompositum (Dreieck)");
        CompositeTriangle t5 = new CompositeTriangle(-2, 4, 3); System.out.println(t5.iterator());

        CompositeTriangle t6 = new CompositeTriangle(0,3,3);
        System.out.println(t6.iterator());

        System.out.println(t6.contains(t));
        System.out.println();
        System.out.println();
        final Triangle t7 = new Triangle(0, 1, 1);
        System.out.println(t6.contains(t7));

    }
}
