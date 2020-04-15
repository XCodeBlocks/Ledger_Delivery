package com.xcodeblocks.ledger_delivery.ui.ledger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.xcodeblocks.ledger_delivery.R

class LedgerFragment : Fragment() {

    private lateinit var ledgerViewModel: LedgerViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        ledgerViewModel =
                ViewModelProviders.of(this).get(LedgerViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ledger, container, false)
        val textView: TextView = root.findViewById(R.id.text_ledger)
        ledgerViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
