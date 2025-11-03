algoritmo "CercaTriangulo"

   real = a, b, c
inicio
    escreva("Digite o comprimento do lado a (m): ")
    leia(a)

    escreva("Digite o comprimento do lado b (m): ")
    leia(b)

    c <- raizq(a * a + b * b)

    escreva("Precisa comprar ", c, " metros de cerca.")
    
fim