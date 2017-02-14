package lol.ignasgaubas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World !!!");
        System.out.println("Hello World 222");
        System.out.println("Hello World 333");
        System.out.println("Hello World 444");
        try {
            System.in.read();
        }catch (Exception e){
            System.out.println("Ooops: " + e.getMessage());
        }
    }
}