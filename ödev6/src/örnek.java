
public class örnek {
    public class ödev {

    private int kasa = 123; // burda private olan bir erişim belirleyiciye
                                      //değer atadık

    public int getkasa() {
        return kasa;          //burda setter ve getter methodlarını
    }                          //oluşturduk

    public void setkasa(int kasa) {  // burda set methodunda bir koşul oluşturduk

        if (kasa == 123) {      // eğer karşıda girilen değer burdaki değerle uyuşmazsa 
            System.out.println("şifre doğru");//erişim belirleyicinin içine 
        } else {                              //giremeyeceğiz
            System.out.println("şifre yanlış");
        }
        this.kasa = kasa;
    }
    }
}

