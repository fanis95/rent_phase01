//biniakou theofanis icsd13126

import java.time.LocalDate;
import java.util.ArrayList;


public abstract class vehicle implements rented{
    protected String number;
    protected ArrayList<LocalDate> rent_vehicle_dates = new ArrayList<>();
    
    public vehicle(String number)
    {
        this.number = number;
    }

    public String get_n()
    {
        return this.number;
    }
    
    
    @Override
    public void add_date(LocalDate d) // tha prosthetw oles tis hmeromhnies pou to oxhma tha einai enoikiasmeno
    {
        rent_vehicle_dates.add(d);
    }
    
    @Override
    public boolean available(LocalDate d) { // an h lista me tis hmeromhnies pou to oxhma einai piasmeno periexei thn 
                                            // hmeromhnia d tote epistrefei true alliws false
        return rent_vehicle_dates.contains(d);
    }
    
    
    @Override
    public void remove_date(LocalDate d) // tha diagrapsw oles tis hmeromhnies gia tis opoies 
                                            // akurwthike h krathsh gia to oxhma
    {
        rent_vehicle_dates.remove(d);
    }

    
}
