
class MainDemo {
	
	      String str="a";
	      String str2;
	      
	     
	      
	  void  strConcat(){
		  for(int j=0;j<100000;j++){
	    	  for(char i='a';i<='z';i++){
	    		  
	    		  str=str.concat(String.valueOf(i));
	    		  System.out.println(str);
	    	  }
	    	  
	      }
	
	
	  }
}
class StringOutOfLanth{
	
	 public static void main(String args[]){ 
		 
		 MainDemo sol=new MainDemo();
		
		 sol.strConcat();
		
  	   
	 }   

}