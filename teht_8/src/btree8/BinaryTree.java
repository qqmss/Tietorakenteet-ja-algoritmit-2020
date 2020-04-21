/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree8;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;
    public static BinaryTree found; // findWithPreOrder()-operaation apurakenne

    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }

    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */

    public String find(String s){
        if (root == null) {
            return null;
        }
        if (s.equals(root.getData())) {
            return root.getData();
        }
        if (root.left() != null){
            String ss = root.left().find(s);
            if(ss != null){
                return ss;
            }
        }
        if (root.right() != null){
            return root.right().find(s);
        }
        return null;
    }

    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }

    // löydetty alipuu asetetaan staattiseen muuttujaan found
    public void findWithPreOrder() {

        if (root != null) {
            System.out.print(root.getData()+ ": muokkaatko tätä?");
            if (root.left()== null)
                System.out.print(" (vasemmalla tilaa)");
            if (root.right() == null)
                System.out.println(" (oikealla tilaa)");
            char select = Lue.merkki();
            if (select =='k') {
                found = this;
                return;
            }
            if (found==null && root.left() != null) // pääseekö vasemmalle?
                root.left().findWithPreOrder();
            if (found== null && root.right() != null) // pääseekö oikealle?
                root.right().findWithPreOrder();
        }

    }
    public void setNotFound() {
        found = null;
    }
    public static BinaryTree getFound() {
        return found;
    }

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
