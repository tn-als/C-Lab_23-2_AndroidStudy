package com.jiyoxn.study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jiyoxn.study.databinding.FragmentHomeBinding
import com.jiyoxn.study.databinding.FragmentMypageBinding

class MypageFragment: Fragment() {
    private var _binding: FragmentMypageBinding? = null
    private val binding: FragmentMypageBinding
        get() = requireNotNull(_binding) { "바인딩 객체가 생성되지 않았다. 생성하고 불러라 임마!" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { // 이제 반환하는 View가 Null일 수 없기 때문에, ?를 지워주셔도 됩니다.
        _binding = FragmentMypageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 대부분의 로직은 여기에 구현합니다.
        // 원두를 갈고~
        // 커피를 내리고~

        var receivedId = arguments?.getString("receivedId")
        var receivedPw = arguments?.getString("receivedPw")
        var receivedName = arguments?.getString("receivedName")
        var receivedMbti = arguments?.getString("receivedMbti")
        var receivedMe = arguments?.getString("receivedMe")

        binding.fragmentMypageTvID.text = "ID: $receivedId"
        binding.fragmentMypageTvPW.text = "PW: $receivedPw"
        binding.fragmentMypageTvName.text = "Name: $receivedName"
        binding.fragmentMypageTvMbti.text = "MBTI: $receivedMbti"
        binding.fragmentMypageTvMe.text = "Me: $receivedMe"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}