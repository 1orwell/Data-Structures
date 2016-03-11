public class MyTree
{

    public static void main(String[] args)
    {
        BinaryNode root = new BinaryNode("root");
        BinaryNode l1 = new BinaryNode("l1");
        BinaryNode r1 = new BinaryNode("r1");

        root.setLeft(l1);
        root.setRight(r1);

    }

}
