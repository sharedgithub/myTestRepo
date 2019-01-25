# Collection


Collections are like containers that groups multiple items in a single unit

Collections Framework is architecture to represent and manipulate Collections in java in a standard way

Collection interface extends Iterable interface. 

java.util.Collection is the root interface of Collections Framework

It contains some important methods such as size(), iterator(), add(), remove(), clear() that every Collection class must implement. Some other important interfaces are java.util.List, java.util.Set, java.util.Queue and java.util.Map. Map is the only interface that doesn’t inherits from Collection interface but it’s part of Collections framework.

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


Set Interface: 

* cannot contain duplicate elements
* does not allow random access
* HashSet, TreeSet, LinkedHashSet

Java HashSet is the basic implementation the Set interface that is backed by a HashMap. It makes no guarantees for iteration order of the set and permits the null element.

This class offers constant time performance for basic operations (add, remove, contains and size), assuming the hash function disperses the elements properly among the buckets. We can set the initial capacity and load factor for this collection. The load factor is a measure of how full the hash map is allowed to get before its capacity is automatically increased.

List Interface

* ordered collection and can contain duplicate elements
* resizable array
* ArrayList, LinkedList

Queue Interface

Dequeue Interface
*  linear collection that supports element insertion and removal at both ends. 

Java Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value.
HashMap, TreeMap, and LinkedHashMap.

SortedSet is a Set that maintains its elements in ascending order.

SortedMap: Map that maintains its mappings in ascending key order.

Java ArrayList is the resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)


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



Comparable and Comparator both are interfaces and can be used to sort collection elements

	Comparable provides a single sorting sequence while comparator can use multiple. That means comparator can use multiple field for sorting like name and id. Comparator modifies actual class and comparable does not
	
we can also use Array.sort() and Collections.sort()


 java.util.Collections is a utility class consists exclusively of static methods that operate on or return collections
 binary search, sorting, shuffling, reverse etc.
