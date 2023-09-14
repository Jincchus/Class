package kr.co.KMarket.controller.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.KMarket.dto.ProductDTO;
import kr.co.KMarket.service.ProductService;

@WebServlet("/product/view.do")
public class ViewController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private ProductService service = ProductService.INSTANCE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String prodNo = req.getParameter("prodNo");
		logger.debug("prodNo : " + prodNo);
		
		ProductDTO product = service.selectProduct(prodNo);
		logger.debug(product.toString());
		
		req.setAttribute("product", product);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/product/view.jsp");
		dispatcher.forward(req, resp);
	}
}
