// This is a sub-class of Instrument class
public class InstrumentToRent extends Instrument
{
    //decalaring attributes with private access
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    
    //constructor method of class InstrumentToRent
    public InstrumentToRent(String instrument_name, int chargePerDay)
    {
        super(instrument_name);//accessing the superclass attribute
        this.chargePerDay= chargePerDay;       
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays=0;
        this.isRented=false;
    }
    
    //accessor methods for all the attributes
    public int getChargePerDay()
    {
        return this.chargePerDay;
    }
    
    public String getDateOfRent()
    {
        return this.dateOfRent;
    }
    
    public String getDateOfReturn()
    {
        return this.dateOfReturn;
    }
    
    public int getNoOfDays()
    {
        return this.noOfDays;
    }
    
    public boolean getIsRented()
    {
        return this.isRented;
    }
    
    //setter methods for all the attributes
    public void setChargePerDay(int chargePerDay)
    {
       this.chargePerDay= chargePerDay;
    }
   
    public void setDateOfRent(String dateOfRent)
    {
        this.dateOfRent= dateOfRent;
    }
    
    public void setDateOfReturn(String dateOfReturn)
    {
        this.dateOfReturn= dateOfReturn;
    }
    
    public void setNoOfDays(int noOfDays)
    {
        this.noOfDays= noOfDays;        
    }
    
    public void setIsRented(boolean isRented)
    {
        this.isRented= isRented;
    }
    
    //method to rent out the Instrument to a customer
    public void rentInstrument(String customer_name, String customer_phone, int customer_pan, 
    String dateOfRent, String dateOfReturn, int noOfDays)
    {   
        if(this.isRented==true)
        {
            System.out.println("The instrustment is already rented.");
            System.out.println("The name of customer is: "+ customer_name);
            System.out.println("The phone number of customer is: "+ customer_phone);
            System.out.println("The instrument will be returned on: "+ dateOfReturn);
        }
        
        else
        {
            //calling the setter method
            super.setCustomer_name(customer_name);
            super.setCustomer_phone(customer_phone);
            super.setCustomer_pan(customer_pan);
            //updating parameters values 
            this.dateOfRent=dateOfRent;
            this.dateOfReturn=dateOfReturn;
            this.noOfDays=noOfDays;
            this.isRented=true;
            float totalCharge=noOfDays * this.chargePerDay;
            System.out.println("The customer's name is: "+ customer_name);
            System.out.println("The customer's number is: "+ customer_phone);
            System.out.println("The customer's pan is: "+ customer_pan);
            System.out.println("The date of rent is: "+ dateOfRent);
            System.out.println("The date of return: "+ dateOfReturn);
            System.out.println("The total number of days is: "+ noOfDays);
            System.out.println("The total charge is: "+ totalCharge);
        }
    }
    
    //this is  a method to return instrument
    public void returnInstrument()
    {
        if(this.isRented==false)
        {
            System.out.println("The instrument is not rented.");
        }
        //if it is rented
        else
        {                 
            setCustomer_name("");
            setCustomer_phone("");
            setCustomer_pan(0);
            setDateOfReturn("");
            setDateOfRent("");
            setNoOfDays(0);
            setIsRented(false);
        }
    }
    //display method
    public void display()
    {
        super.display();//calling the super class method
        System.out.println("Instrument ID="+ getInstrument_id());
        System.out.println("Instrument Name="+ getInstrument_name());        
        if(isRented==true)
        {
            System.out.println("Customer name: "+ getCustomer_name());
            System.out.println("Rented Date: "+ getDateOfRent());
            System.out.println("Return Date: "+ getDateOfReturn());
        }
    }
}
