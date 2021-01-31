import java.util.*; 

public class ContainsCommonItems{
	
	static boolean commonItemsBruteForce(Character[] arr1, Character[] arr2){
		for(int i = 0; i < arr1.length; i++){
			for(int j =0; j < arr2.length; j++){
				if (arr1[i] == arr2[j]){
					return true;
				}
			}
		}
		
		return false;
	}
	
	static boolean commonItemsSet(Character[] arr1, Character[] arr2){
	    Set<Character> set = new HashSet<Character>(Arrays.asList(arr1));
	    set.addAll(Arrays.asList(arr2));
	    
	    return set.size() != arr1.length + arr2.length;
	}
	
	static boolean commonItemsSetRetain(Character[] arr1, Character[] arr2){
	    Set<Character> set1 = new HashSet<>(); 
        Set<Character> set2 = new HashSet<>(); 
        
	    // Adding elements from array1 
        for (Character i : arr1) { 
            set1.add(i); 
        } 
        
        // Adding elements from array2 
        for (Character i : arr2) { 
            set2.add(i); 
        } 
        
        // use retainAll() method to 
        // find common elements 
        set1.retainAll(set2);
	    
	    return !set1.isEmpty();
	}
	
	public static void main(String[] args){
		Character[] array1 = new Character[]{'a', 'b', 'c', 'x'};
		Character[] array2 = new Character[]{'z', 'y', 'i'};
		Character[] array3 = new Character[]{'z', 'y', 'x'};
		
		long endTime   = 0L;
		long totalTime = 0L;
		
		long startTime = System.nanoTime();
		System.out.println(commonItemsBruteForce(array1, array2));
		System.out.println(commonItemsBruteForce(array1, array3));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		startTime = System.nanoTime();
		System.out.println(commonItemsSet(array1, array2));
		System.out.println(commonItemsSet(array1, array3));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		startTime = System.nanoTime();
		System.out.println(commonItemsSetRetain(array1, array2));
		System.out.println(commonItemsSetRetain(array1, array3));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);
		
	}
	
}