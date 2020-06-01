package ar.com.jekipes.app;

/**
 *  mvn -q exec:java
 *  mvn -q exec:java -DmainClass="ar.com.jekipes.app.Main"
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
