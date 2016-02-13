package com.projectx.projectx.activities;

import android.support.v7.app.AppCompatActivity;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.projectx.projectx.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nshaikh on 2/5/2016.
 */
@EActivity(R.layout.delete_me_layout)
public class CreateGroupActivity extends AppCompatActivity {

    /*@ViewById
    Toolbar toolbar;

    @ViewById(R.id.imgCreateGroupCreate)
    ImageView mImgCreate;

    @ViewById(R.id.imgCreateGroupJoin)
    ImageView mImgJoin;*/


    String res = "\"{\"Status\":\"200\",\"Type\":\"Consumer\",\"Message\":\"Success\",\"URL\":\"http://mdev.publicpartnerships.com/ChooseProvider/Index?UserID=29691\",\"Coockie\":{\"UserID\":\"29691\",\"ExternalObjectID\":\"1\",\"MultiUsers\":\"Yes\"},\"Data\":null}\"";

    @AfterViews
    void setHit(){
        String url = "http://mdev.publicpartnerships.com";

        WebView webView = (WebView) findViewById(R.id.web);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);

        String cookieString = "\"UserID\":\"29691\",\"ExternalObjectID\":\"1\",\"MultiUsers\":\"Yes\"";

        /*CookieSyncManager.createInstance(this);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeSessionCookie();
        String cookieString = "\"UserID\":\"29691\",\"ExternalObjectID\":\"1\",\"MultiUsers\":\"Yes\"";
        cookieManager.setCookie("http://mdev.publicpartnerships.com/ChooseProvider/Index?UserID=29691\\", cookieString);
        CookieSyncManager.getInstance().sync();

        Map<String, String> abc = new HashMap<String, String>();
        abc.put("Cookie", cookieString);*/

        //{"UserID":"29691","ExternalObjectID":"1","MultiUsers":"Yes"}


        //webView.loadUrl(url, abc);

        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false; // then it is not handled by default action
            }
        });

        CookieManager.getInstance().setCookie("http://mdev.publicpartnerships.com/ChooseProvider/Index?UserID=29691\\", cookieString);
        webView.loadUrl("http://mdev.publicpartnerships.com/ChooseProvider/Index?UserID=29691\\");

    }

   /* void postOnCreate() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Create Group");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Drawable drawable = getResources().getDrawable(R.drawable.circular_drawable);
        drawable.setColorFilter(getResources().getColor(R.color.colorPrimaryDark), PorterDuff.Mode.SRC_ATOP);

        mImgCreate.setBackground(drawable);
        mImgJoin.setBackground(drawable);

    }*/


}
