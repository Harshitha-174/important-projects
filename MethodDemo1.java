public class MethodDemo1 {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args){
        MethodDemo1 obj = new MethodDemo1();
        int result = obj.add(10,20);
        System.out.println(result);

    }
}
