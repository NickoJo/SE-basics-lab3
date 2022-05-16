import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import data.Point;
import org.junit.Test;

public class PointTest {
  @Test
  public void testInside1() {
    Point point = new Point();
    assertTrue("checking point (-5; -10) via r = 100",point.calculate(-5, -10, 100));
  }
  @Test
  public void testInside2() {
    Point point = new Point();
    assertTrue("checking point (0; 0) via r = 2", point.calculate(0, 0, 2));
  }
  @Test
  public void testOutside1() {
    Point point = new Point();
    assertFalse("checking point (100; 2) via r = 8",point.calculate(100, 2, 8));
  }
  @Test
  public void testOutside2() {
    Point point = new Point();
    assertFalse("checking point (-2; -4.000001) via r = 4", point.calculate(-2, -4.000001, 4));
  }
}