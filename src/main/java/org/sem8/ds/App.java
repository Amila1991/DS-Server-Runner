package org.sem8.ds;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

       // Server server = new Server(8081);
        JettyServer jettyServer = new JettyServer(8081,"../DS_Project/target/DS_Project.war");
        try {
            jettyServer.startServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
       /* WebAppContext webApp = new WebAppContext();
        webApp.setContextPath("/");
        //webApp.setWar("");
        File f = new File("src/A");
        System.out.println(f.getAbsolutePath());
        webApp.setWar("src/main/resources/DS_Project.war");
        server.setHandler(webApp);*/

    /*    try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println( "Hello World!" );
    }
}
