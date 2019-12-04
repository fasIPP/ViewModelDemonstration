package com.example.livedata;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProviders;


public class InputDialog extends DialogFragment {


    private EditText description;

    public InputDialog() {}

     public Dialog onCreateDialog(Bundle savedInstanceState) {
         AlertDialog.Builder b=  new  AlertDialog.Builder(getActivity())
                 .setTitle("Adiciona Mensagem")
                 .setPositiveButton("OK",
                         new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog, int whichButton) {


                                 dialog.dismiss();
                             }
                         }
                 )
                 .setNegativeButton("Cancel",
                         new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog, int whichButton) {
                                 dialog.dismiss();
                             }
                         }
                 );

         LayoutInflater i = getActivity().getLayoutInflater();

         View v = i.inflate(R.layout.create_input_fragment,null);

         this.description = v.findViewById(R.id.editText_description);


         b.setView(v);
         return b.create();
    }


}
