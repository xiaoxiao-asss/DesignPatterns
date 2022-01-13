package com.example.designpatterns.filterchain.v2;

import java.util.ArrayList;
import java.util.List;

public class Servlet_Main {

    public static void main(String[] args) {



       // 2
       FilterChain filterChain=new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
        Request request=new Request();
        request.msg="hello world 111 ss";

        Response response=new Response();
        response.msg="";
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.msg);
        System.out.println(response.msg);
    }



}


interface Filter{
   void doFilter(Request request, Response response,FilterChain filterChain);
}

class FilterChain implements Filter {

    List<Filter> filterList=new ArrayList<>();
    int index=0;

    public FilterChain addFilter(Filter filter){
        filterList.add(filter);
        return this;
    }


    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        if(index==filterList.size())return;

        Filter filter=filterList.get(index);
        index++;

        filter.doFilter(request,response,filterChain);

    }
}

class Request{
    String msg;
}

class Response{
    String msg;
}

class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain){

        request.msg=request.msg.replace("ss","");
        filterChain.doFilter(request,response,filterChain);
        response.msg+="-----SensitiveFilter2";
    }
}

class HtmlFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain){

        request.msg=request.msg.replace("111","xiaoxiao");
        filterChain.doFilter(request,response,filterChain);
        response.msg+="-----HtmlFilter2";
    }
}

