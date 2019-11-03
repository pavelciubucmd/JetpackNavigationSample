package com.sample.jetpacknavigationsample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_b.*

class BFragment : Fragment() {

    private val args: BFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textB.text = args.previousScreen

        buttonB.setOnClickListener {
            val action = BFragmentDirections
                .actionBFragmentToCFragment("Previous screen was B \n Current is C")

            findNavController().navigate(action)
        }

        //get data passed with bundle object
        textB.text = arguments?.getString("key")
    }
}
