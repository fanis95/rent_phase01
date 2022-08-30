//biniakou theofanis icsd13126 , afalwniaths straths icsd13018, omadiki askisi 1h fash

public class Tester {
    
    public Tester()
    {
        hotel h = new hotel("new hotel","samos","4",150);
        
        h.add_rented(); // prosthetei enoikiazomena
        h.delete_rented(); // diagrafei enoikiazomena
        
        
        h.add_reservation(); // prosthetei krathsh
        
        h.search1(); // anazhthsh me vash ton kwdiko ths krathshs
        h.search2(); // anazhthsh me vash to onoma tou pelath
        h.search3(); // anazhthsh krathsewn pou antistoixoun se mia sugkekrhmenh hmeromhnia
        
        h.delete_reservation(); // afairei krathsh
        
        h.kathlhmena_dwmatia(); // emfanizei ta dwmatia pou einai kathlhmena mia sugkekrimenh mera
        h.kathlhmena_dwmatia_ana_kathgoria(); // emfanizei kateilhmmena dwmatia ana kathgoria mia sugkekrimenh mera
        
        h.income(); // upologismos esodwn tou ksenodoxeiou gia enan sugkekrimeno mhna
    }
}
