package A01_Stack;


public class Stack<T>
{
	 private Node<T> first;
     private int counter;

    /**
     * Oberstes Element entfernen und zur�ckliefern.
     * Existiert kein Element, wird eine Exception ausgel�st.
     * @throws StackEmptyException 
     */
    public T pop() throws StackEmptyException {

        if (first == null)
            throw new StackEmptyException();

        Node<T> element = first; // oberstes Element
        first = first.getNext();
        element.setNext(null);
        counter--;

        return element.getData();
    }
    
    /**
     * �bergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {

        Node<T> element = new Node<T>(i);
        element.setNext(first);
        first = element;
        counter++;
    }
    
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
    	return counter;
    }
}
