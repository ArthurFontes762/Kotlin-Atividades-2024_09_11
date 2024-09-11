fun main() {
    println("Em Kotlin, crie variáveis inteiras e uma string com os dizeres 'A soma e multiplicação é: ', e imprima a string e os resultados dessas operações.")

    // Definição de números
    val num1 = 2
    val num2 = 4

    // Operação
    val soma = num1 + num2
    val multiplicacao = num1 * num2

    // Frase a ser dita
    val message = "A soma e multiplicação é:"

    // Resultado Alternativo
    println("A soma entre $num1 e $num2 é: $soma")
    println("A multiplicação entre $num1 e $num2 é: $multiplicacao")

    // Resultado
    println("$message Soma: $soma e Multiplicação: $multiplicacao")
}