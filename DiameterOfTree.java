// make Diameter Pair class that has 2 instance variables that are
// Height and Diameter

// 4 this required
// get diameter of left tree
// get diameter of right tree
// get diameter through the root
// make ans diameter pair that has height and diameter

static class Dia{
        int ht;
        int dia;
        public Dia(int ht, int dia)
        {
            this.ht = ht;
            this.dia = dia;
        }
    }

    static Dia getDiaMeter(TreeNode root)
    {
        if(root == null)
        {
            Dia d = new Dia(-1, 0);
            return d;
        }

        Dia left = getDiaMeter(root.left);
        Dia right = getDiaMeter(root.right);
        int through = left.ht +right.ht +2;

        Dia ans = new Dia(0, 0);
        ans.ht = Math.max(left.ht, right.ht)+1;
        ans.dia = Math.max(left.dia, Math.max(right.dia, through));
        return ans;
    }
