public class Model{
    private int age;
    public Model() {}
    public Model(int age){}
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    import java.util.Scanner;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        setAge(age);
        System.out.println("The age is "+ getAge());
    }
}
