//biniakou theofanis icsd13126 , afalwniaths straths icsd13018, omadiki askisi 1h fash

public class luxury_room extends room{
    
    protected boolean hydromassage;
    
    
    public luxury_room(String r_id, String beds, boolean view, double vasiki_timi, boolean hydromassage)
    {
        super(r_id,beds,view,vasiki_timi);
        this.hydromassage = hydromassage;
    }
     
    @Override
    public double charge_per_day() //epistrefei to kostos ana hmera
    {
        double lux_timi,teliki_timi;
        //arxikopoiw me thn timh pou isoute se poluteles diklino dwmatio me thea xwris udromasaz
        lux_timi = (vasiki_timi + vasiki_timi * 1.6) + 1.5 * (vasiki_timi + vasiki_timi * 1.6);
        
        //an den exei udromasaz krataw thn arxikopoihmenh timh
        if (hydromassage == false)
            teliki_timi = lux_timi;
        //an exei udromasaz kanw thn prosafkshsh
        else 
            teliki_timi = lux_timi + lux_timi*0.1;
        
        
        return teliki_timi;
    }
    
    
    @Override
    public void print()
    {
        if (hydromassage == true)
            System.out.println("kwdikos dwmatiou: " + r_id +
                    "   arithmos klinwn: " + beds + "   thea: nai" + 
                    "   udromasaz: nai");
        else
            System.out.println("kwdikos dwmatiou: " + r_id +
                    "   arithmos klinwn: " + beds + "   thea: nai" +
                    "   udromasaz: oxi");
    }
}
