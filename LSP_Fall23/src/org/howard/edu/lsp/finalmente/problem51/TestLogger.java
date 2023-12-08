package org.howard.edu.lsp.finalmente.problem51;
import org.howard.edu.lsp.finalmente.problem51.Logger;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.*;

public class TestLogger {
    private Logger logger;

    @BeforeEach
    public void setUp() {
        // Ensure a clean slate before each test
        logger = Logger.getInstance();
    }

    @Test
    @DisplayName ("Test singleton instance")
    public void testSingletonInstance() {
        // Given
        Logger anotherLogger = Logger.getInstance();

        // When/Then
        assertSame(logger, anotherLogger);
    }

    @Test
    @DisplayName ("Test new log message")
    public void testLogMessage() {
        logger.logMessage("Test log message.");

        // Given
        String message = "New log message.";

        // When
        logger.logMessage(message);

        // Then
        String initialLog = "Log:\nTest log message.\n";
        String expectedLog = initialLog + message + "\n";
        assertEquals(expectedLog, logger.displayLog());
    }

    @Test
    @DisplayName("Test display log")
    public void testDisplayLog() {
        // Given
        String expectedLog = "Log:\nTest log message.\nNew log message.\n";

        // When/Then
        assertEquals(expectedLog.trim(), logger.displayLog().trim());
    }

    

    
}