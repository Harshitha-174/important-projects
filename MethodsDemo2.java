/*public class MethodsDemo2 {
    static void changevalue(int x){
        x=100;
    }
    public static void main(String[] args){
        int a=10;
        changevalue(10);
        System.out.println(a);

    }
}*/

/* public class MethodsDemo2 {
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int result1=add(10,5);
        System.out.println(result1);
        int result2=add(5,10);
        System.out.println(result2);
    }
}*/

/*public class MethodsDemo2 {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
    static double add(double d1,double d2){
        return d1+d2;
    }
    public static void main(String[] args){

    }
}*/

public class MethodsDemo2 {
    static void print(int a){
        System.out.println(a);
    }
    static void print(String s){
        System.out.println(s);
    }
    static void print(int a,String s){
        System.out.println(a+" "+s);
    }
    public static void main(String[] args){
        print(120);
        print("JAVA With Automation Testing");
    }
}


