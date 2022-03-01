package com.nttdata.yankiaccount.entity.dto;

import java.time.LocalDateTime;

import com.nttdata.yankiaccount.entity.enums.EStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonederoTransaction {

  private String id;

  private String originNumber;

  private String destinationNumber;

  private Double amount;

  private EStatus status;

  private int condition;

  private LocalDateTime createAt;

}