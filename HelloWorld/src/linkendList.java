import java.util.Arrays;
import java.util.LinkedList;

public class linkendList {
    public static void main(String[] argd){
        //初始化链表
        LinkedList<Integer> lst = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
        //检查链表是否为空,输出false
        System.out.println(lst.isEmpty());
        //获取链表的大小
        System.out.println(lst.size());
        //在链表头部插入元素0
        lst.addFirst(0);
        //在链表尾部插入元素6
        lst.addLast(6);
        //获取链表头部和尾部元素
        System.out.println(lst.getFirst() + " " + lst.getLast());
        //删除链表头部 尾部元素,删除某个元素
        lst.removeFirst();
        lst.removeLast();
        //插入元素
        lst.add(2,99);
        lst.remove(1);
        //遍历链表
        for(int val : lst) {
            System.out.print(val + " ");
        }
    }
}
