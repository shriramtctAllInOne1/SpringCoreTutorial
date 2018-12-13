package com.core.spring.messagesourcei181;

import java.util.Locale;
import org.apache.log4j.Logger;
import org.springframework.context.support.GenericXmlApplicationContext;
 
public class Main {
    private static Logger log = Logger.getLogger(Main.class);
 
    public static void main(String[] args) {
 
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:app-context.xml");
    ctx.refresh();
 
    Locale britishEnglish = new Locale("en", "GB");
    System.out.println(ctx.getMessage("msg1", null, britishEnglish));
    System.out.println(ctx.getMessage("msg2", new Object[] { "Luca",
        "Zanini" }, britishEnglish));
 
    System.out.println("\n");
 
    Locale americanEnglish = new Locale("en", "US");
    System.out.println(ctx.getMessage("msg1", null, americanEnglish));
    System.out.println(ctx.getMessage("msg2", new Object[] { "Luca",
        "Zanini" }, americanEnglish));
 
    System.out.println("\n");
 
    Locale italian = new Locale("it");
    System.out.println(ctx.getMessage("msg1", null, italian));
    System.out.println(ctx.getMessage("msg2", new Object[] { "Luca",
        "Zanini" }, italian));
 
    }
}