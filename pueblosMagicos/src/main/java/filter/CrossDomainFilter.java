package filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class CrossDomainFilter implements Filter{

@Override
public void destroy() {
}

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
throws IOException, ServletException {

HttpServletResponse res = (HttpServletResponse) response;

       res.setHeader("Access-Control-Allow-Origin", "*");
       res.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
       res.setHeader("Access-Control-Allow-Credentials", "true");
       res.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
       res.setHeader("Access-Control-Max-Age", "1209600");

       filterChain.doFilter(request, response);
}

@Override
public void init(FilterConfig arg0) throws ServletException {
	
}

}

