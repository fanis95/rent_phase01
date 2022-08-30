//biniakou theofanis icsd13126 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class hotel {
    protected String name;
    protected String location;
    protected String stars;
    protected double vasiki_timi_dwmatiou;
    protected List<reservation> krathseis = new ArrayList<>();
    protected Collection<rented> enoik = new ArrayList<>();
    
    
    public hotel(String name, String location, String stars, double vasiki_timi_dwmatiou)
    {
        this.name = name;
        this.location = location;
        this.stars = stars;
        this.vasiki_timi_dwmatiou = vasiki_timi_dwmatiou;
    }
    
    void add_rented()
    {
        rented r; // dhmiourgw ena antikeimeno tupou rented
        
        // vazw sthn sullogh me ta enoikiazomena kapoia koina dwmatia
        r = new simple_room("sr1","3",true,vasiki_timi_dwmatiou);
        enoik.add(r);
        r = new simple_room("sr2","1",true,vasiki_timi_dwmatiou);
        enoik.add(r);
        r = new simple_room("sr3","2",false,vasiki_timi_dwmatiou);
        enoik.add(r);
        
        // vazw sthn sullogh me ta enoikiazomena kapoia poluteles dwmatia
        r = new luxury_room("lr1","2",true,vasiki_timi_dwmatiou,true);
        enoik.add(r);
        r = new luxury_room("lr2","2",true,vasiki_timi_dwmatiou,false);
        enoik.add(r);
        r = new luxury_room("lr3","2",true,vasiki_timi_dwmatiou,true);
        enoik.add(r);
        
        // vazw sthn sullogh me ta oxhmata kapoia autokinhta
        r = new car("car1");
        enoik.add(r);
        r = new car("car2");
        enoik.add(r);
        
        // vazw sthn sullogh me ta oxhmata kapoies gourounes
        r = new atv("atv1");
        enoik.add(r);
        r = new atv("atv2");
        enoik.add(r);
        
        // vazw sthn sullogh me ta oxhmata kapoia scooter
        r = new scooter("scooter1");
        enoik.add(r);
        r = new scooter("scooter2");
        enoik.add(r);
        
        // emfanizw thn lista me ta enoikiazomena
        System.out.println("\nENOIKIAZOMENA: ");
        enoik.parallelStream()
        .forEach(e -> e.print());
        
        // eisagwgh enoikiazomenou xeirokinhta
        System.out.print("\nthelete na prosthesete kai allo enoikiazomeno? (y or n): ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        
        if (a.equals("y"))
        {
            String flag = "y";
            while(flag.equals("y"))
            {
                System.out.println("eisagwgh dwmatiou(0) h oxhmatos(1)? (apanthste me 0 h 1)");
            
                int answear1 = in.nextInt();
        
                // veveonomai oti o xristis tha dwsei tis swstes times
                while(answear1 != 0 && answear1 != 1)
                {
                    System.out.println("eisagwgh dwmatiou(0) h oxhmatos(1)? (apanthste me 0 h 1)");
                    answear1 = in.nextInt();
                }
            
            
                if(answear1 == 0)
                {
                
                    String r_id; // o kwdikos dwmatiou 
               
                    in.nextLine();
                    System.out.println("eisagwgh koinou(0) h polutelous(1) dwmatiou? (apanthste me 0 h 1)");
                    int answear2 = in.nextInt();
            
                    // veveonomai oti o xristis tha dwsei tis swstes times
                    while(answear2 != 0 && answear2 != 1)
                    {
                        System.out.println("eisagwgh koinou(0) h polutelous(1) dwmatiou? (apanthste me 0 h 1)");
                        answear2 = in.nextInt();
                    }
                        // to koino stoixeio pou exoun ta koina me ta poluteles dwmatia
                        in.nextLine();
                        System.out.println("kwdikos dwmatiou: ");
                        r_id = in.nextLine();
            
                    if (answear2 == 0) // an dhladh ginei eisagwgh koinou dwmatiou
                    {
                        String beds; // posa krevatia exei to dwmatio
                        boolean view; // an exei thea
                   
                        System.out.println("posa krevatia periexei: ");
                        beds = in.nextLine();
                        System.out.println("exei thea? (apanthste me false h true)");
                        view = in.nextBoolean();
                    
                        r = new simple_room(r_id,beds,view,vasiki_timi_dwmatiou); // dimiourgw to koino dwmatio
                    }
                    else
                    {
                        boolean hydromassage; // an periexei udromasaz to dwmatio
                        System.out.println("exei udromasaz? (apanthste me false h true)");
                        hydromassage = in.nextBoolean();
                
                        r = new luxury_room(r_id,"2",true,vasiki_timi_dwmatiou,hydromassage); // dimiourgw to poluteles dwmatio
                        // to "2" einai h default timh gia ta krevatia tou dwmatiou
                        // to true einai h default timh gia to an exei thea to dwmatio
                        // oi 2 panw times einai default shmfwna me ta dedomena ths askhshs
                    }
            }
        
            else // edw ginetai h eisagwgh enos oxhmatos
            {
                System.out.println("eisagwgh autokinhtoy(0), gourounas(1) h scooter(2)? (apanthste me 0 h 1 h 2) ");
                int answear2 = in.nextInt();
            
                // veveonomai oti o xristis tha dwsei tis swstes times
                while(answear2 != 0 && answear2 != 1 && answear2 != 2)
                {
                    System.out.println("eisagwgh autokinhtoy(0), gourounas(1) h scooter(2)? (apanthste me 0 h 1 h 2) ");
                    answear2 = in.nextInt();
                }
                in.nextLine();
            
                String number; // o monadikos arithmos tou kathe oxhmatos
                System.out.println("dwste ton arithmo pinakidas: ");
                number = in.nextLine();
            
            
                switch (answear2) {
                    case 0:
                        r = new car(number); // an to oxhma einai autokinhto, tote prosthetw ena autokinhto
                        break;
                    case 1:
                        r = new atv(number); // antistoixa an einai gourouna
                        break;
                    default:
                        r = new scooter(number); // kai an einai scooter
                        break;
                }
            }
            // rwtaw gia thn eisagwgh perissoterwn enoikiazomenwn
                System.out.println("thelete na kanete kai allh eisagwgh? (y or n): ");
                flag = in.nextLine();
            
            enoik.add(r); // eisagwgh tou enoikiazomenou sthn sullogh me ta enoikiazomena
        }
        }
        
        // emfanizw thn lista me ta enoikiazomena
        System.out.println("\nENOIKIAZOMENA: ");
        enoik.parallelStream()
        .forEach(e -> e.print());
        
    }
    
    void delete_rented() // h katarghsh enos enoikiazomenou
    {
        List<rented> pros_diagrafh = new ArrayList<>(); // se auth thn lista tha vazw ta enoikiazomena pros diagrafh
                                                            // apo to collection
        
        enoik.stream().filter((r) -> (r instanceof room)).forEach((rented r) -> {
            room m = (room) r;
            if (m.get_id().equals("sr2")) {
                pros_diagrafh.add(m);
            }
        });
        
        enoik.stream().filter((r) -> (r instanceof vehicle)).forEach((rented r) -> {
            vehicle v = (vehicle) r;
            if (v.get_n().equals("atv1")) {
                pros_diagrafh.add(v);
            }
        });
        
        enoik.removeAll(pros_diagrafh); // afairw apo thn collection me ta enoikiazomena, ta enoikiazomena pou thelei o 
                                            // xrhsths na diagrapsei
        
        System.out.println("\n\nmeta thn diagrafh: ");
        System.out.println("\nENOIKIAZOMENA: ");
        enoik.parallelStream()
        .forEach(e -> e.print());
        
        //diagrafh enoikiazomenoi xeirokinhta
        System.out.print("\nthelete na afairesete kai allo enoikiazomeno? (y or n): ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        
        if (a.equals("y"))
        {
            String flag="y";
            while(flag.equals("y"))
            {
                System.out.println("katarghsh dwmatiou(0) h oxhmatos(1)? (apanthste me 0 h 1)");
            
                int answear1 = in.nextInt();
                in.nextLine();
            
                // veveonomai oti o xristis tha dwsei tis swstes times
                while(answear1 != 0 && answear1 != 1)
                {
                    System.out.println("katarghsh dwmatiou(0) h oxhmatos(1)? (apanthste me 0 h 1)");
                    answear1 = in.nextInt();
                }
            
            
            
                if (answear1 == 0) // katargisi enos dwmatiou
                {
                    String r_id;
                
                    System.out.println("dwste ton kwdiko dwmatiou: ");
                    r_id = in.nextLine();
                
                    enoik.stream().filter((r) -> (r instanceof room)).forEach((r) -> {
                        room m = (room) r;
                        if (m.get_id().equals(r_id)) 
                        {
                            pros_diagrafh.add(m);
                        }
                    }); 

                }
            
                else // katargisi enos oxhmatos
                {
                    String number;
                
                    System.out.println("dwste ton arithmo oxhmatos: ");
                    number = in.nextLine();
                

                    enoik.stream().filter((r) -> (r instanceof vehicle)).forEach((rented r) -> {
                        vehicle m = (vehicle) r;
                        if (m.get_n().equals(number))
                        {
                            pros_diagrafh.add(m);
                        }
                    });
                }
            
                enoik.removeAll(pros_diagrafh); // afairw apo to collection to enoikiazomeno pou thelei na afairesei o xrhsths
            
                System.out.println("thelete na kanete kai allh katarghsh? (y or n): ");
                flag = in.nextLine();
            }
        }
        System.out.println("\nENOIKIAZOMENA: ");
        enoik.parallelStream()
        .forEach(e -> e.print());
       
    }
    
    void add_reservation()  // dhmiourgeia krathshs
    {
        String flag = "y";
        while(flag.equals("y"))
        {
        
            System.out.println("\n\nTi krathsh tha thelate? ");
            System.out.println("dwmatio(0) h oxhma(1)? ");
            Scanner in = new Scanner(System.in);
            
            int answear1 = in.nextInt();
            
            // veveonomai oti o xristis tha dwsei tis swstes times
            while(answear1 != 0 && answear1 != 1)
            {
               System.out.println("Ti krathsh tha thelate? ");
               System.out.println("dwmatio(0) h oxhma(1)? ");
               answear1 = in.nextInt();
            }
        
            reservation r;
            rented ren = null;
            
            if (answear1 == 0) // tha ginei krathsh enos dwmatiou
            {
                in.nextLine();
                System.out.println("krathsh koinou(0) h polutelous(1) dwmatiou? (apanthste me 0 h 1)");
                int answear2 = in.nextInt();
            
                // veveonomai oti o xristis tha dwsei tis swstes times
                while(answear2 != 0 && answear2 != 1)
                {
                    System.out.println("krathsh koinou(0) h polutelous(1) dwmatiou? (apanthste me 0 h 1)");
                    answear2 = in.nextInt();
                }
                in.nextLine();
                
                System.out.println("dwste ton kwdiko dwmatiou pou thelete na kanete krathsh: ");
                String id = in.nextLine();
                
                // an o xristis thelei na enoikiasei ena dwmatio/oxhma, tote psaxnw na vrw to dwmatio/oxhma pou thelei,
                // an uparxei sthn sullogh me ta enoikiazomena tou ksenodoxeiou kai to krataw se ena antikeimeno 
                // tupou "rented" gia na borw na to xrhsimopoihsw
                
                
                if (answear2 == 0) // tha ginei krathsh enos koinou dwmatiou
                {
                    for (rented e : enoik) { // psaxnw sthn lista me ta enoikiazomena
                        if (e instanceof simple_room) // an to antikeimeno einai tupou simple_room
                        {
                            simple_room s = (simple_room) e; // ftiaxnw antikeimeno kai to kanw cast ston tupo klashs pou
                                                                // xreiazomai
                            if (s.get_id().equals(id)) {    // edw psaxnw na dw an einai to antikeimeno pou edwse o xristis
                                ren = (rented) e;  // kai an einai to enoikiazomeno pou psaxnei o xristis 
                                                    // to krataw gia xrhsh parakatw
                            } else {
                            }
                        }
                    }
                    
                }
                
                // h diadikasia anazhthshs einai akrivws h idia me thn parapanw if
                else // tha ginei krathsh enos polutelous dwmatiou
                {
                    for (rented e : enoik) { 
                        if (e instanceof luxury_room) 
                        {
                            luxury_room s = (luxury_room) e; 
                            if (s.get_id().equals(id)) {    
                                ren = (rented) e;  
                            } else {
                            }
                        }
                    }
                }
            }
            else // tha ginei krathsh enos oxhmatos
                    // h diadikasia anazhthshs einai akrivws h idia me thn diadikasia anazhthshs dwmatiou
            {
                System.out.println("krathsh autokinhtoy(0), gourounas(1) h scooter(2)? (apanthste me 0 h 1 h 2) ");
                int answear2 = in.nextInt();
            
                // veveonomai oti o xristis tha dwsei tis swstes times
                while(answear2 != 0 && answear2 != 1 && answear2 != 2)
                {
                    System.out.println("krathsh autokinhtoy(0), gourounas(1) h scooter(2)? (apanthste me 0 h 1 h 2) ");
                    answear2 = in.nextInt();
                }
                in.nextLine();
                
                System.out.println("dwste ton aithmo kukloforias tou oxhmatos pou thelete na kanete krathsh: ");
                String number = in.nextLine();
                
                
                switch (answear2) {
                // tha ginei krathsh enos autokinhtou
                    case 0:
                    for (rented e : enoik) { 
                        if (e instanceof car) 
                        {
                            car c = (car) e; 
                            if (c.get_n().equals(number)) {    
                                ren = (rented) e;  
                            } else {
                            }
                        }
                    }
                        break;
                // tha ginei krathsh mias gourounas
                    case 1:
                       for (rented e : enoik) { 
                        if (e instanceof atv) 
                        {
                            atv a = (atv) e; 
                            if (a.get_n().equals(number)) {    
                                ren = (rented) e;  
                            } else {
                            }
                        }
                    }
                        break;
                // tha ginei krathsh enos scooter
                    default:
                        for (rented e : enoik) { 
                        if (e instanceof scooter) 
                        {
                            scooter s = (scooter) e; 
                            if (s.get_n().equals(number)) {    
                                ren = (rented) e;  
                            } else {
                            }
                        }
                    }
                        break;
                }
            }
            
            LocalDate start,end;
            
            System.out.println("dwste tis hmeromhnies pou thelete gia krathsh");
            int year,month,day;
            
            // edw pernw apo poia hmeromhnia thelei o xristis to enoikiazomeno
            System.out.println("apo");
            System.out.print("xronia: ");
            year = in.nextInt();
            
            System.out.print("mhnas(1-12): ");
            month = in.nextInt();
            
            System.out.print("mera(1-31): ");
            day = in.nextInt();
            
            
            start = LocalDate.of(year,month,day);
            
            // kai edw mexri poia hmeromhnia thelei o xristis to enoikiazomeno
            System.out.println("mexri");
            System.out.print("xronia: ");
            year = in.nextInt();
            
            System.out.print("mhnas(1-12): ");
            month = in.nextInt();
            
            System.out.print("mera(1-31): ");
            day = in.nextInt();
            
            
            end = LocalDate.of(year,month,day);
            
            
            // edw elegxw an to enoikiazomeno pou thelei o pelaths einai diathesimo
                // stis hmeromhnies pou edwse parapanw
                
            int flag_days = 0;
            
            for (LocalDate d = start; !d.isAfter(end); d = d.plusDays(1)) // apo thn hmeromhnia start 
                                                                            // mexri thn hmerominia end
                                                                                // ana mia hmera
            {
                if (ren instanceof room)
                {
                    room rm = (room) ren;
                    if (rm.available(d))
                    {
                        flag_days = 1; // dhladh h hmeromhnia pou endiaferetai o pelaths na enoikiasei to 
                                    //enoikiazomeno ren, einai piasmenh ara den prepei na ginei h krathsh
                        break;
                    }
                }
                if (ren instanceof vehicle)
                {
                    vehicle v = (vehicle) ren;
                    if (v.available(d))
                    {
                        flag_days = 1; // dhladh h hmeromhnia pou endiaferetai o pelaths na enoikiasei to 
                                    //enoikiazomeno ren, einai piasmenh ara den prepei na ginei h krathsh
                        break;
                    }
                }
            }
            
            if (flag_days == 1)
            {
                System.out.println("den einai dunath h krathsh. Oi hmeromhnies pou dwsate einai kleistes");
                in.nextLine();
            }
                
            else // an dhladh to flag_days == 0, tote prepei na ginei h krathsh afou oi hmeromhnies den einai kleistes
            {
                if (ren instanceof room)
                {
                    room rm = (room) ren;
                    for (LocalDate d = start; !d.isAfter(end); d = d.plusDays(1))
                    {
                        rm.add_date(d);
                    }
                
                }
                else if (ren instanceof vehicle)
                {
                    vehicle v = (vehicle) ren;
                    for (LocalDate d = start; !d.isAfter(end); d = d.plusDays(1))
                    {
                        v.add_date(d);
                    }
                
                }
                in.nextLine();
                // rwtaw ton xristi an thelei na kanei thn krathsh
                System.out.println("\nthelete na ginei h krathsh? (y or n)");
                String a = in.nextLine();
                
                
                // veveonomai oti o xristis tha dwsei tis swstes times
                while(!a.equals("y") && !a.equals("n"))
                {
                    System.out.println("dwste thn swsth apanthsh");
                    System.out.println("\nthelete na ginei h krathsh? (y or n)");
                    a = in.nextLine();
                }
                
                
                
                if (a.equals("y")) // an o xristis apanthsei y tote dhmiourgw thn krathsh
                {
                    System.out.print("dwste to epwnumo: ");
                    String epwnumo = in.nextLine();
                
                    System.out.print("dwste to onoma: ");
                    String onoma = in.nextLine();
                
                    // dhmiourgw thn krathsh
                    r = new reservation(epwnumo,onoma,start,end,ren);
                    // kai thn prosthetw sthn lista me tis krathseis
                    krathseis.add(r);
                }
                
            }
            System.out.print("\nthelete na kanete kai allh krathsh? (y or n): ");
            flag = in.nextLine();
        }
        
        krathseis.parallelStream()
        .forEach(e -> e.print());
    }
    
    
    void search1() // anazhthsh me vash ton kwdiko ths krathshs
    {
        System.out.println("\n\nanazhthsh me vash ton kwdiko ths krathshs");
        System.out.println("kwdikoi krathsewn: "); // emfanizw olous tous kwdikous twn krathsewn
        krathseis.stream().forEach((reservation res) -> {
            System.out.println(res.get_id());
        });
        String flag = "y";
        while(flag.equals("y"))
        {
            System.out.println("dwste ton kwdiko ths krathshs");
            Scanner in = new Scanner(System.in);
        
            int id = in.nextInt();
        
            krathseis.stream().filter((reservation r) -> r.get_id() == id).forEach((r) -> {
                r.print();
            });
            in.nextLine();
            System.out.print("\nthelete kai allh anazhthsh me vash ton kwdiko ths krathshs? (y or n): ");
            flag = in.nextLine();
        }
    }
    
    void search2() // anazhthsh me vash to onoma tou pelath
    {
        
        System.out.println("\n\nanazhthsh me vash to onoma tou pelath");
        String flag = "y";
        while(flag.equals("y"))
        {
            System.out.println("dwste to onoma tou pelath");
            Scanner in = new Scanner(System.in);
        
            System.out.print("epwnumo: ");
            String last = in.nextLine();
        
            System.out.print("onoma: ");
            String first = in.nextLine();
        
            // kanei anazhthsh sthn lista kai ektupwnei thn/tis krathsh/krathseis me vash to onoma enos pelath
            krathseis.stream().filter((r) -> (r.get_l_name().equals(last)) && 
                    (r.get_f_name().equals(first))).forEach(reservation::print);
            System.out.print("\nthelete kai allh anazhthsh me vash to onoma tou pelath? (y or n): ");
            flag = in.nextLine();
        }
    }
    
    void search3() // anazhthsh krathsewn pou antistoixoun se mia sugkekrhmenh hmeromhnia
    {
        System.out.println("\n\nanazhthsh krathsewn pou antistoixoun se mia sugkekrhmenh hmeromhnia");
        Scanner in = new Scanner(System.in);
        
        String flag = "y";
        while(flag.equals("y"))
        {
            // zhtaw apo ton xristi thn hmeromhnia
            System.out.print("xronia: ");
            int year = in.nextInt();
            
            System.out.print("mhnas(1-12): ");
            int month = in.nextInt();
            
            System.out.print("mera(1-31): ");
            int day = in.nextInt();
            
            LocalDate d = LocalDate.of(year,month,day);
       
            // diasxish ths listas me tis krathseis 
            // vriskw poies krathseis uparxoun mia sigkekrimenh hmeromhnia
            // gia kathe krathsh dhladh, vlepw an h hmeromhnia pou edwse o xristis einai endiamesa apo tis hmeromhnies
                // ths krathshs
            krathseis.stream().filter((r) -> (d.isAfter(r.get_start()) && d.isBefore(r.get_end()))).forEach((r) -> {
                r.print();
            });
            in.nextLine();
            System.out.print("\nthelete kai allh anazhthsh krathsewn pou antistoixoun se mia sugkekrhmenh hmeromhnia? (y or n): ");
            flag = in.nextLine();
        }
    }
    
    void delete_reservation() // diagrafh krathshs
    {
        System.out.println("\n\ndwste ton monadiko kwdiko ths krathshs pou epithimeite na diagrapsete: ");
        Scanner in = new Scanner(System.in);
        
        int id = in.nextInt();
        
        List<reservation> pros_diagrafh = new ArrayList<>(); // se auth thn lista tha vazw ta enoikiazomena pros diagrafh
                                                            // apo to collection
        
        // anazhthsh sthn lista gia thn krathsh me ton kwdiko pou edwse o xristis
        krathseis.stream().filter((r) -> (r.get_id() == id)).forEach((r) -> {
            // tha afairesw tis hmeromhnies apo tis listes, pou krataw pote ena enoikiazomeno einai kathllhmeno
                if (r.get_rented() instanceof room)
                {
                    reservation rs = (reservation) r;
                    room rm = (room) rs.get_rented();
                    for (LocalDate d = rs.get_start(); !d.isAfter(rs.get_end()); d = d.plusDays(1))
                    {
                        rm.remove_date(d);
                    }
                    
                }
                else if (r.get_rented() instanceof vehicle)
                {
                    reservation rs = (reservation) r;
                    vehicle v = (vehicle) rs.get_rented();
                    for (LocalDate d = rs.get_start(); !d.isAfter(rs.get_end()); d = d.plusDays(1))
                    {
                        v.remove_date(d);
                    }
                    
                }
            pros_diagrafh.add(r);
        }); 
        
        krathseis.removeAll(pros_diagrafh); // afairw apo thn lista me tis krathseis, tis krathseis pou thelei o 
                                            // xrhsths na diagrapsei
        
        krathseis.parallelStream()
        .forEach(e -> e.print());
    }
    
    void kathlhmena_dwmatia() // emfanizei ta dwmatia pou einai kathlhmena mia sugkekrimenh mera
    {
        System.out.println("\n\ndwmatia pou einai kathlhmena sthn parakatw hmeromhnia");
        Scanner in = new Scanner(System.in);
        
        // zhtaw apo ton xristi thn hmeromhnia
        System.out.print("xronia: ");
        int year = in.nextInt();
            
        System.out.print("mhnas(1-12): ");
        int month = in.nextInt();
            
        System.out.print("mera(1-31): ");
        int day = in.nextInt();
            
        LocalDate d = LocalDate.of(year,month,day);
        
        enoik.stream().filter((r) -> (r instanceof rented)).forEach((rented r) -> {
            rented rd = (rented) r;
            if (rd instanceof room) {
                if (r.available(d)) // an einai kathllhmeno to dwmatio thn hmeromhnia d, tote h sunarthsh available()
                                    // tha epistrepsei true, kai tha emfanhsei ta stoixeia tou dwmatiou
                                // den uparxei thema mhpws emfanhstei kapoio enoikiazomeno parapanw apo mia fora
                                    // giati oi krathseis einai monadikes
                r.print();
            }
        });
        
    }
    
    void kathlhmena_dwmatia_ana_kathgoria() // emfanizei kateilhmmena dwmatia ana kathgoria mia sugkekrimenh mera
    {
        System.out.println("\n\nkathlhmena dwmatia ana kathgoria sthn parakatw hmeromhnia");
        // kanw 2 listes gia kathe kathgoria (koino kai poluteles dwmatio) gia na ta ektupwsw ana kathgoria
        ArrayList<simple_room> sr = new ArrayList<>();
        ArrayList<luxury_room> lr = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        
        // zhtaw apo ton xristi thn hmeromhnia
        System.out.print("xronia: ");
        int year = in.nextInt();
            
        System.out.print("mhnas(1-12): ");
        int month = in.nextInt();
            
        System.out.print("mera(1-31): ");
        int day = in.nextInt();
            
        LocalDate d = LocalDate.of(year,month,day);
        
        enoik.stream().filter((r) -> (r instanceof rented)).forEach((rented r) -> {
            if (r instanceof simple_room) {
                simple_room rd = (simple_room) r;
                if (rd.available(d)) // an einai kathllhmeno to dwmatio thn hmeromhnia d, tote h sunarthsh available()
                                    // tha epistrepsei true, kai tha emfanhsei ta stoixeia tou dwmatiou
                    sr.add(rd); // prosthetw to koino dwmatio sthn lista gia emfanish argotera
            }
            else if(r instanceof luxury_room)
            {
                luxury_room rd = (luxury_room) r;
                if (r.available(d)) // an einai kathllhmeno to dwmatio thn hmeromhnia d, tote h sunarthsh available()
                                    // tha epistrepsei true, kai tha emfanhsei ta stoixeia tou dwmatiou
                    lr.add(rd); // prosthetw to poluteles dwmatio sthn lista gia emfanish argotera
            }
        });
        
        System.out.println("koina dwmatia: ");
        sr.stream().forEach(room::print);
        
        System.out.println("poluteles dwmatia: ");
        lr.stream().forEach(room::print);
        
    }
    
    void income() // upologismos esodwn tou ksenodoxeiou gia enan sugkekrimeno mhna
    {
        
        System.out.println("\n\ngia poion mhna thelete ton upologismo twn esodwn? (1-12): ");
        Scanner in = new Scanner(System.in);
        
        int month = in.nextInt(); // o mhnas gia ton opoio tha upologisw ta esoda
        
        double esoda=0; // ta esoda tou ksenodoxeiou gia ton mhna pou edwse o xristis
        
        for (reservation r : krathseis) 
        {
            rented rd = r.get_rented(); // kai apo to antikeimeno reservation pernw to enoikiazomeno pou afora thn krathsh
            
            // an h krathsh einai oloklhrh ston mhna pou exei orisei o xrhsths, tote apla epistrefw thn xrewsh
                // oloklhrhs ths krathshs
            // dhladh h krathsh arxizei kai teleiwnei ton idio mhna
            if (r.get_start().getMonthValue() == month && r.get_end().getMonthValue() == month)
            {
                esoda += r.charge();
            }
            // an omws h krathsh einai spasmenh se dio mhnes, tote vriskw poies meres anhkoun ston mhna pou theloume
                // kai kalw thn sunarthsh pou upologizei thn xrewsh ana hmera gia to enoikiazomeno pou afora thn krathsh
            else if (r.get_start().getMonthValue() == month || r.get_end().getMonthValue() == month)
            {
                for (LocalDate d = r.get_start(); !d.isAfter(r.get_end()); d = d.plusDays(1))
                    if (d.getMonthValue() == month)
                        esoda += rd.charge_per_day();
            }
        }
        
        System.out.println("ta esoda gia ton " + month + "o mhna einai: " + esoda);
        
    }
    
}
