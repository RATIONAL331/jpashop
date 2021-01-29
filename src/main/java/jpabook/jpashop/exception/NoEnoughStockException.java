package jpabook.jpashop.exception;

public class NoEnoughStockException extends RuntimeException{
    public NoEnoughStockException() {
        super();
    }

    public NoEnoughStockException(String message) {
        super(message);
    }

    public NoEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoEnoughStockException(Throwable cause) {
        super(cause);
    }

}
