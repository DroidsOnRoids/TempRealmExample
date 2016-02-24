package pl.droidsonroids.examplerealm.ui.edition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pl.droidsonroids.examplerealm.R;

public class MyEditionFragment extends Fragment {

    @Bind(R.id.edit_title) EditText mEditTitle;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edition, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.button_add)
    public void onAddClick() {
        //no-op
    }

    @OnClick(R.id.button_remove)
    public void onRemoveClick() {
        //no-op
    }
}
