public class QueueImpl<E> implements Queue<E> {

    private E[] Llista;
    private int num, max;

    public QueueImpl(int m) {
        this.Llista = (E[]) new Object[m];
        this.num = 0;
        this.max = m;
    }

    @Override
    public void push(E e) throws FullQueueException {
        if(this.num < this.max)
        {
            this.Llista[this.num] =e;
            this.num++;
        }
        else throw new FullQueueException();
    }

    @Override
    public E pop() throws EmptyQueueException {
        E first;

        if(this.num > 0)
        {
            E popped = this.Llista[0];
            this.Llista[0]=null;

            for(int i = 0; i < this.num; i++) {
                this.Llista[i] = this.Llista[i + 1];
            }
            this.num--;
            return popped;
        }
        else throw new EmptyQueueException();
    }

    @Override
    public int size() {
        return this.num;
    }

    public String getLlista() {

        String l = "";

        for (int i = 0; i < num; i++) {
            l = l + this.Llista[i];
        }
        return l;
    }
}
