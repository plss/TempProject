package mibh.mis.tempproject.view.adapter;

import android.net.Uri;
import android.os.Environment;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.File;
import java.util.List;

import mibh.mis.tempproject.view.TempItem;

/**
 * Created by Ponlakit on 8/20/2016.
 */

public class TempAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TempItem item;
        if (view != null)
            item = (TempItem) view;
        else
            item = new TempItem(viewGroup.getContext());

        return item;
    }
}
