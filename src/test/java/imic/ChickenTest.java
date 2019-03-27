package imic;

import imic.buoi4.oop.Chicken;
import org.junit.Test;


/**
 * Unit test for simple Chicken.
 */
public class ChickenTest
{

  public static void helpMeSomething()
  {

  }

  @Test
  public void testDatTenBien()
  {
    String publicXYZ;
    String Test = "Peter";
    System.out.println(Test);
    String test = "David";
    System.out.println(test);

  }


  @Test
  public void test2ConGa()
  {
    Chicken chicken1 = new Chicken("TieuBao");
    Chicken chicken2 = new Chicken("TieuHong");

    chicken1.chipchip();
    chicken2.chipchip();

  }

  @Test
  public void testFunctions()
  {
    Chicken chicken1 = new Chicken();
    Chicken.coBaoNhieuChan();

    chicken1.coBaoNhieuChan();
    chicken1.chipchip();
  }
}
