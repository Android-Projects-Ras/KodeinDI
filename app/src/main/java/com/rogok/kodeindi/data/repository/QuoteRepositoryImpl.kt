package com.rogok.kodeindi.data.repository

import androidx.lifecycle.LiveData
import com.rogok.kodeindi.data.db.QuoteDAO
import com.rogok.kodeindi.data.model.Quote

class QuoteRepositoryImpl(private val quoteDAO: QuoteDAO): QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDAO.addQuote(quote)
    }

    override fun getQuotes() = quoteDAO.getQuotes()
}