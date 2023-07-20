// This is a sub class of Instrument class
public class InstrumentToSell extends Instrument
{
    //decalaring attributes with private access
    private float price;
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    
    //constructor method of class InstrumentToSell
    public InstrumentToSell(String instrument_name, int price)
    {
        super(instrument_name);
        this.price=price;
        this.sellDate="";
        this.discountPercent=0f;
        this.isSold=false;
    }
    
    //accessor method of all the attributes
    public float getPrice()
    {
        return this.price;
    }
    
    public String getSellDate()
    {
        return this.sellDate;
    }
    
    public float getDiscountPercent()
    {
        return this.discountPercent;
    }
    
    public boolean getIsSold()
    {
        return this.isSold;
    }
    
    //setter methods of all the attributes
    public void setPrice(float price)
    {
        if(this.isSold==false)
        {
            this.price=price;
        
        }
        else
        {
            System.out.println("This is to notify the item is sold out.");
        }
    }
    
    public void setSellDate(String sellDate)
    {
        this.sellDate=sellDate;
    }
    
    public void setDiscountPercent(float discountPercent)
    {
        this.discountPercent=discountPercent;
    }
    
    public void setIsSold(boolean isSold)
    {
        this.isSold=isSold;
    }
    
    //method to sell the instrument
    public void sellInstrument(String customer_name, String customer_phone, int customer_pan,String sellDate, float discountPercent)
    {
        if(this.isSold==true)
        {
            System.out.println("Dear " + customer_name + " Sorry, The instrument is currently unavailable.");
        }
        else
        {
            setCustomer_name(customer_name);
            setCustomer_phone(customer_phone);
            setCustomer_pan(customer_pan);
            setSellDate(sellDate);
            setDiscountPercent(discountPercent);
            setIsSold(true);
            this.price= this.price-(discountPercent/100 * this.price);
        }
    }
    
    //display method to display the selling details
    public void display()
    {
        super.display();
        System.out.println("The Instrument ID is: "+ getInstrument_id());
        System.out.println("The Instrument Name is: "+ getInstrument_name());
        System.out.println("The price of "+ getInstrument_name() + "is "+ this.price);
        if(this.isSold==true)
        {
            System.out.println("The instrument is sold to: "+ getCustomer_name());
            System.out.println("The customer's number is: "+ getCustomer_phone());
            System.out.println("The customer's pan is: "+ getCustomer_pan());
            System.out.println("The instrument was sold on: "+ getSellDate());
            System.out.println("The selling price of instrument is: Rs"+ this.price);
        }
    }
}