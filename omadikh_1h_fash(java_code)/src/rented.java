//biniakou theofanis icsd13126 , afalwniaths straths icsd13018, omadiki askisi 1h fash

import java.time.LocalDate;


public interface rented {
    
    
    public double charge_per_day();
    public boolean available(LocalDate d);
    public void print();
    public void add_date(LocalDate d);
    public void remove_date(LocalDate d);
    
}

