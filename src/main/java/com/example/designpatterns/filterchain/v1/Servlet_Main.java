package com.example.designpatterns.filterchain.v1;

import java.util.ArrayList;
import java.util.List;

public class Servlet_Main {

    public static void main(String[] args) {


       /* 1
        Request request=new Request();
        request.msg="hello world 111 ss";

        Response response=new Response();
        Filter filter=new HtmlFilter();
        filter.doFilter(request,response);

        System.out.println(request.msg);*/



      /*  2
       FilterChain filterChain=new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
        Request request=new Request();
        request.msg="hello world 111 ss";

        Response response=new Response();
        filterChain.doFilter(request,response);
        System.out.println(request.msg);
*/
    }



}


 interface Filter{
    void doFilter(Request request,Response response);
}

class FilterChain implements Filter{

    List<Filter> filterList=new ArrayList<>();

    public FilterChain addFilter(Filter filter){
        filterList.add(filter);
        return this;
    }


    @Override
    public void doFilter(Request request, Response response) {
        for (Filter filter : filterList) {
            filter.doFilter(request,response);
        }
    }
}

class Request{
    String msg;
}

class Response{
    String msg;
}

class SensitiveFilter implements Filter{

    @Override
    public void doFilter(Request request,Response response){

        request.msg=request.msg.replace("ss","");
    }
}

class HtmlFilter implements Filter{

    @Override
    public void doFilter(Request request,Response response){

        request.msg=request.msg.replace("111","xiaoxiao");
    }
}

