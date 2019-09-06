/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet7;
import java.util.*;

/**
 *
 * @author 17pd04
 */
public class PQ {
    public PriorityQueue <Tuple> a ; 
    public void create(){
        a = new PriorityQueue<>();
        System.out.println("New Priority Queue has been created ");
    }
    public void insert(int p, String str){
        Tuple temp = new Tuple();
        temp.name = str;
        temp.num = p;
        a.add(temp);
    }
    public String next(){
        String str = null;
        Tuple temp;
        temp = a.poll();
        return temp.name;
    }
    public void display(){
        Iterator itr = a.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}


