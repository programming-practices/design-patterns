package com.trl.chapter_9;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/async"}, asyncSupported = true)
public class AsyncServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        final AsyncContext asyncContext = req.startAsync();
        final String data = null;
        asyncContext.addListener(new AsyncListener() {
            @Override
            public void onComplete(AsyncEvent event) throws IOException {
                AsyncContext asyncContext = event.getAsyncContext();
                asyncContext.getResponse().getWriter().println(data);
            }

            @Override
            public void onTimeout(AsyncEvent event) throws IOException {
                // Code not shown for brevity
            }

            @Override
            public void onError(AsyncEvent event) throws IOException {
                // Code not shown for brevity
            }

            @Override
            public void onStartAsync(AsyncEvent event) throws IOException {
                // Code not shown for brevity
            }
        });
        new Thread() {
            @Override
            public void run() {
                asyncContext.complete();
            }
        }.start();
        res.getWriter().write("Results:");
        // Read data from database
        // Queried data�
        // sleep thread for some time�
    }
}