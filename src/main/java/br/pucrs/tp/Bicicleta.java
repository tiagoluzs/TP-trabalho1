
package br.pucrs.tp;

public class Bicicleta extends GenericVeiculo {
    
    public Bicicleta(String marca, String modelo, String cor) {
        super(marca, modelo, cor, null);
        this.hasMotor = false;
        this.maxPassageiros = 1;
    }
    
}
