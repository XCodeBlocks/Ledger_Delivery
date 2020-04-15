package com.xcodeblocks.ledger_delivery.ui.delivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.xcodeblocks.ledger_delivery.R

class DeliveryFragment : Fragment() {

    private lateinit var deliveryViewModel: DeliveryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        deliveryViewModel =
                ViewModelProviders.of(this).get(DeliveryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_delivery, container, false)
        val textView: TextView = root.findViewById(R.id.text_delivery)
        deliveryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
