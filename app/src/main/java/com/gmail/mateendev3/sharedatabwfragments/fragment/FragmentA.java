package com.gmail.mateendev3.sharedatabwfragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.gmail.mateendev3.sharedatabwfragments.R;
import com.gmail.mateendev3.sharedatabwfragments.model.Student;

public class FragmentA extends Fragment {
    private EditText etName, etRollNo, etMobileNo;
    private Button btnSendData;
    private OnFragmentDataGetListener onFragmentDataGetListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        etName = view.findViewById(R.id.et_name_f1);
        etRollNo = view.findViewById(R.id.et_roll_no_f1);
        etMobileNo = view.findViewById(R.id.et_mobile_no_f1);
        btnSendData = view.findViewById(R.id.btn_send_data_f1);

        btnSendData.setOnClickListener(v -> sendData());
        return view;
    }

    private void sendData() {
        if (onFragmentDataGetListener != null) {
            if (
                    !etName.getText().toString().isEmpty() &&
                    !etRollNo.getText().toString().isEmpty() &&
                    !etMobileNo.getText().toString().isEmpty()
            ) {
                Student student = new Student(
                        etName.getText().toString(),
                        Short.parseShort(etRollNo.getText().toString()),
                        etMobileNo.getText().toString()
                );
                onFragmentDataGetListener.onFragmentDataGet(student);
            }
        }
    }



    //setter
    public void setOnFragmentDataGetListener(OnFragmentDataGetListener l) {
        this.onFragmentDataGetListener = l;
    }

    //public interface/contract to send data to Activity
    public interface OnFragmentDataGetListener {
        void onFragmentDataGet(Student student);
    }
}