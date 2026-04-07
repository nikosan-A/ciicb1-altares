public class Task3 {
    public static void main(String[] args) {
        
String a = "Wow";          // use the same literal
String b = "Wow";          // same reference from string pool
String c = "Boo";    // must differ from a 
String d = "Wow!";         // matches b + "!"

boolean b1 = a == b;                  // true (same reference in pool)
boolean b2 = d.equals(b + "!");       // true ("Wow!" == "Wow" + "!")
boolean b3 = !c.equals(a);            // true ("Boo" != "Wow")

if (b1 && b2 && b3) {
    System.out.println("Success!");
}
    }
}