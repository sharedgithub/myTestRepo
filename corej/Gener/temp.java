package Gener;

import java.util.ArrayList;
import java.util.List;

public class temp {
	String value;
	public temp(String value) {
		this.value=value;
	}

	public static void main(String[] args) {
	
		zoeo<temp> t=new zoeo<>(new temp("hello"));
//		zoeo<temp> t=new zoeo<>(new temp("pello"));
		
		
	}
}



class zoeo<T>{
	List<T> t=new ArrayList<>();
	static int count;
	zoeo(T t) {
		 this.t.add(t);
		 count++;
	}
	
	List<T> getList() {
		return t;
	}
}