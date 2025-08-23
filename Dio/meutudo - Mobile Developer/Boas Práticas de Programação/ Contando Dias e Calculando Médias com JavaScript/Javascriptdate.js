// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

const startDate = gets()
const endDate = gets()

function countBusinessDays(startDate, endDate) {
	const start = new Date(startDate);
	const end = new Date(endDate);
	let businessDays = 0;
	
	// Loop do início até o fim, contando os dias úteis (segunda a sexta)
	while (start <= end) {
		const dayOfWeek = start.getDay(); // 0 = domingo, 6 = sábado
		
		// TODO: Crie uma condição para calcular os dias úteis, sabendo que 0 = domingo, 6 = sábado
		
		if (dayOfWeek >= 1 && dayOfWeek <= 5) {
			businessDays++;
		}

	// Avança um dia no calendário
	start.setDate(start.getDate() + 1);
	}
	
	return businessDays;
}

// Imprime o resultado
print(countBusinessDays(startDate, endDate));
