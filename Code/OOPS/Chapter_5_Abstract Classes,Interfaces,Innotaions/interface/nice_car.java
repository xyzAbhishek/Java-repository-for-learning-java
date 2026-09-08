class nice_car{
		
    public engine engine1;
    public media mdea;
	public nice_car(){
		engine1 = new power_engine();
		mdea = new CD_Player();
	}					

	public nice_car(engine engine1){
		this.engine1 = engine1;
	}
	
	public void start(){
		engine1.start();
	}
	
	public void stop(){
		engine1.stop();
	}
    public void stopmusic(){
    	mdea.stop();
    }
      
}