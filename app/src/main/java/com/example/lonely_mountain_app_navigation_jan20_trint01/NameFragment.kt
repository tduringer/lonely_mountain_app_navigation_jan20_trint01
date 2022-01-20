package com.example.lonely_mountain_app_navigation_jan20_trint01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.lonely_mountain_app_navigation_jan20_trint01.databinding.FragmentNameBinding

class NameFragment : Fragment() {

    private var _binding : FragmentNameBinding? = null
    private val binding : FragmentNameBinding get() = _binding!!

    private lateinit var viewModel : UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        with(binding) {
            btnNext.setOnClickListener {

                val firstName = etFirstName.editText?.text?.toString()
                val surname = etSurname.editText?.text?.toString()
                val user = User(firstName!!,surname!!)
                viewModel.addUser(user)

                val action = NameFragmentDirections.actionNameFragmentToEmailFragment(
                    //firstName!!,
                    //surname!!
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