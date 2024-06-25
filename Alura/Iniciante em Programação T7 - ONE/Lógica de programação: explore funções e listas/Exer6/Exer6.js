/*calcularMedia(nota1, nota2, nota3, nota4)=> Esta função recebe as quatro notas do aluno como parâmetros e retorna a média calculada com base nessas notas.
verificarAprovacao(media) => Esta função recebe a média do aluno como parâmetro e retorna "Aprovado" se a média for maior ou igual a 5, caso contrário, retorna "Reprovado".*/

/*let nota1 = 7;
let nota2 = 6;
let nota3 = 3;
let nota4 = 5;*/


function verificarAprovacao(media) {
    return media >= 5 ? "Aprovado" : "Reprovado";
}


function calcularMedia(nota1, nota2, nota3, nota4) {
  let media = (nota1 + nota2 + nota3 + nota4) / 4;
  return media;
}
