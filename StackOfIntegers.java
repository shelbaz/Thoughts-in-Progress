
public class StackOfIntegers 
{
	 private int[] elements ;
	 private int size ;

	 public StackOfIntegers() 
	 {
		 elements = new int[16];
     }

	 public boolean empty()
	 {
		 return size == 0;
	 }

	 public int peek()
	 {
		 return elements[size-1];
	 }
	 public int pop() 
	 {
		 
		 if(size < 0) 
		 {
			 System.out.println("No more items to pop");
			 return 0;
		 }

		 else
			 return elements[--size];
	 }

	 public void push(int item) 
	 {
	
		 if ( size == elements.length-1)
		 {
			 int[] replaceArray = new int[elements.length*2];
			 System.arraycopy(elements, 0, replaceArray, 0, elements.length);
			 elements = replaceArray;
			 elements[size++] = item;
		 }
		 else
			 elements[size++] = item;
		 }

	 public int getSize()
	 {
		 return size;
	 }
}

