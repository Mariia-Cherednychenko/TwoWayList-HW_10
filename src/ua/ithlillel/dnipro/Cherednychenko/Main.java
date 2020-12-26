package ua.ithlillel.dnipro.Cherednychenko;

public class Main {

    public static void main(String[] args) {
	TwoWayList<String> s = new TwoWayList<>();
		s.add("zero");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");

		System.out.println("All elememts: ");
		for (String elem : s) {
			System.out.println(elem);
		}

		System.out.println("============================"+
				"\nGet by index 4: ");
		System.out.println(s.get(4));


		System.out.println("============================"+
				"\nRemove value 4: ");

		s.removeByValue("four");
		for (String elem : s) {
			System.out.println(elem);
		}

		System.out.println("============================"+
				"\nRemove by index: 2 ");
		s.removeByIndex(2);
		for (String elem : s) {
			System.out.println(elem);
		}



		System.out.println("============================"+
				"\nGet value of index 1: ");
	   System.out.println(s.get(1));

		System.out.println("============================"+
				"\nChange index 2 on NEW");
		s.set(2, "new");
		for (String elem : s) {
			System.out.println(elem);
		}

		System.out.println("============================"+
				"\nReverse items");
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
