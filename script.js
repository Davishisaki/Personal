//conaole.log("Hello world!");
//let nome = "Davi";
//console.log(nome);

//let dataNascimento = "12/08/2005";

//var lista = ["sc", "pr", "rs", "mg", "sp"];

//var pessoa = {
    //nome: "asda",
    //dataNascimento: "12/30/12039",
    //endereco: "Rua asoid",
    //cpf: "328482384",
//};

//var estado ={
    //sc: "Santa Catarina",
    //pr: "Paraná",
    //rs: "Rio Grande do Sul",
//};

//for (chave in estado){
    //console.log(chave);
//}

//0 = pedra,
//1 = papel,
//2 = tesoura.
const game = (opcao) => {
let opcaodeSistema = parseInt(getRandomArbitrary(0,3));

 
    if (opcao === opcaodeSistema) {
        console.log("Empate!");
    } else if (opcao === "0" && opcaodeSistema === "2" ||
        opcao === "1" && opcaodeSistema === "0" ||
        opcao === "2" && opcaodeSistema === "1") {
        console.log("Vitória!");
    } else {
        console.log("Não foi desta vez!");
    }

}

alert("Pedra, papel ou Tesoura!");
let opcao = prompt(`
Qual a sua escolha? \n
0 = pedra; \n
1 = papel; \n
2 = tesoura.`);

opcao = confirm("Tem certeza?");
if (opcao == "0"||
    opcao == "1"||
    opcao == "2") {
        comparacao;
} else {
    alert ("Escolha invalida!");
}