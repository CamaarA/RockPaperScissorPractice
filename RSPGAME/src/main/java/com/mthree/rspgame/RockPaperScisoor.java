/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.rspgame;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScisoor {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int endGame = 1;
        while(endGame==1){
        System.out.println("How many rounds do you want to play today?");
        int howManyRounds = sc.nextInt();
        int rock=1;
        int paper=2;
        int scissor=3;
        int maxRounds = 10;
        int minRounds = 1;
        int rounds = 0;
        int computerAnswer=0;
        int userAnswer=0;
        int tie=0;
        int win=0;
        int lost=0;
       
        
        for (int i =0;i<howManyRounds;i++) {
            
        
        if (howManyRounds>maxRounds || howManyRounds<minRounds) {
            System.out.println("Error");
            break;
            
        }
          
        
    
        
        System.out.println("Choose 1 for Rock, 2 for Paper and 3 for Scissors");
        userAnswer = sc.nextInt();
        computerAnswer = r.nextInt(3)+1;
        
        if (computerAnswer==userAnswer) {
            System.out.println("It was a Tie");
            tie++;
            
        } else if (computerAnswer==1 && userAnswer==2) {   
            System.out.println("You Win");
            win++;
            
        }
          else if (computerAnswer==1 && userAnswer==3) {
              System.out.println("You Lost");
              lost++;
              
          }
          else if (computerAnswer==2 && userAnswer==1) {
              System.out.println("You Lost");
              lost++;
              
          }
          else if (computerAnswer==2 && userAnswer==3) {
              System.out.println("You Won");
              win++;
              
          }
          else if (computerAnswer==3 && userAnswer==1) {
              System.out.println("You Won");
              win++;
              
          }
          else if (computerAnswer==3 && userAnswer==2) {
              System.out.println("You Lost");
              lost++;
              
              
          }
        rounds++;
        
        
        System.out.println("You had " +tie+ " tie, " +win+ " User Wins, and " +lost+ " Computer Wins");
          if(win > lost) {
              System.out.println("You are the Overall Winner! Congrats! ");
          }
          else if(win < lost) {
              System.out.println("Computer is the Overall Winner ");
          }
          else {
              System.out.println("Game Ended in a tie.");
          } }
            System.out.println("Do You Want to Play Again? Yes(1) or No(2)?");
            int newGame = sc.nextInt();
            if (newGame==2){
                endGame=0;
                System.out.println("Thanks for playing!");
                
            } else if (newGame==1){
                endGame=1;
            }
            
            
        }
     
          
        
        
        
        
        
           
}
}

               
    
    

