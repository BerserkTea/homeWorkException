package org.example;

import java.io.IOException;

public abstract class InputErrorException extends IOException {
    public InputErrorException(String message) {
        super(message);
    }
}
