public class StringMethod {
    public static void main(String[] args){
        String s = "laxmi";
        //create new string object to concat the string && shit+ctrl+F10 to execute
        s = s.concat("sree");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(7));
        //it will extract the part of string
        System.out.println(s.substring(3));
        //System.out.println(s.substring(3, 11)); Error:StringIndexOutOfBoundException
        System.out.println(s.substring(3, 7));
    }
}
