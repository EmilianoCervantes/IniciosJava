
public interface Interface <T>{
	public T first();
	public T last();
	public boolean isFull();
	public boolean isEmpty();
	public T dequeue();
	public String toString();
	public void enqueue(T e);
	public T randomDequeue( );
	public T priorityDequeue();
}
