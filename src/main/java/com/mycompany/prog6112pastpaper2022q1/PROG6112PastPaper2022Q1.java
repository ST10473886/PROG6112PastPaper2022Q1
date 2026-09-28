/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112pastpaper2022q1;

/**
 *
 * @author conno
 */
public class PROG6112PastPaper2022Q1 {

    public static void main(String[] args) {
        String month[] = {"JAN", "FEB", "MAR"};
        String year[] = {"DELIVERIES 2018", "DELIVERIES 2019", "DELIVERIES 2020"};
        int[][] deliveries = {
            {128, 135, 139},
            {155, 129, 175},
            {129, 130, 185}
        };
        
        int total = 0;
        for(int i = 0; i < deliveries.length; i++){
            for(int j = 0; j < deliveries[i].length; j++){
                total += deliveries[i][j];
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < deliveries.length; i++){
            for(int j = 0; j < deliveries[i].length; j++){
                if(deliveries[i][j] > max){
                    max = deliveries[i][j];
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < deliveries.length; i++){
            for(int j = 0; j < deliveries[i].length; j++){
                if(deliveries[i][j] < min){
                    min = deliveries[i][j];
                }
            }
        }
        
        System.out.println("************************************************************");
        System.out.println("DELIVERY REPORT");
        System.out.println("************************************************************");
        System.out.print("\t");
        for(int i = 0; i < month.length; i++){
            System.out.print("\t\t" + month[i]);
        }
        System.out.println();
        
        for(int i = 0; i < year.length; i ++){
            System.out.print(year[i]);
            for(int j = 0; j < deliveries[i].length; j++){
                System.out.print("\t\t" + deliveries[i][j]);
            }
            System.out.println();
            
        }
                
        System.out.println("************************************************************");
        System.out.println("DELIVERY STATISTICS");
        System.out.println("************************************************************");
        System.out.println("Total Deliveries: " + total);
        System.out.println("Maximum Deliveries: " + max);
        System.out.println("Minimum Deliveries: " + min);
        System.out.println("************************************************************");
        
    }
}
