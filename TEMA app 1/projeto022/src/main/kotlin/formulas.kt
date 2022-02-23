import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.tan

class formulas {

    class `forcPeso` {

        var gravidade = 9.8

        fun forcaPeso(massa: Float, gravidade: Float): Float {

            return massa*gravidade
        }
    }


    fun forcaCentrípeta(massa: Float, velocidade: Float, raio: Float,): Float {
        var x: Float
        var forcaCentrípeta: Float = 0.0f
        return (sqrt(velocidade) * massa)
    }

    fun tan(x: Float): Float {
        return x / forcaCentrípeta()
    }


}

fun movimento(massa:Float,segundos:Float):Float{
    return massa/segundos.pow()
}
}

private fun Float.pow(): Byte {

}

fun calcularImpulso( forca: Float, tempo: Float): Float {

    return  forca * tempo
}


fun forcaElastica(constanteElasticaDaMola : Float, deformacaoDaMola : Float): Float {

    return constanteElasticaDaMola * deformacaoDaMola
}

fun delataS(posicaoFinal: Float, posicaoInicial: Float): Float {
    return posicaoFinal - posicaoInicial
}

fun intervaloDeTempo(tempoFinal: Float, tempoInicial: Float): Float {
    return tempoFinal - tempoInicial
}

fun volocidade(delataS: Float, intervaloDeTempo: Float): Float {
    return delataS / intervaloDeTempo
}
}