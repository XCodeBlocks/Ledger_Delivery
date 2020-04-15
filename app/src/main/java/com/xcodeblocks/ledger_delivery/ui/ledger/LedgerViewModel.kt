package com.xcodeblocks.ledger_delivery.ui.ledger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LedgerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment / LEDGER"
    }
    val text: LiveData<String> = _text
}