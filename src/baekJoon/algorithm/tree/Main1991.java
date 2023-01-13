package baekJoon.algorithm.tree;

import java.io.*;
import java.util.StringTokenizer;

public class Main1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        BinaryTree<Character> t = new BinaryTree<>();

        char[][] dataArr = new char[caseNum][3];

        String nodeData;

        StringTokenizer st;

        for (int i = 0; i < caseNum; i++) {
            nodeData = br.readLine();
            st = new StringTokenizer(nodeData, " ");
            for (int j = 0; j < 3; j++) {
                dataArr[i][j] = st.nextToken().charAt(0);
            }
        }

        t.setRoot(dataArr[0][0], dataArr[0][1], dataArr[0][2]);

        for (int i = 1; i < caseNum; i++) {
            t.addNode(t.root, dataArr[i][0], t.makeNode(dataArr[i][1], null, null), t.makeNode(dataArr[i][2], null, null));
        }

        t.preorder(t.root);
        System.out.print("\n");
        t.inorder(t.root);
        System.out.print("\n");
        t.postorder(t.root);
    }
}
class BinaryTree <T>{

    private static class Node <T> {
        T data;
        Node<T> left;
        Node<T> right;
    }
    Node<T> root = new Node<>();

    public BinaryTree() {
    }
    public void setRoot(T data, T leftData, T rightData) {
        this.root.data = data;
        this.root.left = makeNode(leftData, null, null);
        this.root.right = makeNode(rightData, null, null);
    }

    public Node<T> makeNode (T data, Node<T> left, Node<T> right) {
        Node<T> n = new Node<>();
        if (data.equals('.')) n = null;
        else {
            n.data = data;
            n.left = left;
            n.right = right;
        }

        return n;
    }

    public void addNode (Node<T> tmp, T data, Node<T> left, Node<T> right) {
        if (tmp.data.equals(data)) {
            if (left != null) tmp.left = makeNode(left.data, null, null);
            if (right != null) tmp.right = makeNode(right.data, null, null);
        }
        else {
            if (tmp.left != null) addNode(tmp.left, data, left, right);
            if (tmp.right != null) addNode(tmp.right, data, left, right);
        }
    }

    public void inorder(Node<Character> node){
        if (node != null) {
            inorder(node.left);
            System.out.printf("%c", node.data);
            inorder(node.right);
        }
    }

    public void preorder(Node<Character> node) {
        if (node != null) {
            System.out.printf("%c", node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(Node<Character> node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.printf("%c", node.data);
        }
    }
}
