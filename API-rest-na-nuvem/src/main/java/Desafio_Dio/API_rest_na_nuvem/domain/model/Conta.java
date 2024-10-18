package Desafio_Dio.API_rest_na_nuvem.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(precision = 13, scale = 2)
    private BigDecimal saldo;

    @Column(precision = 13, scale = 2)
    private BigDecimal chequeEspecial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getChequeEspecial() {
        return chequeEspecial;
    }

    public void setLimite(BigDecimal chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
