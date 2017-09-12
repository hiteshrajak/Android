class Convert{
	public static void main(String args[]){
       long Number;
        Number=123456;
//public static String toString(long i)
//The argument i is converted and returned as a string instance. If the number is negative, the sign will be preserved.
        String numberAsString = Long.toString(Number);
	
	 System.out.println(numberAsString.length());


//reverse String 
        StringBuffer buffer = new StringBuffer(numberAsString);
         
	buffer.reverse();
        System.out.println(buffer);
	
	
       }
}
