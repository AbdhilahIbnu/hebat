// HomeFragment.kt
package com.example.sneakersuds

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Mendapatkan referensi ke ImageButton
        val goPaymentButton: ImageButton = view.findViewById(R.id.goPayment)

        // Menangani klik pada ImageButton
        goPaymentButton.setOnClickListener {
            val intent = Intent(activity, PaymentActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
