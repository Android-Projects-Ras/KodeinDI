package com.rogok.kodeindi.data.repository

import androidx.lifecycle.LiveData
import com.rogok.kodeindi.data.model.Quote

interface QuoteRepository {

    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}