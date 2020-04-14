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
 * This class handles all the methods for the LinkedList class.
 * Handles the add, clear, deletefirst, deletelast, delete, get, regroup,and size
 * methods.
 * @param <N> for category1Label
 * @param <N2> for categroy2Label
 * @param <N3> for category3Label
 */
public class LinkedList<N extends Comparable<N> , N2 extends Comparable<N2>, N3 extends Comparable<N3>> {

    //data fields
    private Node head; //pointer to the first Node
    private int size;
    private N category1Label;
    private N2 category2Label;
    private N3 category3Label;
    private int groupingCategory;

    //Default constructor
    public LinkedList() {
    }

    //constructor that initializes the three category data fieldss
    public LinkedList(int groupingCategory) {
        this.groupingCategory = groupingCategory;
    }

    //getters
    public Node getHead() {
        return head;
    }

    public int Size() {
        return size;
    }

    /**
     *     add(value1, value2, value3):
     *     This method shall have three parameters.  These parameters are the values of the categories in a Node.
     *     Use the parameters to create a new Node and add it to the list.
     *     The Node must be added in such a way that it maintains the current grouping category of the list.
     * @param category1Label
     * @param category2Label
     * @param category3Label
     */
    public void add(N category1Label, N2 category2Label, N3 category3Label) {

        this.category1Label = category1Label;
        this.category2Label = category2Label;
        this.category3Label = category3Label;

        if (this.size == 0) {
            this.head = new Node(this.category1Label, this.category2Label, this.category3Label);
            size++;
        } else {
            Node current = this.head;
            Node current2 = this.head;

            if (groupingCategory == 1) {

                while (current != null && current.getCategory1().compareTo(this.category1Label) != 0) {
                    if (current.right == null) {
                        current.right = new Node(this.category1Label, this.category2Label, this.category3Label);
                        this.size++;
                    }
                    current2 = current;
                    current = current.right;
                    current.left = current2;
                }

                if (current.getCategory1().compareTo(this.category1Label) == 0 && (current.getCategory2().compareTo(this.category2Label) != 0 ||
                        current.getCategory3().compareTo(this.category3Label) != 0)) {

                    while (current.down != null) {
                        current = current.down;
                    }
                    current.down = new Node(this.category1Label, this.category2Label, this.category3Label);
                    this.size++;
                }
            } else if (groupingCategory == 2) {
                while (current != null && current.getCategory2().compareTo(this.category2Label) != 0) {
                    if (current.right == null) {
                        current.right = new Node(this.category1Label, this.category2Label, this.category3Label);
                        this.size++;
                    }
                    current2 = current;
                    current = current.right;
                    current.left = current2;
                }

                if (current.getCategory2().compareTo(this.category2Label) == 0 && (current.getCategory3().compareTo(this.category3Label) != 0 ||
                        current.getCategory1().compareTo(this.category1Label) != 0)) {

                    while (current.down != null) {
                        current = current.down;
                    }
                    current.down = new Node(this.category1Label, this.category2Label, this.category3Label);
                    this.size++;
                }

            } else if (groupingCategory == 3) {
                while (current != null && current.getCategory3().compareTo(this.category3Label) != 0) {
                    if (current.right == null) {
                        current.right = new Node(this.category1Label, this.category2Label, this.category3Label);
                        this.size++;
                    }
                    current2 = current;
                    current = current.right;
                    current.left = current2;
                }

                if (current.getCategory3().compareTo(this.category3Label) == 0 && (current.getCategory2().compareTo(this.category2Label) != 0 ||
                        current.getCategory1().compareTo(this.category1Label) != 0)) {

                    while (current.down != null) {
                        current = current.down;
                    }
                    current.down = new Node(this.category1Label, this.category2Label, this.category3Label);
                    this.size++;
                }

            }
        }
    }

    /**
     * This method clears the list
     */
    public void clear() {
        this.head = null;
        this.size = 0;
    }

