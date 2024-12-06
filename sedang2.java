public class sedang2 {

    static void hitungvolume(double r, double t){
  

        double Volume = Math.PI * r * r * t;
    
        System.out.println(Volume);
    }
        static void hitunglingkaran(double r){
        double luas = Math.PI * r * r ;
        System.out.println("ini luas lingkaran" + luas);
    }
    
        static void haha(String a){
        System.out.println(a);
        }
    public static void main(String[] args) {
        haha("ini volume dari tabung");
        hitungvolume(4, 6);

        hitunglingkaran(5);
       

    }
    
}
