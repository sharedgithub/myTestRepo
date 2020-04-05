package CollectionsThis;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TestArraysComparator implements Comparator<TestArrays> { // comparator is something which you need to pass along with the class which you are using in collection ...to collection.sort(class, comparator) method
// hence collection
	
	// comparator generic can be ommited then 
	@Override
	public int compare(TestArrays o1, TestArrays o2) {
		if (o1.rollNo > o2.rollNo) {
			return -1;
		} else if (o1.rollNo < o2.rollNo) {
			return 1;
		}
		return 0;
	}

}

public class TestArrays {//implements Comparable<TestArrays> {

	int rollNo;
	String studentName;

	public TestArrays(int num, String name) {
		rollNo = num;
		studentName = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// overriding toString method to provide meaningfull information for an object
	public String toString() {
		return "Student name:" + studentName + " Roll No:" + rollNo;

	}

	// overiding compareTo in case of comparable
//	@Override
//	public int compareTo(TestArrays t) {
//		if (t.rollNo > rollNo) {
//			return -1; // place the element before current element
//		} else if (t.rollNo < rollNo) {
//			return 1;  //  place the element after current element
//		}
//		return 0;  //element is not unique
//	}
	
	// overriding equals method if we want to create collection of this object and use our own equals mechanism
	public boolean equals(Object t) {
		if ((t instanceof TestArrays) && ((TestArrays) t).getRollNo() == rollNo
				&& ((TestArrays) t).getStudentName() == studentName) {
			return true;
		}
		return false;
	}

	// overriding hascode method as when equals method will be used then we have to
	// make sure hashcode of the object is also same
	public int hasCode(TestArrays t) {
		// implement any hashcoding algorithm
		// hashing is basically provind int ID to object by using any logic
		return t.rollNo;
	}

	public static void main(String args[]) {

		String[] strArray = new String[5];

		// this will throw array index out of bound excception
		// strArray[11]="234";

		// for each loop
		for (String a : strArray) {
			print(a);
		}

		strArray[0] = "2134";
		strArray[1] = "Anuj";
		strArray[2] = "Kum";
		strArray[3] = "Sin";
		strArray[4] = "Rat";

		Arrays.sort(strArray);

		System.out.println("##Search Results" + Arrays.binarySearch(strArray, "Kum"));

		// normal for loop
		for (int i = 0; i < strArray.length; i++) {
			print(strArray[i]);
		}

		String str = Arrays.toString(strArray);
		print(str);

		char[] a=str.toCharArray();
		
		// String sorting tak toh theek hai objects ka kya

		TestArrays[] ta = new TestArrays[3];
		ta[0] = new TestArrays(1, "Bobby");
		ta[1] = new TestArrays(2, "Kobby");
		ta[2] = new TestArrays(3, "Nobby");

		// to sort objects we implement..we use comparator and comparable interface
		// for comparator we have to pass it to the collection.sort or array .sort
		// method
		// have to implement compare method
		// no need to modify the class jiske object sort karne hai

		// to use comparable interface a class must implement toCompare method

		Arrays.sort(ta, new TestArraysComparator());

		//
		// oR
		//

		Arrays.sort(ta, new Comparator<TestArrays>() {

			@Override
			public int compare(TestArrays arg0, TestArrays arg1) {
				// TODO Auto-generated method stub
				return 0;
			}

		});

		List<TestArrays> l = Arrays.asList(ta);

//		Collections.sort(l); // when you try to sort your object, without implementing comparable interface,
								// you will get TestArrays cannot be cast to java.lang.Comparable exception

		Collections.sort(l, new TestArraysComparator());
		
		
		for (TestArrays t : l) {
			print(t);
		}

	}


	public static void print(Object o) {
		System.out.println(o);
	}

}
