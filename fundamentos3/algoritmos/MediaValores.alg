algoritmo MediaValores
inteiro n, i
real valor, soma, media

inicio
    escreva("Digite a quantidade de valores: ")
    leia(n)

    soma <- 0

    para i de 1 até n passo 1 faça
        escreva("Digite o valor ", i, ": ")
        leia(valor)
        soma <- soma + valor
    fimpara

    media <- soma / n
    escreva("A média dos valores é: ", media)
fim
