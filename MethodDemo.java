public class MethodDemo {
    int classLevelVariable=004;
    void method(){
        MethodDemo obj2=new MethodDemo();
        System.out.println(classLevelVariable);

    }
    public static void main(String[] args){
        MethodDemo obj = new MethodDemo();
        obj.method();
        System.out.println(obj.classLevelVariable);

    }
}
