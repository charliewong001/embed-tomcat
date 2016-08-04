package com.github.charlie.launcher;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

    public static void main(String[] args)
            throws ServletException, LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir("E:/charlie/workspaces/default/embed-tomcat/tmp");//tomcat work dir
        tomcat.setPort(8080);
        tomcat.addWebapp("/embed-tomcat",
                "E:/charlie/workspaces/default/embed-tomcat/src/main/webapp");
        tomcat.start();
        tomcat.getServer().await();
    }

}
