package ar.com.juanek.app;

/**
 *  mvn -q exec:java
 *  mvn -q exec:java -DmainClass="ar.com.juanek.app.Main"
 *
 * @author juan kipes
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("from java ...");
        System.out.println("Hello "+Util.message("groovy"));
        Util util = new Util();
        System.out.println("Hello "+util.message2("groovy 2"));
    }
}
