package com.rabbit.consulting;

import java.util.LinkedList;
import java.util.Queue;

public class DistributedQueueClient {
          public static void main(String args[]){
        	  Randomizer randomizer = new Randomizer();
        	  
        	  Queue myQuque = new LinkedList<Integer>();
        	  myQuque.add(randomizer.getRandomNumber());
        	  myQuque.add(randomizer.getRandomNumber());
        	  myQuque.add(randomizer.getRandomNumber());
        	  Prime prime = new Prime();
        	  while(myQuque.peek() != null){
        		 int randomNumber =  (int) myQuque.poll();
        		 if(prime.isPrime(randomNumber)){
        			 System.out.println(randomNumber +" is primenumber");
        		 }else{
        			 System.out.println(randomNumber +" is not a primenumber");
        		 }
        	  }
          }
}
