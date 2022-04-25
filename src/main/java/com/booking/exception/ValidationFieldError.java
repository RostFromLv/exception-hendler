package com.booking.exception;

import lombok.Data;

/**
 * Use this class for customize Validation error.
 */
@Data
public class ValidationFieldError {
  private String field;
  private String error;
}
