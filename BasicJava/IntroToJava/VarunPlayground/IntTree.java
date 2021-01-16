package VarunPlayground;

public class IntTree {
    private IntTreeNode overallRoot;

    public IntTree(int h) {
        overallRoot = fillTree(h, 1);
    } 

    private IntTreeNode fillTree(int h, int curH) {
        if(curH == h) {
            return new IntTreeNode((int)(Math.random()*100), null, null);
        } else {
            return new IntTreeNode((int)(Math.random()*100), fillTree(h, curH+1),fillTree(h, curH+1));
        }
    }

    public void printTree() {
        IntTreeNode root = this.overallRoot;
        printTreeInner(root);
    }
    private void printTreeInner(IntTreeNode root) {
        if(root != null) {
            if(root.left == null && root.right == null) {
                System.out.print(root.data + " ");
            } else {
                printTreeInner(root.left);
                System.out.print(root.data + " ");
                printTreeInner(root.right);
            }
        }
    }
}
