package edu.csc414.usm.simpletabsdemo.adapter;

import edu.csc414.usm.simpletabsdemo.AccountDetails;
import edu.csc414.usm.simpletabsdemo.Contacts;
import edu.csc414.usm.simpletabsdemo.FilesFragment;
import edu.csc414.usm.simpletabsdemo.Messages;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new AccountDetails();
            case 1:
                // Games fragment activity
                return new FilesFragment();
            case 2:
                // Movies fragment activity
                return new Contacts();
            case 3:
                return new Messages();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 4;
    }

}
