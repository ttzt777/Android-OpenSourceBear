package cc.bear3.osbear.ui.recommend.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cc.bear3.osbear.databinding.FragmentSrlRecyclerBinding
import cc.bear3.osbear.ui.common.BaseFragment

/**
 *
 *
 * @author TT
 * @since 2020-7-3
 */
class NewsListFragment : BaseFragment() {
    val viewModel by lazy {
        NewsListViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSrlRecyclerBinding.inflate(inflater, container, false)

        subscribeUi(binding)

        return binding.root
    }

    private fun subscribeUi(binding: FragmentSrlRecyclerBinding) {

    }
}