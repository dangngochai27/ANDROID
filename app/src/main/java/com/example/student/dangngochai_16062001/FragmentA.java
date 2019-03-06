package com.example.student.dangngochai_16062001;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentA extends Fragment {

    TextView tvFragmentA;
    EditText edtFragmentA;
    Button btnFragmentA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container,false);

        tvFragmentA = (TextView) view.findViewById(R.id.tvfragmentA);
        edtFragmentA = (EditText) view.findViewById(R.id.edtfragmentA);
        btnFragmentA = (Button) view.findViewById(R.id.btnfragmentA);

        btnFragmentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), edtFragmentA.getText().toString(), Toast.LENGTH_SHORT).show();
                TextView tvMain = (TextView) getActivity().findViewById(R.id.tvMain);
                tvMain.setText("AAA");
            }
        });

        return view;
    }
}
