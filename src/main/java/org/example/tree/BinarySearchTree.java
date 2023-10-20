package org.example.tree;

import lombok.extern.slf4j.Slf4j;
import org.example.utils.TreeNode;

@Slf4j
public class BinarySearchTree {
    private TreeNode root;
    public BinarySearchTree() {
        root = null;
    }
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 遍历二叉搜索树 Binary Search Tree
     * @param num - 搜索值
     * @return 返回搜索节点
     * @throws Exception
     */
    public TreeNode search(int num) throws Exception {
        TreeNode cur = root;
        if(root == null){
            throw new Exception("Tree is Empty");
        }
        while(cur != null) {
            if(cur.val < num) {
                cur = cur.right;
            } else if (cur.val > num) {
                cur = cur.left;
            } else {
                break;
            }
        }
        if(cur == null)
            throw new Exception("No node contains input number");
        return cur;
    }

    /**
     * 二叉搜索树插入值
     * @param num
     */
    public void insert(int num){
        TreeNode cur = root;
        TreeNode prev = null;
        TreeNode inode = new TreeNode(num);

        // 只有一个节点
        if(root == null) {
            root = inode;
            return;
        }

        while(cur != null) {
            prev = cur;
            if(cur.val < num) {
                cur = cur.right;
            } else if(cur.val > num) {
                cur = cur.left;
            } else {
                //重复节点直接返回
                log.info("Data Exists");
                return;
            }
        }

        if(prev.val<num) {
            prev.right = inode;
        } else {
            prev.left = inode;
        }
    }

    void remove(int num) {
        // 1. 如果为空树，直接返回
        if(root == null)
            return;

        TreeNode cur = root, prev = null;
        // 2. 循环查找，超过叶子节点后跳出 (要么找到该节点，要么找不到指向一个空节点)
        while(cur != null) {
            // 找到节点，跳出循环
            if(cur.val == num)
                break;
            // 未找到前，记录当前节点作为前节点
            prev = cur;
            if(cur.val > num) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }

        // 3. 如果无删除节点，直接返回
        if(cur == null)
            return;

        // 4. 子节点数量=0||1
        if(cur.left == null || cur.right == null) {
            TreeNode child = cur.left != null ? cur.left: cur.right;
            // 如果删除为根节点，则重新指定根节点
            if(cur == root) {
                root = child;
            } else {
                // 如果不是根节点，跳过当前遍历节点替换
                if(prev.left == cur)
                    prev.left = child;
                else
                    prev.right = child;
            }
        }

        // 5. 子节点数量=2
        else{
            // 两个子节点，有两个替换方案： 左子树最大值，或者右子树最小值，这里采用后者
            TreeNode tmp = cur.right;
            while(tmp.left != null) {
                tmp = tmp.left;
            }
            remove(tmp.val);
            cur.val = tmp.val;
        }
    }
}
