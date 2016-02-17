public class TreeNode
{
    int item;
    TreeNode parent;

    public TreeNode(int item)
    {
        this.item = item;
    }

    public TreeNode(int item, TreeNode parent)
    {
        this.item = item; // the data is this node.
        this.parent = parent; // parent pointer
    }
}

