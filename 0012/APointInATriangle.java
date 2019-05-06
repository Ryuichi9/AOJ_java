/**
 * AOJ 0012 A Point in a Triangle
 */

 import java.util.Scanner;

 public class APointInATriangle{
     public static void main(String[] args){
        Point a = new Point(),b = new Point(),c = new Point(),p = new Point();
        Vector ap,bp,cp,ab,bc,ca;
        Double x1,x2,x3;
        Scanner scn = new Scanner(System.in);

        while(scn.hasNext()){
            a.x = scn.nextDouble();
            a.y = scn.nextDouble();
            b.x = scn.nextDouble();
            b.y = scn.nextDouble();
            c.x = scn.nextDouble();
            c.y = scn.nextDouble();
            p.x = scn.nextDouble();
            p.y = scn.nextDouble();

            ap = new Vector(a,p);
            bp = new Vector(b,p);
            cp = new Vector(c,p);
            
            ab = new Vector(a,b);
            bc = new Vector(b,c);
            ca = new Vector(c,a);
            
            x1 = Vector.getCrossVector(ca,ap);
            x2 = Vector.getCrossVector(ab,bp);
            x3 = Vector.getCrossVector(bc,cp);
            
            if((x1 > 0 && x2 > 0 && x3 > 0) || (x1 < 0 && x2 < 0 && x3 < 0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scn.close();
     }

     public static class Point{
         double x;
         double y;
         Point(){
             this.x =0.0;
             this.y =0.0;
         }
     }

     public static class Vector{
         double x;
         double y;

         Vector(Point a,Point b){
            this.x = b.x -a.x;
            this.y = b.y -a.y;
         }

        public static double getCrossVector(Vector a,Vector b){
            //A x B の外積を出力 
            //二次元ベクトルなので外積はスカラとして扱う
            double crossVector = a.x * b.y - a.y * b.x;

            return crossVector;
        }
     }
 }