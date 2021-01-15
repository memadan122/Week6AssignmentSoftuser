package com.madan.week6_assignment1_softuser.fragments

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nibriti.softuser_week6assignment.MainActivity
import com.nibriti.softuser_week6assignment.R
import com.nibriti.softuser_week6assignment.Storage
import com.nibriti.softuser_week6assignment.adapter.StudentDisplay_Adapter

class HomeFragment : Fragment() {

    private lateinit var rvStudents : RecyclerView
    private var storage =  Storage()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        rvStudents = view.findViewById(R.id.rvStudents)
        loadStudentAdapter()

        return view
    }

    private fun loadStudentAdapter() {
        val arr = storage.returnStudent()
        val adapter = StudentDisplay_Adapter(arr, this)
        rvStudents.layoutManager = LinearLayoutManager(view?.context, LinearLayoutManager.VERTICAL, false)
        rvStudents.adapter = adapter
    }



}