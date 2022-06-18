package com.baonguyenduc.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baonguyenduc.model.UserModel;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setUserName("baonguyen");
		userModel.setFullName("NguyenDucBao");
		
		UserModel userModel2 = new UserModel();
		userModel2.setUserName("baonguyen2");
		userModel2.setFullName("NguyenDucBao2");
		
		req.setAttribute("model", userModel);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/web/home.jsp");
		dispatcher.forward(req, resp);


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
