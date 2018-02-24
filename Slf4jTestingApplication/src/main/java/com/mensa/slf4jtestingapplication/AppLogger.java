/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.slf4jtestingapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author pi
 */
public class AppLogger {
    private static Logger LOGGER = LoggerFactory.getLogger(AppLogger.class);
    
    public static void doSomething() 
    {
        LOGGER.error("This is Error Log.");
        LOGGER.warn("This is Warning Log.");
        LOGGER.info("This is Information Log.");
        LOGGER.debug("This is Debug Log.");
        LOGGER.trace("This is Trace Log.");
        
        LOGGER.error("This is Error Log.", "Log 01", "Log 02", "Log 03");
        LOGGER.warn("This is Warning Log.", "Log 01", "Log 02", "Log 03");
        LOGGER.info("This is Information Log.", "Log 01", "Log 02", "Log 03");
        LOGGER.debug("This is Debug Log.", "Log 01", "Log 02", "Log 03");
        LOGGER.trace("This is Trace Log.", "Log 01", "Log 02", "Log 03");
    }

    public static void main(String[] args) 
    {
        AppLogger.doSomething();
    }
    
}
