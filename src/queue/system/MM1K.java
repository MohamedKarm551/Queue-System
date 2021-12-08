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
public class MM1K extends StochasticModel {
int    K=0;
    public MM1K(double arrivalRate, double serviceRate,  int capacity) {
        super(arrivalRate, serviceRate,1,capacity);
        K=capacity;
    }
       public double calcRo(double lamda,double mue){
               return(lamda/mue);
            }
        public double calcPk(double lamda,double mue){
                double Pk=0;
                double ro=calcRo( lamda, mue);
               if(ro==1){
               Pk=1 /(1+K);
               }
               else{
                   double f1=1-ro;
                   double f2=1-(Math.pow(ro, K+1));
                   Pk=(f1*f2)*(Math.pow(ro, K));
               }
               return Pk;
            }
            public double lamdaDash(double lamda,double mue){
               return  lamda*(1-calcPk( lamda, mue));
            }

     @Override
     public  double getL(double lamda,double mue){
    double ro=calcRo(lamda, mue);
        
       if(ro==1){
        this.L= K/2;}
       else{
          double f1=(1-((K+1)*(Math.pow(ro, K)))+(  K*Math.pow(ro, K+1)  )    ) ;
       double f2=((1-ro)*(1-(Math.pow(ro, K+1)))   );
       this.L=Math.ceil(ro*(f1/f2));
       }
       return this.L;
     }
     @Override
    public  double getLq(double lamda,double mue){
     this.Lq=getWq( lamda, mue)*lamdaDash(lamda, mue);
         return this.Lq;}
     @Override
    public  double getW(double lamda,double mue){
     this.W=((getL( lamda, mue))/lamdaDash(lamda, mue));
           return this.W ;}
    @Override
    public  double getWq(double lamda,double mue){
 this.Wq=(getW( lamda, mue)-(1/mue)
                      );
              return this.Wq ;}
    @Override
    public String toString() {
        return "MM1K{" + "L=" + getL( this.arrivalRate, this.serviceRate) + ", Lq=" + getLq( this.arrivalRate, this.serviceRate) + " ... W=" + getW(this.arrivalRate, this.serviceRate) + " ....Wq="+ getWq(this.arrivalRate, this.serviceRate)+ '}';
    }
}
