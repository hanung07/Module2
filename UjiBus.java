package PR;
public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini=new Bus(5);
        busMini.cetak();
        

        
        busMini.pluspenumpang(+6);
        busMini.cetak();
        

        busMini.pluspenumpang(+5);
        busMini.cetak();
        
        
        busMini.pluspenumpang(-4);
        busMini.cetak();
        
          
    }
}



