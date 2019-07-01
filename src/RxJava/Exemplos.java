package RxJava;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;

/**
 *
 * @author Rafael Pimenta
 */
public class Exemplos {

//	private CompositeDisposable;
    public static void main(String[] args) {
        /*
        //Usando Observable.create
        // cria um Observable, com uma express�o lambda do tipo ObservableOnSubscribe
        Observable.create(emitter -> {
            //emitter � um argumento do tipo ObservableEmitter
            //essa fun��o � executada quando um Subscriber se vincula ao Observable

            //emite valores para os Subscribers vinculados a esse Observable
            emitter.onNext("first");
            emitter.onNext("second");
            emitter.onNext("third");

            //finaliza o Observable
            emitter.onComplete();
        })
                .subscribe(System.out::println); //vincula um Subscriber ao Observable; a func�o enviada como par�metro � a a��o executada no evento onNext
         */
    	
        // cria um Observable a partir de um range arbitr�rio de dados
     Observable.range(0, 5)
    .subscribe(System.out::println);

        
 /*
 // cria um Observable a partir de valores arbitr�rios
	Observable.just("first", "second", "third")
    .subscribe(System.out::println);
*/
   
 /*
 // cria um Observable vazio, que emite apenas onCompleted
Observable.empty()
    .subscribe(
        System.out::println, //onNext
        Throwable::printStackTrace, //onError
        () -> System.out.println("OnCompleted")); //onCompleted
 */
 
 /*
 // cria um Observable que emite apenas onError
Observable.error(new RuntimeException("oops"))
    .subscribe(
        System.out::println, //onNext
        Throwable::printStackTrace, //onError
        () -> System.out.println("OnCompleted")); //onCompleted
 */
 
 /*
 // semelhante ao Observable.create, mas permite declarar dinamicamente como o Observable deve ser criado a cada subscri��o
// o argumento � um java.util.concurrent.Callable<? extends ObservableSource<? extends T>>.
	Observable<String> observable = Observable.defer(() -> (e) -> e.onNext("hello"));

	observable.subscribe(System.out::println);
	observable.subscribe(System.out::println);
 */
   
    }
}