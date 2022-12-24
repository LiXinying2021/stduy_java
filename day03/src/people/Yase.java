package people;

public class Yase {

    enum Pf{First,Scond,Tird}
    Pf size;

    public int gjl=10;
    public int fyl=55;
    public int wl = 0;
    public String num="";
    public Pf ys_pf;


    public static void main(String[] args) {
        Yase yase = new Yase();
        yase.ys_pf=Pf.Scond;

    }
   public void funFirst(){
        System.out.println("亚瑟的第一个技能");

    }
    public void funSecod(){
        System.out.println("亚瑟的第二个技能");

    }
     public void funTrid(){
        System.out.println("亚瑟的第三个技能");

    }





}
