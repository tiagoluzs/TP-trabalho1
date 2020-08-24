
package br.pucrs.tp;

public class Carro extends GenericVeiculo {
    
    public Carro(String marca, String modelo, String cor, String placa) {
        super(marca, modelo, cor, placa);
        this.hasMotor = true;
        this.maxPassageiros = 4;
    }
    
    
}
