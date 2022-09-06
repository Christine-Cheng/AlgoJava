package com.algo.queue;

import java.util.Scanner;

/**
 * @Describe: 数组模拟队列
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
     * rear == maxSize - 1[队列满]
     */
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';//接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show:显示队列)");
            System.out.println("e(exit:推出程序)");
            System.out.println("a(add:添加队列数据)");
            System.out.println("g(get:取出队列数据)");
            System.out.println("p(peak:查看队列头数据)");
            key = scanner.next().charAt(0);//接受一个字符
            switch (key) {
                case 's'://展示
                    arrayQueue.showQueue();
                    break;
                case 'e'://退出
                    scanner.close();
                    loop = false;
                    break;
                case 'a'://添加
                    System.out.println("输入一个数据");
                    int val = scanner.nextInt();
                    arrayQueue.addQueue(val);
                    break;
                case 'g'://获取
                    try {
                        int queue = arrayQueue.getQueue();
                        System.out.printf("取出的数据是:%d\n",queue);;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'p'://头数据
                    try {
                        int queue = arrayQueue.peakQueue();
                        System.out.printf("队列头数据是:%d\n",queue);;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
                
            }
        }
        System.out.println("程序退出");
    }
}

class ArrayQueue {
    private Integer maxSize;//数组的最大容量
    private Integer front;//队首
    private Integer rear;//队尾
    private int[] arr;//用于存放数据 模拟队列
    
    //创建队列构造器
    public ArrayQueue(Integer maxSize) {
        //初始化
        this.maxSize = maxSize;
        this.front = -1;//指向头部,可以分析出,front是指向队列头的前一个位置
        this.rear = -1;//指向尾部,rear是指向队列为的数据(既是队列最后一个数据)
        this.arr = new int[maxSize];
    }
    
    //判断满
    public boolean isFull() {
        return rear == maxSize - 1;
    }
    
    //判断空
    public boolean isEmpty() {
        return rear == front;
    }
    
    //add data to queue
    public void addQueue(int data) {
        //先判断满
        if (isFull()) {
            System.out.println("the queue is full");
            return;
        }
        //改变尾标,后移
        rear++;
        //添加数据
        arr[rear] = data;
    }
    
    //get data from queue
    public int getQueue() {
        //先判断空
        if (isEmpty()) {
            System.out.println("the queue is empty");
            throw new RuntimeException("the queue is empty");
        }
        //改变首表,后移
        front++;
        //返回数据
        return arr[front];
    }
    
    //to show all data of queue
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }
    
    //to show the data of front index
    //显示队列头
    public int peakQueue() {
        //判断是否为空
        if (isEmpty()) {
            throw new RuntimeException("the data is empty");
        }
        return arr[front + 1];
    }
}
