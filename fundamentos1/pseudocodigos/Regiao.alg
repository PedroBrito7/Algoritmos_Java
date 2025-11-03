algoritmo "PrecoPassagem"



  // Declaração de variáveis

  inteiro destino, tipo

  real valor



  escreva("Escolha o destino:")

  escreva("\n1 - Região Norte")

  escreva("\n2 - Região Nordeste")

  escreva("\n3 - Região Centro-Oeste")

  escreva("\n4 - Região Sul")

  escreva("\nDigite a opção desejada: ")

  leia(destino)



  escreva("\nA viagem inclui retorno?")

  escreva("\n1 - Somente ida")

  escreva("\n2 - Ida e volta")

  escreva("\nDigite a opção desejada: ")

  leia(tipo)



  escolha destino

    caso 1:

      se tipo = 1 entao

        valor <- 500

      senao

        valor <- 900

      fimse

    caso 2:

      se tipo = 1 entao

        valor <- 350

      senao

        valor <- 650

      fimse

    caso 3:

      se tipo = 1 entao

        valor <- 350

      senao

        valor <- 600

      fimse

    caso 4:

      se tipo = 1 entao

        valor <- 600

      senao

        valor <- 550

      fimse

    outrocaso:

      escreva("Destino inválido!")

      pare

  fimescolha



  escreva("\nO valor da passagem é: R$ ", valor:6:2)



fimalgoritmo

