class Ano (

    var numero:Int

) {
    fun anobissexto (){
        if (numero % 4 ==0 &&  numero % 100 ==0 && numero % 400 ==0)
            println("O ano é um ano bissexto!!!")

        else println("O ano não é um ano bissexto")
    }




}