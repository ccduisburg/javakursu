/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.aq160;

/**
 *
 * @author ckabakci
 */
class Myst{
String msg;
Myst(String msg){
        this.msg=msg;
}
public String toString(){
return msg;
}
}
public class ExamAq160 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {/*
        // TODO code application logic here
        String str=new String("fgfgfg");
    
        System.out.println("Hello "+new StringBuilder("Java SE "));
        System.out.println("Hello"+ new Myst("blabla"));
        System.out.println("Hello "+str);*/
        
        int num[][]=new int[1][3];
        for(int i=0;i<num.length;i++){
    for(int j=0;j<num[i].length;j++){
        num[i][j]=10;
    }
    }
        for(int i=0;i<num.length;i++){
      for(int j=0;j<num[i].length;j++) {
        System.out.println(num[i][j]);}
    }
    }
}
