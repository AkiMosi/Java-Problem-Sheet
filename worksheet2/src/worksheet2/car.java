/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

/**
 *
 * @author 17pd04
 */
public class car {
    float fuel;
    float milage;
    float km;
    car(float mil){
        milage=mil;
        fuel=km=0;
    }
    void tank(float lt){
        fuel=lt;
    }
    void drive(float kilo){
        km=kilo;
    }
    float getfuel(){
        if(fuel>(milage*km))
        {
            fuel = fuel - (milage*km);
            return fuel;
        }
        else
            return 0;        
    }
}
