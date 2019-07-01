package RxJava;

import io.reactivex.Observable;

/**
 *
 * @author Rafael Pimenta
 */
public class HelloWorld {

    public static void main(String[] args) {
//        //Codigo sem Lambda
//        Observable.just("Hello RXJAVA")
//                .subscribe(new Consumer<String>() {
//                    @Override
//                    public void accept(String str) throws Exception {
//                        System.out.println(str);
//                    }
//                });
//
//        //Usando Lambda
        Observable.just("Hello usando lambda")
                .subscribe(str -> {
                    System.out.println(str);
                });

        //Criando um observable de forma completa 
//        Observable.just("Hello Observable completo")
//                .subscribe(new Observer<String>() {
//                    @Override
//                    public void onSubscribe(Disposable dspsbl) {
//                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                    }
//
//                    @Override
//                    public void onNext(String t) {
//                        System.out.println(t);
//                    }
//
//                    @Override
//                    public void onError(Throwable thrwbl) {
//                        System.out.println("Ups: " + thrwbl.getMessage());
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        System.out.println("Terminado");
//                    }
//
//                });
        //Usando just
        Observable.just(3, 6, 9)
                .subscribe(str -> {
                    System.out.println("Just -> " + str);
                });
        //Usando fromArray
        Observable.fromArray(new String[]{"a", "b", "c", "d"})
                .subscribe(str -> {
                    System.out.println("FromArray -> " + str);
                });
        //Usando map 
        Observable.just(3, 6, 9)
                .map(x -> 10 * x) //Multiplicando os valores emitidos por 10
                .subscribe(str -> {
                    System.out.println("Map -> " + str);
                });
        //Usando map 
        Observable.just("Hello GDG Maputo")
                .flatMap(s -> Observable.fromArray(s.split(" ")))
                .subscribe(str -> {
                    System.out.println("Map -> " + str);
                });
        //Usando Filter 
        Observable.just(2, 30, 22, 5, 60, 1)
                .filter(x -> x > 10) //Filtra e imprime só os numeros maiores que 10
                .subscribe(str -> {
                    System.out.println("Filter -> " + str);
                });
        //Usando skip 
        Observable.just(1, 2, 3, 4, 5, 6)
                .skip(2) //Ignora os 2 primeiros objetos
                .subscribe(str -> {
                    System.out.println("Filter -> " + str);
                });
        //Usando distinct 
        Observable.just(1, 1, 2, 2, 3, 3)
                .distinct() //Remove resultados repitidos
                .subscribe(str -> {
                    System.out.println("Distinct -> " + str);
                });

        Observable<String> set1 = Observable.just("MozDevz", "Muthiana Code");
        Observable<String> set2 = Observable.just("GDG Maputo", "Women Techmakers");

        Observable.merge(set1, set2)
                .subscribe(str -> {
                    System.out.println("Merge -> " + str);
                });

        Observable<String> set12 = Observable.just("MozDevz", "Muthiana Code", "JavaEE");
        Observable<String> set22 = Observable.just("GDG Maputo", "Women Techmakers");

        Observable.zip(set12, set22, (str12, str22) -> str12 + " - " + str22)
                .subscribe(str -> {
                    System.out.println("Zip -> "+str);
                });
    }
}
