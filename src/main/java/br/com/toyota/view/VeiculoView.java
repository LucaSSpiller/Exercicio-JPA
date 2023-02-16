package br.com.toyota.view;

import br.com.toyota.model.Veiculo;

import javax.swing.*;
import java.math.BigDecimal;

public abstract class VeiculoView {

    private VeiculoView() {
    }

    public static Veiculo form() {

        Veiculo veiculo = new Veiculo();

        String marca = JOptionPane.showInputDialog("Marca do veículo: ");
        String cor = JOptionPane.showInputDialog("Cor do veículo: ");
        String modelo = JOptionPane.showInputDialog("modelo do veículo: ");
        BigDecimal preco = new BigDecimal(JOptionPane.showInputDialog("Preço do veículo: "));

        return veiculo.setMarca(marca).setCor(cor).setModelo(modelo).setPreco(preco);
    }

}
