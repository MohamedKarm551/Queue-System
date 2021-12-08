/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.system;

/**
 *
 * @author Mohamed Karm
 */
public class MM1 extends StochasticModel {

    public MM1(double arrivalRate, double serviceRate, int capacity, int serversNumber) {
        super(arrivalRate, serviceRate, capacity, serversNumber);
    }
    
 @Override
     public  double getL(double lamda,double mue){
     return 0;};
     @Override
    public  double getLq(double lamda,double mue){
    return 0;};
     @Override
    public  double getW(double lamda,double mue){
    return 0;};
    @Override
    public  double getWq(double lamda,double mue){
    return 0;};
}
