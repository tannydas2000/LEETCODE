 public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int ans = Integer.MIN_VALUE;
        int level = 0;
        int maxLevel = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            level++;
            for(int i = 0; i < size; i++) {
                TreeNode n = q.remove();
                sum += n.val;
                if(n.left != null) {
                    q.add(n.left);
                }
                if(n.right != null) {
                    q.add(n.right);
                }
            }
            if(ans < sum) {
                ans = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
