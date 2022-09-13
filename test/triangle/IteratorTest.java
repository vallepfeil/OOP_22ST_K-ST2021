package triangle;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {
    private static final List<Triangle> EXPECTED = List.of(
            new Triangle(-2, 2, 1),
            new Triangle(-1, 1, 0),
            new Triangle(-1, 2, 1),
            new Triangle(0, 1, 0),
            new Triangle(0, 2, 1),
            new Triangle(-2, 3, 1),
            new Triangle(-1, 2, 0),
            new Triangle(-1, 3, 1),
            new Triangle(-2, 4, 1)
    );

    @Test
    public void testCompositeTriangle() {
        CompositeTriangle t3 = new CompositeTriangle(-2, 4, 3);
        assertEquals(EXPECTED, t3.iterator());
    }
}
