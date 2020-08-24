
package br.pucrs.tp;

public class GenericVeiculo implements Veiculo{
    public String marca;
    public String modelo;
    public String placa;
    public String cor;
    public int maxPassageiros;
    public int portas;
    public int rodas;
    public int anoModelo;
    public int anoFabricacao;
    public boolean hasMotor;
    
    
    public GenericVeiculo(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }
    
    public String getTipo() {
        if(this instanceof Moto) {
            return "Moto";
        } else if ( this instanceof Bicicleta) {
            return "Bicicleta";
        } else if ( this instanceof Carro) {
            return "Carro";
        } else {
            return "Outro";
        }
    }
    
    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " " + this.cor + " " + this.placa;
    }

    @Override
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public void setMarca(String marca) {
       this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    @Override
    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getModelo() {
       return this.modelo;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public int getMaxPassageiros() {
        return this.maxPassageiros;
    }

    @Override
    public int getPortas() {
        return this.portas;
    }

    @Override
    public int getRodas() {
        return this.rodas;
    }

    @Override
    public int getAnoModelo() {
        return this.anoModelo;
    }

    @Override
    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    @Override
    public void hasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;
    }

    @Override
    public boolean hasMotor() {
        return this.hasMotor;
    }

    
}
