//biniakou theofanis icsd13126 

public class scooter extends vehicle{
    
    
    
    public scooter(String number)
    {
        super(number);
    }
    
   
    @Override
    public double charge_per_day() //epistrefei to kostos ana hmera
    {
        return 20;
    }
    
    @Override
    public void print()
    {
        System.out.println("scooter    arithmos kukloforias: " + number);
    }
}
