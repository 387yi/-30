package text_6_3;

import java.util.ArrayList;
import java.util.Collections;

public class doudizhu {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();
        String [] huase={"!","@","#","$"};
        String [] diansu={"2","3","4","5","6","7","8","10","9","J","Q","K","A"};

        for(String hua:huase){
            for(String dian:diansu)
            {
                array.add(hua+dian);
            }
        }
        array.add("小王");
        array.add("大王");
        Collections.shuffle(array);
        /*System.out.println(array);*/

        ArrayList<String> wanjia1=new ArrayList<String>();
        ArrayList<String> wanjia2=new ArrayList<String>();
        ArrayList<String> wanjia3=new ArrayList<String>();
        ArrayList<String> dizupai=new ArrayList<String>();

        for(int i=0;i<array.size();i++){
            String s=array.get(i);
            if (i>=array.size()-3){
                dizupai.add(s);
            }else if(i%3==0){
                wanjia1.add(s);
            }else if(i%3==1){
                wanjia2.add(s);
            }else if(i%3==2){
                wanjia3.add(s);
            }
        }
        kanpai("易武钧",wanjia1);
    }
    public static void kanpai(String name,ArrayList<String> pai){
        System.out.print(name+"的牌是:");
        for(String a:pai){
            System.out.print(a+" ");
        }
        System.out.println(" ");
    }
}
