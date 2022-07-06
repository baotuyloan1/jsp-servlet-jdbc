package com.baonguyenduc.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baonguyenduc.model.NewsModel;
import com.baonguyenduc.service.ICategoryService;
import com.baonguyenduc.service.INewsService;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ICategoryService categoryService;

	@Inject
	private INewsService newsService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = "Bai viet 5";
		String content = "Content bai viet 5";
		Long categoryId = 1L;
		NewsModel newsModel = new NewsModel();
		newsModel.setContent(content);
		newsModel.setTitle(title);
		newsModel.setCategoryid(categoryId);
		
		newsService.save(newsModel);
		req.setAttribute("categories", categoryService.findAll());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/web/home.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
