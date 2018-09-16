/**
 * A class to test the HighArray class.
 * @author Kathryn Cole
 * @date September 15, 2018
 */


public class HighArrayApp {
    public static void main( String[] args ) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray( maxSize );

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 35;
        if( arr.find( searchKey ) ) {
            System.out.println( "Found " + searchKey );
        } else {
            System.out.println( "Can't find " + searchKey );
        }

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        //arr.display();

        System.out.println( arr.getMax() ); 
        arr.delete(88);
        System.out.println( arr.getMax() );
        arr.insert(107);
        System.out.println( arr.getMax() );
        arr.insert(2000);
        System.out.println( arr.getMax() );

        HighArray testy = new HighArray( maxSize );
        System.out.println( testy.getMax() );

        System.out.println("noDups tests");
        arr.insert(2000);
        arr.insert(2000);
        arr.insert(2000);
        arr.display();
        arr.noDups();
        System.out.println("//");
        arr.display();

    }
}