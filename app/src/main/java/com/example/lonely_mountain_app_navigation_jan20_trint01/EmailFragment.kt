package com.example.lonely_mountain_app_navigation_jan20_trint01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.lonely_mountain_app_navigation_jan20_trint01.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {

    //private val args : EmailFragmentArgs by navArgs()

    private var _binding : FragmentEmailBinding? = null
    private val binding : FragmentEmailBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEmailBinding.inflate(inflater,container,false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnNext.setOnClickListener {

                //val firstName = args.firstName

                val action = EmailFragmentDirections.actionEmailFragmentToPasswordFragment(
                    //args.firstName,
                    //args.surname
                )
                findNavController().navigate(action)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}