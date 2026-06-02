package Übungsblatt5;
import java.util.function.Consumer;

public class MyConsumer<T> implements Consumer<T>{

	@Override
	
	public void accept(T t) {

		System.out.println(t);
		
	
	}
}


