//biniakou theofanis icsd13126 

public class atv extends vehicle{
    
    
    public atv(String number)
    {
        super(number);
    }
    
    @Override
    public double charge_per_day() //epistrefei to kostos ana hmera
    {
        return 30;
    }
    
    @Override
    public void print()
    {
        System.out.println("gourouna    arithmos kukloforias: " + number);
    }
}
