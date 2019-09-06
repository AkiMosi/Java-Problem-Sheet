/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Word;

/**
 *
 * @author 17pd04
 */
public class SentenceGenerate {
    String article[]={"the", "a", "one", "some", "any"};
    String preposition[]={"to", "from", "over", "under", "on" };
    String noun[]=new String[5];
    String verb[]=new String[5];
    public void getNV(String n[],String v[]){
        noun=n;
        verb=v;
    }
    public int ranran(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public void SenGen(){
        String newSen;
        String temp,cap;
        for(int i=0;i<20;i++){
            newSen="";
            temp=article[ranran(0,4)];
            cap = temp.substring(0, 1).toUpperCase() + temp.substring(1);
            newSen+=cap+' ';
            newSen+=noun[ranran(0,4)]+' ';
            newSen+=verb[ranran(0,4)]+' ';
            newSen+=preposition[ranran(0,4)]+' ';
            newSen+=article[ranran(0,4)]+' ';
            newSen+=noun[ranran(0,4)]+'.';
            System.out.println("Sentence "+(i+1)+" : "+newSen);
        }
    }
    
}
