package com.nzy.datastructure.array;

import java.util.Arrays;

public class SparseArray {
    public static void main(String[] args) {
        Solution solution = new SparseArray().new Solution();
    }
     class Solution{
        //普通数组转化为稀疏数组
         public Integer[][] toSparse(Integer[][] arr){
             int row = arr.length;//记录原数组的行数
             int col=arr[0].length;//记录原数组的列数
             int count=0;//记录原数组中有效值的个数
             for (int i = 0; i < arr.length; i++) {
                 for (int j = 0; j < arr[i].length; j++) {
                     if (arr[i][j]!=0)count++;
                 }
             }
             //创建稀疏数组
             Integer spa[][]=new Integer[count+1][3];
             spa[0][0]=row;
             spa[0][1]=col;
             spa[0][2]=count;
             //将原数组中的有效值的信息存放到稀疏数组
             //包括值所在的行数、列数、以及值本身
             int num=0;
             for (int i = 0; i < arr.length; i++) {
                 for (int j = 0; j < arr[i].length; j++) {
                     if (arr[i][j]!=0){
                         num++;
                        spa[num][0]=i;
                        spa[num][1]=j;
                        spa[num][2]=arr[i][j];
                     }
                 }
             }
             return spa;
         }
         //稀疏数组转化为普通数组
         public Integer[][] toArray(Integer[][] spa){
             Integer[][] arr=new Integer[spa[0][0]][spa[0][1]];
             for (int i = 1; i < spa.length; i++) {
                 arr[spa[i][0]][spa[i][1]]=spa[i][2];
             }
             return arr;
         }

    }
}
