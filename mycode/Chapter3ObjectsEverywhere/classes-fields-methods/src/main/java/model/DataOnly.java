package model;

public class DataOnly {
  private static int staticI = 5;
  private int i;
  private double d;
  private boolean b;

  public DataOnly() {
    this.i = 10;
    this.d = 10.00;
    this.b = false;
  }

  public static int getStaticI() {
    return staticI;
  }

  public int getI() {
    return i;
  }

  public double getD() {
    return d;
  }

  public boolean getB() {
    return b;
  }

  public static void setStaticI(int staticI) {
    DataOnly.staticI = staticI;
  }

  public void setI(int i) {
    this.i = i;
  }

  public void setD(double d) {
    this.d = d;
  }

  public void setB(boolean b) {
    this.b = b;
  }

  public int addToI(int adder) {
    this.i += adder;
    return this.i;
  }

  public void addToD(double adder) {
    this.d += adder;
  }
}
