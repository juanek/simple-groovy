package ar.com.juanek.app

/**
 * mvn -q exec:java -DmainClass="ar.com.juanek.app.Util"
 * @author juan kipes
 */
class Util {

    public static String message(String msg){
        println "message from static  groovy"
        return ">> "+msg+" <<"
    }
    
    public String message2(String msg){
        println "message from groovy"
        return ">> "+msg+" <<"
    }

    public static void main(String[] args) {
        System.out.println("from groovy ...")
        System.out.println("Hello "+Util.message("groovy"))
        Util util = new Util()
        System.out.println("Hello "+util.message2("groovy 2"))
    }
    
}

