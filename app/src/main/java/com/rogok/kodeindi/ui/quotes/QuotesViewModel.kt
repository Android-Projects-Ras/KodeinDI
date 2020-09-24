package com.rogok.kodeindi.ui.quotes

import androidx.lifecycle.ViewModel
import com.rogok.kodeindi.data.model.Quote
import com.rogok.kodeindi.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}