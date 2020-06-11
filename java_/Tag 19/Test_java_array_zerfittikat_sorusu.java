package fehler;

public class Test {

    public static void main(String[] args) {
        String[][] bla = new String[4][3];
        String[][] blabla = new String[4][];
        blabla[0] = new String[3];
        blabla[1] = new String[3];
        blabla[2] = new String[3];
        blabla[3] = new String[3];
        blabla[0][0]=new String("a");
        blabla[0][1]=new String("a");
        blabla[0][2]=new String("a");
        //blabla[0][3]=new String("a");
        
        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {//chs.length: 2: Index 0 und Index 1 a-> 0, 1
            for (int b = 0; b < chs.length; b++) {////chs.length: 2: Index 0 und Index 1 b-> 0, 1
                chs[a][b] = "" + i;//Erster Durchlauf: a: 0 b:0 i: 97 chs[a][b]=chs[0][0] "97" 
                i++;                //Zweiter Durchlauf a: 0 b:1 i: 98 chs[a][]:chs[0][1] "98"
            }
            //jetzt: a:1
            //Innen //Erster Durchlauf: a: 1 b:0 i: 99 chs[a][b]=chs[1][0] "99" 
             //Innen /Zweiter Durchlauf a: 1 b:1 i: 100 chs[a][]:chs[1][1] "100"
        }//a wird auf 2 gesetzt, Schleifen fertig
        //chs[0][0]:"97"
        //chs[0][1]:"98"
       
        //chs[1][0]:99
       //chs[1][1]:"100"
        //chs[1][2]:NULL
        //chs[1][3]:NULL
        //chs[1][4]:NULL
        for(String[] ch : chs){//wird 2 Mal durchgeführt
            for(String c : ch){//1. Innen: 2 mal(chs[0] = new String[2];)
                                //2. Innen 5 mal(chs[1] = new String[5];)
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}
