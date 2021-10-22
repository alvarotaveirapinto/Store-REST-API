package com.upgradehub.loja.exception;

public class ClientNotFoundException extends RuntimeException {
    private String message;

        public ClientNotFoundException() {
            super();
        }

        public ClientNotFoundException(String message) {
            super(message);
            this.message = message;
        }

    }
