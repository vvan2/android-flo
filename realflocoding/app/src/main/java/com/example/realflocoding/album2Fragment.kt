//package com.example.study3
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import androidx.fragment.app.Fragment
//
//class album2fragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.page_slide2, container, false)
//
//
//        val imageView: ImageView = view.findViewById(R.id.imageView6)
//        imageView.setOnClickListener {
//
//            val explainFragment = ExplainFragment2()
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.fragment_container, explainFragment)
//                .addToBackStack(null)
//                .commit()
//        }
//
//        return view
//    }
//}
