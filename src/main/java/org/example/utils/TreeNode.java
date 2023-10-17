package org.example.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode listToTree(List<Integer> arr){
        return listToTreeDFS(arr, 0);
    }

    private static TreeNode listToTreeDFS(List<Integer> arr, int i) {
        if(i<0 || i>=arr.size() || arr.get(i) == null)
            return null;
        TreeNode root = new TreeNode(arr.get(i));
        root.left = listToTreeDFS(arr, 2*i+1);
        root.right = listToTreeDFS(arr, 2*i+2);
        return root;
    }
}
