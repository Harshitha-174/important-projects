public class Member {
        String name;
        int age;
        void displayInfo() {
            System.out.println("Name:" +name);
            System.out.println("Age:" +age);
        }
        public static void main(String[] args) {
            Member obj=new Member();
            obj.name="Harshitha";
            obj.age=20;

            obj.displayInfo();

    }
}

