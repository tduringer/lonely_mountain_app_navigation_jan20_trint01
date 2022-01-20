package com.example.lonely_mountain_app_navigation_jan20_trint01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lonely_mountain_app_navigation_jan20_trint01.databinding.FragmentSignUpCompleteBinding

class SignUpCompleteFragment : Fragment() {

    private var _binding : FragmentSignUpCompleteBinding? = null
    private val binding : FragmentSignUpCompleteBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpCompleteBinding.inflate(inflater,container,false   )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnBack.setOnClickListener {
                val directions = SignUpCompleteFragmentDirections.actionSignUpCompleteFragmentToNameFragment()
                findNavController().navigate(directions)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}