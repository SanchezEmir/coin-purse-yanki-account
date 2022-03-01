package com.nttdata.yankiaccount.entity.dto;

import java.io.Serializable;

import com.nttdata.yankiaccount.entity.enums.ETypeMaestro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maestros implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  private ETypeMaestro type;
  
  private String valor;
  
}
