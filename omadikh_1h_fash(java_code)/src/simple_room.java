//biniakou theofanis icsd13126 

public class simple_room extends room{
    public simple_room(String r_id, String beds, boolean view,double vasiki_timi)
    {
        super(r_id,beds,view,vasiki_timi);
    }
   
   
    
    @Override
    public double charge_per_day() //epistrefei to kostos ana hmera
    {
        double teliki_timi;
        
        //an to dwmatio einai monoklino
        if(beds.equals("monoklino")) 
            if(view == false) //an den exei thea
                teliki_timi = vasiki_timi; //tote epistrefei thn telikh timh
            else //an exei thea
                teliki_timi = (vasiki_timi + vasiki_timi*0.1); //kanei prosaukshsh 10%
        
        //an to dwmatio einai diklino
        else if(beds.equals("diklino")) 
            if(view == false) //an den exei thea
                teliki_timi = vasiki_timi + vasiki_timi * 1.6;
            else //an exei thea
                //kanei prosaukshsh 10%
                teliki_timi = (vasiki_timi + vasiki_timi * 1.6) + ((vasiki_timi + vasiki_timi * 1.6) * 0.1);
        
        //an to dwmatio einai triklino
        else 
            if(view == false) //an den exei thea
                teliki_timi = vasiki_timi + vasiki_timi * 2.1;
            else //an exei thea
                //kanei prosaukshsh 10%
                teliki_timi = (vasiki_timi + vasiki_timi * 2.1) + ((vasiki_timi + vasiki_timi * 1.6) * 0.1);
        
        
        return teliki_timi;
    }
}
