algoritmo Calculadora
real valor1, valor2, resultado
literal operacao

inicio
    escreva("Digite o primeiro valor: ")
    leia(valor1)

    escreva("Digite o segundo valor: ")
    leia(valor2)

    escreva("Escolha a operação (+, -, *, /): ")
    leia(operacao)

    escolha operacao
        caso "+":
            resultado <- valor1 + valor2
        caso "-":
            resultado <- valor1 - valor2
        caso "*":
            resultado <- valor1 * valor2
        caso "/":
            se valor2 <> 0 entao
                resultado <- valor1 / valor2
            senao
                escreva("Erro: divisão por zero!")
        outrocaso:
            escreva("Operação inválida!")
    fimescolha

    se operacao = "+" ou operacao = "-" ou operacao = "*" ou (operacao = "/" e valor2 <> 0) entao
        escreva("Resultado: ", resultado)
fim
