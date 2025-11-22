public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Additional code can be added here
        int userAge = 25;
        double height = 1.80;
        boolean isAvtive = true;
        char grade = 'A'; 

        // Display user information
        String namStringe = "John Doe";
        System.out.println("Name: " + namStringe);
        System.out.println("Age: " + userAge);
        System.out.println("Height: " + height + " meters");
        System.out.println("Active: " + isAvtive);
        System.out.println("Grade: " + grade);

if(isAvtive) {
    System.out.println( " is active");
} else {
    System.out.println( " is not active.");
}

int score = 43;
if(score >= 90) {
    System.out.println("Grade: A");
} else if(score >= 80) {
    System.out.println("Grade: B");
} else if(score >= 70) {
    System.out.println("Grade: C");
} else if(score >= 60) {
    System.out.println("Grade: D");
} else {
    System.out.println("Grade: F");
}

    }
} int j = 1;
while(j <= 5) {
    System.out.println("Count: " + j);
    j++;
}




