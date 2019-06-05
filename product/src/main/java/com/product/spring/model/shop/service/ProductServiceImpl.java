package com.product.spring.model.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.product.spring.model.shop.dao.ProductDAO;
import com.product.spring.model.shop.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Inject
	ProductDAO productDao;
	@Override
	public List<ProductDTO> listProduct() {
		
		return productDao.listProduct();
	}

	@Override
	public ProductDTO detailProduct(int product_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(ProductDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int product_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertProduct(ProductDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fileInfo(int product_id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
