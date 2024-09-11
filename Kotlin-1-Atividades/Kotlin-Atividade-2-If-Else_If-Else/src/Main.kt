fun main() {
    println("Em Kotlin, faça uma função que, ao enviar um número por parâmetro, ela vai, por condicional, imprimir se é positiva ou negativa.")

    checkNumber1(5)
    checkNumber2(-5)
    checkNumber3(0)

}

fun checkNumber1(number1: Int) {
    if (number1 > 0) {
        println("O número $number1 é positivo.")
    } else if (number1 < 0) {
        println("O número $number1 é negativo.")
    } else {
        println("O número $number1 é zero.")
    }
}

fun checkNumber2(number2: Int) {
    if (number2 > 0) {
        println("O número $number2 é positivo.")
    } else if (number2 < 0) {
        println("O número $number2 é negativo.")
    } else {
        println("O número $number2 é zero.")
    }
}

fun checkNumber3(number3: Int) {
    if (number3 > 0) {
        println("O número $number3 é positivo.")
    } else if (number3 < 0) {
        println("O número $number3 é negativo.")
    } else {
        println("O número $number3 é zero.")
    }
}

