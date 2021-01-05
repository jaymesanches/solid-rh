package br.com.alura.rh.service.promocao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
  public BigDecimal valor();
  public LocalDate data();
}
