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
public class QueueSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 MMC mmc=new MMC(0.1,0.05,0,0,3);//L=2.8 ,Lq=0.88 , W=28.8 , Wq=8.8
 MM1K mm1k=new MM1K(2,2.4,5);
        System.out.println(mmc);  
          System.out.println(mm1k); //MM1K{L=1.9788276239889147, Lq=1.182617844304876, W=1.0355455698152485, Wq=0.6188789031485817}
  MMCK mmck=new MMCK(1,0.16,3,7); //l=6.06 , lq=3.09 ,W=12.3 ,Wq=
  System.out.println(mmck);
    }

}


