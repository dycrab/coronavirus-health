package com.example.new_coronavirus.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.new_coronavirus.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeFragment extends Fragment implements AdapterView.OnItemClickListener{

    private HomeViewModel homeViewModel;
    ListView listView;
    SimpleAdapter simpleAdapter;





//    @Override
//    public void onStart() {
//        listData.add(new HomeViewModel("1"));
//        listData.add(new HomeViewModel("2"));
//        listData.add(new HomeViewModel("3"));
//        listData.add(new HomeViewModel("4"));
//        super.onStart();
//    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView) root.findViewById(R.id.home_list);
        simpleAdapter = new SimpleAdapter(getActivity(),
                getData(),
                R.layout.home_item,
                new String[]{"title","article","from","time"},
                new int[]{R.id.item_title,R.id.item_article,R.id.item_src,R.id.item_time});
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(this);

        return root;
    }


    private List<Map<String,Object>> getData() {
        String [] titles={"水果1","水果2","水果3","水果4","水果5","水果6","水果7"};
        String [] srcs={"水果1","水果2","水果3","水果4","水果5","水果6","水果7"};
        String [] articles = {"https://www.baidu.com","https://www.baidu.com",
                "https://www.baidu.com","https://www.baidu.com",
                "https://www.baidu.com", "htttps://www.baidu.com",
                "https://www.baidu.com"};
        String [] times={"水果1","水果2","水果3","水果4","水果5","水果6","水果7"};
        String [] urls = {"https://www.baidu.com","https://www.baidu.com",
                "https://www.baidu.com","https://www.baidu.com",
                "https://www.baidu.com", "htttps://www.baidu.com",
                "https://www.baidu.com"};
        List<Map<String,Object>> list= new ArrayList<>();
        for(int i=0;i<7;i++){
            Map  map = new HashMap();
            map.put("title","titles"+String.valueOf(i));
            map.put("from","from"+Integer.toString(i));
            map.put("time","time"+Integer.toString(i));
            map.put("article",articles[i]);
            map.put("url",urls[i]);
            list.add(map);
        }
        return list;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Log.i(getString(R.string.position)+position);
//        String text = listView.getAdapter().getItem(position).toString();
//        Intent intent =new Intent(Intent.ACTION_VIEW);
//        WebActivity webactivity = new WebActivity();
//        webactivity.setWebView((String) getData().get(position).get("url"));
//        WebView webView = (WebView)
//        Uri uri = Uri.parse((String) getData().get(position).get("url"));
//
//        intent.setData(uri);
//
//        startActivityForResult(intent,1000);

        Intent intent = new Intent();

        intent.setClass(getActivity(), WebActivity.class);
        intent.putExtra("url",(String) getData().get(position).get("url"));
        startActivity(intent);
        //Log.i("position:"+position+"text"+text );
    }

}