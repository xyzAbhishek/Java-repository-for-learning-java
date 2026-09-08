class car implements engine,Break,media{
     @Override
     public void start(){
        System.out.println("Start the engine");
     }  
      @Override
     public void stop(){
        System.out.println("Stop the engine");
     }  
      @Override
     public void accerlerate(){
        System.out.println("acclerate the engine");
     }  
      @Override
     public void play(){
        System.out.println("play the song");
     }     
      @Override
     public void Brake(){
        System.out.println("Apply the brake");
     }  

}