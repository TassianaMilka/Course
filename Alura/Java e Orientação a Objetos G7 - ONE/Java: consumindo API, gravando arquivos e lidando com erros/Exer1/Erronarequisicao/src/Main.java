//O método send, utilizado para disparar a requisição, foi chamado no objeto errado e
//O método send, utilizado para disparar a requisição, foi chamado no objeto errado.

Scanner leitura = new Scanner(System.in);
System.out.println("Digite a palavra para buscar no dicionário: ");
String busca = leitura.nextLine();

String endereco = "https://www.apidicionario.com.br?palavra= +busca";

HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
HttpResponse<String> response = request.send(request, HttpResponse.BodyHandlers.ofString());

System.out.println(response.body());