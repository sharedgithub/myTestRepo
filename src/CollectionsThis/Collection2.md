# Collection

Collection interface extends Iterable interface

Any class to implement for each loop need to extend iterable

Collecton interface has common methods 

Basic Operation
	add(Object)
	remove(Object)
	contains(Object)
	size();
	isEmpty();

Bulk Operation
	addAll(Collection)
	removeAll(Collection)
	retainAll(Collection)
	containsAll(Collection)
	clear();

Array Operation
	toArray();



### List Interface
	List is used when sequence or position matters. It is basically a resizable array

	extends collection interface has some methods of its own
	
	=>>>Positional Operations
	get(index)
	set(index, value)
	add(index,value)
	add(value)
	remove(index)
	addAll(index,Collection)
	
	+>>> Search operations
	indexOf(Element)
	lastindexOf(Element)
	
	==>> Range View Operations
	subList(fromIndex,toIndex)
	
	this method return a list...any change made to it will be reflected in original list
	
	==>> bulk operations
	removeAll(collectrion)
	retainAll(collecton)     it is like give common element between both collection
	addAll(collection)
	
### ArrayList interface

A resizable array implementation of List Interface...
fast random access O(1) constant time complexity
appending or deleting last element O(1)

if element is to be added in between or say at first position all the remaining element have to shift right
add(index,element) O(N) linear time complexity

remove method from specified element then all the element are shifter right
remove (element)  O(N) linear time complexity  ** notice that List implementation of remove uses index but array list tries to find the given element

contains and indexOf  both have lineear time complexity as for last element entire list is scanned

if frequest search is required then go for set implementation which has constant time complexity for search

looping the list with for each and removing element at the same time can give concurrentmodficaiton exception...so for this we can use iterator

Iterator<integer> i=collectionABC.iterator();

while(i.hasNext()){
	i.next();
	i.remove();
}



	