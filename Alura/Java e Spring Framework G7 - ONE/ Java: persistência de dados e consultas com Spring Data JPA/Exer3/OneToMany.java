/* Esta opção implementa corretamente o mapeamento usando fetch EAGER, o que significa que as transações serão carregadas sempre que 
uma conta for carregada, e o cascade ALL, ou seja, qualquer alteração feita na conta será aplicada às transações também.*/

@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
private List<Transacao> transacoes;
