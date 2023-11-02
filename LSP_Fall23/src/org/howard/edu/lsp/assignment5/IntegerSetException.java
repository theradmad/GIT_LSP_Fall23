package org.howard.edu.lsp.assignment5;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;



/**
 * 
 * @author mbumpus
 * error to throw if theres an issue
 * prints a message depending on error
 *
 */
public class IntegerSetException extends RuntimeException {
    public IntegerSetException(String message) {
        super(message);
    }
}
