package br.com.devdojo.demo.error;

/**
 * author: Jose Augusto for DevDojo SpringBoot Course on 5/18/20
 */

public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
