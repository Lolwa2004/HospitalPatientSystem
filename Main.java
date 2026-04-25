public class Main {
    public static void main(String[] args) {


        Patient p1 = new Patient(123, "Ali", 30, "Flu");

        Patient p2 = new Patient(133, "Sara", 25, "Cold");

        Patient p3 = new Patient(145, "Mona", 40, "Diabetes");


        System.out.println("===== BST Testing =====");


        BST bst = new BST();


        bst.root = bst.insert(bst.root, p1);

        bst.root = bst.insert(bst.root, p2);

        bst.root = bst.insert(bst.root, p3);


        System.out.println("Patients in BST:");

        bst.display(bst.root);


        System.out.println("\nSearch in BST:");

        BST.Node result = bst.search(bst.root, 133);


        if (result != null) {

            System.out.println(result.patient);

        }


        bst.root = bst.delete(bst.root, 123);


        System.out.println("\nAfter Delete:");

        bst.display(bst.root);



        System.out.println("\n===== Hash Table Testing =====");


        HashTable hashTable = new HashTable(10);


        hashTable.insert(p1);

        hashTable.insert(p2);

        hashTable.insert(p3);

System.out.println("Patients in Hash Table:");
hashTable.display();

System.out.println("\nSearch in Hash Table:");
System.out.println(hashTable.search(133));

hashTable.delete(123);

System.out.println("\nAfter Delete:");
hashTable.display();
}

}
