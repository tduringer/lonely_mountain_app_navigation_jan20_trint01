package com.example.lonely_mountain_app_navigation_jan20_trint01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lonely_mountain_app_navigation_jan20_trint01.databinding.FragmentDisplayAllUsersBinding

class DisplayAllUserFragment : Fragment() {

    private var _binding : FragmentDisplayAllUsersBinding? = null
    private val binding : FragmentDisplayAllUsersBinding get() = _binding!!

    private lateinit var viewModel : UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDisplayAllUsersBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        with(binding) {
//            viewModel.user.observe(viewLifecycleOwner) {
//                tvDisplayUsers.text = it.toString()
//            }
            //tvDisplayUsers.text = viewModel.user.value
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}