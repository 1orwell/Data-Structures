public class BinaryNode
{

    private String name;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(String name)
    {
        this.name = name;
    }

    public BinaryNode(String name, BinaryNode left)
    {
        this.name = name;
        this.left = left;
    }

    public BinaryNode(String name, BinaryNode left, BinaryNode right)
    {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public String getName()
    {
        return this.name;
    }

    public BinaryNode getLeft()
    {
        return this.left;
    }

    public BinaryNode getRight()
    {
        return this.right;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setLeft(BinaryNode newLeft)
    {
        this.left = newLeft;
    }

    public void setRight(BinaryNode newRight)
    {
        this.right = right;
    }

}
