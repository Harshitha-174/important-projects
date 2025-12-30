import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;
        String[] name = new String[n];
        int[] mark = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Marks: ");
            mark[i] = sc.nextInt();
            sc.nextLine();
        }

        // Topper + Average
        int max = mark[0], sum = 0, top = 0;
        for (int i = 0; i < n; i++) {
            sum += mark[i];
            if (mark[i] > max) {
                max = mark[i];
                top = i;
            }
        }
        System.out.println("\nTopper: " + name[top] + " (" + max + ")");
        System.out.println("Average: " + (sum / (double) n));

        // Search
        System.out.print("\nSearch name: ");
        String s = sc.nextLine();
        for (int i = 0; i < n; i++)
            if (name[i].equalsIgnoreCase(s))
                System.out.println("Found: " + name[i] + " " + mark[i]);

        // Marks > 75
        System.out.println("\nMarks > 75:");
        for (int i = 0; i < n; i++)
            if (mark[i] > 75)
                System.out.println(name[i] + " " + mark[i]);

        // Sort
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (mark[j] > mark[j + 1]) {
                    int t = mark[j]; mark[j] = mark[j + 1]; mark[j + 1] = t;
                    String temp = name[j]; name[j] = name[j + 1]; name[j + 1] = temp;
                }

        System.out.println("\nSorted List:");
        for (int i = 0; i < n; i++)
            System.out.println(name[i] + " " + mark[i]);

        sc.close();
    }
}