    /**
     * This method method deletes the first Node in the main list and
     * does NOT delete any nodes in the first Node's sublist.
     */
    public void deleteFirst() {
        Node current = this.head;
        Node current2 = this.head;
        if (this.size > 0) {
            if (current.down == null && current.right != null) {
                current = current.right;
                this.head = current;
            } else if (current.down == null && current.right == null) {
                this.head = null;
            } else if (current.down != null && current.right != null) {
                current2 = current.right;
                current = current.down;
                this.head = current;
                this.head.right = current2;
            } else if (current.down != null && current.right == null) {
                this.head = this.head.down;
            }
            this.size = this.size - 1;
        }
    }

    public void deleteLast() {
        Node current = this.head;
        Node current2 = null;
        if (this.size > 0) {
            if (current.right == null) {
                this.head = this.head.down;
            } else if (current.right != null) {
                while (current.right != null) {
                    current = current.right;
                }

                if (current.down == null) {
                    current2 = current.left;
                    current2.right = null;
                } else if (current.down != null) {
                    current2 = current.left;
                    current = current.down;
                    current.left = current2;
                    current2.right = current;
                }
            }
        }
        this.size = this.size - 1;
    }

    /**
     * This method returns the size of the sublist at the given index.
     * If the given index is out of bounds then an throws out of bounds exception
     * with a message should appear.
     * @param index
     * @return
     */
    public int size(int index) {
        int counter = 0;
        int count = 0;
        int value = 0;
        Node current = this.head;
        while (counter != index) {
            counter = counter + 1;
            current = current.right;
        }

        try {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index Out Of Bounds");
            } else {
                while (current.down != null) {
                    count = count + 1;
                    current = current.down;
                }
                value = count + 1;
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index Out Of Bounds");
        }
        return value;
    }

    /**
     * This method returns the size of the main list which is the
     * number of nodes in the main list.
     * @return
     */
    public int size() {

        int counter = 0;
        int count = 0;
        Node current = this.head;
        while (current != null) {
            counter = counter + 1;
            current = current.right;
        }
        if (current == null) {
            return counter;
        }

        return counter;
    }

