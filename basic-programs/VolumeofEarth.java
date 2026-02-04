public class VolumeofEarth{
   public static void main(String[] args){
   double r=6378;
   double volumeinkm=(4/3)*Math.PI*r*r*r;
   double volumeinmiles=volumeinkm*1.6;
   
   System.out.print("The volume of the earth in cubic killometer is"+volumeinkm+"and cubic miles is"+volumeinmiles);
   }
   }