
package br.pucrs.tp;

public interface Veiculo {
    void setMarca(String marca);
    void setModelo(String modelo);
    void setPlaca(String placa);
    void setCor(String cor);
    void setMaxPassageiros(int maxPassageiros);
    void setPortas(int portas);
    void setRodas(int rodas);
    void setAnoModelo(int anoModelo);
    void setAnoFabricacao(int anoFabricacao);
    void hasMotor(boolean hasMotor);
    
    String getTipo();
    String getMarca();
    String getModelo();
    String getPlaca();
    String getCor();
    int getMaxPassageiros();
    int getPortas();
    int getRodas();
    int getAnoModelo();
    int getAnoFabricacao();
    boolean hasMotor();
}
