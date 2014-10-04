package edu.csc414.usm.simpletabsdemo;;

import edu.csc414.usm.simpletabsdemo.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.Override;

public class WhiteListFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_whitelist, container, false);

        return rootView;
    }
}