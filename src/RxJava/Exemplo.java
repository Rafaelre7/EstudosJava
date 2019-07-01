package RxJava;

import java.util.concurrent.TimeUnit;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class Exemplo {

	public static void main(String[] args) {

		// Usando Observable.create
		// cria um Observable, com uma express�o lambda do tipo ObservableOnSubscribe
		Observable.create(emitter -> {
			// emitter � um argumento do tipo ObservableEmitter
			// essa fun��o � executada quando um Subscriber se vincula ao Observable

			// emite valores para os Subscribers vinculados a esse Observable
			emitter.onNext("first");
			emitter.onNext("second");
			emitter.onNext("third");

			// finaliza o Observable
			emitter.onComplete();
		}).filter(s -> s.equals("first"))// em caso de ser necessario criar um filtro
				.subscribe(System.out::println); // vincula um Subscriber ao Observable; a func�o enviada como par�metro
													// � a a��o executada no evento onNext

	}

}