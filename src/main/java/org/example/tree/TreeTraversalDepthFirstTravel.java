package org.example.tree;

import org.example.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversalDepthFirstTravel {
    static List<Integer> list = new ArrayList<>();

    public static List<Integer> getList() {
        return list;
    }

    static void preOrder(TreeNode root){
        if(root == null)
            return;
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(TreeNode root) {
        if(root == null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    static void postOrder(TreeNode root) {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);
    }
}
