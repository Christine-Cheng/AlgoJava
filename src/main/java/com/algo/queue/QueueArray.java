package com.algo.queue;

/**
 * @Describe: 队列
 * @Author: HAPPY
 * @Date: 2022-08-22 14:16 星期一
 **/
public class QueueArray {
    /**
     * 1) 队列是一个有序列表，可以用数组或是链表来实现。
     * 2) 遵循先入先出的原则。即：先存入队列的数据，要先取出。后存入的要后取出
     * 3) 队列俩个重要的参数 front表队首 rear表队尾  maxSize表队列的最大容量
     * 4) 队列初始化  front=-1 rear=-1
     * 5) 加入数据 指针rear后移动  取数据 指针front后移 [加数据从队首加,取数据从队尾取]
     * 6) 将尾指针往后移：rear+1 , 当front == rear 【空】
     * 7) 若尾指针rear 小于队列的最大下标maxSize-1,则将数据存入rear 所指的数组元素中,否则无法存入数据。
     *    rear == maxSize - 1[队列满]
     */
    public static void main(String[] args) {
    
    }
}
