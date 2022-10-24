package model;

public class DataOnly {
  private int i;
  private double d;
  private boolean b;

  public DataOnly() {
    this.i = 10;
    this.d = 10.00;
    this.b = false;
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
