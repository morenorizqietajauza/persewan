import java.util.Scanner;

public class SewaDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Mau membuat berapa onbjek?");
            int jumlah = s.nextInt();
            System.out.println("Jumlah: "+jumlah);
        } catch(Exception e) {
            System.out.println("Tipe data salah");
        }

        System.out.println("Pilih CD atau DVD");
        String pilihan = s.next();

        if (pilihan.equals("CD")) {
            CD c = new CD();
            c.print();
        }else if(pilihan.equals("DVD")) {
            DVD d = new DVD();
            d.print();
        }
        s.close();
    }
}