    /**
     * This method deletes a specific node from anywhere in the list which
     * the main index and sub index is given.
     * @param mainIndex
     * @param subIndex
     */
    public void delete(int mainIndex, int subIndex) {
        Node current = this.head;
        Node previous = this.head;
//        Node previous = null;
//        Node right = null;
        int counter = 0;
        int counter2 = 0;

        try {
            if (mainIndex > this.size - 1 || mainIndex < 0) {
                throw new IndexOutOfBoundsException("Index Out Of Bounds");
            } else if (subIndex > this.size(mainIndex) || subIndex < 0) {
                throw new IndexOutOfBoundsException("sub Index out of bounds");
            }

            if (mainIndex == 0 && subIndex == 0) {
                deleteFirst();
            } else if (mainIndex == this.size - 1 && subIndex == 0) {
                deleteLast();
            }
            if (this.size > 0) {

                while (current.right != null && counter < mainIndex) {

                    previous = current;
                    current = current.right;
                    counter++;
                }

                while (current.down != null && counter2 < subIndex) {
                    previous = current;
                    current = current.down;
                    counter2++;
                }
                Node rightPointer = current.right;
                Node leftPointer = current.left;
                if (subIndex == 0) {

                    if (current.down != null) {

                        if (mainIndex > 0) {

                            leftPointer.right = current.down;
                            current.down.right = rightPointer;
                            current.down.left = leftPointer;
                        } else {
                            rightPointer.left = current.down;
                            current.down.right = rightPointer;
                            current.down.left = leftPointer;

                        }
                    } else {
                        rightPointer.left = leftPointer;
                        leftPointer.right = rightPointer;
                    }
                    this.size--;
                } else if (subIndex > 0) {
                    if (current.down != null) {
                        previous.down = current.down;
                    } else {
                        previous.down = null;
                    }
                }
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index Out Of Bounds");
        }
    }

    /**
     * This method returns the chosen category value, from the chosen node
     * in the main list.If the index is out of bounds then an throws index out
     * of bounds exception should appear.
     * @param mainIndex
     * @param category
     * @return
     */
    public String get(int mainIndex, int category) {

        Node current = this.head;

        try {

            if (mainIndex > this.size - 1 || mainIndex < 0) {
                throw new IndexOutOfBoundsException("MainIndex Out Of Bounds");
            } else if (category < 0 || category > 3) {
                throw new IndexOutOfBoundsException("category Index out of bounds");
            }
            int counter = 0;
            if (category == 1) {

                while (current.right != null && counter < mainIndex) {
                    current = current.right;
                    counter = counter + 1;
                }
                return (String)current.getCategory1();
            } else if (category == 2) {
                while (current.right != null && counter < mainIndex) {
                    current = current.right;
                    counter = counter + 1;
                }
                return (String) current.getCategory2();
            } else if (category == 3) {
                while (current.right != null && counter < mainIndex) {
                    current = current.right;
                    counter = counter + 1;
                }

                return String.valueOf(current.getCategory3());
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index Out Of Bounds");
        }
        return null;
    }

    /**
     * This method returns the value from the chosen category, in the indicated
     * sub-list.If any of the parameters are out of bounds then an throws index out
     *      * of bounds exception should appear.
     * @param mainIndex
     * @param subIndex
     * @param category
     * @return
     */
    public String get(int mainIndex, int subIndex, int category) {

        Node current = this.head;
        int counter = 0;
        int counter2 = 0;

        try {

            if (mainIndex > this.size - 1 || mainIndex < 0) {
                throw new IndexOutOfBoundsException("MainIndex Out Of Bounds");
            } else if (category < 0 || category > 3) {
                throw new IndexOutOfBoundsException("category Index out of bounds");
            } else if (subIndex < 0 || subIndex > this.size(subIndex)) {
                throw new IndexOutOfBoundsException("SubIndex out of bounds");
            }
                if(category == 1) {
                    while (current.right != null && counter < mainIndex) {
                        current = current.right;
                        counter = counter + 1;
                    }
                    while (current.down != null && counter2 < subIndex) {
                        current = current.down;
                        counter2 = counter2 + 1;
                    }
                    return (String) current.getCategory1();
                }
         else if (category == 2) {
                    while (current.right != null && counter < mainIndex) {
                        current = current.right;
                        counter = counter + 1;
                    }
                    while (current.down != null && counter2 < subIndex) {
                        current = current.down;
                        counter2 = counter2 + 1;
                    }
            return (String) current.getCategory2();
        } else if (category == 3) {
                    while (current.right != null && counter < mainIndex) {
                        current = current.right;
                        counter = counter + 1;
                    }
                    while (current.down != null && counter2 < subIndex) {
                        current = current.down;
                        counter2 = counter2 + 1;
                    }
            return String.valueOf(current.getCategory3());
        }
        }
             catch (IndexOutOfBoundsException ex) {
                 System.out.println("Index Out Of Bounds");
             }
        return null;
    }

    /**
     * This method regroups my LinkedList on the given regrouping category
     * number.
     * @param groupingCategoryNumber
     */
    public void regroup(int groupingCategoryNumber){

        LinkedList<N,N2,N3> list2 = new LinkedList<>(groupingCategoryNumber);

        Node current = this.head;
        Node current2 = this.head;

            try {
                if (groupingCategoryNumber < 1 || groupingCategoryNumber > 3) {
                    throw new IndexOutOfBoundsException("Grouping category number is  Out Of Bounds");
                }
                else{
                    while(current != null){
                        System.out.println("hi");
                    list2.add((N)current.getCategory1(), (N2)current.getCategory2(),(N3)current.getCategory3());

                        if (current.down != null) {
                            current = current.down;
                        }
                        else {
                            current2 = current2.right;
                            current = current2;
                        }
                    }
                }
                this.head = list2.head;
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println("Index Out Of Bounds");
            }
    }
}