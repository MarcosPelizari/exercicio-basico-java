package service;

import java.math.BigDecimal;

public class Pagamento {
    private BigDecimal descontoMaximo;
    private BigDecimal taxaJuros;

    public Pagamento(double descontoMaximo, double taxaJuros) {
        this.descontoMaximo = BigDecimal.valueOf(descontoMaximo);
        this.taxaJuros = BigDecimal.valueOf(taxaJuros);
    }

    public BigDecimal getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(BigDecimal descontoMaximo) {
        this.descontoMaximo = validarTaxa(descontoMaximo, "Desconto");
    }

    public BigDecimal getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(BigDecimal taxaJuros) {
        this.taxaJuros = validarTaxa(taxaJuros, "Taxa de Juros");
    }

    public BigDecimal pagamentoTotal(BigDecimal valorProduto) {
        BigDecimal desconto = valorProduto.multiply(descontoMaximo);
        return valorProduto.subtract(desconto);
    }

    private BigDecimal validarTaxa(BigDecimal valor, String nomeTaxa) {
        if (valor == null) {
            throw new IllegalArgumentException(nomeTaxa + " não pode ser nulo.");
        }
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(nomeTaxa + " não pode ser negativo.");
        }
        if (valor.compareTo(BigDecimal.ONE) > 0) {
            throw new IllegalArgumentException(nomeTaxa + " não pode ser maior que 100%");
        }
        return valor;
    }

    public BigDecimal pagamentoParcelado(BigDecimal valorProduto, int parcelas) {
        if (parcelas <= 1) {
            throw new IllegalArgumentException("Número de parcelas deve ser maior que 1 para pagamento parcelado.");
        }
        if (parcelas <= 3) {
            return valorProduto.divide(BigDecimal.valueOf(parcelas),2,BigDecimal.ROUND_HALF_UP);
        } else {
            BigDecimal juros = valorProduto.multiply(taxaJuros);
            BigDecimal valorComJuros = valorProduto.add(juros);
            return valorComJuros.divide(BigDecimal.valueOf(parcelas),2,BigDecimal.ROUND_HALF_UP);
        }
    }
}
