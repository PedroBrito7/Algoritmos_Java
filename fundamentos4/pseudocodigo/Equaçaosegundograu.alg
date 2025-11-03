algoritmo Equacaodesegundograu
    início
        algoritmo "EquacaoSegundoGrau"

var
    a, b, c: real
    delta, x1, x2: real

inicio
    escreva("Digite o valor de a: ")
    leia(a)

    escreva("Digite o valor de b: ")
    leia(b)

    escreva("Digite o valor de c: ")
    leia(c)

    delta <- b * b - 4 * a * c

    se delta < 0 entao
        escreval("A equacao nao possui raizes reais.")
    senao
        x1 <- (-b + raizq(delta)) / (2 * a)
        x2 <- (-b - raizq(delta)) / (2 * a)

        escreval("Delta = ", delta)
        escreval("Raiz 1 = ", x1)
        escreval("Raiz 2 = ", x2)
    fim