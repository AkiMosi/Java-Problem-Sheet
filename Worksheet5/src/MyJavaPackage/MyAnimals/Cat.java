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
public class Cat extends Animal implements Pet {
    String name;
    public Cat(){
        this("");
    }
    public Cat(String name){
        super(4);
        this.name=name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void play(){
        System.out.println(this.name+" plays with ball");
    }
    @Override
    public void eat(){
        System.out.println(this.name+" eats fish, rat");
    }
}
