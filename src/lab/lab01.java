public class lab01{
    public static void main(String[] args) {
        if(args.length < 1){
            int i;
            for(i = 0; i < args.length; i++)
                System.out.println(args[i]);
        }
        else
            System.out.println("Hello World!");
    }
}