fun main(args: Array<String>) {

    println("digite o número do ano")
    var numero = readLine()!!.toInt()

    val ano = Ano(numero)

    ano.anobissexto()


}