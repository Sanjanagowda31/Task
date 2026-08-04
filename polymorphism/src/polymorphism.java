
class person {
    void display() {
        System.out.println("I am a Person");
    }
}

class Teacher extends person {
    void display() {
        System.out.println("I am a Teacher");
    }
}

public class polymorphism 
{
    final static String COLLEGE_NAME = "ABC College";

    public static void main(String[] args) 
    {
        person p = new Teacher();
        p.display();   

        Teacher t = (Teacher) p;
        t.display();

        System.out.println("College Name: " + COLLEGE_NAME);
    }
}
