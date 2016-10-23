package com.citech.vanka_sangashetty.proto1.fragment;

/**
 * Created by Vanka on 24-04-2016.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.citech.vanka_sangashetty.proto1.R;

public class AchieveFragment extends Fragment{


    WebView myWebView;
    static String myBlogAddr = "file:///android_asset/www/achievements.html";
    String myUrl;
   // public void OpenPage(String url){
   //     myWebView.loadUrl(url);
    //}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_achieve, container, false);
        myWebView = (WebView)view.findViewById(R.id.achieve_frag);

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
