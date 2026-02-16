import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.offer("Honda");
        linkedList.offer("Ford");
        linkedList.offer("Toyota");
        
        linkedList.add(1, "Skoda");

        System.out.println(linkedList);


        }
}
