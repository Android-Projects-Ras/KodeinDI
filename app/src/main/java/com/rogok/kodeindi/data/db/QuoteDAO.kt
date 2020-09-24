package com.rogok.kodeindi.data.db

import androidx.lifecycle.LiveData
import com.rogok.kodeindi.data.model.Quote

interface QuoteDAO {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}