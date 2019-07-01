package RxJava;

import static org.junit.Assert.assertTrue;

import java.awt.List;

import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class RxJavaUnitTest<Todo> {
	String result = "";
	
	@Test
	public void returnAValue() {
		result = "";
		Observable<String> observer = Observable.just("Hello");
		
		observer.subscribe(s -> result = s);
		
		assertTrue(equals("Hello"));
		
		
	}
	
//	Observable<Todo> todoObservable = Observable.create(emitter -> {
//	    try {
//	        List<Todo> todos = getTodos();
//	        for (Todo todo : todos) {
//	            emitter.onNext(todo);
//	        }
//	        emitter.onComplete();
//	    } catch (Exception e) {
//	        emitter.onError(e);
//	    }
//	});
	


}
