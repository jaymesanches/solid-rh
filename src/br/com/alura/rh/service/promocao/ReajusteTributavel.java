package br.com.alura.rh.service.promocao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {
  public BigDecimal valorImpostoDeRenda();
}
