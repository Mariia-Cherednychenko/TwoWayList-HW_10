package ua.ithlillel.dnipro.Cherednychenko;

public class Main {

    public static void main(String[] args) {
	TwoWayList<String> s = new TwoWayList<>();
		s.add("Hello");
		s.add("mystery");
		s.add("Java");
		s.add("world");
		s.add("!");

		for (String elem : s) {
			System.out.println(elem);
		}

		System.out.println("The List size is " + s.size());

		s.add(":-)");

		for (String elem : s) {
			System.out.println(elem);
		}

		System.out.println(s.get(2));

		s.set(2, "Java programming");

		for (String elem : s) {
			System.out.println(elem);
		}

		TwoWayList.ListBackIterator revIterator = s.reverseIterator();
		while (revIterator.hasPrev()){
			System.out.println(revIterator.prev());
		}


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


    }
}
