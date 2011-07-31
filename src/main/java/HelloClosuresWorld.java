public class HelloClosuresWorld {
	
        public static void main(String[] args) {
            String whichWorld = "closures";
            new Thread( #{System.out.println("Hello " + whichWorld + " world!")} ).start();
        }
}