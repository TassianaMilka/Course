//Dados

const player1={

  NOME:"Mario",
  VELOCIDADE1:4,
  MANOBRABILIDADE1:3,
  PODER1:3,
  PONTOS:0,
};

const player2={

  NOME:"Peach",
  VELOCIDADE2:3,
  MANOBRABILIDADE2:4,
  PODER2:2,
  PONTOS:0,

};

//Função para calcular o resultado da partida

async function rollDice(){

 return Math.floor(Math.random()*6 + 1);
 
}

/*function main(){

  console.log("Hello");

}*/

// Simular a partida
async function getRandomBlock() {
  let random = Math.random();
  let result;

   //Controle de fluxo
  switch (true) {
    case random < 0.33:
      result = "RETA";
      break;
    case random < 0.66:
      result = "CURVA";
      break;
    default:
      result = "CONFRONTO";
  }

  return result;
}

//Função para saber o resultado da partida
async function logRollResult(characterName, block, diceResult, attribute) {
  console.log(
    `${characterName} 🎲 rolou um dado de ${block} ${diceResult} + ${attribute} = ${
      diceResult + attribute
    }`
  );
}

// Função sobre loop da quantidade de vezes da corrida
async function playRaceEngine(character1, character2) {
  for (let round = 1; round <= 5; round++) {
    console.log(`🏁 Rodada ${round}`);

    // sortear bloco
    let block = await getRandomBlock();
    console.log(`Bloco: ${block}`);

    // rolar os dados
    let diceResult1 = await rollDice();
    let diceResult2 = await rollDice();

    //teste de habilidade
    let totalTestSkill1 = 0;
    let totalTestSkill2 = 0;

    if (block === "RETA") {
      totalTestSkill1 = diceResult1 + character1.VELOCIDADE1;
      totalTestSkill2 = diceResult2 + character2.VELOCIDADE2;

      await logRollResult(
        character1.NOME1,
        "velocidade",
        diceResult1,
        character1.VELOCIDADE1
      );

      await logRollResult(
        character2.NOME1,
        "velocidade",
        diceResult2,
        character2.VELOCIDADE2
      );
    }
     
    //Validação(estrutura condicional)
    if (block === "CURVA") {
      totalTestSkill1 = diceResult1 + character1.MANOBRABILIDADE1;
      totalTestSkill2 = diceResult2 + character2.MANOBRABILIDADE2;

      await logRollResult(
        character1.NOME1,
        "manobrabilidade",
        diceResult1,
        character1.MANOBRABILIDADE1
      );

      await logRollResult(
        character2.NOME1,
        "manobrabilidade",
        diceResult2,
        character2.MANOBRABILIDADE2
      );
    }

    if (block === "CONFRONTO") {
      let powerResult1 = diceResult1 + character1.PODER;
      let powerResult2 = diceResult2 + character2.PODER;

      console.log(`${character1.NOME} confrontou com ${character2.NOME}! 🥊`);

      await logRollResult(
        character1.NOME,
        "poder",
        diceResult1,
        character1.PODER
      );

      await logRollResult(
        character2.NOME,
        "poder",
        diceResult2,
        character2.PODER
      );

      // Validação de verificação
      if (powerResult1 > powerResult2 && character2.PONTOS > 0) {
        console.log(
          `${character1.NOME} venceu o confronto! ${character2.NOME} perdeu 1 ponto 🐢`
        );
        character2.PONTOS--;
      }

      if (powerResult2 > powerResult1 && character1.PONTOS > 0) {
        console.log(
          `${character2.NOME} venceu o confronto! ${character1.NOME} perdeu 1 ponto 🐢`
        );
        character1.PONTOS--;
      }
       //Empate de validação
      console.log(
        powerResult2 === powerResult1
          ? "Confronto empatado! Nenhum ponto foi perdido"
          : ""
      );
    }

    // verificando o vencedor
    if (totalTestSkill1 > totalTestSkill2) {
      console.log(`${character1.NOME} marcou um ponto!`);
      character1.PONTOS++;
    } else if (totalTestSkill2 > totalTestSkill1) {
      console.log(`${character2.NOME} marcou um ponto!`);
      character2.PONTOS++;
    }

    console.log("-----------------------------");
  }
}

async function declareWinner(character1, character2) {
  console.log("Resultado final:");
  console.log(`${character1.NOME}: ${character1.PONTOS} ponto(s)`);
  console.log(`${character2.NOME}: ${character2.PONTOS} ponto(s)`);
  //validação de resultado
  if (character1.PONTOS > character2.PONTOS)
    console.log(`\n${character1.NOME} venceu a corrida! Parabéns! 🏆`);
  else if (character2.PONTOS > character1.PONTOS)
    console.log(`\n${character2.NOME} venceu a corrida! Parabéns! 🏆`);
  else console.log("A corrida terminou em empate");
}
//Finalização de função final dos resultados
(async function main() {
  console.log(
    `🏁🚨 Corrida entre ${player1.NOME} e ${player2.NOME} começando...\n`
  );

  await playRaceEngine(player1, player2);
  await declareWinner(player1, player2);
})();





