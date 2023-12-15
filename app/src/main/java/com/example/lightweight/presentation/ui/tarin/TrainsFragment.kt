package com.example.lightweight.presentation.ui.tarin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lightweight.databinding.FragmentTrainBinding

class TrainsFragment : Fragment() {

    private var _binding: FragmentTrainBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val trainsViewModel =
            ViewModelProvider(this).get(TrainsViewModel::class.java)

        _binding = FragmentTrainBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.startTrainLayout.setOnClickListener {
            binding.startTrainLayout.isEnabled = false
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}