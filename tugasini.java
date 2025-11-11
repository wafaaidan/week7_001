import java.util.Scanner;

public class tugasini {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nama: " + (i+1));
            String nama = ns.nextLine();
            System.out.println("namamu" + nama);
          }ns.close();
    }
    
}
