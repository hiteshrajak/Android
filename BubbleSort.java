
 class BubbleSortExample  {

	private int []arr;
	int counter;
	
	public int [] getArr() {
		return arr;
	}
	public void setArr(int [] arr) {
		this.arr = arr;
	}
	
	void LinearSearchExample(int item) {
		int num=arr.length;
		
		 for ( counter = 0; counter < num; counter++)
	      {
	         if (arr[counter] == item) 
	         {
	        	 System.out.println();
	           System.out.println(item+" is present at location "+(counter+1));
	           /*Item is found so to stop the search and to come out of the 
	            * loop use break statement.*/
	           break;
	         }
	      }
		 
		//If item is not found
		 
		 if (counter == num) {
	    	  System.out.println();
	        System.out.println(item + " doesn't exist in array.");
	      }
	   }
	
	  void bubbleSort() {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }
	  
	int  binarySearch(int arr[], int x){
		 int l = 0, r = arr.length - 1;
	        while (l <= r)
	        {
	            int m = l + (r-l)/2;
	 
	            // Check if x is present at mid
	            if (arr[m] == x)
	                return m;
	 
	            // If x greater, ignore left half
	            if (arr[m] < x)
	                l = m + 1;
	 
	            // If x is smaller, ignore right half
	            else
	                r = m - 1;
	        }
	     // if we reach here, then element was not present
	        return -1;
	  }
	  
	  void Display() {
		  System.out.println();
		  System.out.println("Array After Bubble Sort");  
          for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
          }  
		  
	  }

}
 public class BubbleSort {
	   public static void main(String[] args) {  
           int arr[] ={3,60,35,2,45,320,5};  
            //Display Array Before  Sort
           
           System.out.println("Array Before Sort");  
           for(int i=0; i < arr.length; i++){  
                   System.out.print(arr[i] + " ");  
           }  
           System.out.println();  
           BubbleSortExample BSE=new BubbleSortExample();
         
           BSE.setArr(arr);//Set Array value via setArr
           BSE.LinearSearchExample(320);//Find Number by Linear Search;
           BSE.bubbleSort();//Sorting by BubbleShort.
           BSE.Display();//Display function.
           System.out.println(); 
           int result = BSE.binarySearch(arr, 320);
           if (result == -1)
               System.out.println("Element not present");
           else
               System.out.println("Element found at index "+result);
          

   } 
	
}