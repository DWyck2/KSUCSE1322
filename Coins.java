public class Coins {
    private int quantityOnHand;
    private float denomination;
    private float weight;
    Coins(float denomination, float weight){
        this.denomination=denomination;
        this.weight=weight;
    }
    public float getTotalWeight(){
        float totalWeight=(weight*quantityOnHand);
        return totalWeight;
    }
    public float getTotalValue(){
        float totalValue=(denomination*quantityOnHand);
        return totalValue;
    }
    public void increaseQuantity(int quantity){
        quantityOnHand+=quantity;
    }
    public void decreaseQuantity(int quantity){
        if(quantityOnHand==0)
            quantityOnHand=0;
        else
            quantityOnHand-=quantity;
    }
    public int getQuantityOnHand() {
        return quantityOnHand;
    }
    public String printPretty(float amount){
        return("$"+String.format("%4.2f",amount));
    }
    @Override
    public String toString(){
        return printPretty(getTotalValue())+" in "+printPretty(denomination)+" coins";
    }
}
