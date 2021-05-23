package com.example.lesson10;

import com.example.lesson10.ConsolePrinter;
import com.example.lesson10.FilePrinter;
import com.example.lesson10.PrinterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PrinterConfig.class);

        ConsolePrinter consolePrinter = applicationContext.getBean("consolePrinter",ConsolePrinter.class);
        FilePrinter filePrinter = applicationContext.getBean(FilePrinter.class);

        consolePrinter.doPrint();
        filePrinter.doPrint();
    }

}
