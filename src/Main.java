/*
Booleans Operators 03
Exercise: Boolean Operators 3
Try to solve on paper the following boolean algebra operations:

[A]: !(!(!(false ^ false) || (true && true)))
[B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1)
Then compare your solutions with a Java program that tests the validity of your assumptions.
 */
public class Main {
    public static void main(String[] args) {

        //[A]: !(!(!(false ^ false) || (true && true))) = !(!(!(true) || (true))) = !(!(false || true)) = !(!(true)) = !(false) = true
        System.out.println("[A]: "+(!(!(!(false ^ false) || (true && true)))));

        /*[B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1) =
        = !(6 <= 6) && (1 != 1) =
        = !(true) && (false) =
        = false && false = false */
        int x=3, y=2;
        System.out.println("[B]: considering that x=3 and y=2: "+(!((x * y) <= 6) && (x - y != 1)));

    }
}
