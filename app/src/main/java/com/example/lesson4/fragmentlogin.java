package com.example.lesson4;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmentlogin extends Fragment {
    public static final String tag = "Login";
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(tag,"onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tag,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(tag,"onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmentlogin, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(tag,"onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(tag,"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(tag,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(tag,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(tag,"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(tag,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(tag,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(tag,"onDetach");
    }

}
