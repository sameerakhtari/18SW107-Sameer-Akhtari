public class StaticRunner{

   public static void main( String[] args ) {

        StaticTest st = new StaticTest();

        // calling a nonstatic member function
        System.out.println(" 2 * 2 = " + st.multiply(2,2));

        // calling a static member function
        System.out.println(" 2 + 3 = " + StaticTest.add(2,3));
   }
}