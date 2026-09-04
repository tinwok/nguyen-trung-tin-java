public class Tablet extends Product {
     private  double screenSize;
    public  Tablet(String name,double price,int screenSize){
        super(name, price);
        this.screenSize = screenSize;
    }
  public void setScreenSize(double screenSize) {
      this.screenSize = screenSize;
  }
  public double getScreenSize() {
      return screenSize;
  }

}
