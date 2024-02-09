import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitList = new LinkedList<>();

        fruitList.add(new Fruit("Mela"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Arancia"));

        System.out.println("Lista di frutti : ");
        for (Fruit fruit : fruitList) {
            System.out.println("Nome : " + fruit.getName());
        }

        fruitList.addFirst(new Fruit("Kiwi"));

        fruitList.addLast(new Fruit("Pesca"));

        System.out.println("\nLista di frutti aggiornata : ");
        for (Fruit fruit : fruitList) {
            System.out.println("Nome : " + fruit.getName());
        }
    }
}