package com.citech.vanka_sangashetty.proto1.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.citech.vanka_sangashetty.proto1.R;

/**
 * Created by Vanka on 30-04-2016.
 */
public class DevFragment extends Fragment {


    WebView myWebView;
    static String myBlogAddr = "file:///android_asset/www/developers.html";
    String myUrl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dev, container, false);
        myWebView = (WebView)view.findViewById(R.id.dev_frag);

        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new MyWebViewClient());

        if(myUrl == null){
            myUrl = myBlogAddr;
        }
        myWebView.loadUrl(myUrl);

        return view;

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            myUrl = url;
            view.loadUrl(url);
            return true;
        }
    }


}
