package com.spring.springannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //Spring container will create a spring bean for this class automatically
public class ValueAnnotationDemo {

    @Value("Default Name")
    private String defaultName;
/*=====================================================*/

    @Value("${mail.host}")  //The syntax to get a value for a property key is "${}"
    private String host;

    @Value("${mail.email}")
    private String email;

    @Value("${mail.password}")
    private String password;

/*==========================================================*/

    @Value("${java.home}") //This key will provide a value as a complete Java Home path.
    //This will give the system variable for a Java Home
    private String javaHome;

    @Value("${user.home}") //This will give the correct home directory
    private String homeDir;

    /*=============================================================*/
    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getHomeDir() {
        return homeDir;
    }
}


//Next lets see how to use @Value annotation to get a value for a particular property key from
// the application.properties file

//Go to application.properties file

/*=============================================================================================*/

//Next lets see how to use the @Value to read environment variables and system variables
//By default spring boot will load the environment variables and system variables.

/*

(Q)What are system and environment variables?

System variables and environment variables are both types of variables that store information in a computer's operating system. They are used to configure various aspects of the system and provide runtime information to applications and processes.

1. System Variables: System variables are global variables that apply to the entire operating system. They are typically defined by the operating system or system administrators and are accessible by all users and processes running on the system. System variables often define system-wide settings and configurations. Examples of system variables include the PATH variable, which specifies the directories to search for executable programs, and the JAVA_HOME variable, which points to the installation directory of Java.

2. Environment Variables: Environment variables are specific to a user or a process and provide runtime information or configuration settings for that specific user or process. They are set within a specific environment (e.g., a user session or a process execution context) and are accessible only within that environment. Environment variables can be set by the operating system, by user configuration, or by applications. They are often used to define user-specific settings or to pass information between processes. Examples of environment variables include the USER variable, which stores the username of the currently logged-in user, and the LANG variable, which specifies the default language setting.

Both system variables and environment variables can be accessed by applications and scripts to retrieve configuration information or to customize behavior based on the runtime environment. They provide a way to pass information to programs without hardcoding values directly into the code.


Here are examples of both system variables and environment variables:

1. System Variables:
   - PATH: Specifies the directories to search for executable programs. For example, "C:\Program Files\Java\jdk1.8.0_231\bin" is added to the PATH variable to include the Java executable files.
   - JAVA_HOME: Points to the installation directory of Java. For example, "C:\Program Files\Java\jdk1.8.0_231" is set as the JAVA_HOME variable to specify the Java installation directory.

2. Environment Variables:
   - USER: Stores the username of the currently logged-in user. For example, "johnsmith" is stored in the USER variable.
   - LANG: Specifies the default language setting. For example, "en_US" is set as the LANG variable to indicate English language with the United States locale.

Note that the actual values and names of system and environment variables may vary depending on the operating system and configuration. The examples provided above are commonly used variables, but there can be additional variables specific to different systems or applications.

 */
