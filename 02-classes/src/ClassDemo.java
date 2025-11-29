public class ClassDemo {
    public static void main(String[] args) {
        System.out.println("Кількість: " + sc );
        
        
}


class Student{

    private String name;
    private int age;


    private static int studentCount = 0;



    public Student() {
        studentCount ++;
    }


    public Student(String name, int age){
        this.name = name ;
        this.age = age;
        studentCount ++;    

    }

    public void setName(String name) {
        if (name !=null && !name.isEmpty()){
            this.name = name;       
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0 && age < 150) {

        }

    }

    public int getAge() {
        return age;
    }

    public void introduce(){
        System.out.println("Hello! I"
            + name + " me " + age + "years old");

    }
   

}

