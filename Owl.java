 public class Owl extends Animal implements Flyable{
    @Override
    void sound() {
        System.out.println("hoot hoot");
    }
     @Override
     public void fly() {
         System.out.println("bing bong");
     }
     @Override
     public void glide() {
         System.out.println("oh ye o o ye!");
     }
}
