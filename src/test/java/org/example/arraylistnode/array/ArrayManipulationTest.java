package org.example.arraylistnode.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

@Slf4j
public class ArrayManipulationTest {
    private int[] nums = {0,1,2,3,4,5};
    private ArrayManipulation arraysManipulation = new ArrayManipulation();

    @Test
    public void insert() {
        arraysManipulation.insert(nums, 10, 2);
        log.info(Arrays.toString(nums));
    }

    @Test
    public void remove() {
        arraysManipulation.remove(nums,2);
        log.info(Arrays.toString(nums));
    }

    @Test
    public void traverse() {
        int count = arraysManipulation.traverse(nums);
        log.info(" " + count);
    }

    @Test
    public void find() {
        int index = arraysManipulation.find(nums, 2);
        log.info("index - " + index);
    }

    @Test
    public void extend() {
        int[] newNums = arraysManipulation.extend(nums, 10);
        log.info(Arrays.toString(newNums));
    }
}