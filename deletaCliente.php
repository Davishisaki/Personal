<?php
    require 'Banco.php';
    require 'Cliente.pgp';

    $banco = new Banco();
    $conexao = $banco->getConexao();

    $cliente = new Cliente($conexao);

    $cliente->setID($_GET['id']);

    if ($cliente->delete()){
        echo "Cliente deletado com sucesso.";
        header("Refresh:3;url=ListaCliente.php");
    }else {
        echo "Erro ao deletar o cliente";
    }
?>