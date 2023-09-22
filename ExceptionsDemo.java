public class ExceptionsDemo {
    public static void main(String[] args) {
        /* Types of Exception */
        /*
         * int a=20;
         * int b=0;
         * int c=a/b;
         * System.out.println(c); //Arithmetic Exception
         */

        /*
         * String s = null;
         * System.out.println(s.length()); //NullPointer Exception
         */

        /*
         * String s = "xyz";
         * int i=Integer.parseInt(s);//NumberFormat Exception
         * System.out.println(i);
         */

        /*
         * int arr[] = {10,20,30,40,50};
         * System.out.println(arr[10]); //ArrayIndexOutOfBoundsException
         */

        /* Mechanism to handlin all types of Exception in Java */

        /*
         * try & catch block
         * syntax---
         * try{
         * //exception code
         * }catch(Exception e){
         * //display message after handling the exception
         * sout(e)
         * }
         *
         */
        // Arithmetic Exception
        /*
         * int a = 20; // 1
         * int b = 0; // 2
         * int c;
         * // try: detect the exception
         * try {
         * c = a / b; // 3
         * System.out.println(c); // 4
         * } catch (ArithmeticException e) {
         * //e.printStackTrace();// 5
         * //System.out.println(e);
         * //System.out.println(e.getMessage());
         * //System.out.println("Can't divided by Zero");
         * //solution also provide
         * System.out.println(a/(b+2));
         * }
         */

        // Null Pointer Exception
        /*
         * try{
         * String s = null;
         * System.out.println(s.length());
         * }catch(NullPointerException n)
         * {
         * n.printStackTrace();
         * }
         */

        // NumberFormatException a

        // Array Index
        /*
         * int arr[] = { 10, 20, 30, 40, 50 };
         * try {
         * System.out.println(arr[10]);
         * } catch (ArrayIndexOutOfBoundsException a) {
         * //a.printStackTrace();
         * System.out.println("Array is out of bound");
         * }
         */

        // Finaly Block
        /*
         * try{
         * System.out.println("Youth Career Hub");
         * int a = 20, b=0, c;
         * c = a/b;
         * System.out.println(c);
         * System.out.println("Like, Share, Subscribe");
         * }catch(ArithmeticException e){
         * e.printStackTrace();
         * }finally{
         * System.out.println("Join our Institute");
         * }
         */

        // Multipl try-catch
        /*
         * try{
         * int a=20,b=0;
         * int c=a/b;
         * System.out.println(c);
         * }catch(ArithmeticException a){
         * a.printStackTrace();
         * }
         * try{
         * int a[] = {1,2,3};
         * System.out.println(a[4]);
         * }catch(ArrayIndexOutOfBoundsException ar){
         * ar.printStackTrace();
         * }
         */

        // Multiple Catch Block
        /*
         * try {
         * int a = 20, b = 10;
         * int c = a / b; //
         * System.out.println(c);
         * 
         * int ar[] = { 1, 2, 3 };
         * System.out.println(ar[2]);
         * 
         * String s = null;
         * System.out.println(s.length());
         * 
         * } catch (ArrayIndexOutOfBoundsException e) {
         * e.printStackTrace();
         * } catch (ArithmeticException a) {
         * a.printStackTrace();
         * } catch (Exception ex) {
         * ex.printStackTrace();
         * }
         */

        // Nested Try Block
        /*
         * try {
         * try {
         * try {
         * String s = null;
         * System.out.println(s.length());
         * } catch (NullPointerException n) {
         * n.printStackTrace();
         * }
         * int ar[] = { 1, 2, 3 };
         * System.out.println(ar[4]); // 2
         * } catch (ArrayIndexOutOfBoundsException a) {
         * a.printStackTrace(); // 3
         * }
         * System.out.println(10 / 0);
         * } catch (ArithmeticException e) {
         * e.printStackTrace(); // 4
         * }
         */

        // Nested Catch
        /*try {
            System.out.println(10/5);
        } catch (Exception e) {
            try {
                String a = null;
                System.out.println(a.toLowerCase());
            } catch (NullPointerException n) {
                n.printStackTrace();
                try{
                    int arr[] = {1,2,3};
                    System.out.println(arr[15]);
                }catch(ArrayIndexOutOfBoundsException ar){
                    ar.printStackTrace();
                }
            }
            e.printStackTrace();
        }*/

        //Nested Finally
        try{
            String name = "Indra";
            System.out.println(name.toUpperCase());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                System.out.println(10/5);
            }catch(ArithmeticException a){
                a.printStackTrace();
            }finally{
                System.out.println("Youth Career Hub");
                try{
                    int arr[] = {1,2,3};
                    System.out.println(arr[2]);
                }catch(ArrayIndexOutOfBoundsException arr){
                    arr.printStackTrace();
                }finally{
                    System.out.println("Thank you very much for todays class");
                }
            }
        }

        System.out.println("Main method end"); // 5

        // if no exception
        /*
         * 1 2 3 4 6 Termination: Normal
         * 
         */
        // if exception in 3rd statement
        /*
         * 1 2 5 6 Termination: Ab Normal
         * 
         */
    }
}