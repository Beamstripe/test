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
    public static void main(String[] args){
        int age = 20;
        System.out.println("The age is "+ age);
    }
}
