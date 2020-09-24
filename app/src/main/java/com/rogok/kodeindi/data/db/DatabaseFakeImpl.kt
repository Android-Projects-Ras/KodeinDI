package com.rogok.kodeindi.data.db

class DatabaseFakeImpl: Database {
    override val quoteDAO: QuoteDAO = QuoteDaoFakeImpl()
}