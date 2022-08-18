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
        /*一.初始化二维数组*/
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
        System.out.println("\n#######################################################\n");
        
        /*二:把原始的二维数组转换为稀疏数组*/
        //1.获取所有的非零元素
        int sum = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    sum++;
                }
            }
        }
        
        //2.创建稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        //给稀疏数组赋值 初始化数组
        sparseArr[0][0] = 11;//原始数组行数
        sparseArr[0][1] = 11;//原始数组列数
        sparseArr[0][2] = sum;//sum个非零元素
        
        //3.遍历二维数组,把非零元素放到稀疏数组中
        int count = 0;//用于记录第几个非零元素
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    count++;//稀疏数组第一行(index=0)记录的是原始数组的行列数目,和有效元素的数目;有效元素坐标和值从index=1开始
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        }
        
        /*三.输出稀疏数组*/
        System.out.println("得到的稀疏数组:");
        //for (int i = 0; i < sparseArr.length; i++) {
        //    for (int j = 0; j < sparseArr[i].length; j++) {
        //        System.out.printf("%d\t", sparseArr[i][j]);
        //    }
        //    System.out.println();
        //}
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }
    
        System.out.println("\n#######################################################\n");
    
    
        /*四.将稀疏数组--->二维数组*/
        //创建一个二维数组
        int new2DArr[][]=new int[sparseArr[0][0]][sparseArr[0][1]];
        //初始化二维数组
        for (int i = 1; i < sparseArr.length; i++) {//index=1开始
            new2DArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        //输出还原的二维数组
        System.out.println("还原的二维数组:");
        for (int[] row : new2DArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        
        //todo 把数组数据保存到 .data文件中
        
        
    }
}
