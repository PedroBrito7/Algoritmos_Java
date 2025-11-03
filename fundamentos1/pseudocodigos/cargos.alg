public /*

algoritmo Cargos

  início

    inteiro codigo

    real salario, aumento, novoSalario

    caractere cargo



    escreva("Digite o codigo do cargo (1 a 5): ")

    leia(codigo)



    escreva("Digite o salario atual: ")

    leia(salario)



    escolha codigo

      caso 1:

        cargo <- "Escriturario"

        aumento <- salario * 0.50

        novoSalario <- salario + aumento

      caso 2:

        cargo <- "Secretario"

        aumento <- salario * 0.35

        novoSalario <- salario + aumento

      caso 3:

        cargo <- "Caixa"

        aumento <- salario * 0.20

        novoSalario <- salario + aumento

      caso 4:

        cargo <- "Gerente"

        aumento <- salario * 0.10

        novoSalario <- salario + aumento

      caso 5:

        cargo <- "Diretor"

        aumento <- 0

        novoSalario <- salario

      outrocaso:

        escreva("Codigo invalido!")

        pare

    fimescolha



    escreva("Cargo: ", cargo)

    escreva("Valor do aumento: ", aumento)

    escreva("Novo salario: ", novoSalario)

  fim

*/
