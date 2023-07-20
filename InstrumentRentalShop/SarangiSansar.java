// importing Java packages
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SarangiSansar implements ActionListener
{   
    //----------------components of the form---------------
    public JFrame frame;
    JTabbedPane tabbed_pane;
    JPanel panel_rent, panel_sell;
    
    //--------------------RENT--------------------------
    JLabel rent,inst_name1,charge1, inst_name2,
    cus_name, cus_pan,cus_phone,rent_date,charge2,return_date,
    rent_day, inst_name3;
    JTextField t_instName1,t_charge1, t_instName2, 
    t_cusName,t_cusPan, t_cusPhone, t_charge2, t_rentDay,
    t_instName3;
    JButton b_add, b_rent, b_return,b_display, b_clear;
    JComboBox<String> cb_day, cb_month, cb_year,cb_day1, cb_month1, cb_year1;
    
    //----------------------SELL------------------------------
    
    JLabel sell,inst_name4,price, inst_name5,
    cus_name1, cus_pan1,cus_phone1,sell_date,discount;
    JTextField t_instName4,t_price, t_instName5, 
    t_cusName1,t_cusPan1, t_cusPhone1, t_discount;
    JButton b_add1, b_sell,b_display1, b_clear1;
    JComboBox<String> cb_day2, cb_month2, cb_year2;
    
    /*
    * Creating an ArrayList of type Instrument class to hold the
    *InstrumentToRent and InstrumentToSell. 
    */
    ArrayList <Instrument> list = new ArrayList<Instrument>();
    
    
    //constructor to initialize the components
    public SarangiSansar()
    {
        //Frame
        frame = new JFrame("Sarangi Sansar");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocation(150,10);
        
        //Creating TabbedPane  
        tabbed_pane = new JTabbedPane(JTabbedPane.TOP);
        tabbed_pane.setBounds(5,10,840,630);
        tabbed_pane.setBackground(new Color(0xf7f7fd));
        
        //---------JPanel for RENT------------
        panel_rent= new JPanel();
        panel_rent.setBackground(new Color(0xe8e6e3));
        panel_rent.setLayout(null);
        
        //Components inside panel_rent
        //TITILE
        rent = new JLabel("INSTRUMENT FOR RENT");
        rent.setBounds(300,6,242,27);
        rent.setFont(new Font("Helvetica",Font.BOLD,20));
        panel_rent.add(rent);
        
        //Label for Instrument Name
        inst_name1= new JLabel("Instrument Name:");
        inst_name1.setBounds(18,70,145,23);
        //inst_name1.setFont(new Font("Helvetica",Font.BOLD,16));
        panel_rent.add(inst_name1);
        
        //TextField for Instrument Name
        t_instName1 = new JTextField();
        t_instName1.setBounds(179,70,158,23);
        panel_rent.add(t_instName1);
        
        //Label for Charge Per Day
        charge1= new JLabel("Charge Per Day:");
        charge1.setBounds(461,70,145,23);
        //charge.setFont(new Font("Helvetica",Font.BOLD,16));
        panel_rent.add(charge1);
        
        //TextField for Charge Per Day
        t_charge1 = new JTextField();
        t_charge1.setBounds(628,70,158,23);
        panel_rent.add(t_charge1);
        
        //Button for Add
        b_add = new JButton("ADD");
        b_add.setBounds(362,116,100,23);
        b_add.setBackground(new Color(0xdfe1fc));
        b_add.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_rent.add(b_add);
        b_add.addActionListener(this);
        
        //Label for Instrument Name for Renting
        inst_name2= new JLabel("Instrument Name:");
        inst_name2.setBounds(18,173,160,23);
        //inst_name1.setFont(new Font("Helvetica",Font.BOLD,16));
        panel_rent.add(inst_name2);
        
        //TextField for Instrument Name
        t_instName2 = new JTextField();
        t_instName2.setBounds(179,173,158,23);
        panel_rent.add(t_instName2);
        
        //Label for Customer Name
        cus_name= new JLabel("Customer Name:");
        cus_name.setBounds(461,172,145,23);
        panel_rent.add(cus_name);
        
        //TextField for Customer Name
        t_cusName = new JTextField();
        t_cusName.setBounds(627,170,158,23);
        panel_rent.add(t_cusName);
        
        //Label for Customer PAN no.
        cus_pan= new JLabel("Customer PAN no.:");
        cus_pan.setBounds(18,227,160,23);
        panel_rent.add(cus_pan);
        
        //TextField for Customer PAN no.
        t_cusPan = new JTextField();
        t_cusPan.setBounds(179,228,158,23);
        panel_rent.add(t_cusPan);
        
        //Label for Customer Phone
        cus_phone= new JLabel("Customer Phone:");
        cus_phone.setBounds(461,226,150,23);
        panel_rent.add(cus_phone);
        
        //TextField for Customer Phone
        t_cusPhone = new JTextField();
        t_cusPhone.setBounds(627,225,158,23);
        panel_rent.add(t_cusPhone);
        
        //Label for Rent Date
        rent_date= new JLabel("Rent Date:");
        rent_date.setBounds(18,283,145,23);
        panel_rent.add(rent_date);
        
        //Combo box for rent date

        String day[]={"1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30"};
        cb_day= new JComboBox<String>(day);
        cb_day.setBounds(179,284,59,23);
        panel_rent.add(cb_day);
        
        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul",
            "Aug", "Sep","Oct","Nov","Dec"};
        cb_month=new JComboBox<String>(month);
        cb_month.setBounds(237,284,59,23);
        panel_rent.add(cb_month);
        
        String year[]={"2022","2021","2020","2019","2018","2017","2016"};
        cb_year=new JComboBox<String>(year);
        cb_year.setBounds(295,284,59,23);
        panel_rent.add(cb_year);
        
        //Label for No of Renting Days
        rent_day= new JLabel("No. Of Renting Day:");
        rent_day.setBounds(461,282,145,23);
        panel_rent.add(rent_day);
        
        //TextField for No of renting days
        t_rentDay = new JTextField();
        t_rentDay.setBounds(628,279,158,23);
        panel_rent.add(t_rentDay);
        
        //Label for Return Date
        return_date= new JLabel("Return Date:");
        return_date.setBounds(18,339,145,23);
        panel_rent.add(return_date);
        
        //Combo box for return date
        cb_day1= new JComboBox<String>(day);
        cb_day1.setBounds(179,340,59,23);
        panel_rent.add(cb_day1);
        
        cb_month1=new JComboBox<String>(month);
        cb_month1.setBounds(237,340,59,23);
        panel_rent.add(cb_month1);
        
        String year1[]={"2022","2023","2024","2025"};
        cb_year1=new JComboBox<String>(year1);
        cb_year1.setBounds(295,340,59,23);
        panel_rent.add(cb_year1);
        
        //Button for Rent
        b_rent = new JButton("RENT");
        b_rent.setBounds(362,397,100,23);
        b_rent.setBackground(new Color(0xdfe1fc));
        b_rent.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_rent.add(b_rent);
        b_rent.addActionListener(this);
        
        //Label for Instrument Name for Returning
        inst_name3= new JLabel("Instrument Name:");
        inst_name3.setBounds(30,459,160,23);
        panel_rent.add(inst_name3);
        
        //TextField for Instrument Name
        t_instName3 = new JTextField();
        t_instName3.setBounds(179,459,158,23);
        panel_rent.add(t_instName3);
        
        //Button for Return
        b_return = new JButton("RETURN");
        b_return.setBounds(362,494,100,23);
        b_return.setBackground(new Color(0xdfe1fc));
        b_return.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_rent.add(b_return);
        b_return.addActionListener(this);
        
        //Button for Display
        b_display = new JButton("DISPLAY");
        b_display.setBounds(297,550,100,23);
        b_display.setBackground(new Color(0xd4e3fc));
        b_display.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_rent.add(b_display);
        b_display.addActionListener(this);
        
        //Button for Clear
        b_clear = new JButton("CLEAR");
        b_clear.setBounds(427,550,100,23);
        b_clear.setBackground(new Color(0xd4e3fc));
        b_clear.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_rent.add(b_clear);
        b_clear.addActionListener(this);
        
        //--------------------Jpanel for SELL---------------------------
        //Panel for selling Instrument
        panel_sell= new JPanel(); 
        panel_sell.setBackground(new Color(0xe8e6e3));
        panel_sell.setLayout(null);
        
        //Components inside panel_sell
        //TITILE
        sell = new JLabel("INSTRUMENT FOR SELL");
        sell.setBounds(300,6,242,27);
        sell.setFont(new Font("Helvetica",Font.BOLD,20));
        panel_sell.add(sell);
        
        //Label for Instrument Name
        inst_name4= new JLabel("Instrument Name:");
        inst_name4.setBounds(18,70,145,23);
        panel_sell.add(inst_name4);
        
        //TextField for Instrument Name
        t_instName4 = new JTextField();
        t_instName4.setBounds(179,70,158,23);
        panel_sell.add(t_instName4);
        
        //Label for Price
        price= new JLabel("Price:");
        price.setBounds(461,70,145,23);
        panel_sell.add(price);
        
        //TextField for Price
        t_price = new JTextField();
        t_price.setBounds(628,70,158,23);
        panel_sell.add(t_price);
        
        //Button for Add
        b_add1 = new JButton("ADD");
        b_add1.setBounds(362,116,100,23);
        b_add1.setBackground(new Color(0xdfe1fc));
        b_add1.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_sell.add(b_add1);
        b_add1.addActionListener(this);
        
        //Label for Instrument Name for Selling
        inst_name5= new JLabel("Instrument Name:");
        inst_name5.setBounds(18,173,160,23);
        //inst_name1.setFont(new Font("Helvetica",Font.BOLD,16));
        panel_sell.add(inst_name5);
        
        //TextField for Instrument Name
        t_instName5 = new JTextField();
        t_instName5.setBounds(179,173,158,23);
        panel_sell.add(t_instName5);
        
        //Label for Customer Name
        cus_name1= new JLabel("Customer Name:");
        cus_name1.setBounds(461,172,145,23);
        panel_sell.add(cus_name1);
        
        //TextField for Customer Name
        t_cusName1 = new JTextField();
        t_cusName1.setBounds(628,170,158,23);
        panel_sell.add(t_cusName1);
        
        //Label for Customer PAN no.
        cus_pan1= new JLabel("Customer PAN no.:");
        cus_pan1.setBounds(18,227,160,23);
        panel_sell.add(cus_pan1);
        
        //TextField for Customer PAN no.
        t_cusPan1 = new JTextField();
        t_cusPan1.setBounds(179,228,158,23);
        panel_sell.add(t_cusPan1);
        
        //Label for Customer Phone
        cus_phone1= new JLabel("Customer Phone:");
        cus_phone1.setBounds(461,226,150,23);
        panel_sell.add(cus_phone1);
        
        //TextField for Customer Phone
        t_cusPhone1 = new JTextField();
        t_cusPhone1.setBounds(628,225,158,23);
        panel_sell.add(t_cusPhone1);
        
        //Label for Sell Date
        sell_date= new JLabel("Sell Date:");
        sell_date.setBounds(18,283,145,23);
        panel_sell.add(sell_date);
        
        //Combo box for sell date
        cb_day2= new JComboBox<String>(day);
        cb_day2.setBounds(179,284,59,23);
        panel_sell.add(cb_day2);
       
        cb_month2=new JComboBox<String>(month);
        cb_month2.setBounds(237,284,59,23);
        panel_sell.add(cb_month2);
        
        cb_year2=new JComboBox<String>(year);
        cb_year2.setBounds(295,284,59,23);
        panel_sell.add(cb_year2);
        
        //Label for Discount Percent
        discount= new JLabel("Discount Percent:");
        discount.setBounds(461,282,145,23);
        panel_sell.add(discount);
        
        //TextField for Discount Percent
        t_discount = new JTextField();
        t_discount.setBounds(628,282,158,23);
        panel_sell.add(t_discount);
        
        //Button for Sell
        b_sell = new JButton("SELL");
        b_sell.setBounds(362,338,100,23);
        b_sell.setBackground(new Color(0xdfe1fc));
        b_sell.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_sell.add(b_sell);
        b_sell.addActionListener(this);
        
        //Button for Display
        b_display1 = new JButton("DISPLAY");
        b_display1.setBounds(297,405,100,23);
        b_display1.setBackground(new Color(0xd4e3fc));
        b_display1.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_sell.add(b_display1);
        b_display1.addActionListener(this);
        
        //Button for Clear
        b_clear1 = new JButton("CLEAR");
        b_clear1.setBounds(427,405,100,23);
        b_clear1.setBackground(new Color(0xd4e3fc));
        b_clear1.setFont(new Font("Helvetica", Font.BOLD,14));
        panel_sell.add(b_clear1);
        b_clear1.addActionListener(this);
        
        //adding panel to JTabbedPane
        tabbed_pane.add(panel_rent, "Rent Instrument");
        tabbed_pane.add(panel_sell, "Sell Instrument");
        
        //adding elements in frame
        frame.add(tabbed_pane);
        frame.setSize(860,700);
        frame.setVisible(true);
    }
    
    //overriding the method Action Listener
    public void actionPerformed(ActionEvent e)
    {
        /*
         * The actions mentioned below are generated when the particular
         * buttons are pressed. 
         * Also, the exception handling is performed here.
         */
        
        //Event Handing for button Add
        if(e.getSource()== b_add)
        {
            /*
             *to check if the text fields are empty or not
             *if yes message is displayed
             *if not exception is handled accordingly and required action is performed
             */
            if(t_instName1.getText().isEmpty() || t_charge1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Please fill all required fields.","Empty field found!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                String inst_name ="";
                int charge =0;
                try
                {
                    inst_name = t_instName1.getText();
                    charge =Integer.parseInt(t_charge1.getText());
                    boolean instAdd = false;
                    
                    for(Instrument item: list)
                    {
                        if(item.getInstrument_name().equals(inst_name) && item instanceof InstrumentToRent)
                        {
                            instAdd =true;
                        }
                    }
                    if(instAdd == false)
                    {
                        InstrumentToRent obj = new InstrumentToRent(inst_name, charge);
                        list.add(obj);
                        JOptionPane.showMessageDialog(frame, t_instName1.getText() + " has been added to Rent !");
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(frame, "Instrument is already added.");
                    }
                    
                }
                catch(NumberFormatException ex1)
                {
                    JOptionPane.showMessageDialog(frame,"Please enter a valid information.");
                    t_instName1.setText("");
                    t_charge1.setText("");
                }
            }
        }

        //Event Handling for Rent
        if(e.getSource() == b_rent)
        {
            //to check if the text fields are empty or not and display message
            if(t_instName2.getText().isEmpty() || t_cusName.getText().isEmpty()
            || t_cusPan.getText().isEmpty() || t_cusPhone.getText().isEmpty() 
            || t_rentDay.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Please fill all required fields.","Empty field found!", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                //Exception Handling
                try
                {
                    String inst_name=t_instName2.getText();
                    boolean instAdd= false;
                    String customerName = t_cusName.getText();
                    String customerPhone = t_cusPhone.getText();
                    int customerPan = Integer.parseInt(t_cusPan.getText());
                    String dateOfRent =(cb_day.getSelectedItem()).toString()+","+(cb_month.getSelectedItem()).toString()+","+
                    (cb_year.getSelectedItem()).toString();
                    String dateOfReturn =(cb_day1.getSelectedItem()).toString()+","+(cb_month1.getSelectedItem()).toString()+","+
                    (cb_year1.getSelectedItem()).toString();
                    int noOfDays = Integer.parseInt(t_rentDay.getText());
                    
                    for(Instrument item:list)
                    {
                        if(item.getInstrument_name().equals(inst_name))
                        {
                             instAdd= true;
                             if(item instanceof InstrumentToRent)
                             {
                                //downcasting 
                                InstrumentToRent rent = (InstrumentToRent)item;
                                if(rent.getIsRented()== true)
                                {
                                    JOptionPane.showMessageDialog(frame,t_instName2.getText()+" is already rented.");
                                }
                                else
                                {
                                    rent.rentInstrument(customerName,customerPhone,customerPan,dateOfRent,dateOfReturn,noOfDays);
                                    JOptionPane.showMessageDialog(frame, t_instName2.getText() +" has been rented sucessfully."); 
                                }
                                break;
                             }
                             else
                             {
                                 JOptionPane.showMessageDialog(frame, "Please try again.");
                                 break;
                             }
                        }
                    }
                    if(!instAdd)
                    {
                        JOptionPane.showMessageDialog(frame, "Instrument Unavailable!");
                    }
                }
                
                catch(Exception ex2)
                {
                    JOptionPane.showMessageDialog(frame,"Please enter a valid information.");
                }
            }    
        }
        
        
        //Event Handling for returning the rented instrument
        if(e.getSource()== b_return)
        {
            //to check if the text fields are empty or not and display message
            if(t_instName3.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Please fill all required fields.","Empty field found!", JOptionPane.WARNING_MESSAGE);
            }
                
            else
            {
                try
                {
                    String instName= t_instName3.getText();
                    for(Instrument item:list)
                    {
                        if(item instanceof InstrumentToRent)
                        {
                            InstrumentToRent rent = (InstrumentToRent)item;
                            if(instName.equals(item.getInstrument_name()) && rent.getIsRented()==true)
                            {
                                rent.returnInstrument();
                                JOptionPane.showMessageDialog(frame, t_instName3.getText()+"! Sucessfully returned!");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame,"Invalid Instrument Name.","ERROR!", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                catch(Exception exp3)
                {
                      JOptionPane.showMessageDialog(frame,"Please try again");
                }
            }
        }
        
        //Event Handling for Display in Rent Panel
        if(e.getSource() == b_display)
        {
            if(list.size()==0)
            {
                JOptionPane.showMessageDialog(frame, "Instrument is not rented.");
            }
            for (Instrument item: list)
            {
                if( item instanceof InstrumentToRent)
                {
                    InstrumentToRent return_ = (InstrumentToRent)item;
                    return_.display();
                }
            }
        }
        
        //Event Handling for Clear in the Rent Panel
        if(e.getSource() == b_clear)
        {
            t_instName1.setText("");
            t_charge1.setText("");
            t_rentDay.setText("");
            t_instName2.setText("");
            t_cusName.setText("");
            t_cusPan.setText("");
            t_cusPhone.setText("");
            t_instName3.setText("");
            cb_day.setSelectedIndex(0);
            cb_month.setSelectedIndex(0);
            cb_year.setSelectedIndex(0);
            cb_day1.setSelectedIndex(0);
            cb_month1.setSelectedIndex(0);
            cb_year1.setSelectedIndex(0);
        }
        
        //Event Handling for adding Instrument to sell
        if(e.getSource() == b_add1)
        {
            if(t_instName4.getText().isEmpty() || t_price.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Please fill all required fields.","Empty field found!", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                String inst_name="";
                int price =0;
                try
                {
                    boolean instAdd = false;
                    inst_name = t_instName4.getText();
                    price = Integer.parseInt(t_price.getText());
                    
                    for(Instrument item: list)
                    {
                        if(item.getInstrument_name().equals(inst_name) && item instanceof InstrumentToSell)
                        {
                            instAdd = true;
                        }
                    }
                    
                    if(instAdd)
                    {
                        JOptionPane.showMessageDialog(frame, "Instrument is already added.");
                    }
                    else 
                    {
                        InstrumentToSell obj1 = new InstrumentToSell(inst_name, price);
                        list.add(obj1);
                        JOptionPane.showMessageDialog(frame, t_instName4.getText() + " has been added to Sell !");
                    }
                    
                }
                catch(NumberFormatException ex5)
                {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid information! ");
                }
            }
        }
        
        //Event Handling for Sell
        if(e.getSource() == b_sell)
        {
            if(t_instName5.getText().isEmpty() || t_cusName1.getText().isEmpty() 
            || t_cusPhone1.getText().isEmpty() || t_cusPan1.getText().isEmpty() || t_discount .getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Please fill all required fields.","Empty field found!", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                String inst_name="";
                boolean instAdd;
                String customerName;
                String customerPhone;
                int customerPan;
                String sellDate;
                float discountPercent;
                try
                {
                    inst_name=t_instName5.getText();
                    instAdd= false;
                    customerName = t_cusName1.getText();
                    customerPhone = t_cusPhone1.getText();
                    customerPan = Integer.parseInt(t_cusPan1.getText());
                    sellDate =(cb_day2.getSelectedItem()).toString()+","+(cb_month2.getSelectedItem()).toString()+","+
                    (cb_year2.getSelectedItem()).toString();
                    discountPercent = Float.parseFloat(t_discount.getText());
                    
                    for(Instrument item:list)
                    {
                        if(item.getInstrument_name().equals(inst_name))
                        {
                             instAdd= true;
                             if(item instanceof InstrumentToSell)
                             {
                                InstrumentToSell sell = (InstrumentToSell)item;
                                if(sell.getIsSold()== true)
                                {
                                    JOptionPane.showMessageDialog(frame,t_instName4.getText()+" is already sold.");
                                }
                                else
                                {
                                    sell.sellInstrument(customerName,customerPhone,customerPan,sellDate,discountPercent);
                                    JOptionPane.showMessageDialog(frame, t_instName4.getText() +" is sold."); 
                                }
                             }
                             else
                             {
                                 JOptionPane.showMessageDialog(frame, "Please try again.");
                             }
                        }
                        if(!instAdd)
                        {
                            JOptionPane.showMessageDialog(frame, "Instrument Unavailable!");
                        }
                    }
                }
                catch(Exception exp6)
                {
                    JOptionPane.showMessageDialog(frame,"Please enter a valid information.");
                }
            }
        }
        
        //Event Handling for Display in Sell Panel
        if(e.getSource() == b_display1)
        {
            if(list.size()==0)
            {
                    JOptionPane.showMessageDialog(frame, "Instrument is not Sold.");
            }
            for (Instrument item: list)
            {
                if(item instanceof InstrumentToSell)
                {
                    InstrumentToSell sell_ = (InstrumentToSell)item;
                    sell_.display();
                }            
            }
        }
        
        //Event Handling for Clear in the Sell Panel
        if(e.getSource() == b_clear1)
        {
            t_instName4.setText("");
            t_price.setText("");
            t_instName5.setText("");
            t_cusName1.setText("");
            t_cusPan1.setText("");
            t_cusPhone1.setText("");
            t_discount.setText("");
            cb_day2.setSelectedIndex(0);
            cb_month2.setSelectedIndex(0);
            cb_year2.setSelectedIndex(0);
        } 

    }
    
    //main method
    public static void main (String args[])
    {
        new SarangiSansar();
    }
}
