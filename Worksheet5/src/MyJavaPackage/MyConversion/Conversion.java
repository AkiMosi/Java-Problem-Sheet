/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaPackage.MyConversion;

/**
 *
 * @author 17pd04
 */
public class Conversion {
    public float inch2cm(float x){
        return (float) (x*2.54);
    }
    public float cm2inch(float x){
        return (float) (x/2.54);
    }
    public float pound2kilo(float x){
        return (float) (x*454/1000);
    }
    public float kilo2pound(float x){
        return (float) (x*1000/454);
    }
    public float mile2km(float x){
        return (float) (x*1.609344);
    }
    public float min2hr(float x){
        return (float) (x/60);
    }
    public float min2sec(float x){
        return (float) (x/60);
    }
    public float fah2cel(float x){
        return (float) (x/33.8);
    }
    public float cel2fah(float x){
        return (float) (x*33.8);
    }
}
