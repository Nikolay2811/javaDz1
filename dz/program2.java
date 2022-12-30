package dz;
/*
 * шанхайская башня
 */
public class program2 {
    static void piramida(String with, String on, String some, int count ){
        if(count > 1) piramida(with, some, on, count-1);
        System.out.println(with+">>"+on);
        if (count > 1) piramida(some, on, with, count-1);
    }

 public static void main(String[] args) {
piramida("1", "3", "2", 3);
 }
    
}
    

