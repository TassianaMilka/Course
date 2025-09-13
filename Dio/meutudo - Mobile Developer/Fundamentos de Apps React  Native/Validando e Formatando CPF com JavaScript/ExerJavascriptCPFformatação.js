
const valor = gets()

function formatarCPF(cpf) {
  const apenasNumeros = cpf.replace(/\D/g, '');

  if (apenasNumeros.length !== 11) {
    return "CPF invalido";
  }

  const cpfFormatado = apenasNumeros.replace(/(\d{3})(\d{3})(\d{3})(\d{2})/, "$1.$2.$3-$4");

  return cpfFormatado;
}

print(formatarCPF(valor));
