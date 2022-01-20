package com.example.lonely_mountain_app_navigation_jan20_trint01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lonely_mountain_app_navigation_jan20_trint01.databinding.FragmentDisplayAllUsersBinding

class DisplayAllUserFragment : Fragment() {

    private var _binding : FragmentDisplayAllUsersBinding? = null
    private val binding : FragmentDisplayAllUsersBinding get() = _binding!!

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
        with(binding) {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}