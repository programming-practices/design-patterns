package com.trl.chapter_9;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/async", asyncSupported = true)
public class AsyncServlet4 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Resource
    private ManagedThreadFactory factory;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        final AsyncContext asyncContext = req.startAsync();
        final PrintWriter writer = res.getWriter();
        Thread thread = factory.newThread(new Runnable() {
            @Override
            public void run() {
                writer.println("Complete!");
                asyncContext.complete();
            }
        });
        thread.start();
    }
}