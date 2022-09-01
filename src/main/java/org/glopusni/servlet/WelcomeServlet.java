package org.glopusni.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet(urlPatterns = "/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    private static final String PAGE_HEADER = "<html><head><title>Jakarta Servlet Example</title></head><body>";
    private static final String WELCOME_TEXT = "Welcome to my page.";
    private static final String PAGE_FOOTER = "</body></html>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Writer writer = response.getWriter();

        writer.write(PAGE_HEADER);
        writer.write(WELCOME_TEXT);
        writer.write(PAGE_FOOTER);
        writer.close();
    }
}
