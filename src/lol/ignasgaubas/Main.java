package lol.ignasgaubas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World !!!");
        try {
            System.in.read();
        }catch (Exception e){
            System.out.println("Ooops: " + e.getMessage());
        }
    }
}