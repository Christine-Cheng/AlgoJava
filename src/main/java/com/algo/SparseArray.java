package com.algo;

/**
 * @author Happy
 * @Describe 稀疏数组
 * @create 2022/8/15-15:09
 **/
public class SparseArray {
    /*例如五子棋 (一个二维数组)*/
    //1.遍历原始数组,获取有效数据的个数sum (稀疏数组第一行的元素描述: 几行  几列  有效元素个数; 以后每一行表述为 行数 列数 元素值)
    //2.根据sum可以创建稀疏数组  例如:int[sum+1][3]
    //3.将二维数组的有效数据存入稀疏数组
    
    /*还原稀疏数组为二维数组*/
    //1.先取稀疏数组的第一行元素建立一个二维数组 int chaseArr [11][11]
    //2.读取稀疏数组中元素赋值给二维数组
    
    public static void main(String[] args) {
        //初始化二维数组
        int chessArr[][] = new int[11][11];
        //0 表示没有棋子  1-黑子 2-白子
        //index从0开始编码
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[4][5] = 2;
        
        //输出一个二维数组
        //原始的二维数组
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        
        
        //把原始的二维数组转换为稀疏数组
        //1.获取所有的非零元素
        int sum=0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
            
            }
            
        }
        
    }
}
