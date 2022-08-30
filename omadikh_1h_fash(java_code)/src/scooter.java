//biniakou theofanis icsd13126 , afalwniaths straths icsd13018, omadiki askisi 1h fash

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
