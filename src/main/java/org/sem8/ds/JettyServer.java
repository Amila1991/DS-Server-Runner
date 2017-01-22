package org.sem8.ds;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author amila karunathilaka.
 */
public class JettyServer {

    private  String warPath;
    private  int serverPort;

    private  Server server;


    public JettyServer(int serverPort, String warPath) {
        setServerPort(serverPort);
        this.warPath = warPath;
        WebAppContext webApp = new WebAppContext();
        webApp.setContextPath("/");
        webApp.setWar(warPath);
        server.setHandler(webApp);
    }

    public void startServer() throws Exception {
        if(!server.isStarted()) {
            server.start();
        }
    }

    public void stopServer() throws Exception {
        if (server.isRunning()) {
            server.stop();
        }
    }


    private void setServerPort(int serverPort) {
        if (server == null) {
            this.serverPort = serverPort;
            server = new Server(this.serverPort);
        }

    }

}
