/* O filtro é aplicado para buscar as contas que tem o tipo “corrente”. A lista é ordenada em ordem decrescente de saldo e,
finalmente, são obtidos os cinco primeiros elementos.*/

dadosClientes.stream()
              .filter(c -> c.getTipoConta().equalsIgnoreCase("corrente"))
              .sorted(Comparator.comparingDouble(Conta::getSaldo).reversed())
              .limit(5);
