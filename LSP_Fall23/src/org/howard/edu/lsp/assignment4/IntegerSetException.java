package org.howard.edu.lsp.assignment4;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


/**
 * error to throw if theres an issue
 * prints a message depending on error
 * @author mbumpus
 *
 */
public class IntegerSetException extends RuntimeException {
    public IntegerSetException(String message) {
        super(message);
    }
}
