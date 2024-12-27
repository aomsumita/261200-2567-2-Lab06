public class Cow extends Animal {
    @Override //เพื่อบอกว่า เอาเมททอดมาจากsuper class
    void sound() {
        System.out.println("moo moo");
    }
    void milk(){
        System.out.println("... now loading...");
    }
}
