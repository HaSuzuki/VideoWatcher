package jp.co.hakutosuzuki.videowatcher.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.hakutosuzuki.videowatcher.databinding.FragmentVideoPageBinding

class VideoPageFragment : Fragment() {

    private lateinit var binding: FragmentVideoPageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentVideoPageBinding.inflate(
                inflater,
                container!!,
                false
        )
        activity?.supportStartPostponedEnterTransition()
        return binding.root
    }
}