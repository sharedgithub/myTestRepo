# Collection


* Collections are like containers that groups multiple items in a single unit
* Collections Framework is architecture to represent and manipulate Collections in java in a standard way
* Collection interface extends Iterable interface. Any class to implement for each loop need to extend iterable interface. Iterable has only one method which is iterator()
* java.util.Collection is the root interface of Collections Framework
* It contains some important methods such as size(), iterator(), add(), remove(), clear() that every Collection class must implement. Some other important interfaces are java.util.List, java.util.Set, java.util.Queue and java.util.Map. Map is the only interface that doesn’t inherits from Collection interface but it’s part of Collections framework.

![](http://apprize.info/javascript/oca_2/oca_2.files/image1184.jpg)

collections can hold Objects but not primitives.hence we use wrapper class.

subflavours of collections : sorted unsorted ordered unorderd

some collections use hashing to store and retrieve data all those collections starts with "Hash"

Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.

Some of the common methods in objects class java.lang.Object

![](http://apprize.info/javascript/oca_2/oca_2.files/image1165.jpg)

The bottom line is this: If you want objects of your class to be used as keys for a hashtable (or as elements in any data structure that uses equivalency for searching for—and/or retrieving—an object), then you must override equals() so that two different instances can be considered the same
"If two objects are equal using Object class equals method, then the hashcode method should give the same value for these two objects.". Hence it is required to override hashcode methods along with the equals method.

Basically if you have your own data type and you want to use collections over it then do the above

### Collecton interface has common methods 

Basic Operation
* add(Object)
* remove(Object)
* contains(Object)
* size();
* isEmpty();

Bulk Operation
* addAll(Collection)
* removeAll(Collection)
* retainAll(Collection)
* containsAll(Collection)
* clear();

Array Operation
* toArray();

# Types
Set Interface: 

* cannot contain duplicate elements
* does not allow random access

* HashSet(The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance) (no iteration order)(null allowed)
* TreeSet(maintain sorting)(null not allowed)(fast random access)
* LinkedHashSet(maintain insertion order)(null allowed)


This class offers constant time performance for basic operations (add, remove, contains and size), assuming the hash function disperses the elements properly among the buckets. We can set the initial capacity and load factor for this collection. The load factor is a measure of how full the hash map is allowed to get before its capacity is automatically increased.

List Interface

* ordered collection and can contain duplicate elements
* resizable array
* ArrayList, LinkedList

1) ArrayList internally uses a dynamic array to store the elements.	LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.	Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.

Arrays can contain primitive or Objects whereas ArrayList can contain only Objects.
Arrays are fixed size whereas ArrayList size is dynamic.
Arrays doesn’t provide a lot of features like ArrayList, such as addAll, removeAll, iterator etc.

Queue Interface 

orders the element in FIFO(First In First Out) manner

Dequeue Interface
*  collection that supports element insertion and removal at both ends. 

Java Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value.
HashMap, TreeMap, and LinkedHashMap.
hashMap : insertion order of key is not maintained
LinkedHashMap: insertion order of key is mainted
TreeMap: sorting of key is maintained

1) HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.	Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2) HashMap allows one null key and multiple null values.	Hashtable doesn't allow any null key or value.
3) HashMap is a new class introduced in JDK 1.2.	Hashtable is a legacy class.
4) HashMap is fast.	Hashtable is slow.


SortedSet is a Set that maintains its elements in ascending order.

SortedMap: Map that maintains its mappings in ascending key order.

Java ArrayList is the resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is unsynchronized.)

### Key Attributes of Common Collection Classes (OCP Objectives 4.5 and 4.6)

* ArrayList Fast iteration and fast random access.

* Vector It’s like a slower ArrayList, but it has synchronized methods.

* LinkedList Good for adding elements to the ends, i.e., stacks and queues.

* HashSet Fast access, assures no duplicates, provides no ordering.

* LinkedHashSet No duplicates; iterates by insertion order.

* image TreeSet No duplicates; iterates in sorted order.

* HashMap Fastest updates (key/values); allows one null key, many null values.

* Hashtable Like a slower HashMap (as with Vector, due to its synchronized methods). No null values or null keys allowed.

* LinkedHashMap Faster iterations; iterates by insertion order or last accessed; allows one null key, many null values.

* TreeMap A sorted map.

* PriorityQueue A to-do list ordered by the elements’ priority.

![](http://apprize.info/javascript/oca_2/oca_2.files/image1256.jpg)

![](http://apprize.info/javascript/oca_2/oca_2.files/image1257.jpg)

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

Comparator modifies actual class and comparable does not
	
we can also use Array.sort() and Collections.sort()


 java.util.Collections is a utility class consists exclusively of static methods that operate on or return collections
 binary search, sorting, shuffling, reverse etc.
 
 
All collection classes (except Vector and Hashtable) in the java.util package are not thread-safe.ie non synchronized
A piece of code is thread-safe if it only manipulates shared data structures in a manner that guarantees safe execution by multiple threads at the same time.
 
 
 concurrent modification exception occurs when you iterate over the element and try to modify the collections at the same time...
 
But Iterator implementation in java.util.concurrent packages are fail-safe and we can modify the collection while iterating. Some of these classes are CopyOnWriteArrayList, ConcurrentHashMap, CopyOnWriteArraySet.
