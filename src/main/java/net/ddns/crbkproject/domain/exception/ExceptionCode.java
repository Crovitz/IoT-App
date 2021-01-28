package net.ddns.crbkproject.domain.exception;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

public enum ExceptionCode {
    INTERNAL_SERVER("CRBK-001", "Internal Server Exception", INTERNAL_SERVER_ERROR),
    INVALID_VALUE_OF_FIELD("CRBK-002", "%s", BAD_REQUEST),
    NOT_SUPPORTED_MEASURE("CRBK-051", "Not supported measure '%s'", BAD_REQUEST);

    private final String code;
    private final String detailsPattern;
    private final HttpStatus httpStatus;

    ExceptionCode(String code, String detailsPattern, HttpStatus httpStatus) {
        this.code = code;
        this.detailsPattern = detailsPattern;
        this.httpStatus = httpStatus;
    }

    public String getCode() {
        return code;
    }

    public String getDetailsPattern() {
        return detailsPattern;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
