/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet7;

/**
 *
 * @author 17pd04
 */
public class Tuple implements Comparable<Tuple> {
    public String name;
    public int num;
    @Override
    public int compareTo(Tuple m){
        return this.num - m.num;
    }

    @Override
    public String toString() {
        return "Tuple{" + "name=" + name + ", num=" + num + '}';
    }
}
