package com.rogok.kodeindi

import android.app.Application
import com.rogok.kodeindi.data.db.Database
import com.rogok.kodeindi.data.db.DatabaseFakeImpl
import com.rogok.kodeindi.data.db.QuoteDAO
import com.rogok.kodeindi.data.repository.QuoteRepository
import com.rogok.kodeindi.data.repository.QuoteRepositoryImpl
import com.rogok.kodeindi.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication: Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDAO>() with singleton { instance<Database>().quoteDAO }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}