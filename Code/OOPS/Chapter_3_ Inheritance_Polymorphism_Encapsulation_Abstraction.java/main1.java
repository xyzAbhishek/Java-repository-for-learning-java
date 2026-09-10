class main1{
    static double l;
    static double h;
    static double b;

   main1(){
   	this.l = 1;
   	this.b = 1;
   	this.h = 1;
   }

   
   main1(double l){
   	this.l = l;
   	this.b = 1;
   	this.h = 1;
   }

     
   main1(double l,double b,double h){
   	this.l = l;
   	this.b = b;
   	this.h = h;
   }

   static void dimensions(){
      System.out.print(l+","+b+","+h);
   }
}