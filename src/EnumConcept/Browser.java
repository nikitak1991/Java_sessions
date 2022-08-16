package EnumConcept;

    public enum Browser{
      CHROME(1),FIREFOX(2),SAFARI(3),EDGE(4),IE(5);
      
      Integer id;
    	
   Browser(Integer id)
   {
	   this.id = id;
   }
	
   public Integer getBrowserID() {
	   return id;
   }
}
