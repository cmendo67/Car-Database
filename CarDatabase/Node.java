/**
 * Name: Carlos Mendoza
 * CIN:304972595
 *
 * Description: For this assignment we will be designing custom nodes with
 * three categories on which to group.We will be implementing a new version
 * of a linked list that has possible sublists descending from each node. We
 * will also be creating a gui because we need to show a visual representation
 * of my linked list structure.
 */
package CarDatabase;

/**
 * This class handels the data fields for my linked list and sets the constructors for my data
 * fields.It also sets my getters and setters for my Node class.
 * @param <N> for Category 1
 * @param <N2>for category 2
 * @param <N3> for category 3
 */
public class Node <N extends Comparable<N> , N2 extends Comparable<N2>, N3 extends Comparable<N3>> {

    //data fields
    private N category1;
    private N2 category2;
    private N3 category3;
    protected Node right; //pointer to the next item
    protected Node left;//pointer to the previous item
    protected Node down;//pointer to the next item in the sub-list
    //default Constructor
    public Node(){
    }

    //constructor that initializes the three category data fields
    public Node(N category1, N2 category2, N3 category3){
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.right = null;
        this.left = null;
        this.down = null;
    }

    //getters for data fields
    public N getCategory1() {
        return category1;
    }

    public N2 getCategory2() {
        return category2;
    }

    public N3 getCategory3() {
        return category3;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getDown() {
        return down;
    }

    //setters for data fields
    public void setCategory1(N category1) {
        this.category1 = category1;
    }

    public void setCategory2(N2 category2) {
        this.category2 = category2;
    }

    public void setCategory3(N3 category3) {
        this.category3 = category3;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setDown(Node down) {
        this.down = down;
    }

}