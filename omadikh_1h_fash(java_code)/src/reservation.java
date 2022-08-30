//biniakou theofanis icsd13126 , afalwniaths straths icsd13018, omadiki askisi 1h fash

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class reservation {
    
    protected static final AtomicInteger count = new AtomicInteger(0); 
    protected final int r_id; // kwdikos krathshs
    protected String l_name; //epwnumo
    protected String f_name; //onoma
    protected LocalDate start; //hmeromhnia enarksis
    protected LocalDate end; //hmeromhnia liksis
    protected rented r; // to enoikiazomeno pou afora thn krathsh
    
    public reservation(String l_name, String f_name, LocalDate start, LocalDate end, rented r)
    {
        // dhmiourgw ena monadiko id
        this.r_id = count.incrementAndGet(); // auksanei kata ena, to prohgoumeno r_id tou prohgoumenou antikeimenou
        this.l_name = l_name; // epwnumo pelath
        this.f_name = f_name; // onoma pelath
        this.start = start; // hmeromhnia apo otan arxisei h krathsh
        this.end = end; // hmeromhnia mexri na teleiwsei h krathsh
        this.r = r;    // antikeimeno tupou rented pou uparxei sthn krathsh 
    }
    
    double charge()
    {
        // upologizw poses meres einai h krathsh
        int days = 0;
        // gia kathe hmeromhnia, arxizontas apo thn start
        for (LocalDate d = start; !d.isAfter(end); d = d.plusDays(1)) {
            days++;
        }
        
        double xrewsh;
        // h xrewsh gia mia krathsh tha upologizetai apo 
            // to sunolo twn merwn pou exei ginei h krathsh
                //epi thn xrewsh ana hmera analoga to enoikiazomeno
        xrewsh = days * r.charge_per_day();
        
        return xrewsh;
    }
    
    
    int get_id()
    {
        return r_id;
    }
    
    String get_l_name()
    {
        return l_name;
    }
    
    String get_f_name()
    {
        return f_name;
    }
    
    LocalDate get_start()
    {
        return start;
    }
    
    LocalDate get_end()
    {
        return end;
    }
    
    rented get_rented()
    {
        return r;
    }
    
    void print()
    {
        System.out.println("kwdikos krathshs: " + r_id + 
                "   epwnumo: " + l_name + "   onoma: " + f_name + 
                "   hmeromhnia(apo): " + start + 
                "   hmeromhnia(mexri): " + end );
        System.out.print("enoikiazomeno krathshs:   ");
        r.print();
    }
    
}
