import MecanicasDoJogo.desliza
import MecanicasDoJogo.inicializandoFichas
import MecanicasDoJogo.salta

fun main() {
    val listaInicial = inicializandoFichas()
    busca(listaInicial)
}

private fun busca(lista: List<Elemento>) {
    for (indice in 0..4) {
        val listaPosDesliza = desliza(lista[indice], lista, indice)
        if (listaPosDesliza.isNotEmpty()) {
            busca(listaPosDesliza)
        }

        val listaPosSalta = salta(lista[indice], lista, indice)
        if (listaPosSalta.isNotEmpty()) {
            busca(listaPosSalta)
        }
    }
}