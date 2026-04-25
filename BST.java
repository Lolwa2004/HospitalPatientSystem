public class BST {

    class Node {
Patient patient;
Node left, right;

public Node(Patient patient) {
    this.patient = patient;
}}
Node root;

public Node insert(Node root, Patient patient) {
if (root == null) {
return new Node(patient);
}

if (patient.id < root.patient.id) {
root.left = insert(root.left, patient);
} else {
root.right = insert(root.right, patient);
}

return root;
}

public Node search(Node root, int id) {
if (root == null || root.patient.id == id) {
return root;
}

if (id < root.patient.id) {
return search(root.left, id);
}

return search(root.right, id);
}

public Node delete(Node root, int id) {
if (root == null) {
return null;
}

if (id < root.patient.id) {
root.left = delete(root.left, id);
} else if (id > root.patient.id) {
root.right = delete(root.right, id);
} else {
if (root.left == null)
return root.right;

if (root.right == null)
return root.left;
}

return root;
}

public void display(Node root) {
if (root != null) {
display(root.left);
System.out.println(root.patient);
display(root.right);
}
}


}
