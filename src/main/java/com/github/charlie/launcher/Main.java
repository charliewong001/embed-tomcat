package com.github.charlie.launcher;

import javax.servlet.ServletException;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

    public static void main(String[] args)
            throws ServletException, LifecycleException {
        Tomcat tomcat = new Tomcat();
        // tomcat work dir
        tomcat.setBaseDir("E:/charlie/workspaces/default/embed-tomcat/tmp");
        tomcat.setPort(8080);
        Context context = tomcat.addWebapp("/embed-tomcat",
                "E:/charlie/workspaces/default/embed-tomcat/src/main/webapp");
        Tomcat.addServlet(context, "servlet",
                "com.github.charlie.web.CommonServlet");
        context.addServletMapping("/servlet", "servlet");
        tomcat.getConnector().setProperty("connectionTimeout", "20000");
        tomcat.getConnector().setProperty("URIEncoding", "UTF-8");
        tomcat.start();
        tomcat.getServer().await();
    }

}
