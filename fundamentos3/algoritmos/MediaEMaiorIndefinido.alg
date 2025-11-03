algoritmo MediaEMaiorIndefinido
real valor, soma, media, maior
inteiro contador

inicio
    soma <- 0
    contador <- 0
    maior <- -infinito

    escreva("Digite os valores (digite 0 para parar): ")
    leia(valor)

    enquanto valor <> 0 faça
        soma <- soma + valor
        contador <- contador + 1
        se valor > maior então
            maior <- valor
        fimse
        leia(valor)
    fimenquanto

    se contador > 0 então
        media <- soma / contador
        escreva("Média: ", media)
        escreva("Maior valor: ", maior)
    senao
        escreva("Nenhum valor foi digitado.")
    fimse
fim