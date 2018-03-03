package jp.co.hakutosuzuki.videowatcher.ui

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.hakutosuzuki.videowatcher.databinding.FragmentVideoPageBinding

class VideoPageFragment : Fragment() {
    companion object {
        val gridSpanSize: Int = 2
    }

    private lateinit var binding: FragmentVideoPageBinding
    private lateinit var mContext: Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentVideoPageBinding.inflate(
                inflater,
                container!!,
                false
        )
        mContext = activity!!.applicationContext
        activity?.supportStartPostponedEnterTransition()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager = GridLayoutManager(mContext, gridSpanSize)
    }
}