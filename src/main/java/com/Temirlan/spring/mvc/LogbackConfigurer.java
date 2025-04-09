//package com.Temirlan.spring.mvc;
//
//import ch.qos.logback.classic.Level;
//import ch.qos.logback.classic.Logger;
//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
//import ch.qos.logback.classic.filter.ThresholdFilter;
//import ch.qos.logback.classic.html.HTMLLayout;
//import ch.qos.logback.classic.net.SMTPAppender;
//import ch.qos.logback.classic.spi.ILoggingEvent;
//import ch.qos.logback.core.ConsoleAppender;
//import ch.qos.logback.core.rolling.RollingFileAppender;
//import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;
//import ch.qos.logback.core.spi.CyclicBufferTracker;
//import org.slf4j.LoggerFactory;
//import ch.qos.logback.classic.spi.Configurator;
//
//public class LogbackConfigurer {
//
//    public static void configureLogback() {
//        // Get the logger context
//        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
//
//        // Reset any existing configuration
//        context.reset();
//
//        // Create a console appender
//        ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<>();
//        consoleAppender.setContext(context);
//        consoleAppender.setName("CONSOLE");
//
//        // Configure encoder for console appender
//        PatternLayoutEncoder consoleEncoder = new PatternLayoutEncoder();
//        consoleEncoder.setContext(context);
//        consoleEncoder.setPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n %msg%n");
//        consoleEncoder.start();
//
//        consoleAppender.setEncoder(consoleEncoder);
//        consoleAppender.start();
//
//        // Create a rolling file appender
//        RollingFileAppender<ILoggingEvent> fileAppender = new RollingFileAppender<>();
//        fileAppender.setContext(context);
//        fileAppender.setName("FILE");
//        // Configure rolling policy
//        TimeBasedRollingPolicy<ILoggingEvent> rollingPolicy = new TimeBasedRollingPolicy<>();
//        rollingPolicy.setContext(context);
//        rollingPolicy.setParent(fileAppender);
//        rollingPolicy.setFileNamePattern("application.%d{yyyy-MM-dd}.log");
//        rollingPolicy.setMaxHistory(30);
//        rollingPolicy.start();
//
//        fileAppender.setRollingPolicy(rollingPolicy);
//
//        // Configure encoder for file appender
//        PatternLayoutEncoder fileEncoder = new PatternLayoutEncoder();
//        fileEncoder.setContext(context);
//        fileEncoder.setPattern("%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n");
//        fileEncoder.start();
//
//        fileAppender.setEncoder(fileEncoder);
//        fileAppender.start();
//
//        // Get the root logger and set its level
//        Logger rootLogger = context.getLogger(Logger.ROOT_LOGGER_NAME);
//        rootLogger.setLevel(Level.DEBUG);
//
//        SMTPAppender smtpAppender = new SMTPAppender();
//        smtpAppender.setContext(context);
//        smtpAppender.setName("EMAIL");
//
//// Configure buffer
//        CyclicBufferTracker<ILoggingEvent> cbTracker = new CyclicBufferTracker<>();
//        cbTracker.setBufferSize(1);
//        smtpAppender.setCyclicBufferTracker(cbTracker);
//
//// Email server settings
//        smtpAppender.setSMTPHost("smtp.yandex.ru");
//        smtpAppender.setSMTPPort(587);
//        smtpAppender.setUsername("k.temirlan@ic-group.kz");
//        smtpAppender.setPassword("IcGroup@2024");
//        smtpAppender.setSTARTTLS(true);
////        smtpAppender.setSSL(true);
//// Email settings
//        smtpAppender.addTo("timakhamza@gmail.com");
//        smtpAppender.setFrom("k.temirlan@ic-group.kz");
//        smtpAppender.setSubject("Application Error: %logger{20}");
//
//// HTML layout for emails
//        HTMLLayout layout = new HTMLLayout();
//        layout.setContext(context);
//        layout.setPattern("%date%level%logger{40}%message");
//        layout.start();
//        smtpAppender.setLayout(layout);
//
//// Add filter for ERROR level
//        ThresholdFilter filter = new ThresholdFilter();
//        filter.setLevel(String.valueOf(Level.DEBUG));
//        filter.start();
//        smtpAppender.addFilter(filter);
//
//        smtpAppender.start();
//        rootLogger.addAppender(smtpAppender);
//        Logger packageLogger = context.getLogger("com.Temirlan.spring.mvc");
//        packageLogger.setLevel(Level.DEBUG);
//        packageLogger.setAdditive(false);
//        rootLogger.addAppender(consoleAppender);
//        rootLogger.addAppender(fileAppender);
//
//    }
//}