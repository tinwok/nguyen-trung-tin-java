public class Smartphone extends Product {
    private  int weight;
    public  Smartphone(String name,double price,int weight){
        super(name, price);
        this.weight = weight;
    }
   public int getWeight() {
       return weight;
   }
   public void setWeight(int weight) {
       this.weight = weight;
   }
}
