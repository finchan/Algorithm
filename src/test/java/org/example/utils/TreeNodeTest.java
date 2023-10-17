package org.example.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

@Slf4j
public class TreeNodeTest {

    @Test
    public void listToTree() {
        TreeNode node = TreeNode.listToTree(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        log.info(node.toString());
    }
}