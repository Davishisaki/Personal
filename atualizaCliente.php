<?php
    require 'Banco.php';
    require 'Cliente.php';

    $banco = new Banco();
    $conexao = $banco->getConexao();

    $cliente = new Cliente($conexao);
    $cliente->setNome($_POST['nome']);
    $cliente->setCPF($_POST['cpf']);
    $cliente->setTelefone($_POST['telefone']);
    $cliente->setEmail($_POST['email']);
    $cliente->setId($_POST['id']);
    
        if ($cliente->update()) {
            echo "Cliente atualizado.";
            header("Refresh:3;url=form_cadastroCliente.php");
        }else {
            echo"Erro.";
        }
?>