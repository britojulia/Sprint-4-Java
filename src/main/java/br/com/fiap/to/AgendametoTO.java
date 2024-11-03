package br.com.fiap.to;

import java.time.LocalDate;

public class AgendametoTO {

    private Long id_agendamento;
    private LocalDate data_agendamento;
    private String tipo_serviço;
    private String status;
    private String cpf;
    private String placa;

    public AgendametoTO() {
    }

    public AgendametoTO(Long id_agendamento, LocalDate data_agendamento, String tipo_serviço, String status, String cpf, String placa) {
        this.id_agendamento = id_agendamento;
        this.data_agendamento = data_agendamento;
        this.tipo_serviço = tipo_serviço;
        this.status = status;
        this.cpf = cpf;
        this.placa = placa;
    }

    public Long getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(Long id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public LocalDate getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(LocalDate data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public String getTipo_serviço() {
        return tipo_serviço;
    }

    public void setTipo_serviço(String tipo_serviço) {
        this.tipo_serviço = tipo_serviço;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
