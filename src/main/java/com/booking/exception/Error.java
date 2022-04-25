package com.booking.exception;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

/**
 * Use this class to customize error message.
 */
@Data
public class Error {
  @Min(400)
  @Max(600)
  private Integer code;
  private String message;
  private LocalDateTime timestamp;
}
