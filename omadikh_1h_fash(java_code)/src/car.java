//biniakou theofanis icsd13126
public class car extends vehicle{
    
    public car(String number)
    {
        super(number);
    }
    
    @Override
    public double charge_per_day() //epistrefei to kostos ana hmera
    {
        return 50;
    }
    
    @Override
    public void print()
    {
        System.out.println("autokinhto      arithmos kukloforias: " + number);
    }
}
