class Pizza{
    private int price;
    private Boolean veg;
   
    private int extraCheeseprice=100;
    private int extraToppingsPrice=150;

    private int basePizzaPrice;
    private Boolean isExtraCheeseAdded=false;
    private Boolean isExtraToppings=false;;

    private Boolean isOptFortakeAway=false;
    private int backPackPrice=20;
    public Pizza(Boolean veg)
    {
        this.veg=veg;
        if(this.veg)
        {
            this.price=300;
        }
        else{
            this.price=400; //non-veg pizza
        }
        basePizzaPrice=this.price;
    }
    public void addExtraChesse()
    {
        //System.out.println("Extra Cheese Added");
        this.price+=extraCheeseprice;
        isExtraCheeseAdded=true;
    }
    public void addextraToppings(){
        //System.out.println("Extra Toppings Added");
        this.price+=extraToppingsPrice;
        isExtraToppings=true;
    }
    public void takeAway()
    {
        //System.out.println("Your takeaway is ready");
        this.price+=backPackPrice;
        
    }
 public void BillPrint()
 {
    String bill="";
    //System.out.println("You Billing Amount is ");
    bill+="Pizza: "+ basePizzaPrice+"\n";
    if(isExtraCheeseAdded)
    {
        bill+="Extra Cheese added : "+extraCheeseprice+ "\n";
    }
     if(isExtraToppings)
    {
        bill+="Extra Cheese added : "+extraToppingsPrice+ "\n";
    }
    if(isOptFortakeAway)
    {
        bill+="Take away: "+backPackPrice+ "\n";
    }
    bill+="Bill: "+this.price+ "\n";
    System.out.println("Bill amount is: \n"+bill+"Thank You for Order");
 }

}
class deluxPizza extends Pizza {
    public deluxPizza(Boolean veg)
    {
        super(veg);
        super.addExtraChesse();
        super.addextraToppings();
    }
    @Override
        public void addextraToppings(){
        }
    @Override
        public void addExtraChesse(){
        } 

}

public class pizzaBillgenerator {
    public static void main(String[] args)
    {
    //     Pizza basePizza=new Pizza(true);
    //     basePizza.addextraToppings();
    //     basePizza.addExtraChesse();
    //    // basePizza.takeAway();
    //     basePizza.BillPrint();

      deluxPizza dp=new deluxPizza(true);
      dp.addExtraChesse();
      dp.BillPrint();
    }
    
}
