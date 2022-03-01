package com.nttdata.yankiaccount.entity;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("moneyAccount")
public class MonederoAccount {
  
  @Id
  private String id;
  
  @NotEmpty
  private String typeDocument;
  
  @NotEmpty
  private String nroDocument;
  
  @NotEmpty
  private String phoneOperator;
  
  @NotNull
  private String nroPhone;
  
  @NotEmpty
  private String imeiPhone;
  
  @NotEmpty
  private String email;
  
  @NotNull
  private Double balance;
  
  private LocalDateTime createAt;
  
}
