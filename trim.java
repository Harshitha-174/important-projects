public class trim {
    public static void main(String[] args){
        String s = "Java,python,c++";
        s.split(",");
        String[] arr = s.split(",");
        for(String lang:arr){
            System.out.print(lang+" ");
        }
    }
}
