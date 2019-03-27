package imic.buoi2.helloworld;

import imic.buoi4.oop.Chicken;

/**
 * Hello world!
 */
public class App
{
  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello my love!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
  }


  public static int tinhNhan(int a, int b)
  {
    return a + b;
  }

  protected static int tinhTong(int a, int b)
  {
    return a + b;
  }

  public static int tinhHamYTheoX(int x)
  {
    String mauLong;

    int y = 0;

    int a = 2;
    int b = 3;
    y = a * (x * x) + b;

    return y;
  }

  public void testChiecken()
  {
    Chicken chicken1 = new Chicken("TieuBao", "vang");
    //Chicken chicken2 = new Chicken();
  }


  public static void checkAllPrimitiveDataType()
  {
    String myString = "Hello World";
    //char my1stChar = myString.charAt(0);
    //char my1stChar = myString.charAt(6);
    char my1stChar = myString.charAt(myString.length() - 1);
    System.out.println("my1stChar -> " + my1stChar);


    byte myByte = -128;
    short myShort = 1000;
    int myInteger1 = 2147483647;
    myInteger1 = myInteger1 + 2;
    System.out.println("myInteger1 -> " + myInteger1); //-2147483647
                                                       //-2147483648
    long myLong = 1000;
    int myInteger2 = 1000;
    long myLong2 = 1000L;
    long danSoTheGioi = 7111111111L;

    double myDecimal = 1.25;
    float  myDeimal2 = 1.25f;

    boolean myBoolean = true;
    myBoolean = false;

    char myChar = 'a';
  }

  public static void checkClassObjectType()
  {


    Byte myByte = 10;
    Integer myInteger = 1000; //=> "1000"
    myInteger.compareTo(new Integer(2000));
    System.out.println("myInteger -> " + (myInteger + 1));
    System.out.println("myInteger -> " + (myInteger.toString()  + 1));

    Long myLong = new Long(1000L);
    Long myLong3 = 1000L;
    Double myDecimal = 1.25;
    Float  myDeimal2 = 1.25f;

    Boolean myBoolean = true;
    myBoolean = false;

    Character myChar = 'a';

    Chicken chicken = new Chicken();
  }

  public static void checkReferenceType()
  {
    String myChiken1 = "TieuBao";
    changeSomeString(myChiken1);
    System.out.println("myChiken1 -> " +  myChiken1);

    Chicken myChicken2 = new Chicken("TieuBao");
    changeSomeChicken(myChicken2);
    System.out.println("myChicken2 -> " +  myChicken2.name);
  }

  public static void changeSomeString(String myChiken) //"TieuBao"
  {
    myChiken = "TieuHong";
  }

  public static void changeSomeChicken(Chicken myChiken) //
  {
    myChiken.name = "TieuHong";
  }
}
