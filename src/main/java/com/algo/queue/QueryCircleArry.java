package com.algo.queue;

/**
 * @Describe: 数组模拟循环队列:解决数组空间使用后没法复用
 * @Author: HAPPY
 * @Date: 2022-09-06 12:58 星期二
 **/
public class QueryCircleArry {
    public static void main(String[] args) {
    
    }
}


class QueryCircle {
    private Integer maxSize;//数组的最大容量
    private Integer front;//队首
    private Integer rear;//队尾
    private int[] arr;//用于存放数据 模拟队列
    
    //创建队列构造器
    public QueryCircle(Integer maxSize) {
        //初始化
        this.maxSize = maxSize;
        this.front = 0;//指向头部,front是指向队列头的第一个位置,arr[front]是队列第一个元素,front初始值为=0
        this.rear = 0;//指向尾部,rear是指向队列尾部的后一个位置,因为希望空出一个空间作为一个约定,rear的初值为=0
        //队列满: (rear+1 - front)%maxSize = front
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
