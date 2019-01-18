public class VariableMutation {

    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a =a+10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b=b-7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c=c*2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d=d/5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e=e*e*e;
        System.out.println(e);

        //int f1 = 123;
        //int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean f1biggerThanf2;
        int f1 = 123;
        int f2 = 345;
        if(f1>f2){
            f1biggerThanf2=true;
        }else{
            f1biggerThanf2 = false;
        }
        System.out.println(f1biggerThanf2);


        int g1 = 350;
        int g2 = 200;
        boolean g;
        if(2*g2>g1){
            g=true;
        }else{
            g=false;
        }
        System.out.println(g);
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean divisor;
        if(h%11==0){
            divisor=true;
        }else{
            divisor=false;
        }
        System.out.println(divisor);


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean i;
        if(i1>(i2*i2)&&i1>(i2*i2*2)){
            i=true;
        }else{
            i=false;
        }
        System.out.println(i);
        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        boolean dividable;
        if(j%3==0|j%5==0){
            dividable=true;
        }else{
            dividable=false;
        }
        System.out.println(dividable);
        String k = "Apple";
        //fill the k variable with its content 4 times
        for(int l=0;l<2;l++){
            k+=k;
        }
        System.out.println(k);
    }



}
