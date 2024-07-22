package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    public static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
}
