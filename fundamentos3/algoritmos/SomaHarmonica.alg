algoritmo SomaHarmonica
inteiro n, i
real soma

inicio
    escreva("Digite um número inteiro positivo: ")
    leia(n)

    se n <= 0 então
        escreva("Número inválido!")
    senao
        soma <- 0
        para i de 1 até n passo 1 faça
            soma <- soma + 1 / i
        fimpara
        escreva("Soma: ", soma)
    fimse
fim
