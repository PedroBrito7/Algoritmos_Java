algoritmo MediaAlturaPorSexo
real altura, somaHomens, somaMulheres
inteiro contadorHomens, contadorMulheres
literal sexo

inicio
    somaHomens <- 0
    somaMulheres <- 0
    contadorHomens <- 0
    contadorMulheres <- 0

    escreva("Digite a altura (0 para parar): ")
    leia(altura)

    enquanto altura <> 0 faça
        escreva("Digite o sexo (M/F): ")
        leia(sexo)

        se sexo = "M" então
            somaHomens <- somaHomens + altura
            contadorHomens <- contadorHomens + 1
        senao se sexo = "F" então
            somaMulheres <- somaMulheres + altura
            contadorMulheres <- contadorMulheres + 1
        fimse

        escreva("Digite a altura (0 para parar): ")
        leia(altura)
    fimenquanto

    se contadorHomens > 0 então
        escreva("Média de altura dos homens: ", somaHomens / contadorHomens)
    fimse

    se contadorMulheres > 0 então
        escreva("Média de altura das mulheres: ", somaMulheres / contadorMulheres)
    fimse
fim
