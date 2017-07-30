package in.cyberwalker.cavein.ui;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import in.cyberwalker.cavein.R;


public class LoginWalkThroughFragment extends Fragment {

    private String contentText, headerText;
    private int drawableId;

    public static LoginWalkThroughFragment newInstance(String headerTxt, String contentTxt, @DrawableRes int drawableId) {
        LoginWalkThroughFragment f = new LoginWalkThroughFragment();
        Bundle args = new Bundle();
        args.putString("h", headerTxt);
        args.putString("c", contentTxt);
        args.putInt("id", drawableId);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawableId = getArguments().getInt("id");
        contentText = getArguments().getString("c");
        headerText = getArguments().getString("h");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_login_1, container, false);

        return rootView;
    }
}
