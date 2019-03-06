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

public class FragmentB extends Fragment {

    TextView tvFragmentB;
    EditText edtFragmentB;
    Button btnFragmentB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b,container,false) ;

        tvFragmentB = (TextView) view.findViewById(R.id.tvfragmentB);
        edtFragmentB = (EditText) view.findViewById(R.id.edtfragmentB);
        btnFragmentB = (Button) view.findViewById(R.id.btnfragmentB);

        btnFragmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), edtFragmentB.getText().toString(), Toast.LENGTH_SHORT).show();
                TextView tvFragmentA = (TextView)
                        getActivity().findViewById(R.id.tvfragmentA);
                tvFragmentA.setText(edtFragmentB.getText().toString());
            }
        });

        return view;
    }
}
