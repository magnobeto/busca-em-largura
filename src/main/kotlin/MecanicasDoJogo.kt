import java.util.*

object MecanicasDoJogo {

    private val ficha1 = Ficha(cor = Ficha.Cor.BRANCA)
    private val ficha2 = Ficha(cor = Ficha.Cor.BRANCA)
    private val ficha3 = Ficha(cor = Ficha.Cor.PRETA)
    private val ficha4 = Ficha(cor = Ficha.Cor.PRETA)
    private val intervaloVazio = IntervaloVazio()

    fun inicializandoFichas(): List<Elemento> {
        return listOf(ficha1, ficha2, intervaloVazio, ficha3, ficha4)
    }

    fun desliza(elemento: Elemento, lista: List<Elemento>, indice: Int): List<Elemento> {
        val novaLista = lista
        val nextItem = indice + 1
        val beforeItem = indice - 1
        return try {
            if ((lista[nextItem] == intervaloVazio || elemento == intervaloVazio) && nextItem < 5 && indice < 5) {
                Collections.swap(novaLista, indice, nextItem)
                println(novaLista)
                novaLista
            } else if ((lista[beforeItem] == intervaloVazio || elemento == intervaloVazio) && beforeItem >= 0 && indice < 5) {
                Collections.swap(novaLista, indice, beforeItem)
                println(novaLista)
                novaLista
            } else {
                listOf()
            }
        } catch (exception: Exception) {
            return listOf()
        }
    }

    fun salta(elemento: Elemento, lista: List<Elemento>, indice: Int): List<Elemento> {
        val novaLista = lista
        val nextItem = indice + 2
        val beforeItem = indice - 2
        return try {
            if ((lista[nextItem] == intervaloVazio || elemento == intervaloVazio) && nextItem < 5 && indice < 5) {
                Collections.swap(novaLista, indice, nextItem)
                println(novaLista)
                novaLista
            } else if ((lista[beforeItem] == intervaloVazio || elemento == intervaloVazio) && beforeItem >= 0 && indice < 5) {
                Collections.swap(novaLista, indice, beforeItem)
                println(novaLista)
                novaLista
            } else {
                listOf()
            }
        } catch (exception: Exception) {
            return listOf()
        }
    }
}