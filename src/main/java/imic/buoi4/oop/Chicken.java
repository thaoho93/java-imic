package imic.buoi4.oop;

/**
 * Hello world!
 */
public class Chicken
{
  public static int soLuongConGa;
  public String name;
  public String mauLong;
  public static int soChan;

  public Chicken(String name)
  {
    this.name = name;
  }

  public Chicken(String name, String mauLong)
  {
    this.name = name;
    this.mauLong = mauLong;
  }

  public Chicken()
  {

  }

  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");

    Chicken chiken1 = new Chicken("TieuHong", "mauDo");
    System.out.println("chiken1 -> " + chiken1.mauLong);
    Chicken chicken2 = new Chicken();
    System.out.println("chicken2 -> " + chicken2.mauLong);
  }

  public void chipchip()
  {
    coBaoNhieuChan();
    System.out.println(name + " Chipcha chipchip!!");
    coBaoNhieuChan();
  }

  public void chickenGoDance()
  {
    this.name = "TieuBao";
  }

  public static void coBaoNhieuChan()
  {
    System.out.println("Ga thi co 2 chan, hoi gi ki!!");
  }

}
