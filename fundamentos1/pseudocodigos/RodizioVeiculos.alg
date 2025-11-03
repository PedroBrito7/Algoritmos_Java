algoritmo "RodizioVeiculos"

    // Declaração de variáveis
    inteiro placa, finalPlaca

    // Entrada de dados
    escreva("Digite os quatro últimos dígitos da placa do veículo: ")
    leia(placa)

    // Captura o último dígito
    finalPlaca <- placa % 10

    // Estrutura de decisão
    escolha finalPlaca
        caso 1, 2:
            escreva("Rodízio na segunda-feira")
        caso 3, 4:
            escreva("Rodízio na terça-feira")
        caso 5, 6:
            escreva("Rodízio na quarta-feira")
        caso 7, 8:
            escreva("Rodízio na quinta-feira")
        caso 9, 0:
            escreva("Rodízio na sexta-feira")
        outrocaso:
            escreva("Dígito inválido.")
    fimescolha

fimalgoritmo