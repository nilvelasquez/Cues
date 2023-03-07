public class Main {
    public static void main(String[] args) {
        QueueImpl<String> llista = new QueueImpl<>(3);
        try {
            System.out.println("Posem a la llista les tres paraules. \t");

            llista.push("Un, ");
            llista.push("Dos, ");
            llista.push("Tres.");

            System.out.println("El tamany de la llista es: " + llista.size() + ".\t");

            System.out.println("El que hi ha a la cua: " + llista.getLlista());
            llista.pop();
            System.out.println("El que hi ha a la cua: " + llista.getLlista());
            llista.pop();
            System.out.println("El que hi ha a la cua: " + llista.getLlista());
            llista.pop();

            System.out.println("El tamany de la llista es: " + llista.size() + ".\t");
        }
        catch (FullQueueException e) {
            System.out.println(e.getMessage());
        }
        catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}