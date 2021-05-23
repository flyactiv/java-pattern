package com.example.lesson10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public ConsolePrinter consolePrinter() {
        return new ConsolePrinter();
    }

    @Bean
    public FilePrinter filePrinter() {
        return new FilePrinter();
    }

}
