public class Main {
    public static void main(String[] args) {
        QueueImpl<String> llista = new QueueImpl<>(3);
        try{
            System.out.println("Ponemos en la lista las 3 frases. \t");

            llista.push("Somos el");
            llista.push(" Nil y ");
            llista.push(" el Borja.");

            System.out.println("El tamaño de la lista es: " + llista.size() + ".\t");

            System.out.println(llista.getLlista());
            llista.pop();
            System.out.println(llista.getLlista());
            llista.pop();
            System.out.println(llista.getLlista());
            llista.pop();

            System.out.println("El tamaño de la lista es: " + llista.size() + ".\t");
        }
        catch (FullQueueException e) {
            System.out.println(e.getMessage());
        }

        catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}