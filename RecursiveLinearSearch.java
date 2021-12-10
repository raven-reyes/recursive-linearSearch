
public class RecursiveLinearSearch {
	
	public static int recursiveSearch(int arr[], int l, int r, int key ) {
		//  l = starting index
		// r = ending index
		// base case
		if(l < 0) {
			return -1;
		}
		// if key  is present at starting index
		if(arr[l]  == key) {
			return l; // return the index of key
		} 
		 // else return search in remaining elements
		 return recursiveSearch(arr, l+1, r ,  key);
	}
	
	// driver code
	public static void main(String[] args) {
		
		int[] arr= {9,50,27,30,50,70,19};     // the array
        int key = 9;   // the key to search
        int index = recursiveSearch(arr, 0,  arr.length-1, key); // this  variable  stores the index of key element 
        if (index != -1) {  // if index is not -1
            System.out.println("Element " + key + " is present at index " + index); 
        } else {
             System.out.println("Element " + key + " is not present");
        
        }
	}

}
