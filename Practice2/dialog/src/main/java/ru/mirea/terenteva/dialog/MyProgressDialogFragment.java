package ru.mirea.terenteva.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    ProgressDialog progress;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        progress = new ProgressDialog(getActivity());
        progress.setTitle("ProgressDialog");
        progress.setMessage("Loading...");

        progress.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                ((MainActivity)getActivity()).onCloseProgress();
                dialog.cancel();
            }
        });
        return progress;
    }

}
