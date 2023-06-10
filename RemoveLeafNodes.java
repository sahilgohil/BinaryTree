static TreeNode removeLeafNodes(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        if(root.left == null && root.right == null)
        {
            return null;
        }

        TreeNode left = removeLeafNodes(root.left);
        TreeNode right = removeLeafNodes(root.right);

        root.left = left;
        root.right = right;
        return root;
    }
