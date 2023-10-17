package org.example.tree;

import lombok.extern.slf4j.Slf4j;
import org.example.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class BinarySearchTreeTest {
    private TreeNode root;

    public TreeNode getNodes() {
        return root;
    }

    @Before
    public void setUp() throws Exception {
        root = TreeNode.listToTree(Arrays.asList(8,4,12,2,6,10,14,1,3,5,7,9,11,13,15));
    }

    @Test
    public void search(){
        // 初始化根节点
        BinarySearchTree bst = new BinarySearchTree();
        bst.setRoot(root);
        List<Integer> datas = Arrays.asList(8,4,12,2,6,10,14,1,3,5,7,9,11,13,15);
        datas.forEach(data->{
            try {
                TreeNode node = bst.search(data);
                log.info(String.valueOf(node.val));
            } catch (Exception e) {
                if("Tree is Empty".equals(e.getMessage())){
                    log.info("Tree is Empty");
                }else if("No node contains input number".equals(e.getMessage())){
                    log.info("No node contains input number");
                } else {
                    log.info("Other errors");
                }
            }
        });

        TreeNode node = null;
        try {
            node = bst.search(16);
            log.info(String.valueOf(node.val));
        } catch (Exception e) {
            if("Tree is Empty".equals(e.getMessage())){
                log.info("Tree is Empty");
            }else if("No node contains input number".equals(e.getMessage())){
                log.info("No node contains input number - " + 16);
            } else {
                log.info("Other errors");
            }
        }

    }

    @Test
    public void insert() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(4);
        bst.insert(12);
        bst.insert(2);
        bst.insert(6);
        bst.insert(10);
        bst.insert(14);
        TreeNode node = bst.getRoot();
        log.info(" " + node.val);
    }
}