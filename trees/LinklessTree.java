/**
 * Trees without explicit links.
 * Notice that various fields/methods have the protected modifier
 * when normally they would/should be private.
 * The reason is that this supports whitebox testing.
 *
 * @author Stefan Kahrs
 * @version 1
 */
//note the constraint on A is a slight generalisation of A extends Comparable<A>
//and is generally recommended when one wants a comparison operation
//it basically allows that the comparison op is implemented at a supertype
//of A, instead of A itself;
//for the assessment itself it makes no discernable difference
public class LinklessTree<A extends Comparable<? super A>>
{
    //sizes of subtrees at that node index
    protected int[] sizes;
    protected Object[] elems;
    //for annoying technical reason this has to be an array of objects
    protected A root;
    
    /**
     * Constructor for objects of class LinklessTree
     */
    private static final int STARTSIZE=15;
    public LinklessTree()
    {
        assert STARTSIZE>0;
        elems = freshElemArray(STARTSIZE);
        sizes = new int[STARTSIZE];
        sizes[0]=0; 
        
    }

    //size of whole tree is the size of the subtree rooted at 0
    public int size() {
        return getSize(0);
    }

    public A getValue(int index) {
        return (A)elems[index];
    }

    //auxiliary methods to index the arrays out of bounds too
    //they may help to reduce case distinctions
    protected A getKey(int subtree) {
        if (subtree>=elems.length) {
            return null; // out of bounds
        }
        return getValue(subtree);
    }

    protected int getSize(int subtree) {
        if (subtree>=elems.length) {
            return 0; // out of bounds
        }
        return sizes[subtree];
    }

    //encapsulates the cast on the allocation
    protected Object[] freshElemArray(int capacity) {
        return new Object[capacity];
    }

    //remainder needs to be modified

    //find index position of val in tree, if there, or where it goes, if not there
    protected int findIndex(A val) {
        int index = 0;
        boolean found = false;
        
        
        if (elems[0] == null || elems[0] == val){
            return index;
        }
        else{
            
        }
        
        

        return index; 
    }

    //is value in tree
    public boolean contains(A val) {
        return false; 
    }

    //grow the space in which we can palce the tree, so that at least one insertion will succeed
    protected void grow() {
    }

    //fetch the i-th element, in comparsion order
    public A get(int i){
        return null;
    }

    //add x to tree, return true if tree was modified
    //we do not allow multiple copies of the equal objects in tree
    //equality is decided by using compareTo
    public boolean insert(A x){ 
        return false; 
    }

    //remove x from tree, return true if tree was modified
    public boolean delete(A x){ 
        return false; 
    }

    //not requested, but these might be useful auxiliary ops for delete
    private A deleteLargest(int subtree) {
        return null; 
    }

    private A deleteSmallest(int subtree) { 
        return null; 
    }
}