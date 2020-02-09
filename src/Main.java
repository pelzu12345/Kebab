public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Kebab[] kebabs= new Kebab[3] ;

        kebabs[0] =new Kebab(25,"Sralibaba","Wypali morde nie jednemu ") ;
        kebabs[1]=new Kebab( ) ;
        System.out.println(kebabs[0]+"*****"+kebabs[1]);

        Kebab.setKebabName("Najgorszy kebab w miescie" );

        System.out.println(kebabs[0]+"*****"+kebabs[1]);
//        kebabs[1] =new Kebab(25,"Łagodny falafel","Kebab dla pedałow") ;
//        kebabs[2] =new Kebab(25,"Srednia Baranina na Grubym","") ;

    }
}
