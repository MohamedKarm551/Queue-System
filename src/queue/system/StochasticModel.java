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
public abstract class StochasticModel extends QueueingClass{

    public StochasticModel(double arrivalRate, double serviceRate, int capacity, int serversNumber) {
        super(arrivalRate, serviceRate, capacity, serversNumber);
    }
    
    public abstract double getL(double lamda,double mue);
    public abstract double getLq(double lamda,double mue);
    public abstract double getW(double lamda,double mue);
    public abstract double getWq(double lamda,double mue);
}
