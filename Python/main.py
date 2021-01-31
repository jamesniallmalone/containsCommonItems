''' Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
For Example:
const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
should return false.
-----------
const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
should return true.

 2 parameters - arrays - no size limit
 return true or false
'''


'''
Script will compare one element against another. 
Inefficient, since runtime is O(a*b)
'''
def containsCommonItemBruteForce(arr1, arr2):
	for elem in arr1:
		for elem2 in arr2:
			if elem == elem2:
				return True
	return False
	
'''
Script will swap both arrays to sets. Perform a merge. 
Returns whether size of merged set is the same as the sum of the size of both sets.
O(a + b)
'''
def containsCommonItemSets(arr1, arr2):
	return len(set(arr1).union(set(arr2))) != len(arr1) + len(arr2)
	

array1 = ['a', 'b', 'c', 'x']
array2 = ['z', 'y', 'i']
array_contains = ['z', 'y', 'x']

import time

start = time.time()
print("Brute force approach")
print(containsCommonItemBruteForce(array1, array2))
print(containsCommonItemBruteForce(array1, array_contains))
end = time.time()
print(end - start)

start = time.time()
print("Sets approach")
print(containsCommonItemSets(array1, array2))
print(containsCommonItemSets(array1, array_contains))
end = time.time()
print(end - start)