
package latihan;


public class latihan7 {
public static void main(String[] args) {
    
    int x = 12;
    int y = 20;
    int z ;
z = x | y;
System.out.println("Hasil operasi bitwise OR: " + z);
z = x & y;
System.out.println("Hasil operasi bitwise AND: " + z);
z = x ^ y;
System.out.println("Hasil operasi bitwise XOR: " + z);
z = ~x;
System.out.println("Hasil operasi bitwise NOT: " + z);
z = x << y;
System.out.println("Hasil operasi bitwise shift left: " + z);
z = x >> y;
System.out.println("Hasil operasi bitwise shift right: " + z);
}    
}
