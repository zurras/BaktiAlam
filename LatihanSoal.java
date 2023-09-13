import java.util.Scanner;

public class LatihanSoal {
    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        
        System.out.println("Silahkan pilih hari :harga (weekday) (weekend) (holiday) ");
        System.out.println("Duku :915000 1025000 1225000");
        System.out.println("Jeruk :915000 1025000 1225000");
        System.out.println("Alpukat :575000 695000 895000");
        System.out.println("Jambu Air :575000 695000 895000");
        System.out.println("Durian :595000 715000 915000");
        System.out.println("Melon :595000 715000 915000");
        System.out.println("Belimbing :495000 575000 755000");
        System.out.println("Mangga :495000 575000 755000");
        System.out.println("Kedondong :495000 575000 755000");
        System.out.println("-Contoh : Durian, holiday-");
        int harga = 0;
        String jadwal = P.nextLine();
        String day = P.nextLine();

        if(jadwal.equals ("Durian")|| jadwal.equals("Melon")){
            switch(day){
                case "weekday":
                harga = 595000;
                break;

                case "weekend":
                harga = 715000;
                break;

                case "holiday":
                harga = 915000;
                break;

                default:
                harga = 0;
            }
        }
        else if(jadwal.equals("Duku")||jadwal.equals("Jeruk")){
            switch(day){
                case "weekday":
                harga = 915000;
                break;

                case "weekend":
                harga = 1025000;
                break;

                case "holiday":
                harga = 1225000;
                break;

                default:
                harga = 0;
                break;
            }
        }
        else if(jadwal.equals("Alpukat")||jadwal.equals("Jambu air")){
            switch(day){
                case "weekday":
                harga = 575000;
                break;

                case "weekend":
                harga = 695000;
                break;

                case "holiday":
                harga = 895000;
                break;

                default:
                harga = 0;
                break;
            }
        }
        else if(jadwal.equals("Belimbing")||jadwal.equals("Mangga")||jadwal.equals("Kedondong")){
            switch(day){
                case "weekday":
                harga = 495000;
                break;

                case "weekend":
                harga = 575000;
                break;

                case "holiday":
                harga = 755000;
                break;

                default:
                harga = 0;
                break;
            }
        }
        else{
            System.out.println("Maaf Pilihan Anda Tidak Ada.");
        }
        System.out.println("Jadwal Yang Anda Pilih: " +jadwal);
        System.out.println("Hari Anda Pilih: " +day);
        System.out.println("Total: " + harga);

    }
    
}
