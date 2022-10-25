package model;

public class ValB {
  private int i;

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public boolean equals(Object o) {
    ValB rValue = (ValB)o;
    return i == rValue.i;
  }
}
