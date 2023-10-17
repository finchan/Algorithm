package org.example.tree;

import lombok.extern.slf4j.Slf4j;
import org.example.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class TreeTraversalDepthFirstTravelTest {
    private List<Integer> values = new ArrayList<>();
    TreeNode root = null;

    @Before
    public void setUp() throws Exception {
        root = TreeNode.listToTree(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    }

    @Test
    public void preOrder() {
        TreeTraversalDepthFirstTravel.preOrder(root);
        String listStr = Arrays.toString(TreeTraversalDepthFirstTravel.getList().toArray());
        log.info(listStr);
    }

    @Test
    public void inOrder() {
        TreeTraversalDepthFirstTravel.inOrder(root);
        String listStr = Arrays.toString(TreeTraversalDepthFirstTravel.getList().toArray());
        log.info(listStr);
    }

    @Test
    public void postOrder() {
        TreeTraversalDepthFirstTravel.postOrder(root);
        String listStr = Arrays.toString(TreeTraversalDepthFirstTravel.getList().toArray());
        log.info(listStr);
    }
}