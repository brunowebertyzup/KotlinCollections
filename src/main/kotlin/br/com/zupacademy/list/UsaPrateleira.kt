package br.com.zupacademy.list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", listaDeLivros)
    val ornanizarPorAutor = prateleira.organizarPorAutor()
    ornanizarPorAutor.imprimeComMarcadores()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()
    organizarPorAnoPublicacao.imprimeComMarcadores()
}