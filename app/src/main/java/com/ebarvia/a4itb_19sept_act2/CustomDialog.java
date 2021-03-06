package com.ebarvia.a4itb_19sept_act2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Dianne on 9/19/2017.
 */

public class CustomDialog extends DialogFragment {

    LayoutInflater inflater;
    View v;


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.custom_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v)
                .setCancelable(true)
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener()
                {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity(), "OK was clicked", Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }

}
