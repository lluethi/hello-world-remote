
public class HelloWorld {

    private String name;

    public HelloWorld() {
    }

    public HelloWorld(String text) {
        System.out.println(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[]args){
        HelloWorld hw = new HelloWorld("gugus");
    }
}
