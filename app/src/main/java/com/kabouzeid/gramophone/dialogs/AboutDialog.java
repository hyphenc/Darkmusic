package com.kabouzeid.gramophone.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;

import com.afollestad.materialdialogs.MaterialDialog;
import com.kabouzeid.gramophone.R;

/**
 * @author Karim Abou Zeid (kabouzeid), Aidan Follestad (afollestad)
 */
public class AboutDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new MaterialDialog.Builder(getActivity())
                .title(getActivity().getResources().getString(R.string.app_name) + " " + getCurrentVersionName(getActivity()))
                .iconRes(R.drawable.ic_launcher)
                .content(TextUtils.concat(getActivity().getResources().getText(R.string.credits_1),
                                getActivity().getResources().getText(R.string.credits_2),
                                getActivity().getResources().getText(R.string.credits_3),
                                getActivity().getResources().getText(R.string.credits_4))
                )
                .positiveText(getActivity().getResources().getString(android.R.string.ok))
                .callback(new MaterialDialog.ButtonCallback() {
                    @Override
                    public void onPositive(MaterialDialog dialog) {
                        super.onPositive(dialog);
                        dialog.dismiss();
                    }
                })
                .build();
    }

    private static String getCurrentVersionName(final Context context) {
        String versionName;
        try {
            versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "Unknown";
        }
        return versionName;
    }
}