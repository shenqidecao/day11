
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
          Goods goods1 = new Goods("001","少林核桃",15.5,"斤");
          Goods goods2 = new Goods("002","尚康饼干",14.5,"包");
          Goods goods3 = new Goods("003","移动硬盘",345.0,"个");
          Goods goods4 = new Goods("004","高清无码",199.0,"G");
          ArrayList<Goods> goods = new ArrayList<>();


          System.out.println("              欢迎来到超市购物系统");

          for (;;){

              Scanner sc =new Scanner(System.in);
              System.out.println("请输入你要进行的操作：");
              System.out.println("1：购买商品"+"                 2：结算并打印小票     "+"3：退出系统");

              String str = sc.next();
              if (str.equals(1)){
                  System.out.println("-----------------------");
                  System.out.println("              商品列表");
                  System.out.println(goods);

              }else if (str.equals(2)){
                  System.out.println("-----------------------");
                  System.out.println("              欢迎光临");
              }else if (str.equals(3)){
                  System.out.println("感谢您使用超市购物系统，欢迎下次光临，拜拜");

              }
          }
    }
}
class Goods<id> {
    private String id;
    private String name;
    private double price;
    private String weight;

    public Goods(String id, String name, double price,String weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

     public String getWeight() { return weight; }
     public void setWeight(String weight) { this.weight = weight;}
     public String getId() {
         return id;
     }
     public void setId(String id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public double getPrice() {
         return price;
     }
     public void setPrice(double price) {
         this.price = price;
     }
}


