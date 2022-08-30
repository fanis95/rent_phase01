//biniakou theofanis icsd13126 

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class room implements rented{
    protected String r_id;
    protected String beds;
    protected boolean view;
    protected double vasiki_timi;
    protected ArrayList<LocalDate> rent_room_dates = new ArrayList<>();
    
    public room (String r_id, String beds, boolean view, double vasiki_timi)
    {
        this.r_id = r_id;
        this.beds = beds;
        this.view = view;
        this.vasiki_timi = vasiki_timi;
    }
    
    public String get_id()
    {
        return this.r_id;
    }
    
    @Override
    public void print()
    {
        if (view == true)
            System.out.println("kwdikos dwmatiou: " + r_id +
                    "   arithmos klinwn: " + beds + "   thea: nai");
        else
            System.out.println("kwdikos dwmatiou: " + r_id +
                    "   arithmos klinwn: " + beds + "   thea: oxi");
    }
    
    @Override
    public boolean available(LocalDate d) { // an h lista me tis hmeromhnies pou to dwmatio einai piasmeno periexei thn 
                                            // hmeromhnia d, tote epistrefei true alliws false
        return rent_room_dates.contains(d);
    }
    
    @Override
    public void add_date(LocalDate d) // tha prosthetw oles tis hmeromhnies pou to dwmatio tha einai enoikiasmeno
    {
        rent_room_dates.add(d);
    }
    
    @Override
    public void remove_date(LocalDate d) // tha diagrapsw oles tis hmeromhnies gia tis opoies akurwthike h krathsh gia to dwmatio
    {
        rent_room_dates.remove(d);
    }
    
}
