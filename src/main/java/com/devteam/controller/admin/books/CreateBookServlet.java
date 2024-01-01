package com.devteam.controller.admin.books;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.devteam.service.BookService;

/**
 * Servlet implementation class CreateBookServlet
 */
@WebServlet("/admin/create_book")
@MultipartConfig(
		fileSizeThreshold = 2048 * 20,	// 10 KB
		maxFileSize = 2048 * 600,		// 300 KB
		maxRequestSize = 2048 * 2048	// 1 MB 
)
public class CreateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService bookService = new BookService( request, response);
		bookService.createBook();
	}

}