package model;

public class ShortCircuit {

  private String lastOperation;

  public String getLastOperation() {
    return lastOperation;
  }

  public void setLastOperation(String lastOperation) {
    this.lastOperation = lastOperation;
  }

  public boolean xAndY(int x, int y) {
    String result = x > y ? "x > y" : "y <= x";
    this.setLastOperation(result);
    return x > y;
  }

  public boolean xAndZ(int x, int z) {
    String result = x > z ? "x > z" : "z <= x";
    this.setLastOperation(result);
    return x > z;
  }

  public boolean yAndZ(int y, int z) {
    String result = y > z ? "y > z" : "y <= x";
    this.setLastOperation(result);
    return y > z;
  }

  public boolean xAndYAndZ(int x, int y, int z) {
    return xAndY(x, y) && xAndZ(x, z) && yAndZ(y, z);
  }
}
