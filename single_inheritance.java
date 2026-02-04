 class person{
    String name;
    int age;
    
}
class student extends person
{
    int studentId;
    void display(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("Name:"+name+"Age:"+age);
    }
}




public class single_inheritance
{
    public static void main(String[] args) {
        String name="Gunal";
        int age=20;
        student s = new student();
        s.display(name,age);
        
    }
}