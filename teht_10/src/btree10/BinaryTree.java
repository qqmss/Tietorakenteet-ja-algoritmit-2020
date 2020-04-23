/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree10;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;
    
    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }
    public BinaryTree(){
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */

    public void insert(String aData) {
        if (root != null) {
            if (root.getData().compareTo(aData) < 0) {
                if (root.left() == null) {
                    root.setLeft(new BinaryTree(aData));
                } else {
                    root.left().insert(aData);
                }
                if(root.left().getHeight() == getHeight()){
                    root.setHeight(root.getHeight() + 1);
                }
            } else {
                if (root.right() == null) {
                    root.setRight(new BinaryTree(aData));
                } else {
                    root.right().insert(aData);
                }
                if(root.right().getHeight() == getHeight()){
                    root.setHeight(root.getHeight() + 1);
                }
            }
        } else {
            root = new Node(aData);
        }
    }

    private int getHeight(){
        return root.getHeight();
    }


    
    public BinaryTree find(String aData){
        if(root != null){
            switch (Integer.signum(root.getData().compareTo(aData))) {
                case -1:
                    if(root.left() != null){
                        return root.left().find(aData);
                    }
                    break;
                case 0:
                    return this;
                //break;
                case 1:
                    if(root.right() != null){
                        return root.right().find(aData);
                    }
                    break;
            }
        }
        return null;
    }

    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+','+root.getHeight());
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
