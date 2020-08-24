
package br.pucrs.tp;

public class Moto extends GenericVeiculo {
    public Moto(String marca, String modelo, String cor, String placa) {
        super(marca,modelo,cor,placa);
        this.hasMotor = true;
        this.maxPassageiros = 2;
    }
}
