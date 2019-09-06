/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaPackage.MyAnimals;

/**
 *
 * @author 17pd04
 */
public abstract class Animal {
    protected  int legs;
    public Animal(){
        
    }
    protected Animal(int legs){
        this.legs=legs;
    }
    public void walk(){
        if(this.legs==0)
            System.out.println("The animal has no legs ");
        else
            System.out.println("The animal has "+this.legs+" legs");
    }
    public abstract void eat();
}
