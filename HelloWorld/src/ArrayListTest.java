
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(20);
        System.out.println(nums.get(0));
        //初始化一个包含1,3,5的动态数组
        ArrayList<Integer> nums_1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5));
        //初始化ArrayList,大小为10,元素都为0
        ArrayList<Integer> nums_2 = new ArrayList<Integer>(Collections.nCopies(10, 0));
        //判断动态数组是否为空
        System.out.println(nums.isEmpty());
        //输出数组大小
        System.out.println("数组的大小为:" + nums.size());
        //删除散组最后一个元素
        nums_1.remove(nums_1.size() - 1);
        //通过索引取值或修改
        nums_2.set(3, 11);
        //获得索引处的数据
        System.out.println(nums.get(0));
        //在索引处插入一个数,该索引处原来的数向后挪一个
        nums_2.add(3, 20);
        System.out.println(nums_2.get(3));
        //交换nums_2[0]和nums_2[1]
        Collections.swap(nums_2,0,1);
        //遍历数组
        for(int num : nums)//num是数组中元素赋值的变量名,随手起的
        {
            System.out.print(nums_2 + " ");
        }
    }
}