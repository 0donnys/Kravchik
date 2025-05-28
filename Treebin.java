package treebin;

class TreebinNode{
    int value;
  TreebinNode left;
     TreebinNode right;
     TreebinNode(int value) {
         this.value = value;
         left = null;
         right = null;
     }
}
public class Treebin {
    public static void insertNode(TreebinNode root,int value){
        TreebinNode current = root;
        while (true){
            if(value < current.value){
                if(current.left == null){
                    current.left = new TreebinNode(value);
                    break;
                } else{
                    current = current.left;
                }
            }else{
                if(current.right == null){
                    current.right = new TreebinNode(value);
                    break;
                }else{
                    current = current.right;
                }
            }
        }
    }
    public static TreebinNode createTreebin(int[] values){
       TreebinNode root = new TreebinNode(values[0]);
        for(int i = 1; i<values.length; i++){
            insertNode(root,values[i]);
        }
        return root;
    }
    public static void printBinaryTree(TreebinNode root){
        if (root == null) return;
        printBinaryTree(root.left);
        System.out.println(root.value);
        printBinaryTree(root.right);
    }
    public static void main(String[] args){
        int[] values = {10,5,15,2,7,12,17};
        TreebinNode root = createTreebin(values);
        printBinaryTree(root);
    }
}