package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Iterator;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	OneWayList<String> s = new OneWayList<>();
	s.add("Hello");
	s.add("world");
	s.add("!");

	/*for (int i=0; i<s.size();i++){
        System.out.println(s.get(i));
    }*/

	/*s.forEach(new Consumer<String>() {
		@Override
		public void accept(String s) {
			System.out.println(s);
		}
	});*/

	//s.forEach(elem-> System.out.println(elem));

		/*Iterator<String> iterator = s.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}*/

		for (String elem : s) {
			System.out.println(elem);
		}


    }
}
