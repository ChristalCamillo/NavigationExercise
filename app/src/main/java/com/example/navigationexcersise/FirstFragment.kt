package com.example.navigationexcersise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.Person.fromBundle
import androidx.navigation.fragment.findNavController
import com.example.navigationexcersise.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    //variaveis

    private lateinit var inteiro: String
    private lateinit var boolean: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = FirstFragmentArgs.fromBundle(requireArguments())

        binding.buttonSecondFragment.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.buttonThirdFragment.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_thirdFragment)
        }
    }
}