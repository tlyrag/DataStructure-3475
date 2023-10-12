/**
 * 
 * @author mbashir1
 *
 */
public class MyLListUsingOneRef<T> implements MyListInterface<T>{
	private Node firstNode;            // Reference to first node of chain
	private int  numberOfEntries;
	   
	public MyLListUsingOneRef()
	{
	     initializeDataFields();
	} // end default constructor
	
	@Override
	public void clear()
	{
	      initializeDataFields();
	} // end clear
	
	private void initializeDataFields()
	{
	      firstNode = null;
	      numberOfEntries = 0;
	} // end initializeDataFields

	// Returns a reference to the node at a given position.
	   // Precondition: The chain is not empty;
	   //               1 <= givenPosition <= numberOfEntries.
	private Node getNodeAt(int givenPosition)
	{
	      // Assertion: (firstNode != null) &&
	      //            (1 <= givenPosition) && (givenPosition <= numberOfEntries)
	      Node currentNode = firstNode;
	      
	      // Traverse the chain to locate the desired node
	      // (skipped if givenPosition is 1)
	      for (int counter = 1; counter < givenPosition; counter++)
	         currentNode = currentNode.getNextNode();
	      // Assertion: currentNode != null
	      return currentNode;
	} // end getNodeAt
	
	@Override
	public boolean isEmpty()
	{
	      boolean result;
	      
	      if (numberOfEntries == 0) // Or getLength() == 0
	      {
	         // Assertion: firstNode == null
	         result = true;
	      }
	      else
	      {
	         // Assertion: firstNode != null
	         result = false;
	      } // end if
	      
	      return result;
	} // end isEmpty
	
	public T[] toArray()
	{
	      // The cast is safe because the new array contains null entries
	      @SuppressWarnings("unchecked")
	      T[] result = (T[])new Object[numberOfEntries];
	      
	      int index = 0;
	      Node currentNode = firstNode;
	      while ((index < numberOfEntries) && (currentNode != null))
	      {
	         result[index] = currentNode.getData();
	         currentNode = currentNode.getNextNode();
	         index++;
	      } // end while
	      
	      return result;
	  } // end toArray
	
	@Override
	public void add(T newEntry)          
	{
	      Node newNode = new Node(newEntry);
	      
	      if (isEmpty())
	         firstNode = newNode;
	      else                              // Add to end of nonempty list
	      {
	         Node lastNode = getNodeAt(numberOfEntries);
	         lastNode.setNextNode(newNode); // Make last node reference new node
	      } // end if
	      
	      numberOfEntries++;
	} // end add


	@Override
	public void add(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		if ((givenPosition >= 1) && (givenPosition <= numberOfEntries + 1))
	      {
	         Node newNode = new Node(newEntry);
	         if (givenPosition == 1)                // Case 1
	         {
	            newNode.setNextNode(firstNode);
	            firstNode = newNode;
	         }
	         else                                    // Case 2: list is not empty
	         {                                       // and givenPosition > 1
	            Node nodeBefore = getNodeAt(givenPosition - 1);
	            Node nodeAfter = nodeBefore.getNextNode();
	            newNode.setNextNode(nodeAfter);
	            nodeBefore.setNextNode(newNode);
	         } // end if
	         numberOfEntries++;
	      }
	      else
	         throw new IndexOutOfBoundsException("Illegal position given to add operation.");
	}

	@Override
	public T remove(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLength()
	{
	      return numberOfEntries;
	} // end getLength

	   private class Node //private inner class 
	   {
	      private T    data; // Entry in list
	      private Node next; // Link to next node
	      
	      private Node(T dataPortion)
	      {
	         data = dataPortion;
	         next = null;
	      } // end constructor
	      
	      private Node(T dataPortion, Node nextNode)
	      {
	         data = dataPortion;
	         next = nextNode;
	      } // end constructor
	      
	      private T getData()
	      {
	         return data;
	      } // end getData
	      
	      private void setData(T newData)
	      {
	         data = newData;
	      } // end setData
	      
	      private Node getNextNode()
	      {
	         return next;
	      } // end getNextNode
	      
	      private void setNextNode(Node nextNode)
	      {
	         next = nextNode;
	      } // end setNextNode
	   } // end Node
}
