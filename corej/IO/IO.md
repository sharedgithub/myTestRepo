if stream==connection does input stream and output stream makes sense now??

Byte streams were introduced with JDK 1.0 and operate on the files containing ASCII characters. We know Java supports other language characters also known as Unicode characters. To read the files containing Unicode characters, the designers introduced character streams with JDK 1.1. As ASCII is a subset of Unicode, for the files of English characters, we can go with either byte streams or character streams.

String objects in Java use the UTF-16 encoding that can't be modified. The only thing that can have a different encoding is a byte[] . So if you need UTF-8 data, then you need a byte[]

Stream operations: Open>> Read Write>> Close 

Streams are of two types 
	byte streams-> InputStream, OutputStream
	Character streams-> Reader, writer
	
Character streams are latest

Java Byte streams are used to perform input and output of 8-bit bytes, whereas Java Character streams are used to perform input and output for 16-bit Unicode. Though there are many classes related to character streams but the most frequently used classes are, FileReader and FileWriter. Though internally FileReader uses FileInputStream and FileWriter uses FileOutputStream but here the major difference is that FileReader reads two bytes at a time and FileWriter writes two bytes at a time.

In Java, characters are stored using Unicode conventions. Character stream is useful when we want to process text files. These text files can be processed character by character. A character size is typically 16 bits.

Byte oriented reads byte by byte.  A byte stream is suitable for processing raw data like binary files. eg making copy of file

Byte Streams are used to read or write byte data with files which could be characters, image data, unicode data

Inputstream/OutputStream and Reader/writer classess are base or supermost classes insite java.io package


try with resources we can use to open a single resourece or multiple resources. It will close that stream automatically for you. AutoCloseAble

Two benefits of buffered
	With buffered classes IO operations are only performed when buffer(memory area) is either full(write) or empty(read)
	Buffered Streams are synchronous while unbuffered are not.This means you can work with multiple threads when using Buffered Streams/

As the performance of FileInputStream and FileOutputStream is low it is preffered to use BufferedInputStream and BufferedOutputStream
BufferedInputStream and BufferedOutputStream uses buffer of byte arrays around 8192 bytes

BufferInputStream does not work independently ..they provide buffering functionality and do not interact with the file directly
hence they are chained with other class like fileinputstream

BufferInputStream b=new BufferInputStream(new FileInputStream("filepath")) //decorator pattern

here bufferinputstream class is providing additional capability of buffering to fileinputstream class

The open closed principle.. the class should be open for extension but closed for modification
 
 Buffered classes are preffered
 
 The Difference Between Java I/O and NIO
The main difference between these two packages is that the read() and write() methods of Java IO are a blocking calls. By this we mean that the thread calling one of these methods will be blocked until the data has been read or written to the file.

On the other hand, in the case of NIO, the methods are non-blocking. This means that the calling threads can perform other tasks (like reading/writing data from another source or update the UI) while the read or write methods wait for their operation to complete. This can result in a significant performance increase if you're dealing with many IO requests or lots of data.
 
 
 "println()" is a method of PrintStream class. "out" is a static object of PrintStream class defined in "System" class. System is a class from java.lang package used to interact with the underlying operating system by the programmer.


Now check the TESTDIR.java class
	
	
