public class HashTable {
    class Node {

        Patient patient;

Node next;



        public Node(Patient patient) {

    this.patient = patient;

this.next = null;

}

    }


    private Node[] table;


    public HashTable(int size) {

    table = new Node[size];

}


    public int hashFunction(int id) {

    return id % table.length;

}


    public void insert(Patient patient) {

    int index = hashFunction(patient.id);


Node newNode = new Node(patient);


if (table[index] == null) {

    table[index] = newNode;

} else {

    Node current = table[index];


while (current.next != null) {

    current = current.next;

}


            current.next = newNode;

}

}


    public Patient search(int id) {

    int index = hashFunction(id);

Node current = table[index];


while (current != null) {

    if (current.patient.id == id) {

    return current.patient;

}

            current = current.next;

}


        return null;

}


    public void delete(int id) {

    int index = hashFunction(id);

Node current = table[index];

Node previous = null;


while (current != null) {

    if (current.patient.id == id) {

    if (previous == null) {

    table[index] = current.next;

    } else {

        previous.next = current.next;

    }

    return;

    }


            previous = current;

current = current.next;

}

}


    public void display() {

    for (int i = 0; i < table.length; i++) {

    System.out.print("Index " + i + ": ");

Node current = table[i];

if (current == null) {
System.out.println("Empty");
} else {
while (current != null) {
System.out.print(current.patient + " -> ");
current = current.next;
}
System.out.println("null");
}
}
}
}


