# Teoria do Algoritmo de Dijkstra

O algoritmo de Dijkstra serve para:

Encontrar o caminho mínimo entre um nó origem e os outros nós de um grafo com pesos positivos.

Ele é muito usado em:

- GPS

- Google Maps

- Redes de computadores

- Jogos

- Sistemas de rotas

Exemplo de grafo

Imagine o grafo:
````
A --2-- B
|       |
4       1
|       |
C --3-- D
````
Pesos representam custo / distância.

Queremos sair de A até D.

Possíveis caminhos:
````
A → B → D = 2 + 1 = 3
A → C → D = 4 + 3 = 7
```` 
O menor é:
````
A → B → D = 3
```` 

## No codigo que fizemoms 
Utilizamos matriz de adjacência
`````
   0 1 2
0 [0 5 2]
1 [5 0 1]
2 [2 1 0]
`````
- 0 → 1 peso 5
- 0 → 2 peso 2
- 1 → 2 peso 1
representamos isso com
````
vertices[][] 
````
que guardam o numero dos vertices 

os numeros guardados vao retornar o peso 

e tem a função de já criar a aresta que vai ligar os nós

Dijkstra não funciona com pesos negativos, então ele garante peso positivo. entao por isso implementou um if

Criando ligação

- vertices[noOrigem][noDestino]=peso;
- vertices[noDestino][noOrigem]=peso;

grafo não direcionado por que : 

````
A → B
B → A
```` 

Agora funcao de encontrar o nó mais proximo com menor custo: 

ele inicia a variavel
````
int minDistancia = Integer.MAX_VALUE;
````
Começa com o maior número possível.

Isso representa infinito que é obrigação da fórmula.

Cria uma variavel tempporaria que vai guardar o no mais proximo, ela inicia do  
````
int noProximo = 0;
````

ai entao ele percorre os nós.

mas primeiro vai percorrer os que nao visitado 

````
for (Integer i : naoVisitados)
````
vai fazer uma comparacao(validação) pra pegar so o custo menor
````
if(listaCustos[i] < minDistancia) // se o custo desse nó for menor então faça
````
````
minDistancia = listaCustos[i];
````
Guarda novo menor custo.

Atualiza nó mais próximo
````
noProximo = i;
````
Esse passa a ser o nó escolhido.

Retorna o nó com menor distância. fecho um metodo 

----
Encontrar vizinho 

o metodo retorna todos os nos ligados ao nó atual 

entao cria se uma lista de vizinhos vazia 

e vai percorrer todos os nos possiveis 

ele faz a verificao que se o peso for maior que 0 siginfica que existe aresta, ja que nao pode ser negativo 

ele adiciona o vizinho para proxima manipulaçao 


----

criado o metodo de pegar custo vai recever dois paramentros o no de origem e o de destino 

ele ja retorna o peso da aresta 

---

agora criado o metodo pra achar o caminho mais minimo ele pega dois paramentros dnv, de origem e destino 

vai guardar e crair o custo de cada nó, ou seja o custo daquela aresta pra ir pra outro nó 

````
int custo[] = new int[vertices.length];
````
Isso permite reconstruir o caminho.(antecessor)
````
int antecessor[] = new int[vertices.length];// esse guarda de qual nó veio
````
Guarda nós que ainda não foram processados.
````
Set<Integer> naoVisitados = new HashSet<Integer>(); // como ele vai retornar so um dados nao precisa ser map
````
Aqui ta iniciliazando o origem de custo 0 
````
custo[noOrigem] = 0;
````
Agora se perccore todos os nos 
````
for(int v = 0; v< vertices.length; v++)
````
Todos começam com custo infinito. (seguido a formula )
````
if (v!= noOrigem){
custo[v] = Integer.MAX_VALUE;
}
````
Antecessor
````
antecessor[v] = -1;
````
-1 significa:

ainda não tem antecessor

````
naoVisitados.add(v); // Adiciona aos não visitados
````
Enquanto houver nós não visitados.
````
while (!naoVisitados.isEmpty())
````

Escolhe o mais próximo
````
int noMaisProximo = getMaisProximo(custo,naoVisitados);
````
Escolhe o nó com menor custo.

Marca como visitado
````
naoVisitados.remove(noMaisProximo);
````
Remove da lista.

Atualizar vizinhos (parte central)
````
for(Integer vizinhos : getVizinhos(noMaisProximo))
````
Percorre vizinhos do nó atual.

Calcula novo custo
````
int custoTotal = custo[noMaisProximo] + getCusto(noMaisProximo, vizinhos);
````
Exemplo:
````
custo atual = 4
aresta = 2

novo custo = 6
````
Relaxamento (parte mais importante)
````
if (custoTotal< custo[vizinhos])
````
Se encontrou caminho melhor.

Atualiza:
````
custo[vizinhos] = custoTotal;
antecessor[vizinhos] = noMaisProximo;
````
Isso significa:

melhor caminho para vizinho passa pelo noMaisProximo
````
if(noMaisProximo == noDestino)
````
Se já chegou no destino.
````
return caminhoMaisProximo(antecessor, noMaisProximo);
````
Reconstrói o caminho.
---
Reconstrução do caminho
````
public List<Integer> caminhoMaisProximo(...)
````
Aqui ele volta pelos antecessores.

Lista
````
List<Integer> caminho = new ArrayList<>();
````
Adiciona destino
````
caminho.add(noMaisProximo);
````
Volta no caminho
````
while(antecessor[noMaisProximo] != -1)
````

Enquanto houver antecessor.

Adiciona no caminho
````
caminho.add(antecessor[noMaisProximo]);
````
Move para trás
````
noMaisProximo = antecessor[noMaisProximo];
````

Vai andando para trás.

Inverte lista
````
Collections.reverse(caminho);
````
Porque o metodo que criou se agora foi montado:

destino → origem

Então inverte.