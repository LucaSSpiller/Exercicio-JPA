package br.com.toyota.model;

import br.com.toyota.repository.VeiculoRepository;
import br.com.toyota.view.VeiculoView;

public class Main {

    public static void main(String[] args) {

        var repoVeiculo = new VeiculoRepository();

        var veiculoView = VeiculoView.form();

        repoVeiculo.save(veiculoView);


    }

}
