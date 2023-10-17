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
}
