Some of the common methods in objects class java.lang.Object

![](http://apprize.info/javascript/oca_2/oca_2.files/image1165.jpg)

The bottom line is this: If you want objects of your class to be used as keys for a hashtable (or as elements in any data structure that uses equivalency for searching for—and/or retrieving—an object), then you must override equals() so that two different instances can be considered the same
"If two objects are equal using Object class equals method, then the hashcode method should give the same value for these two objects.". Hence it is required to override hashcode methods along with the equals method.

Basically if you have your own data type and you want to use collections over it then do the above

![](http://apprize.info/javascript/oca_2/oca_2.files/image1184.jpg)

notice map does not extend collection

collections can hold Objects but not primitives.hence we use wrapper class.

subflavours of collections : sorted unsorted ordered unorderd

some collections use hashing to store and retrieve data all those collections starts with "Hash"

Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.

Converting arrays to list we can use below

List l1=Arrays.asList(array);
Object[] o=l1.toArray();

![](http://apprize.info/javascript/oca_2/oca_2.files/image1256.jpg)

![](http://apprize.info/javascript/oca_2/oca_2.files/image1257.jpg)


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



Hashtable is considered legacy code. There's nothing about Hashtable that can't be done using HashMap or derivations of HashMap, so for new code, I don't see any justification for going back to Hashtable.

Hashtable is synchronized, whereas HashMap is not. This makes HashMap better for non-threaded applications, as unsynchronized Objects typically perform better than synchronized ones.

Hashtable does not allow null keys or values.  HashMap allows one null key and any number of null values.

One of HashMap's subclasses is LinkedHashMap, so in the event that you'd want predictable iteration order (which is insertion order by default), you could easily swap out the HashMap for a  LinkedHashMap. This wouldn't be as easy if you were using Hashtable.
