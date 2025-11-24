class Animal{
    public void sound(){
        System.out.println("Animal sound");
    }
}

class Child extends Animal{
    public void childSound(){
         System.out.println("Child sound");
    }
}
 public class test{
     public static void main(String[] args){
         Child obj=new Child();
         obj.sound();
     }
 }
