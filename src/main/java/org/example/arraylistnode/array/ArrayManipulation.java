package org.example.arraylistnode.array;

/**********************************************************************************
 * 数组优点：
 * 1. 空间效率高: 数组为数据分配了连续的内存块，无须额外的结构开销。
 * 2. 支持随机访问: 数组允许在 𝑂(1) 时间内访问任何元素。
 * 数组缺点：
 * 1. 插入与删除效率低: 当数组中元素较多时，插入与删除操作需要移动大量的元素。
 * 2. 长度不可变: 数组在初始化后长度就固定了，扩容数组需要将所有数据复制到新数组，开销很大。
 * 3. 空间浪费: 如果数组分配的大小超过了实际所需，那么多余的空间就被浪费了。
 **********************************************************************************/
public class ArrayManipulation {

    /**
     * 在数据的索引index处插入元素num
     * @param nums      - 操作数组
     * @param num       - 插入数据
     * @param index     - 插入数据对应索引
     */
    void insert(int[] nums, int num, int index) {
        for(int i = nums.length-1; i > index; i--) {
            nums[i] = nums[i-1];
        }
        nums[index] = num;
    }

    /**
     * 删除索引index处的元素
     * @param nums      - 操作数组
     * @param index     - 插入数据对应索引
     */
    void remove(int[] nums, int index) {
        for(int i = index; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = 0;
    }

    /**
     * 遍历数组
     * @param nums      - 操作数组
     * @return          - 返回数组元素个数
     */
    int traverse(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length;i++) {
            count++;
        }
        count = 0;
        for(int num: nums){
            count++;
        }
        return count;
    }

    /**
     * 在数组中查找指定元素
     * @param nums      - 操作数组
     * @param target    - 查找元素
     * @return          - 返回查找数据索引，如未查找到返回-1
     */
    int find(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }

    /**
     * 扩展数组
     * @param nums      - 操作数组
     * @param enlarge   - 扩展个数
     * @return
     */
    int[] extend(int[]nums, int enlarge) {
        int[] res = new int[nums.length + enlarge];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        return res;
    }
}
