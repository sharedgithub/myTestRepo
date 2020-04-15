Hashset uses hashing so in programing if you want to do too many contains operation then user set



"abc".repeat(3)
"
byte b=9; -127 to 127
Short b =2323; range from 32  thousand to -32 thousand something

Arrays.equals
Arrays.sort
Arrays.binarysearch(arr,3) //prints a random negative number if not found else returns index

int[] arr=new int[]{1,2,3,4,5};
List<Integer> abc=Arrays.asList(1,2,3,4,5) you wont be able to modify these list

List<Integer> abc=Intstream.of(arr).boxed().collect(Collectors.toList());
List<String> abc="asdfasdf".chars().mapToObject(x->Character.toString(x)).collect(Collectors.toList);

StringJoiner sj=new StringJoiner(",")
sj.add("an");
sj.add("bn");
sj.add("cn");
String s1=sj.toString(); // an,bn,cn

StringJoiner sj=new StringJoiner(",","[","]")
sj.add("an").add("bn").add("cn");
String s1=sj.toString(); // [an,bn,cn]


@@@@@@ String formating

%d for decimal
%f for float
%s for string


String.format("%s",2323);

@@@@@@ Regular Expression

\d decimal  \D non decimal
\w Aphabets & number   \W non alphabets and numbers
\s whitespaces		\S non whitespaces

String abc="this is my  #@(*@&(#(& numer 98. and your 92";
System.out.println(abc.replaceAll("\\w\\w\\w\\w",","));
System.out.println(abc.replaceAll("\\s",","));
System.out.println(abc.replaceAll("\\W",""));



Pattern pp=Pattern.compile("\\d\\d");
Matcher dd=pp.matcher(abc);
while(dd.find()){
	System.out.println(dd.group());
}



Different ways to create object
1) new keyword 2) .clone() 3) deserialization 4) className.newInstance method

find all substring of a stirng
    private static void permutation(String prefix, String str) {
        if (str.length() == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < str.length(); i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
        }
    }
	
	
	HashMap works on hashing algorithm and uses hashCode() and equals() method in put and get methods.
	so basically there is an array 
	for each key and value which we want to put
	hascode is generated for that key
	and hasfunctions are used to get index of these key from hashCode
	so it is possible that two keys can have same index which is called hashcollision
	
	
CopyOnWriteArrayList CopyOnWriteArraySet ConcurrentHashMap are fail safe as we can do concurrent modification while iterating
ArrayList and others are Fail fast as they give concurrent modification exception


    public static void main(String[] args) throws IOException {
        abc(null);
    }

    static void abc(String ab){
        System.out.println("Asdf");
    }
    static void abc(Object ab){

    }
	
	
the above program will call more specific version of method abc which is with string\


        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
		
the above code wont compile saying exception FileNotFoundException already caught
	
	
	Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution.
Whenever an object is created, it’s always stored in the Heap space and stack memory contains the reference to it. Stack memory only contains local primitive variables and reference variables to objects in heap space.
Memory management in the stack is done in a LIFO manner whereas it’s more complex in Heap memory because it’s used globally.


public class Test {

	public static String toString(){
		System.out.println("Test toString called");
		return "";
	}
	
	public static void main(String args[]){
		System.out.println(toString());
	}
}

this will give compile error as toString is java.lang.Object class method which every class by default extends so it cannot override it with static keyword


There are three types of built-in Class Loaders in Java:

Bootstrap Class Loader – It loads JDK internal classes, typically loads rt.jar and other core classes.
Extensions Class Loader – It loads classes from the JDK extensions directory, usually $JAVA_HOME/lib/ext directory.
System Class Loader – It loads classes from the current classpath that can be set while invoking a program using -cp or -classpath command line options.


We can convert a Java object to an Stream that is called Serialization. Once an object is converted to Stream, it can be saved to file or send over the network or used in socket connections.

S = Single Responsibility - Each class/instance should have only 1 responsibility
O = Open Closed - Objects should be open for extension closed for modification
L = Liskov substitution - Instance objects can be replaced with subtypes without altering correctness
I = Interface Segregation - Multiple specific interfaces are better than big general one
D = Dependency Injection - High level and Low level modules should both depend on abstraction



Design Pattern
Practice program
Selenium
Restassured
