package people;

import cals.Calcu;

public class Chafingdish {
    private String renshu;//吃饭的人数
    private String guodi;//火锅汤底
    private float jingongge;//决定火锅是几宫格
    private String xiaocai;//吃什么小菜
    private String huncai;//吃什么荤菜
    private String sucai;//吃什么素菜
    private Boolean is_heorbuhe;//喝不喝酒
public Chafingdish(String xiaocai){
    this.xiaocai = xiaocai;
}

    public Chafingdish(String renshu, String guodi, float jingongge, String xiaocai, String huncai, String sucai, Boolean is_heorbuhe) {
        this.renshu = renshu;
        this.guodi = guodi;
        this.jingongge = jingongge;
        this.xiaocai = xiaocai;
        this.huncai = huncai;
        this.sucai = sucai;
        this.is_heorbuhe = is_heorbuhe;
    }

    public void setRenshu(String renshu) {
        this.renshu = renshu;
    }

    public String getGuodi() {
        return guodi;
    }

    public void setGuodi(String guodi) {
        this.guodi = guodi;
    }

    public float getJingongge() {
        return jingongge;
    }

    public void setJingongge(float jingongge) {
        this.jingongge = jingongge;
    }

    public String getXiaocai() {
        return xiaocai;
    }

    public void setXiaocai(String xiaocai) {
        this.xiaocai = xiaocai;
    }

    public String getHuncai() {
        return huncai;
    }

    public void setHuncai(String huncai) {
        this.huncai = huncai;
    }

    public String getSucai() {
        return sucai;
    }

    public void setSucai(String sucai) {
        this.sucai = sucai;
    }

    public Boolean getIs_heorbuhe() {
        return is_heorbuhe;
    }

    public void setIs_heorbuhe(Boolean is_heorbuhe) {
        this.is_heorbuhe = is_heorbuhe;
    }

     static public void daincai(){
        System.out.println("点菜");
    }
     public void eat(){
        System.out.println("吃火锅");
    }
    public void pay(){
        System.out.println("付钱");
    }




        public void useCalcu(){
            //创建一个计算器
            //Calcu a = new Calcu(1,2,3,4);
            //使用计算器的某个方法
           // a.add();
           //a.jianFa();
        }



}
