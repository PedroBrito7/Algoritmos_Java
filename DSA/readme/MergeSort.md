# Merge sort
Ele divide o array em array menores e depois junta tudo.
Aquele mesmo do livro entendendo algoritmos 

voce tem array com 8 elementos - ai escolhe o do meio como ancora 
fica 4 pra esquerda e 4 pra direita 
quebra dnv no meio e fica 2 pra esquerda e 2 pra direita (de cado lado)

e segue sempre o menor valor pra esquerda e o maior pra direita a cada vez que quebra
os valores. 
ou seja desce desordenado e dps vai ordenando


Ai para conquistar ela vai de baixo para cima alinhando e vendo qual os maiores
(esquerda o menor, direita o maior)

### quando usar:

- listas grandes 
- quando previsibilidade de tempo é importante 

### por que é util: 

- tem complexidade garantidade d O(n log n) - otimo para grandes volumes de dados.

## Divisão e conquista 
- Dividimos o problema em instâncias menores do mesmo problema 
- Conquistar: resolver o problemas menores recursivamente
- Combinar(adicionado pelo Matheuslf): todos os subproblemas transformá-los em uma solução.

### dentro do merge sort o DC funciona assim: 
- Dividir : o vetor com N elementos em dois subvetores com n/2 elementos cada

- Conquistar: Ordenar os sub vetores de forma recursiva

- Combinar: Juntar os sub vetores ordenados em um vetor ordenado




