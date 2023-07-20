//This is a parent class
public class Instrument
{
    //declaring variables and giving private access
    private static int instrument_id;
    private String instrument_name;
    private String customer_name;
    private String customer_phone;
    private int customer_pan;
    
    //creating constructors for class Instrument
    public Instrument(String instrument_name)
    {
        instrument_id++; //auto incremented after adding new instrument
        this.instrument_name= instrument_name;
        this.customer_name="";
        this.customer_phone="";
        this.customer_pan=0;
    }
    
    //creating accessor method for all the attributes 
    public int getInstrument_id()
    {
        return instrument_id; //(static variable)
    }
    
    public String getInstrument_name()
    {
        return this.instrument_name;
    }
    
    public String getCustomer_name()
    {
        return this.customer_name;
    }
    
    public String getCustomer_phone()
    {
        return this.customer_phone;
    }
    
    public int getCustomer_pan()
    {
        return this.customer_pan;
    }
    
    //creating setter method for all the attributes
    public void setInstrument_id(int instrument_id)
    {
       Instrument.instrument_id=instrument_id;
    }
    
    public void setInstrument_name(String instrument_name)
    {
        this.instrument_name= instrument_name;
    }
    
    public void setCustomer_name(String customer_name)
    {
        this.customer_name= customer_name;
    }
    
    public void setCustomer_phone(String customer_phone)
    {
        this.customer_phone= customer_phone;        
    }
    
    public void setCustomer_pan(int customer_pan)
    {
        this.customer_pan= customer_pan;
    }
    
    //display method (it displays the values the above attributes)
    public void display()
    {
         System.out.println("The Instrument ID is: "+ getInstrument_id());
         System.out.println("The Instrument Name is: "+ getInstrument_name());
         //printing the values of customer name, phone number and pan if they aren't empty
         if(customer_name!="" && customer_phone!="" && customer_pan!=0)
         {
             System.out.println("The Customer's Name is: "+ getCustomer_name());
             System.out.println("The Customer's Phone number is: "+ getCustomer_phone());
             System.out.println("The Customer's PAN is: "+ getCustomer_pan());
         }
    }
}