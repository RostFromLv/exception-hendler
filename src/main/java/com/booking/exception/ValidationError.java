package com.booking.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Use this class to customize Validation errors representing.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ValidationError extends Error {
  private Error error;
  private List<ValidationFieldError> validationError;
}
