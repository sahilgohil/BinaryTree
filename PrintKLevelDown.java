 static void klevelDown(TreeNode root,int k)
    {
        if(root == null)
        {
            return;
        }
        if(k == 0)
        {
            System.out.println(root.data);
        }

        klevelDown(root.left, k-1);
        klevelDown(root.right, k-1);
    }
