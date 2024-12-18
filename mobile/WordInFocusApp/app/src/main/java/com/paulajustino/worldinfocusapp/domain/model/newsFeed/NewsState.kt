package com.paulajustino.worldinfocusapp.domain.model.newsFeed

/**
 * Estado das noticias.
 * Pode ser um estado de carregamento, sucesso ou erro.
 */
sealed class NewsState {
    data class Loading(val isRefreshing: Boolean) : NewsState()
    data class Success(val news: List<NewsItemModel>) : NewsState()
    data class Error(val message: String) : NewsState()
}