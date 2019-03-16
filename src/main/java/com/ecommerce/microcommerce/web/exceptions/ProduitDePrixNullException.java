package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class ProduitDePrixNullException extends RuntimeException{
    public ProduitDePrixNullException(String s) {
        super(s);
    }
}
