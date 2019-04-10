package com.sheedmi.testapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ActivityBFragment extends Fragment {

    String tag = ActivityBFragment.this.getClass().getSimpleName();

    public static ActivityBFragment newInstance() {
        return new ActivityBFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(tag, "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tag, "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.i(tag, "onCreateView");
        return inflater.inflate(R.layout.activity_b_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(tag, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(tag, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(tag, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(tag, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(tag, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(tag, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(tag, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(tag, "onDetach");
    }
}
