/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree10;

/**
 *
 * @author kamaj
 */
public class Node {
    private String data;
    private BinaryTree left;
    private BinaryTree right;
    private int height;

    public Node(String value) {
        data = new String(value);
        left = right = null;
        height = 0;
    }

    public Node(String data, int height) {
        this.data = data;
        left = right = null;
        this.height = height;
    }

    public  Node (String value, BinaryTree left, BinaryTree right) {
        data = new String(value);
        this.left = left;
        this.right = right;
    }
    public String getData() {
        return data;
    }
    public BinaryTree left() {
        return left;
    }
    public BinaryTree right() {
        return right;
    }
    public void setLeft(BinaryTree tree) {
        left = tree;
    }
    public void setRight(BinaryTree tree) {
        right = tree;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
