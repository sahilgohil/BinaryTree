static void printOneChildNodes(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        if(root.left == null && root.right != null)
        {
            System.out.println(root.data);
        }
        if(root.right == null && root.left != null)
        {
            System.out.println(root.data);
        }

        printOneChildNodes(root.left);
        printOneChildNodes(root.right);
    }
