/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucrs.tp;

import java.util.ArrayList;

/**
 *
 * @author tiagoluz
 */
public class Main {
    
    static ArrayList<Veiculo> veiculos;
            
    public static void main(String a[]) {
         veiculos = new ArrayList<Veiculo>();
        
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "PLA-1232"));
        veiculos.add(new Moto("Yamaha", "CBX-150", "Preta", "XXS-1232"));
        veiculos.add(new Moto("Yamaha", "CBX-200", "Branca", "ABC-1232"));
        veiculos.add(new Moto("Yamaha", "CBX-250", "Branca", "CNN-1233"));
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "NBC-1235"));
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "ABC-4123"));
        veiculos.add(new Moto("Yamaha", "CBX-100", "Branca", "KWA-5123"));
        
        veiculos.add(new Bicicleta("Caloi", "Caloi 10", "Branca"));
        veiculos.add(new Bicicleta("Monark", "Morark BMX", "Preta"));
        veiculos.add(new Bicicleta("TREK", "Émonda SLR 7", "Vermelha"));
        veiculos.add(new Bicicleta("TREK", "Émonda SLR 6", "Azul"));
        veiculos.add(new Bicicleta("Caloi", "Caloi 10", "Prata"));
        
        veiculos.add(new Carro("Mitsubishi", "ASX", "Prata","VLX-9312"));
        veiculos.add(new Carro("GM Chevrolet", "Cruise", "Branco","VLX-9312"));
        veiculos.add(new Carro("Honda", "Civic", "Preto","VLX-9312"));
        veiculos.add(new Carro("Toyota", "Corolla", "Vermelho","VLX-9312"));
        veiculos.add(new Carro("Toyota", "Prius", "Azul","VLX-9312"));
        veiculos.add(new Carro("Toyota", "Ethios", "Verde","VLX-9312"));
        veiculos.add(new Carro("Honda", "City", "Branco","VLX-9312"));
        veiculos.add(new Carro("Honda", "Fit", "Prata","VLX-9312"));
        veiculos.add(new Carro("Honda", "CRV", "Branco","VLX-9312"));
        veiculos.add(new Carro("Honda", "WRV", "Branco","VLX-9312"));
        
        filtrar("Carros");
        
        filtrar("Motos");
        
        filtrar("Bicicletas");
    }
    
    static void filtrar(String selected) {
    
        System.out.println(selected);
        
        for(Veiculo v : veiculos) {
            if(selected.equals("") || selected.equals("Todos") || (selected.equals("Motos") && v instanceof Moto) || 
                    (selected.equals("Carros") && v instanceof Carro) || 
                    (selected.equals("Bicicletas") && v instanceof Bicicleta) ) {
                
                System.out.println(" - " + v);
            }
        }
        
        
    }
}
